
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
        Cavalo oCavalo = new Cavalo();
        Cavalo oCavalo2 = new Cavalo(2,"Vermelho","Pangare");
        Leao oLeao = new Leao();
        Leao oLeao2 = new Leao(3,"Preto",true);
        String localFuga;
        String animalCacado;
        String comidaCavalo;
        String comidaLeao;

        System.out.println("Digite o tamanho do cavalo:");
        oCavalo.setTamanho(scan.nextFloat());
        System.out.println("Digite o tamanho do leao:");
        oLeao.setTamanho(scan.nextFloat());
        System.out.println("Digite a cor do cavalo");
        oCavalo.setCor(scan.next());
        System.out.println("Digite a cor do leao");
        oLeao.setCor(scan.next());
        System.out.println("Digite o que o cavalo comeu");
        comidaCavalo = scan.next();
        System.out.println("Digite o que o leao comeu");
        comidaLeao = scan.next();
        System.out.println("Digite a raça do cavalo");
        oCavalo.setRaca(scan.next());
        System.out.println("Digite para onde o cavalo fugiu");
        localFuga = scan.next();
        System.out.println("Digite se o leao tem juba ou nao true ou false");
        oLeao.setJuba(scan.nextBoolean());
        System.out.println("Digite o animal que o leao caçou");
        animalCacado = scan.next();

        
        oCavalo.imprimirCavalo(oCavalo);
        oCavalo.fugir(localFuga);
        oCavalo.comer(comidaCavalo);

        System.out.println("--------------------------");
        
        oLeao.imprimirLeao(oLeao);
        oLeao.cacar(animalCacado);
        oLeao.comer(comidaLeao);

        
        System.out.println("--------------------------");
        
        System.out.println("Cavalo 2: "+oCavalo2.getTamanho()+" - "+oCavalo2.getCor()+" - "+oCavalo2.getRaca());
        System.out.println("Leao 2: "+oLeao2.getTamanho()+" - "+oLeao2.getCor()+" - "+oLeao2.getJuba());

        scan.close();
    }
}
