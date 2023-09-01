package pizza;

import java.util.ArrayList;

public class Topping {
    private String nombre;
    private ArrayList<String> ingredientes = new ArrayList();
    private double costo;

    public double getCosto() {
        return this.costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public Topping(String nombre, double costo) {
        this.nombre = nombre;
        this.costo = costo;
    }

    public void agregarIngrediente(String ingrediente) {
        this.ingredientes.add(ingrediente);
    }

    public Topping(String nombre) {
        this.nombre = nombre;
    }

    public String toString() {
        return "Topping: " + this.nombre + " Ingredientes: " + this.ingredientes;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getIngredientes() {
        return this.ingredientes;
    }

    public void setIngredientes(ArrayList<String> ingredientes) {
        this.ingredientes = ingredientes;
    }
}
