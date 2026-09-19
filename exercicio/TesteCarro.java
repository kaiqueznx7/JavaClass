package exercicio;

public class TesteCarro {

    public static void main(String[] args){

        //1. Criando um objeto usando o construtor padrão
        Carro c1 = new Carro();

        c1.exibirInfo();

        System.out.println("_____________________________________");

        Carro c2 = new Carro("Audi", 2014, 80000);

        c2.exibirInfo();
        System.out.println("_____________________________________");

        Carro c3 = new Carro("Audi", "Q3", "Branca", 2014, 80000);

    }
}
