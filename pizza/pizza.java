package pizza;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class pizza {
    private String name;
    private double price;
    private List<Topping> toppings = new ArrayList();

    public pizza(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void addTopping(Topping topping) {
        this.toppings.add(topping);
    }

    public void removeTopping(int index) {
        this.toppings.remove(index);
    }

    public String toString() {
        return "pizza: " + this.name + " price: " + this.price;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<Topping> getToppings() {
        return this.toppings;
    }

    public void prepare() {
        System.out.println("Y la que cocine..." + this.name);
        System.out.println("Agregando sus mezclas...");
        Iterator var1 = this.toppings.iterator();

        while(var1.hasNext()) {
            Topping topping = (Topping)var1.next();
            System.out.println("-" + topping.getNombre());

            try {
                Thread.sleep(1000L);
            } catch (Exception var4) {
                System.out.printf(var4.getMessage());
            }
        }


        System.out.println("Listo puede ir a comer ");
    }

    public double calcularCostoTotal() {
        double costoTotal = this.price;

        Topping topping;
        for(Iterator var3 = this.toppings.iterator(); var3.hasNext(); costoTotal += topping.getCosto()) {
            topping = (Topping)var3.next();
        }

        return costoTotal;
    }
}
