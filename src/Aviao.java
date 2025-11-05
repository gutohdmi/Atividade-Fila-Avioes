class Aviao {
    String prefixo;
    String companhia;

    public Aviao(String prefixo, String companhia) {
        this.prefixo = prefixo;
        this.companhia = companhia;
    }

    public String toString() {
        return "Avião {Prefixo: " + prefixo + ", Companhia: " + companhia + "}";
    }
}