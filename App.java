public class App {
    public static void main(String[] args) {
        Usuario usuarioAdmin = new Usuario(1, "Carlos Admin", "Usuário Adm", "carlos@app.com", "12345", "10/05/1990", StatusUser.ATIVO);
        Usuario usuarioDev = new Usuario(2, "Ana Desenvolvedora","Desenolvedora", "ana@app.com","senhaforte", "20/08/1995", StatusUser.ATIVO);
        usuarioAdmin.login("carlos@app.com", "12345");
        usuarioAdmin.logout();
        usuarioDev.login("ana@app.com", "senhaincorreta");
    
        Projeto projetoWeb = new Projeto(10,"Landing Page Institucional","Criação do site principal da empresa.","12/10/2025","12/12/2025",StatusProjeto.ATIVO,usuarioAdmin);

        usuarioDev.atribuirProjeto(projetoWeb);
        usuarioAdmin.atribuirProjeto(projetoWeb);


        Tarefa tarefaDesign = new Tarefa(101,"Design UI/UX","Criação dos mockups no Figma.","12/10/2025","20/12/2025",PrioridadeTarefa.ALTA,StatusTarefa.PENDENTE,projetoWeb,usuarioAdmin);

        Tarefa tarefaCodificacao = new Tarefa(102,"Codificação do Frontend","Desenvolvimento em React.","12/10/2025","12/11/2025",PrioridadeTarefa.MEDIA,StatusTarefa.PENDENTE, projetoWeb,usuarioDev);
        
        
        projetoWeb.adicionarTarefa(tarefaDesign);
        projetoWeb.adicionarTarefa(tarefaCodificacao);

        tarefaDesign.atualizarStatus(StatusTarefa.FAZENDO);
        tarefaDesign.definirPrazo("25/10/2025");
    }
}
