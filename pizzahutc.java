import java.util.Scanner;

public class pizzahutc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = getMenuSelection(scanner);
        if (choice == -1) {
            System.out.println("Selección no válida.");
            scanner.close();
            return;
        }

        PizzaOption selectedPizza = selectPizzaOption(choice);
        printReceipt(selectedPizza);
        scanner.close();
    }

    private static int getMenuSelection(Scanner scanner) {
        System.out.println("Seleccione una oferta de pizza:");
        System.out.println("1. La Fija");
        System.out.println("2. 2x1 Pizzas Medianas");
        System.out.println("3. Hut Completo Mediano");
        System.out.println("4. Doble o Nada Familiar");
        System.out.println("5. Combo Pizza XL");
        System.out.println("6. Doble o Nada Grande");
        System.out.println("7. Súper Combo del Hincha");
        System.out.println("8. Huts del Hincha");

        int choice = scanner.nextInt();
        if (choice < 1 || choice > 8) {
            return -1;
        }
        return choice;
    }

    private static PizzaOption selectPizzaOption(int choice) {
        switch (choice) {
            case 1:
                return new PizzaOption("La Fija", 19.90, "Ármala de la forma que prefieras y con el ingrediente que más te guste.");
            case 2:
                return new PizzaOption("2x1 Pizzas Medianas", 20.90, "2 Pizzas Medianas en Americana, Pepperoni o Mozzarella.");
            case 3:
                return new PizzaOption("Hut Completo Mediano", 39.90, "2 Pizzas M, 6 Palitos a la Siciliana y Bebida de 1L.");
            case 4:
                return new PizzaOption("Doble o Nada Familiar", 72.90, "2 Pizzas Fam. a un precio especial.");
            case 5:
                return new PizzaOption("Combo Pizza XL", 69.90, "1 Pizza XL Clásica y 1 Gas. 1L.");
            case 6:
                return new PizzaOption("Doble o Nada Grande", 44.90, "2 Pizzas Grandes a un precio especial.");
            case 7:
                return new PizzaOption("Súper Combo del Hincha", 49.90, "2 Pizzas Grandes + 6 palitos a la Siciliana + 1 Bebida 1L.");
            case 8:
                return new PizzaOption("Huts del Hincha", 39.90, "2 Pizzas Grandes a precio especial.");
            default:
                return null;
        }
    }

    private static void printReceipt(PizzaOption pizza) {
        System.out.println("\n----- BOLETA -----");
        System.out.println("Producto seleccionado: " + pizza.getName());
        System.out.println("Descripción: " + pizza.getDescription());
        System.out.println("Precio: S/ " + pizza.getPrice());
        System.out.println("Gracias por su compra!");
    }

    static class PizzaOption {
        private String name;
        private double price;
        private String description;

        public PizzaOption(String name, double price, String description) {
            this.name = name;
            this.price = price;
            this.description = description;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        public String getDescription() {
            return description;
        }
    }
}
