package exercicio;

public class Carro {
    private String marca;
    private String modelo;
    private String cor;
    private int ano;
    private float preco;

    //Construtor padrão
    public Carro(){
        this.marca = "Audi";
        this.modelo = "Q3";
        this.cor = "Branca";
        this.ano = 2014;
        this.preco = 80000;
    }
    //Construtor parametrizado
    public Carro(String marca, int ano, float preco){
        this.marca = marca;
        this.ano = ano;
        this.preco = preco;
    }
//Construtor com 5 parametros, classe cheia
    public Carro(String marca, String modelo, String cor, int ano, float preco)
    {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.preco = preco;
    }

    //getters e setters

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public void exibirInfo(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Ano: " + ano);
        System.out.println("Preço: " + preco);

    }
    }
