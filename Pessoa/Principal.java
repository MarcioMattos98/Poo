package Pessoa;

public class Principal {

    public static void main(String[] args) {
        Pessoa isaac = new Pessoa();
        Pessoa einstein = new Pessoa();

        isaac.nome = "Isaac Newton";
        isaac.ajustaDataDeNascimento(14, 03, 1849);

        einstein.nome = "Albert Einstein";
        einstein.ajustaDataDeNascimento(04, 01, 1643);

        isaac.calculaIdade(11, 09, 2023);
        einstein.calculaIdade(11, 09, 2023);
        
        System.out.println("Idade atual de " + isaac.informaNome() + " seria de " + isaac.informaIdade());
        System.out.println("Idade atual de " + einstein.informaNome() + " seria de " + einstein.informaIdade());

    }

}
