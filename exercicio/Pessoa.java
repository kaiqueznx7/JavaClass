package exercicio;

public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;


    public Pessoa(String nome, int idade, String sexo){
         this.nome = "Kaique";
         this.idade = 21;
         this.sexo = "Masculino";

        }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = "Kaique";
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = 21;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = "Masculino";
    }
}

