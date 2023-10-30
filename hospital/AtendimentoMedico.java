
package hospital;

import java.util.Scanner;


public class AtendimentoMedico {
    //atributos
    private String Sintomas;
    private int iniSint;
    private boolean alergia;
    private String alergico;
    //composicionalidade
    protected PedidoExame pedido;

    Scanner scan = new Scanner(System.in);
    
    //construtor sobrecarregado
    public AtendimentoMedico(String sintoma, int iniSint, boolean alergia) {
        this.Sintomas = sintoma;
        this.iniSint = iniSint;
        this.alergia = alergia;
    }

    //metodos especiais
    public String getSintomas() {
        return Sintomas;
    }

    public void setSintomas(String Sintomas) {
        this.Sintomas = Sintomas;
    }

    public int getIniSint() {
        return iniSint;
    }

    public void setIniSint(int iniSint) {
        this.iniSint = iniSint;
    }

    public boolean getAlergia() {
        return alergia;
    }

    public void setAlergia(boolean alergia) {
        this.alergia = alergia;

    }

    public PedidoExame getPedido() {
        return pedido;
    }

    public void setPedido(PedidoExame pedido) {
        this.pedido = pedido;
    }

    
    //metodos

    public void exibeConsulta() {
        System.out.println("*** Atendimento ***");
        System.out.println("Sintomas: " + getSintomas());
        System.out.println("Inicio dos sintomas: " + getIniSint() + " dias");
        System.out.println("Alergia: "+getAlergia());
        if(pedido != null){
           // pedido.Encaminhamento();
        }
    }

    public void alergiaPaciente() {       
            
            System.out.print("Qual alergia o paciente possui? ");
            alergico = scan.next();            
            
    }
    public void exibeAlergia(){
        System.out.println("Paciente alergico a: " + alergico);
    }
    

    public void pedidoExame() {
        System.out.print("Deseja solicitar algum exame ao paciente? (true or false)");
        boolean exame = scan.nextBoolean();
        this.pedidoExame();

    }
    
    public void solicitarExame(){
        System.out.print("Deseja solicitar algum exame ao paciente? (true or false)");
        boolean exame = scan.nextBoolean();
        if(exame){
            System.out.println("Qual exame deseja solicitar? ");
            System.out.println("1- Raio-x");
            System.out.println("2- Ressonância");
            System.out.println("3- Sangue");
            System.out.println("4- Urina");
            int escolhaExame = scan.nextInt();
            this.pedido = new PedidoExame(escolhaExame);
        }
    }
}
