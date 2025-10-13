import java.time.LocalDate;

public class Tarefa {
    private String titulo;
    private long idTarefa;
    private String descricao;
    private LocalDate dataCriacao;
    private LocalDate dataConclusao;
    private String prioridade; // (Baixa, Média, Alta)
    private String status; //(Pendente, Fazendo, Feito)
    Projeto idProjeto; //(referência ao projeto))
    public Tarefa(String titulo, long idTarefa, String descricao, LocalDate dataCriacao, LocalDate dataConclusao,
            String prioridade, String status, Projeto idProjeto) {
        this.titulo = titulo;
        this.idTarefa = idTarefa;
        this.descricao = descricao;
        this.dataCriacao = dataCriacao;
        this.dataConclusao = dataConclusao;
        this.prioridade = prioridade;
        this.status = status;
        this.idProjeto = idProjeto;
    }
    
    public void atualizarStatus(){

    }

    public void definirPrazo(){

    }
}
