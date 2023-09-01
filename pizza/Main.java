package pizza;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        pizza pizza1 = new pizza("Pizza Clásica", 40.0);
        pizza pizza2 = new pizza("Pizza Especial", 80.0);
        pizza1.addTopping(new Topping("Jamón", 2.5));
        pizza1.addTopping(new Topping("Piña", 4.75));
        pizza1.addTopping(new Topping("Tomate", 3.5));
        pizza2.addTopping(new Topping("Pepperoni", 4.0));
        pizza2.addTopping(new Topping("Atún", 7.25));
        pizza2.addTopping(new Topping("Mozzarella", 6.8));
        System.out.println("Pizzas que te ofrecemos :");
        System.out.println("1. " + pizza1.getName());
        System.out.println("2. " + pizza2.getName());
        System.out.print("Que pizza quires?(escriba el numero): \n");
        int opcion = scanner.nextInt();
        pizza pizzaElegida = null;
        if (opcion == 1) {
            pizzaElegida = pizza1;
        } else {
            if (opcion != 2) {
                System.out.println("NO asi no es.");
                scanner.close();
                return;
            }

            pizzaElegida = pizza2;
        }

        System.out.println("Ingredientes  para la pizza:  " + pizzaElegida.getName() + ":");

        for(int i = 0; i < pizzaElegida.getToppings().size(); ++i) {
            Topping topping = (Topping)pizzaElegida.getToppings().get(i);
            System.out.println("" + i + ". " + topping.getNombre());
        }

        System.out.print("Escribe los números de los ingredientes que quieres (separados por comas): ");
        scanner.nextLine(); // Consumir la línea en blanco anterior
        String[] indicesElegidos = scanner.nextLine().split(",");
        ArrayList<Topping> ingredientesElegidos = new ArrayList<>();
        for (String indice : indicesElegidos) {
            int index = Integer.parseInt(indice.trim());
            Topping toppingElegido = null;
            if (index >= 0 && index < pizzaElegida.getToppings().size()) {
                toppingElegido = pizzaElegida.getToppings().get(index);
            }
            ingredientesElegidos.add(toppingElegido);

            Iterator var16 = ingredientesElegidos.iterator();

            Topping topping;
            while (var16.hasNext()) {
                topping = (Topping) var16.next();
                pizzaElegida.addTopping(topping);
            }

            System.out.println("Su pizza " + pizzaElegida.getName() + " con ingredientes:");
            var16 = pizzaElegida.getToppings().iterator();

            while (var16.hasNext()) {
                topping = (Topping) var16.next();
                System.out.println("- " + topping.getNombre());
            }

            System.out.println("Preparando la pizza...");
            pizzaElegida.prepare();
            double costoTotal = pizzaElegida.calcularCostoTotal();
            System.out.println("Costo total: Q" + costoTotal);
            scanner.close();
        }
    }
}



//modificar esto necesito que el precio de la pizza sea en base al los ingredientes de la pizza
//el price de la pizza
//ventana 1 ingredientes