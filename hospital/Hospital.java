
package hospital;

import java.util.Scanner;


public class Hospital {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Recepcao paciente;
        AtendimentoMedico atendimento;
        PedidoExame pedidoExame;
        String continuar;
        
        do {
            System.out.println("Inserir dados do paciente:");
            System.out.print("Nome: ");
            String nome = scan.next();
            System.out.print("Idade: ");
            int idade = scan.nextInt();
            System.out.print("Sexo: (Masculino ou Feminino)");
            String sexo = scan.next();
            System.out.print("Hora de Chegada: (hh:mm)");            
            String horaChegada = scan.next();
            paciente = new Recepcao(nome, idade, sexo, horaChegada);
            
            System.out.println("Inserir dados do atendimento médico:");
            System.out.print("Sintomas: ");
            String sintomas = scan.next();
            System.out.print("Início dos Sintomas (dias): ");
            int iniSint = scan.nextInt();
            System.out.print("Possui Alergia (true/false): ");
            boolean alergia = scan.nextBoolean();
            atendimento = new AtendimentoMedico(sintomas, iniSint, alergia);
            if (alergia == true) {
                atendimento.alergiaPaciente();
            }

            System.out.println("Deseja solicitar algum exame ao paciente? (true/false): ");
            boolean solicitarExame = scan.nextBoolean();
            if (solicitarExame) {
                System.out.print("Escolha o exame (1-Raio-X, 2-Ressonância, 3-Sangue, 4-Urina): ");
                int escolhaExame = scan.nextInt();
                pedidoExame = new PedidoExame(escolhaExame);
                atendimento.setPedido(pedidoExame);
                atendimento.pedido.Encaminhamento();
            }
            System.out.println("*** Dados dos Pacientes ***");
            System.out.println();
            paciente.exibeDadosPaciente();
            paciente.exibeHoraChegada();
            atendimento.exibeConsulta();
            atendimento.exibeAlergia();
            if (atendimento.getPedido() != null) {
                atendimento.getPedido().Encaminhamento();
            }
            System.out.println();
            System.out.print("Deseja inserir outro paciente? (sim/nao): ");
            continuar = scan.next();
        } while (continuar.equalsIgnoreCase("sim"));

        scan.close();
    }
    
}
