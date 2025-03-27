package Tienda;

public class Ropa extends Producto implements Categoria {
    private String Marca;
    private String Talla;
    private String Color;

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getTalla() {
        return Talla;
    }

    public void setTalla(String talla) {
        Talla = talla;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    @Override
    public Ropa CrearObjeto() {
        return new Ropa();
    }
}
