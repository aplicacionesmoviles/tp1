public class Deportista extends Persona {
    public Deportista (String nombre) {
        super(nombre);

    }

    @Override
    public int correr() {
        return 3;
    }

    public void saltar () {
        System.out.println("El deportista salta como parte de su entrenamiento.");

    }
}
