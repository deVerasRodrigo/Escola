public final class AlunoBolsista extends Aluno{
    private Double valorBolsa;

    public AlunoBolsista() {
    }

    public AlunoBolsista(String nome, String registro, String disciplina, double media) {
        super(nome, registro, disciplina, media);
    }

    public Double getValorBolsa() {
        return valorBolsa;
    }

    public void setValorBolsa(Double valorBolsa) {
        this.valorBolsa = valorBolsa;
    }

}
