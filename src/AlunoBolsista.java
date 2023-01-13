import java.math.BigDecimal;

public final class AlunoBolsista extends Aluno{
    private BigDecimal valorBolsa;

    public AlunoBolsista() {
    }

    public AlunoBolsista(String nome, String registro, String disciplina, double media) {
        super(nome, registro, disciplina, media);
    }

    public BigDecimal getValorBolsa() {
        return valorBolsa;
    }

    public void setValorBolsa(BigDecimal valorBolsa) {
        this.valorBolsa = valorBolsa;
    }

    @Override
    public String toString() {
        String texto = super.toString() + ", Valor bolsa: " + this.getValorBolsa();
        return texto;
    }
}
