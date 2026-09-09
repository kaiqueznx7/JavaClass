package aula1;

public class Carro {
    //atributos / caracteristicas / informações do objeto
String marca;
String modelo;
String cor;
int velocidadeAtual;


    //métodos (comportamentos/ações)
    void acelerar(){
        System.out.println("Acelerando...");
        velocidadeAtual = velocidadeAtual + 10;
        System.out.println("O carro Acelerou! Velocidade Atual: "+velocidadeAtual+"KM/H");
    }
    void freiar(){
        System.out.println("Freiando...");
        velocidadeAtual = velocidadeAtual - 7;
        System.out.println("O carro Freiou! Velocidade Atual: "+velocidadeAtual+"KM/H");
    }


}
