
package hospital;



    public class Recepcao {
    //atributos
    private String nome;
    private int idade;
    private String sexo;
    private String horaChegada;
    
    //construtor sobrecarregado
    public Recepcao(String nome, int idade, String sexo, String horaChegada){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo; 
        this.horaChegada = horaChegada;
    }
    public Recepcao(String horaChegada){
        this.horaChegada = horaChegada;        
    }
    
    //metodos especiais
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade > 0){
            this.idade = idade;            
        }else{
            System.out.println("Insira uma idade válida!");
        }
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getHoraChegada() {
        return horaChegada;
    }

    public void setHoraChegada(String horaChegada) {       
        this.horaChegada = horaChegada;
        
    }        
    
    //metodos
    public void exibeDadosPaciente(){
        System.out.println("*** Novo Paciente ***");
        System.out.println("Nome: "+ getNome());
        System.out.println("Idade: "+getIdade()+" anos");
        System.out.println("Sexo: "+getSexo());
                
    }
    public void exibeHoraChegada(){
        System.out.println("*** Hora Chegada ***");
        System.out.println("Horário que o paciente chegou: "+getHoraChegada());
        
    }
    
    
}
    

