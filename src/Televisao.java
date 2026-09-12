// Encapsulamento - Private, protected e public

public class Televisao {

    // Atributos da classe televisão
    private int canal;
    private int volume ;
    private boolean ligado ;
    private String marca;



//    Metodos da classe televisão


    // Metodos de acesso - Acessores GETTERS
    public int getCanal() {
        return canal;

    }

    public int getVolume() {
        return volume;
    }

    public boolean getLigado() {
        return ligado;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
}