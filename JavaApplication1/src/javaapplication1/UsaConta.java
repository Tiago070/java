
package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author tiago
 */
public class UsaConta {
    
    public static void main(String[] argumentos){
        Conta conta1 = new Conta();
        Conta conta2 = new Conta();
        Scanner scan = new Scanner(System.in);
        
        /*
        conta1.setNome("Tiago");
        conta2.setNome("Maria");
        */
        
        /*depositando nas contas
        conta1.depositar(50);
        conta2.depositar(10);
        */
        
        System.out.println("Informe o nome: ");
        conta1.setNome(scan.next());
        
        System.out.println("Digite o saldo: ");
        double saldo = scan.nextDouble();
        
        System.out.println("Digite a porcentagem: ");
        double porcentagem = scan.nextDouble();
        
        conta1.depositar2(saldo, porcentagem);
        System.out.printf("Saldo: %.2f" ,conta1.getSaldo());
        System.out.println("\nNome: " +conta1.getNome());
        
        System.out.println("====MENU====");
        System.out.println("0 - Sair");
        System.out.println("1 - Calcular novamente");
        int opcao = scan.nextInt();
        
        while (opcao == 1) {            
            System.out.println("Informe o nome: ");
            conta1.setNome(scan.next());

            System.out.println("Digite o saldo: ");
            double saldo2 = scan.nextDouble();

            System.out.println("Digite a porcentagem: ");
            double porcentagem2 = scan.nextDouble();

            conta1.depositar2(saldo, porcentagem);

            System.out.printf("Saldo: %.2f" ,conta1.getSaldo());
            System.out.println("\nNome: " +conta1.getNome());
            
            System.out.println("====MENU====");
            System.out.println("0 - Sair");
            System.out.println("1 - Calcular novamente");
            opcao = scan.nextInt();
        }
        
        /*
        System.out.println("\nConta 1 - Nome: " +conta1.getNome());
        System.out.printf("Conta 1 - Saldo: %.2f" ,conta1.getSaldo());
        
        System.out.println("\nConta 2 - Nome: " +conta2.getNome());
        System.out.println("Conta 2 - Saldo: " +conta2.getSaldo());
        */
    }
}
