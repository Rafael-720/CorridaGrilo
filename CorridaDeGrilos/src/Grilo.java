
import java.util.Random;

public class Grilo {

    private int distanciaRandomica;

    //nome do grilo
    private String nome;
    
    public Grilo(String nome){
        this.setNome(nome);
    }
    
    public void pular(){
        this.setDistanciaRandomica(new Random().nextInt(50));
        //this.getDistanciaRandomica();
    }
    
    public int getDistanciaRandomica() {
        return distanciaRandomica;
    }

    public void setDistanciaRandomica(int distanciaRandomica) {
        this.distanciaRandomica = distanciaRandomica;
    }
    
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
}
