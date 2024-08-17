/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Aluno
 */
public class Paciente {
    
    //Atributos
    private String nomeCompleto = "";
    private int peso = 0;
    private float altura = 0;
    private String sexo = "";
    
    //Metodos

    public Paciente() {
    }
    public Paciente(String nomeCompleto, int peso, float altura, String sexo){
        this.nomeCompleto = nomeCompleto;
        this.peso = peso;
        this.altura = altura;
        this.sexo = sexo;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) throws Exception {
        if(nomeCompleto.isEmpty()) throw new Exception("Nome não pode estar vazia");
        this.nomeCompleto = nomeCompleto;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso)throws Exception {
        if(peso <= 0) throw new Exception("Peso não pode ser <= 0");
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura)throws Exception {
        if(altura <= 0) throw new Exception("Altura não pode ser <= 0");
        this.altura = altura;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo)throws Exception {
        if(sexo.isEmpty()) throw new Exception("Sexo não pode estar vazia");
        this.sexo = sexo;
    }
    
    public float calcularIMC(){
        return (peso/(altura * altura));
    }
    
    public String calcularFaixaRisco(){
        float imc = calcularIMC();
        if(imc < 20) return ("abaixo do peso ideal");
        if(imc <= 25) return ("peso normal");
        if(imc <= 30) return ("excesso de peso");
        if(imc <= 35) return ("obesidade");
        return ("obesidade mórbida");
    }
    
    public float calcularPesoIdeal(){
        if(sexo.equalsIgnoreCase("Feminino")){
            return (float)(62.1 * altura -44.7);
        }
        return (float) (72.7 * altura - 58);
    }
    
}
