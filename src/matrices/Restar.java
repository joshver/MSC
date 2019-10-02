package matrices;

public class  Restar extends Thread {
    public void run()
    {
        System.out.println("Inicia el procedimiento de resta...");
        
        long TInicio, TFin, tiempo; //Variables para determinar el tiempo de ejecución
        TInicio = System.currentTimeMillis();
        
        Main obj = new Main();
 
        int longitud = obj.getLongitud();
        
        int[][] matriz1 = new int[longitud][longitud];
        int[][] matriz2 = new int[longitud][longitud];
        
        int[][] resultado = new int[longitud][longitud];
        
        // Ciclo que crea las matrices con numeros aleatorios
        for (int i = 0; i < longitud; i++) {
            for (int j = 0; j < longitud; j++) {
                matriz1[i][j] = (int) (Math.random()*100);
                matriz2[i][j] = (int) (Math.random()*100);
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        
        TFin = System.currentTimeMillis();
        tiempo = TFin - TInicio;
                
        System.out.println("Proceso de restar terminado. Tiempo de ejecución: "+tiempo+" milisegundos");
    }
}
