public enum Prioridade {
    BAIXA("Azul"),
    MEDIA("Lilás"),
    ALTA("Roxo");

    private String cor;



    private Prioridade(String cor) {
        this.cor = cor;
    }



    public String getCor() {
        return cor;
    }



    public void setCor(String cor) {
        this.cor = cor;
    }
}

