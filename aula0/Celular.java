package aula0;

public class Celular {
    String marca;
    int modelo;

    void ligar(){
        System.out.println("Ligando...");
    }
    void desligar(){
        System.out.println("Desligando...");
    }

    public static void main(String[] args){
        Celular c1 = new Celular();
        c1.ligar();
        c1.desligar();
        c1.marca = "Apple";
        c1.modelo = 17;
        System.out.println(c1.marca);
        System.out.println(c1.modelo);

    }

}
