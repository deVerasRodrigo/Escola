public class Professor extends Pessoa {
    private String disciplina;
    private String turma;


    public Professor() {

    }

    public Professor(String nome, String registro, String disciplina, String turma) {
        super(nome, registro);
        this.disciplina = disciplina;
        this.turma = turma;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    @Override
    public void realizarAtividade() {
        System.out.println("Professor ensinando!");
    }

    @Override
    public void calcularCargaHoraria() {
        if (this.disciplina.equals("CalculoI")){
            System.out.println("Carga horaria total: 90 horas");
        } else {
            System.out.println("Carga horaria total: 60 horas");
        }
    }

    @Override
    public String toString() {
        String texto = super.toString() + ", Disciplina: " + this.getDisciplina() + ", Turma: " + this.getTurma();
        return texto;
    }
}
