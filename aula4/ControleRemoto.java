package aula4;

public class ControleRemoto {

    //1. Atributos
    private boolean ligado;
    private int volume;

    //2. Construtores
    public ControleRemoto(){
        this.ligado = false;
        this.volume = 10;
    }
    public ControleRemoto(boolean ligado, int volume){
        this.ligado = ligado;
        this.volume = volume;

    }

    //3. getters e setters
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        //validação simples com condicionais
        if (volume >= 0 && volume <= 100) {
            this.volume = volume;
            System.out.println("Volume alterado: "+ volume);
        }else{
            System.out.println("Volume Inválido!");
        }
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    //4. Metódos Operacionais - Lógica Condicional

    //Metodo Ligar e Desligar a tv
    public void LigarDesligar(){
        this.ligado = !this.ligado;
        if(this.ligado){
            System.out.println("TV LIGADA!");
        }else{
            System.out.println("TV DESLIGADA!");
        }
    }

    //Aumentar volume (+1)
    public void aumentarVolume(){
        if(this.volume > 100){
            System.out.println("Volume Máximo!");
        } else if (!this.ligado) {
            System.out.println("Erro: TV desligada!");
        }else{
            this.volume = this.volume +1;
            //this.volume ++;
        }
    }

    //Diminuir volume (-1)
    public void diminuirVolume(){
        if(this.volume <= 0){
            System.out.println("Volume no Minímo!");
        } else if (!this.ligado) {
            System.out.println("Erro: TV DESLIGADA!");
        }else {
            this.volume --;
            System.out.println("Volume diminuido!");
        }
    }


}