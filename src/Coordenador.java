public class Coordenador extends Pessoa{
    private String cursoCoordenado;

    public Coordenador() {

    }
    public Coordenador(String nome, String registro, String cursoCoordenado) {
        super(nome, registro);
        this.cursoCoordenado = cursoCoordenado;
    }

    public String getCursoCoordenado() {
        return cursoCoordenado;
    }

    public void setCursoCoordenado(String cursoCoordenado) {
        this.cursoCoordenado = cursoCoordenado;
    }

    @Override
    public void realizarAtividade() {
        System.out.println("Coordenar turma");
    }

    @Override
    public void calcularCargaHoraria() {
        if (this.cursoCoordenado.equals("Engenharia")) {
            System.out.println("Carga horaria total: 90 horas");
        } else {
            System.out.println("Carga horaria total: 60 horas");
        }
    }

    @Override
    public String toString() {
        String texto = super.toString() + ", Curso coordenado: " + this.getCursoCoordenado();
        return texto;
    }
}
