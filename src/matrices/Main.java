package matrices;

public class Main {
    
    int longitud=3000; // variable que determina el tamaño de la matriz

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public static void main(String[] args) {
        
        Sumar suma = new Sumar();
        Restar resta = new Restar();
        Multiplicar multiplicacion = new Multiplicar();
        
        suma.start();
        resta.start();
        multiplicacion.start();
    }
}
