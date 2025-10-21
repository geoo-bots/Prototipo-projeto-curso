import java.util.ArrayList;

public class Usuario {
    
    private int idUsuario;
    private String nome;
    private String descricao;
    private String email;
    private String senha;
    private String dataNasc;
    private StatusUsuario status;
    private ArrayList<Projeto> projetos;
    //private Projeto [] projetos;

    
    
    public Usuario(int idUsuario, String nome, String descricao, String email, String senha, String dataNasc,
            StatusUsuario status, ArrayList<Projeto> projetos) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.descricao = descricao;
        this.email = email;
        this.senha = senha;
        this.dataNasc = dataNasc;
        this.status = status;
        if (projetos != null) {
        this.projetos = projetos;
        } else {
            this.projetos = new ArrayList<>();
    }
        //antigo: this.projetos = new Projeto[10];
    }


 


    public int getIdUsuario() {
        return idUsuario;
    }





    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }





    public String getNome() {
        return nome;
    }





    public void setNome(String nome) {
        this.nome = nome;
    }





    public String getDescricao() {
        return descricao;
    }





    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }





    public String getEmail() {
        return email;
    }





    public void setEmail(String email) {
        this.email = email;
    }





    public String getSenha() {
        return senha;
    }





    public void setSenha(String senha) {
        this.senha = senha;
    }





    public String getDataNasc() {
        return dataNasc;
    }





    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }





    public StatusUsuario getStatus() {
        return status;
    }





    public void setStatus(StatusUsuario status) {
        this.status = status;
    }





    public ArrayList<Projeto> getProjetos() {
        return projetos;
    }





    public void setProjetos(ArrayList<Projeto> projetos) {
        this.projetos = projetos;
    }





    public void login(String testeemail, String testeSenha){
        if(testeemail.equals(email) && testeSenha.equals(senha)){
            System.out.printf("%s logou. \n", this.nome);
        }else{
            System.out.println("Email ou senha incorreto. \n");
        }
    }
    public void logout(){
        System.out.println(this.nome+ " deslogado. \n");
    }


    public void atribuirProjeto(Projeto projeto){
        projetos.add(projeto);
        projeto.setResponsavel(this);
        System.out.println("Projeto atribuído a: "+ nome);
    }
    /*  public void atribuirProjeto(Projeto projeto) {
    for (int i = 0; i < projetos.length; i++) {
        if (projetos[i] == null) {
            projetos[i] = projeto;
            projeto.setResponsavel(this); 
            System.out.println("Projeto atribuído a: " + this.nome);
            return;
        }
    }
    System.out.println("Capacidade máxima atingida");
}
    código antigo comentado mas ainda utilizável.
*/
    }
        
    


