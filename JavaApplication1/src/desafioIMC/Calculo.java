
package desafioIMC;

/**
 *
 * @author aluno
 */
public class Calculo {
    
    
    public float calcular(Pessoa pessoa1){
        return pessoa1.getPeso() / (pessoa1.getAltura() * pessoa1.getAltura());
        
    }
    
    public String verificar(float imc){
        if ((imc >= 18.50) && (imc <= 24.99)){
            return "Peso normal";
        } else if ((imc >= 25.00) && (imc <= 29.99)){
            return "Pré-Obesidade";
        } else if ((imc >= 30.00) && (imc <= 34.99)){
            return "Obesidade Grau I";
        } else if ((imc >= 35.00) && (imc <= 39.99)){
            return "Obesidade Grau II";
        } else if (imc >= 40.00){
            return "Obesidade Grau III";
        } else {
            return "Valor inválido";
        }
    };
}
