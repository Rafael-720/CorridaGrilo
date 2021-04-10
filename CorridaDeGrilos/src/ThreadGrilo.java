public class ThreadGrilo extends Thread{
    
    private Grilo grilo;
    private int linhaChegada;
    private int totalPercorrido = 0;
    private int pulos = 0;
    private static int colocacao = 0;
    

    public ThreadGrilo(Grilo g, int linhaChegada) {
        this.setGrilo(g);
        this.setLinhaChegada(linhaChegada);
        //this.linhaChegada = linhaChegada;
        
    }
    
    
    @Override
    public void run(){
        
        if(totalPercorrido < linhaChegada){
            
            pulos++;
            
            this.grilo.pular();
            
            this.totalPercorrido += this.grilo.getDistanciaRandomica();
            
            if(this.totalPercorrido >= this.linhaChegada){                
                System.out.println("O " + this.grilo.getNome() + " pulou " + this.grilo.getDistanciaRandomica() +
                    "cm e cruzou a linha de chegada percorrendo " + this.totalPercorrido + "cm");
            }else{
                System.out.println("O " + this.grilo.getNome() + " pulou " + this.grilo.getDistanciaRandomica() +
                    "cm e já percorreu " + this.totalPercorrido + "cm");
            }
                    
            this.run();
        }else{
            colocacao++;
            System.out.println(this.grilo.getNome() + " foi o " + colocacao + "° e alcançou a linha de chegada com " + pulos + " pulos");
        }
        
        
        
    }

    public int getTotalPercorrido() {
        return totalPercorrido;
    }

    public void setTotalPercorrido(int totalPercorrido) {
        this.totalPercorrido = totalPercorrido;
    }

    
    public Grilo getGrilo() {
        return grilo;
    }

    public void setGrilo(Grilo grilo) {
        this.grilo = grilo;
    }

    public int getLinhaChegada() {
        return linhaChegada;
    }

    public void setLinhaChegada(int linhaChegada) {
        this.linhaChegada = linhaChegada;
    }

    
    
    
}

