import java.time.LocalDate;

public class Projeto {
    private long idProjeto;
    private String nome;
    private String descricao;
    private LocalDate dataInicio;
    private LocalDate dataConclusao;
    private String status; //(Ativo, Concluído, Cancelado)
    private String responsavel;
     //Lista<Tarefa> tarefas
    //Lista<Usuario> participantes
    public Projeto(long idProjeto, String nome, String descricao, LocalDate dataInicio, LocalDate dataConclusao,
            String status, String responsavel) {
        this.idProjeto = idProjeto;
        this.nome = nome;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataConclusao = dataConclusao;
        this.status = status;
        this.responsavel = responsavel;
    }
    public long getIdProjeto() {
        return idProjeto;
    }
    public void setIdProjeto(long idProjeto) {
        this.idProjeto = idProjeto;
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
    public LocalDate getDataInicio() {
        return dataInicio;
    }
    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }
    public LocalDate getDataConclusao() {
        return dataConclusao;
    }
    public void setDataConclusao(LocalDate dataConclusao) {
        this.dataConclusao = dataConclusao;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getResponsavel() {
        return responsavel;
    }
    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public void adicionarTarefa(){

    }
    public void removerTarefa(){

    }
    
    public void adicionarParticipante(){
        
    }
}
