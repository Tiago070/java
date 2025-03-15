
import java.util.Scanner;
package javaapplication1;

public class PessoaPrincipal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Cliente oCliente = new Cliente ();
        
        System.out.println("Digite o nome: ");
        oCliente.setNome(scan.next());
        
        System.out.println("Digite a idade: ");
        oCliente.setIdade(scan.next());
        
        System.out.println("Digite o endereço: ");
        oCliente.setEndereco(scan.next());
        
        System.out.println("Digite o email: ");
        oCliente.setEmail(scan.next());
        
        System.out.println("Digite o telefone: ");
        oCliente.setTelefone(scan.next());
        
        oCliente.calcularSalario();
        
        
        /*Cliente oCliente = new Cliente();
        oCliente.setCpf("123.234.665-54");
        oCliente.setNome("Tiago");
        oCliente.setEndereco("Rua 23");
        oCliente.setIdade("20");*/
        
        oCliente.imprimirCliente();
        
        Fornecedor oFornecedor = new Fornecedor();
        
        oFornecedor.setCnpj("3124352453634");
        oFornecedor.setNome("Fabi");
        oFornecedor.setEndereco("Avenida Jao");
        oFornecedor.setIdade("29");
        
        oFornecedor.imprimirFornecedor();
        
    }
}
