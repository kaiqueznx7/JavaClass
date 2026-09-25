package exercicio;

public class TestePessoa {
    public static void main(String[] args){
        Pessoa p1 = new Pessoa("Kaique", 21,"Masculino");

        System.out.println("--- Pessoa 1 ---");
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Idade: " + p1.getIdade());
        System.out.println("Sexo: " + p1.getSexo());
    }
}
