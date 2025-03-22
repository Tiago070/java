
package javaapplication1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author tiago
 */
public class Zoo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        Animal animal = new Animal();
        Leao leao = new Leao();
        Cavalo cavalo = new Cavalo();
        String localFuga;
        String animalCacado;
        String comida;
        
        System.out.println("Tamanho do animal(m): ");
        animal.setTamanho(scan.nextFloat());
        System.out.println("Cor do animal: ");
        animal.setCor(scan.next());
        System.out.println("O que o animal comeu: ");
        comida=scan.next();
        System.out.println("Raça do cavalo: ");
        cavalo.setRaca(scan.next());
        System.out.println("Para onde o cavalo fugiu: ");
        localFuga = scan.next();
        System.out.println("Leao tem juba ou não: ");
        leao.setJuba(scan.nextBoolean());
        System.out.println("Leao tem juba ou não: ");
        leao.setJuba(scan.nextBoolean());
        System.out.println("Animal que o leão caçou: ");
        animalCacado=scan.next();
        
        cavalo.comer(comida);
        cavalo.imprimirCavalo(cavalo, animal);
        cavalo.fugir(localFuga);
        
        leao.imprimirLeao(leao, animal);
        leao.cacar(animalCacado);
        
        scan.close();
    }
}
