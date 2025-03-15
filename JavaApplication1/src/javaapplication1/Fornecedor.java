
package javaapplication1;

public class Fornecedor extends Pessoa {
    
    private String cnpj;
    private float valor, imposto;

    
    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float getImposto() {
        return imposto;
    }

    public void setImposto(float imposto) {
        this.imposto = imposto;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    public float calcularProduto(Cliente oFornecedor){
        float valorProduto = valor + imposto;
        return valorProduto;
    }
    
    public void imprimirFornecedor(){
        System.out.println("CNPJ do fornecedor: " +this.getCnpj());
        System.out.println("Nome do fornecedor: " +this.getNome());
        System.out.println("Idade do fornecedor: " +this.getIdade());
        System.out.println("Endereco do fornecedor: " +this.getEndereco());
    }
    
}
