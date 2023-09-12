
package Pessoa;



public class Pessoa {
    int dia;
    int mes;
    int ano;
    int diaAt;
    int mesAt;
    int anoAt;
    String nome;
    int idade;
    
    
    void calculaIdade(int dia, int mes, int ano){
        this.anoAt = ano;
        this.idade = this.anoAt - this.ano;
    }
    public int informaIdade(){
        return idade;
    }
    public String informaNome(){
        return nome;
    }
    public void ajustaDataDeNascimento(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    
    }
        

