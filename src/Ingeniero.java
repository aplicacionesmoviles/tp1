public class Ingeniero  extends Persona {
    public Ingeniero (String nombre) {
        super(nombre);
    }

    @Override
    public int correr() {
        return 7;
    }
    public void sumar (int a, int b) {
        int suma=0;
        suma = a+b;

        System.out.printf("el valor entero es %d", suma);
    }
    public void sumar (float a, float b) {
        float suma=0;
        suma = a+b;

        System.out.printf("el valor float es  es %.2f%n", suma);
    }
    public void saltar() {
        System.out.println("El ingeniero salta para hacer ejercicio.");

    }
}
