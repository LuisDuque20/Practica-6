public class Main {
    public static void main(String[] args) {

        CocinarHamburguesa construirHamburguesa = new CocinarHamburguesa();

        Hamburguesa hamburguesa1 = construirHamburguesa.agregarCarne("pollo").agregarLechuga().agregarTomate().construir();
        Hamburguesa hamburguesa2 = construirHamburguesa.agregarCarne("res").agregarTomate().agregarCebolla().agregarQueso().agregarTocino().quitarLechuga().construir();
        Hamburguesa hamburguesa3 = construirHamburguesa.agregarCarne("tocino").agregarLechuga().agregarTomate().agregarCebolla().agregarQueso().agregarTocino().construir();

        System.out.println("Orden de cliente #1: " + hamburguesa1);
        System.out.println("Orden de cliente #2: " + hamburguesa2);
        System.out.println("Orden de cliente #3: " + hamburguesa3);
    }
}

