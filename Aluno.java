
package newpackage;

/**
 * Classe que representa um aluno e suas notas.
 */
public class Aluno {

    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;

    /**
     * Construtor da classe Aluno.
     * 
     * @param nota1 Primeira nota do aluno.
     * @param nota2 Segunda nota do aluno.
     * @param nota3 Terceira nota do aluno.
     * @param nota4 Quarta nota do aluno.
     */
    public Aluno(double nota1, double nota2, double nota3, double nota4) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }

    /**
     * Método para calcular a média aritmética das notas do aluno.
     * 
     * @return A média aritmética das quatro notas.
     */
    public double calcularMedia() {
        return (nota1 + nota2 + nota3 + nota4) / 4;
    }

    /**
     * Método para verificar se o aluno foi aprovado ou reprovado.
     * 
     * @return true se a média for maior ou igual a 6, false caso contrário.
     */
    public boolean verificarAprovacao() {
        return calcularMedia() >= 6;
    }

    public static void main(String[] args) {
        Aluno aluno = new Aluno(7.5, 6.0, 8.0, 5.5);
        System.out.println("Média: " + aluno.calcularMedia());
        System.out.println("Aprovado: " + aluno.verificarAprovacao());
    }
}
