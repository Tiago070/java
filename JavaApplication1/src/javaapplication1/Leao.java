
package javaapplication1;

/**
 *
 * @author tiago
 */
public class Leao extends Animal {
    private boolean juba;

    public boolean getJuba() {
        return juba;
    }

    public void setJuba(boolean juba) {
        this.juba = juba;
    }

    
    public void cacar(String animalCacado){
        System.out.println("Leao caçando o animal " +animalCacado);
    }
    
    public void imprimirLeao(Leao leao, Animal animal){
        System.out.println("Tamanho leão: " +animal.getTamanho());
        System.out.println("Cor leão: " +animal.getCor());
        System.out.println("Leão tem juba? " +leao.getJuba());
    }
}
