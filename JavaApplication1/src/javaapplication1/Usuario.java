
package javaapplication1;

public class Usuario {
    private int id;
    private String nome;
    private String endereco;
    private String email;
    private byte receita;

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public byte getReceita() {
        return receita;
    }

    public void setReceita(byte receita) {
        this.receita = receita;
    }
    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    public void consultaMedicamento(){
        System.out.println("Consulta feita!");
    }
    public void comprarMedicamento(){
        System.out.println("Compra feita!");
    }
    public void efetuaPagamento(){
        System.out.println("Pagamento feito!");
    }
    
    public float calcularImposto(float valor){
        if (valor > 100){
            return (float) (valor * (15/100));
        } else if (valor <= 100){
            return (float) (valor * (10/100));
        }
        return 0;
    }
}


