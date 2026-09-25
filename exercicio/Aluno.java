package exercicio;
import java.time.LocalDate;

public class Aluno {
    private String nome;
    private LocalDate dataNascimento = LocalDate.of(2005,9,6);
    private String endereco;
    private String telefone;
    private String curso;
    private String periodo;

    public Aluno(String nome, String telefone, LocalDate dataNascimento, String curso) {
        this.nome = nome;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public void exibirInfos(){
        System.out.println("Nome: "+ nome);
        System.out.println("Data Nascimento: "+ dataNascimento);
        System.out.println("Endereço: "+ endereco);
        System.out.println("Telefone: "+ telefone);
        System.out.println("Curso: "+ curso);
        System.out.println("Periodo: "+ periodo);
    }





}


