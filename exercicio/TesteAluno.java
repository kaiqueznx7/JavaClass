package exercicio;

import java.time.LocalDate;

public class TesteAluno {
    public static void main(String[] args){
        Aluno a1 = new Aluno("Kaique", "11968656218", LocalDate.parse("2005-09-06"),"ADS");


        a1.exibirInfos();
    }
}
