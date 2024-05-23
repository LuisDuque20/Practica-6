class Hamburguesa {
    private String carne;
    private boolean lechuga;
    private boolean tomate;
    private boolean cebolla;
    private boolean queso;
    private boolean tocino;

    public Hamburguesa() {
    }

    public void addCarne(String carne) {
        this.carne = carne;
    }

    public void addLechuga(boolean lechuga) {
        this.lechuga = lechuga;
    }

    public void addTomate(boolean tomate) {
        this.tomate = tomate;
    }

    public void addCebolla(boolean cebolla) {
        this.cebolla = cebolla;
    }

    public void addQueso(boolean queso) {
        this.queso = queso;
    }

    public void addTocino(boolean tocino) {
        this.tocino = tocino;
    }

    @Override
    public String toString() {
        StringBuilder descripcion = new StringBuilder("Hamburguesa: ");
        if (carne != null) {
            descripcion.append(carne).append(", ");
        }
        if (lechuga) {
            descripcion.append("lechuga, ");
        }
        if (tomate) {
            descripcion.append("tomate, ");
        }
        if (cebolla) {
            descripcion.append("cebolla, ");
        }
        if (queso) {
            descripcion.append("queso, ");
        }
        if (tocino) {
            descripcion.append("tocino, ");
        }
        return descripcion.toString().replaceAll(", $", "");
    }
}
