
public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("=========================================");
        System.out.println("  INÍCIO DOS TESTES DO PROJETO POO");
        System.out.println("=========================================");

        // --- 1. CRIAÇÃO DE USUÁRIOS ---
        System.out.println("\n--- 1. CRIAÇÃO DE USUÁRIOS ---");
        
        Usuario usuarioAdmin = new Usuario(1, 
            "Carlos Admin", 
            "Usuário Adm", 
            "carlos@app.com", 
            "12345", 
            "10/05/1990", 
            StatusUsuario.ATIVO, 
            null
        );

        Usuario usuarioDev = new Usuario(
            2, 
            "Ana Desenvolvedora", 
            "Desenolvedora",
            "ana@app.com", 
            "senhaforte", 
            "20/08/1995",
            StatusUsuario.ATIVO,
            null
        );
        
        // --- 2. TESTE DE MÉTODOS DA CLASSE USUARIO ---
        System.out.println("\n--- 2. TESTE: Login e Atribuição ---");
        
        // Teste Login (Sucesso)
        usuarioAdmin.login("carlos@app.com", "12345");
        //Teste Logout
        usuarioAdmin.logout();
        
        // Teste Login (Falha)
        usuarioDev.login("ana@app.com", "senhaincorreta"); 
        
        // --- 3. CRIAÇÃO DE PROJETO E RELACIONAMENTO ---
        System.out.println("\n--- 3. CRIAÇÃO DE PROJETO ---");
        
        Projeto projetoWeb = new Projeto(
            10, 
            "Landing Page Institucional", 
            "Criação do site principal da empresa.", 
            "12/10/2025", 
            "12/12/2025",
            StatusProjeto.ATIVO, 
            usuarioAdmin // Carlos é o responsável
        );
        
        // Atribuição de Usuário ao Projeto (Método da classe Usuario)
        usuarioDev.atribuirProjeto(projetoWeb);
        usuarioAdmin.atribuirProjeto(projetoWeb);

        // --- 4. CRIAÇÃO E ATRIBUIÇÃO DE TAREFAS ---
        System.out.println("\n--- 4. CRIAÇÃO E MÉTODOS DE TAREFA ---");
        
        Tarefa tarefaDesign = new Tarefa(
            101, 
            "Design UI/UX", 
            "Criação dos mockups no Figma.", 
            "12/10/2025", 
            "20/12/2025", 
            Prioridade.ALTA, 
            StatusTarefa.PENDENTE, 
            projetoWeb,
            usuarioAdmin
        );

        Tarefa tarefaCodificacao = new Tarefa(
            102, 
            "Codificação do Frontend", 
            "Desenvolvimento em React.", 
            "12/10/2025", 
            "12/11/2025",  
            Prioridade.MEDIA, 
            StatusTarefa.PENDENTE, 
            projetoWeb,
            usuarioDev
        );

        // Adiciona Tarefas ao Projeto (Método da classe Projeto)
        projetoWeb.adicionarTarefa(tarefaDesign);
        projetoWeb.adicionarTarefa(tarefaCodificacao);
        
        // // --- 5. TESTE DE MÉTODOS DA CLASSE TAREFA ---
        System.out.println("\n--- 5. TESTE: Atualização de Status e Prazo ---");
        
        // Teste 5a: Atualizar Status
        tarefaDesign.atualizarStatus(StatusTarefa.FAZENDO);
        
        // Teste 5b: Definir Novo Prazo
        tarefaDesign.definirPrazo("25/10/2025");


        System.out.println("\n=========================================");
        System.out.println("      FIM DOS TESTES DE PROJETO");
        System.out.println("=========================================");

    }
}
