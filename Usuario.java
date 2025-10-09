public class Usuario {
    
    private long idUsuario;
    private String nome;
    private String descricao;
    private String email;
    private String senha;
    private String dataNasc;
    private String status; //(Ativo, Inativo, Bloqueado)
    // - Lista<Projeto> projetos
    public Usuario(long idUsuario, String nome, String descricao, String email, String senha, String dataNasc,
            String status) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.descricao = descricao;
        this.email = email;
        this.senha = senha;
        this.dataNasc = dataNasc;
        this.status = status;
    }

    public void login(){
    
    }
    public void logout(){

    }
    public void atribuirProjeto(){

    }
}
