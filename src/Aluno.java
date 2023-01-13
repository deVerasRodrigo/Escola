public class Aluno extends Pessoa{
    private String disciplina;
    private double media;

    public Aluno() {

    }

    public Aluno(String nome, String registro, String disciplina, double media) {
        super(nome, registro);
        this.disciplina = disciplina;
        this.media = media;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    @Override
    public void realizarAtividade() {
        System.out.println("Aluno estudando");
    }

    @Override
    public final void calcularCargaHoraria() {
        if (this.disciplina.equals("CalculoI")){
            System.out.println("Carga horaria total: 90 horas");
        } else {
            System.out.println("Carga horaria total: 60 horas");
        }

    }

    @Override
    public String toString() {
        String texto = super.toString() + ", Disciplina: " + this.getDisciplina() +
                ", Média geral: " + this.getMedia();

        return texto;
    }
}
