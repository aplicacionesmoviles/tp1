//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
interface Saltador {
    void saltar();
}
public abstract class Persona {
    private String nombre;
    public String getNombre () {
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    //constructor
    public Persona (String nombre){
        super();
        this.nombre = nombre;
    }
    public abstract int correr();

}
