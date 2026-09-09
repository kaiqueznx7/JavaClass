package aula1;

public class CarroTeste {

     public static void main(String[] args){
         //System.out.println("Hello World!");

         // Criando obejeto carro1 do tipo Carro()
         Carro carro1 = new Carro();
         carro1.marca = "Fiat";
         carro1.modelo = "Uno";
         carro1.cor = "Preto";
         carro1.velocidadeAtual = 0;

         System.out.println("Marca : "+ carro1.marca);
         System.out.println("Modelo: "+ carro1.modelo);
         System.out.println("Cor :"+ carro1.cor);
         System.out.println("Velocidade Atual: "+ carro1.velocidadeAtual);

         System.out.println("\n------------------------------------------\n");

         Carro carro2 = new Carro();
         carro2.marca = "Jeep";
         carro2.modelo = "Compass";
         carro2.cor = "Branco";
         carro2.velocidadeAtual = 4;

         System.out.println("Marca : "+ carro2.marca);
         System.out.println("Modelo: "+ carro2.modelo);
         System.out.println("Cor :"+ carro2.cor);
         System.out.println("Velocidade Atual: "+ carro2.velocidadeAtual);

         System.out.println("\n------------------------------------------\n");

         System.out.println("Ações do carro: "+ carro1.modelo);
         carro1.acelerar();
         carro1.acelerar();
         carro1.freiar();
         carro1.acelerar();
         System.out.println("Velocidade Atual: "+ carro1.velocidadeAtual);
         System.out.println("\n------------------------------------------\n");
         System.out.println("Ações do carro: "+ carro2.modelo);
         carro2.acelerar();
         carro2.acelerar();
         carro2.acelerar();
         carro2.freiar();
         carro2.freiar();
         carro2.freiar();



     }
}
