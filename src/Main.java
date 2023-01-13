import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        // criação dos objetos
        Professor professor1 = new Professor("Rachel", "P22", "Química", "A");
        Professor professor2 = new Professor("Matheus", "P23", "Automação", "C");
        Professor professor3 = new Professor("Matheus", "P23", "Controle", "B");

        System.out.print("Comparação entre professor1 e professor2:  ");
        if(professor1.equals(professor2)){
            System.out.println("É o mesmo professor! (Possui mesmo registro)");
        } else{
            System.out.println("São professores diferentes!");
        }
        System.out.println("Dados dos professores comparados:");
        System.out.print("Professor 1 - ");
        System.out.println(professor1);
        System.out.print("Professor 2 - ");
        System.out.println(professor2);

        System.out.print("\nComparação entre professor2 e professor3:  ");
        if(professor2.equals(professor3)){
            System.out.println("É o mesmo professor! (Possui mesmo registro)");
        } else{
            System.out.println("São professores diferentes!");
        }
        System.out.println("Dados dos professores comparados:");
        System.out.print("Professor 2 - ");
        System.out.println(professor2);
        System.out.print("Professor 3 - ");
        System.out.println(professor3);

        Aluno aluno1 = new Aluno("João", "A11", "CalculoI", 8.0);
        System.out.print("\nAluno 1 - ");
        System.out.println(aluno1);
        aluno1.calcularCargaHoraria();

        Aluno aluno2 = new Aluno("Pedro", "A13", "Algebra Linear", 5.0);
        System.out.print("\nAluno 2 - ");
        System.out.println(aluno2);
        aluno2.calcularCargaHoraria();

        AlunoBolsista bolsista1 = new AlunoBolsista("Fernanda", "A43", "Algebra Linear", 9.0);
        BigDecimal valorBolsa = new BigDecimal("400.00");
        bolsista1.setValorBolsa(valorBolsa);
        System.out.println("\nBolsista 1 - ");
        System.out.println(bolsista1);

        Coordenador coordenador1 = new Coordenador("Frederico", "C01", "Engenharia");
        System.out.print("\nCoordenador 1 - ");
        System.out.println(coordenador1);
        coordenador1.calcularCargaHoraria();
    }
}