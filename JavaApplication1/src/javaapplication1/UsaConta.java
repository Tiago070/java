
package javaapplication1;

/**
 *
 * @author tiago
 */
public class UsaConta {
    public static void main(String[] argumentos){
        Conta conta1 = new Conta();
        Conta conta2 = new Conta();
        
        conta1.setNome("Tiago");
        conta2.setNome("Maria");
        
        //depositnado nas contas
        conta1.depositar(50);
        conta2.depositar(10);
        
        System.out.println("Conta 1 - Nome: " +conta1.getNome());
        System.out.printf("Conta 1 - Saldo: %,0f" +conta1.getSaldo());
        
        System.out.println("Conta 2 - Nome: " +conta2.getNome());
        System.out.println("Conta 2 - Saldo: " +conta2.getSaldo());
    }
}
