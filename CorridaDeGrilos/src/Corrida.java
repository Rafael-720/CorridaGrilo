
public class Corrida {
    
    //variavel responsavel por armazenar o valor da linha d chegada
    private int linhaChegada;

    //instanciando threads
    ThreadGrilo[] threads;
    
    public Corrida(Grilo[] grilos, int linhaChegada){
        
        //this.linhaChegada = linhaChegada;
        this.setLinhaChegada(linhaChegada);
        
        threads = new ThreadGrilo[grilos.length];
        
        //iniciando as threads
        for(int i = 0; i < grilos.length; i++){
            threads[i] = new ThreadGrilo(grilos[i], this.getLinhaChegada());
            threads[i].start();   
            //System.out.println("Thread " + i + " iniciada");
        }
//        for(int i = 0; i < grilos.length; i++){
//            try {
//                threads[i].join();
//                //System.out.println("o " + threads[i].getGrilo().getNome() + " foi o " + (i + 1) + "° colocado");
//            } catch (InterruptedException ex) {
//                //Logger.getLogger(Corrida.class.getName()).log(Level.SEVERE, null, ex);
//                ex.printStackTrace();
//            }
//        }
    }

    public int getLinhaChegada() {
        return this.linhaChegada;
    }

    public void setLinhaChegada(int linhaChegada) {
        this.linhaChegada = linhaChegada;
    }
    
}