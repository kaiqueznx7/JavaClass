package aula4;

public class TesteControleRemoto {
    public static void main(String[] args){

        //Criando objeteo de controle remoto (construtor vazio)
        ControleRemoto controle = new ControleRemoto();

        System.out.println("Controle remoto criado!");
        System.out.println("Estado: " + controle.isLigado());
        System.out.println("Volume: " + controle.getVolume());

        System.out.println("---------- TESTE 1 -----------");

        controle.setVolume(50);
        System.out.println("Volume: " + controle.getVolume());

        System.out.println("----------- TESTE2 ---------");
        controle.LigarDesligar();
        System.out.println("Ligado: " + controle.isLigado());

        System.out.println("---------- TESTE3 -----------");
        controle.aumentarVolume();
        controle.diminuirVolume();
        controle.aumentarVolume();
        controle.setVolume(200);
        System.out.println("Volume: " + controle.getVolume());
    }
}
