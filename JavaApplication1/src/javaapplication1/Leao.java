
package javaapplication1;

/**
 *
 * @author tiago
 */
public class Leao extends Animal {
    public Leao(){};
    
    public Leao(float tamanho, String cor, boolean juba){
        super(tamanho, cor);
        this.juba=juba;
    }
    
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
    
    public void imprimirLeao(Leao leao){
        System.out.println("Tamanho leão: " +leao.getTamanho());
        System.out.println("Cor leão: " +leao.getCor());
        System.out.println("Leão tem juba? " +leao.getJuba());
    }
}
