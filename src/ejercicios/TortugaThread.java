package ejercicios;

public class TortugaThread extends Thread
{
    // Actividad del thread
    public void run()
    {
        int  i = 0;
        System.out.println("Comienza la tortuga.."); 
        while(i<5)
        {
            try
            { 
                Thread.sleep(5000); 
                System.out.println("Tortuga...");
            }
            catch(InterruptedException ex) {} 
            i++;
        }
        System.out.println("Termina la tortuga ….");
    }
}
