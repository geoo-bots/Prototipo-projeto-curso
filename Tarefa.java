
public class Tarefa {
    private String titulo;
    private int idTarefa;
    private String descricao;
    private String dataCriacao;
    private String dataConclusao;
    private PrioridadeTarefa prioridade; 
    private StatusTarefa status; 
    private Projeto idProjeto; 
    private Usuario responsavel;
    
    public Tarefa( int idTarefa,String titulo, String descricao, String dataCriacao, String dataConclusao,
            PrioridadeTarefa prioridade, StatusTarefa status, Projeto idProjeto, Usuario responsavel) {
        this.idTarefa = idTarefa;
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataCriacao = dataCriacao;
        this.dataConclusao = dataConclusao;
        this.prioridade = prioridade;
        this.status = status;
        this.idProjeto = idProjeto;
        this.responsavel = responsavel;
    }
    
    
    


    public String getTitulo() {
        return titulo;
    }





    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }





    public int getIdTarefa() {
        return idTarefa;
    }





    public void setIdTarefa(int idTarefa) {
        this.idTarefa = idTarefa;
    }





    public String getDescricao() {
        return descricao;
    }





    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }





    public String getDataCriacao() {
        return dataCriacao;
    }





    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }





    public String getDataConclusao() {
        return dataConclusao;
    }





    public void setDataConclusao(String dataConclusao) {
        this.dataConclusao = dataConclusao;
    }





    public PrioridadeTarefa getPrioridade() {
        return prioridade;
    }





    public void setPrioridade(PrioridadeTarefa prioridade) {
        this.prioridade = prioridade;
    }





    public StatusTarefa getStatus() {
        return status;
    }





    public void setStatus(StatusTarefa status) {
        this.status = status;
    }





    public Projeto getIdProjeto() {
        return idProjeto;
    }





    public void setIdProjeto(Projeto idProjeto) {
        this.idProjeto = idProjeto;
    }





    public Usuario getResponsavel() {
        return responsavel;
    }





    public void setResponsavel(Usuario responsavel) {
        this.responsavel = responsavel;
    }





    public void atualizarStatus(StatusTarefa novoStatus){
        this.status = novoStatus;
    }

    public void definirPrazo(String data){
        dataConclusao = data;
    }
}
