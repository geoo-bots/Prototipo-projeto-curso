public enum StatusTarefa {
    PENDENTE("Vermelho"),
    FAZENDO("Amarelo"),
    FEITO("Verde");

    private String cor;

    private StatusTarefa(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    } 
    
}
