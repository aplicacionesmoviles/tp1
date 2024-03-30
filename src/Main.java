public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        Ingeniero i= new Ingeniero("ale");
        Deportista d = new Deportista("messi");
        //System.out.println(i.correr());
        //System.out.println(d.correr());
        i.sumar(2,8);
        i.sumar(2.33f,8.66f);
        i.saltar();
        d.saltar();
    }

}