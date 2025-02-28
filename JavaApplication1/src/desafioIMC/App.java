
package desafioIMC;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author aluno
 */
public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        Pessoa pessoa1 = new Pessoa();
        Calculo calculo1 = new Calculo();
        int opcao = 1;
        
        while (opcao == 1){
            System.out.println("Informe o CPF: ");
            pessoa1.setCpf(scan.nextInt());

            System.out.println("Informe o nome: ");
            pessoa1.setNome(scan.next());

            System.out.println("Informe o peso: ");
            pessoa1.setPeso(scan.nextFloat());

            System.out.println("Informe a altura: ");
            pessoa1.setAltura(scan.nextFloat());

            System.out.println("IMC: " +String.format("%.2f", calculo1.calcular(pessoa1)));
            System.out.println("Faixa: " +calculo1.verificar(calculo1.calcular(pessoa1)));
            
            System.out.println("====MENU====");
            System.out.println("0 - Sair");
            System.out.println("1 - Calcular novamente");
            opcao = scan.nextInt();
           
        }
        
        
    }
}
