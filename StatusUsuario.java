public enum StatusUsuario {
    ATIVO("ATIVO"), 
    INATIVO("INATIVO"),
    BLOQUEADO("BLOQUEADO");

    private String status;

    private StatusUsuario(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void SetStatus(String status) {
        this.status = status;
    }
    
    
}
