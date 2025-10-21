import java.util.ArrayList;

public class Projeto {
    private int idProjeto;
    private String nome;
    private String descricao;
    private String dataInicio;
    private String dataConclusao;
    private StatusProjeto status;
    private Usuario responsavel;
    private ArrayList<Tarefa> tarefas;
    private ArrayList<Usuario> participantes;
    //private Tarefa [] tarefas;
    //private Usuario [] participantes;

    public Projeto(int idProjeto, String nome, String descricao, String dataInicio, String dataConclusao,
            StatusProjeto status, Usuario responsavel) {
        this.idProjeto = idProjeto;
        this.nome = nome;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataConclusao = dataConclusao;
        this.status = status;
        this.responsavel = responsavel;
        this.tarefas = new ArrayList<>();
        this.participantes = new ArrayList<>();
        //this.tarefas = new Tarefa[10];
        //this.participantes = new Usuario[10];
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





    public ArrayList<Tarefa> getTarefas() {
        return tarefas;
    }





    public void setTarefas(ArrayList<Tarefa> tarefas) {
        this.tarefas = tarefas;
    }





    public ArrayList<Usuario> getParticipantes() {
        return participantes;
    }





    public void setParticipantes(ArrayList<Usuario> participantes) {
        this.participantes = participantes;
    }




    public void adicionarTarefa(Tarefa tarefa) {
    tarefas.add(tarefa);
    System.out.println("Tarefa adicionada.");
    }

    /*public void adicionarTarefa(Tarefa tarefa){
        for(int i = 0; i<tarefas.length; i++){
            if(tarefas[i]==null){
                tarefas[i] = tarefa;
                System.out.println("tarefa adicionada.");
                return;
            }
        }
        System.out.println("Tarefa não adicionada pela capacidade máxima.");

    }*/
   

    public void removerTarefa(Tarefa tarefa) {
    if(tarefas.remove(tarefa)){
    System.out.println("Tarefa removida.");
    }else{
        System.out.println("Tarefa não encontrada!.");
    }
    }

    /*public void removerTarefa(Tarefa tarefa){
        for(int i= 0; i<tarefas.length;i++){
            if(tarefas[i]!=null && tarefas[i].equals(tarefa)){
                tarefas[i] = null;
                System.out.println("tarefa removida.");
                return;
            }
        }
    }*/ 
    public void adicionarParticipante(Usuario participante) {
        participantes.add(participante);
        System.out.println("Participante adicionado.");
}


    /*public void adicionarParticipante(Usuario participante){
        for(int i = 0; i<participantes.length; i++){
            if(participantes[i] == null){
                participantes[i] = participante;
                System.out.println("Participante adicionado.");
                return;
            }
        }System.out.println("Não adicionado pelo excesso de participantes.");
    }*/




    /*   pra listar tarefas de teste casoo precise:
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
