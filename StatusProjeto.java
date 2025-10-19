public enum StatusProjeto {
    ATIVO("ATIVO"),
    CONCLUIDO("CONCLUIDO"),
    CANCELADO("CANCELADO");

    private String status;

    private StatusProjeto(String status) {
        this.status = status;
    }

    public String status() {
        return status;
    }

    
}
