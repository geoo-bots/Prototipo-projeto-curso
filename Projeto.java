public class Projeto {
    private int idProjeto;
    private String nome;
    private String descricao;
    private String dataInicio;
    private String dataConclusao;
    private StatusProjeto status;
    private Usuario responsavel;
    private Tarefa [] tarefas;
    private Usuario [] participantes;

    public Projeto(int idProjeto, String nome, String descricao, String dataInicio, String dataConclusao,
            StatusProjeto status, Usuario responsavel) {
        this.idProjeto = idProjeto;
        this.nome = nome;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataConclusao = dataConclusao;
        this.status = status;
        this.responsavel = responsavel;
        this.tarefas = new Tarefa[10];
        this.participantes = new Usuario[10];
    }
    

    public int getIdProjeto() {
        return idProjeto;
    }


    public void setIdProjeto(int idProjeto) {
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


    public String getDataInicio() {
        return dataInicio;
    }


    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }


    public String getDataConclusao() {
        return dataConclusao;
    }


    public void setDataConclusao(String dataConclusao) {
        this.dataConclusao = dataConclusao;
    }


    public StatusProjeto getStatus() {
        return status;
    }


    public void setStatus(StatusProjeto status) {
        this.status = status;
    }


    public Usuario getResponsavel() {
        return responsavel;
    }


    public void setResponsavel(Usuario responsavel) {
        this.responsavel = responsavel;
    }


    public Tarefa[] getTarefas() {
        return tarefas;
    }


    public void setTarefas(Tarefa[] tarefas) {
        this.tarefas = tarefas;
    }


    public Usuario[] getParticipantes() {
        return participantes;
    }


    public void setParticipantes(Usuario[] participantes) {
        this.participantes = participantes;
    }


    public void adicionarTarefa(Tarefa tarefa){
        for(int i = 0; i<tarefas.length; i++){
            if(tarefas[i]==null){
                tarefas[i] = tarefa;
                System.out.println("tarefa adicionada.");
                return;
            }
        }
        System.out.println("Tarefa não adicionada pela capacidade máxima.");

    }
   


    public void removerTarefa(Tarefa tarefa){
        for(int i= 0; i<tarefas.length;i++){
            if(tarefas[i]!=null && tarefas[i].equals(tarefa)){
                tarefas[i] = null;
                System.out.println("tarefa removida.");
                return;
            }
        }
    }
    
    public void adicionarParticipante(Usuario participante){
        for(int i = 0; i<participantes.length; i++){
            if(participantes[i] == null){
                participantes[i] = participante;
                System.out.println("Participante adicionado.");
                return;
            }
        }System.out.println("Não adicionado pelo excesso de participantes.");
    }

    /*p listar tarefas de teste caso precise:
    public void listarTarefas(){
    for(Tarefa tarefa : tarefas){
    if(tarefas!=null){
        sout("título " + tarefa.getTitulo());
        sout(informações adicionais)
        sout("******************")
    }}
    }
*/
}
