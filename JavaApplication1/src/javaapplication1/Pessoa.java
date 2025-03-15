
package javaapplication1;

public class Pessoa {
    private String nome, idade, endereco, email, telefone;
    
    public Pessoa(){}
    
    public Pessoa (String nome, String idade, String endereco, String email, String telefone){
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
}
