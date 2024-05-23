public class CocinarHamburguesa{
    private Hamburguesa hamburguesa;
    public CocinarHamburguesa() {
        hamburguesa = new Hamburguesa();
    }

    public CocinarHamburguesa agregarCarne(String carne) {
        hamburguesa.addCarne(carne);
        return this;
    }

    public CocinarHamburguesa agregarLechuga() {
        hamburguesa.addLechuga(true);
        return this;
    }

    public CocinarHamburguesa agregarTomate() {
        hamburguesa.addTomate(true);
        return this;
    }

    public CocinarHamburguesa agregarCebolla() {
        hamburguesa.addCebolla(true);
        return this;
    }

    public CocinarHamburguesa agregarQueso() {
        hamburguesa.addQueso(true);
        return this;
    }

    public CocinarHamburguesa agregarTocino() {
        hamburguesa.addTocino(true);
        return this;
    }

    public CocinarHamburguesa quitarLechuga() {
        hamburguesa.addLechuga(false);
        return this;
    }
    public Hamburguesa construir() {
        return hamburguesa;
    }
}
