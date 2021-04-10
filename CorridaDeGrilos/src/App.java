public class App {
    public static void main(String[] args) throws Exception {
        //numero de grilos
        int numGrilos = 4;
        
        //tamanho da corrida
        int linhaChegada = 200;
        
        //instanciando grilos
        Grilo[] grilos = new Grilo[numGrilos]; 
        
        //criando a corrida
        Corrida corrida;
        
        //inicializando grilos
        for(int i = 0; i < numGrilos; i++){
            grilos[i] = new Grilo("Grilo_" + (i+1));
        }
        
        //iniciando a corrida
        corrida = new Corrida(grilos, linhaChegada);
        
    }
    
}
