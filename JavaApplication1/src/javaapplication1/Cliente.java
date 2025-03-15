
package javaapplication1;

public class Cliente extends Pessoa {
    
    public Cliente(String cpf, float salario, float IR, String nome, String idade, String endereco, String email, String telefone){
        super(nome, idade, endereco, email, telefone);
        this.cpf = cpf;
        this.salario = salario;
        this.IR = IR;
    }
    
    private String cpf;
    private float salario, IR;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getIR() {
        return IR;
    }

    public void setIR(float IR) {
        this.IR = IR;
    }

    
    
    public float calcularSalario(Cliente salario, Cliente IR, float salarioLiquido){
        return salarioLiquido = this.salario - this.IR;
    }
    
    public void imprimirCliente(){
        System.out.println("CPF do cliente: " +this.getCpf());
        System.out.println("Nome do cliente: " +this.getNome());
        System.out.println("Idade do cliente: " +this.getIdade());
        System.out.println("Endereco do cliente: " +this.getEndereco());
    }
    
}
