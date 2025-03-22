
package javaapplication1;

/**
 *
 * @author tiago
 */
public class Cavalo extends Animal {
    private String raca;

    
    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
    
    
    public void fugir(String local){
        System.out.println("Cavalo fugindo para " +local);
    }
    
    public void imprimirCavalo(Cavalo cavalo, Animal animal){
        System.out.println("Tamanho cavalo: " +animal.getTamanho());
        System.out.println("Cor cavalo: " +animal.getCor());
        System.out.println("Raça cavalo: " +this.getRaca());
    }
}

