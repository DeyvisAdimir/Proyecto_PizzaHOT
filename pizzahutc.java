import java.util.Scanner;

public class pizzahutc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
        String itemName = "";
        double price = 0;
        String description = "";

        switch (choice) {
            case 1:
                itemName = "La Fija";
                price = 19.90;
                description = "Ármala de la forma que prefieras y con el ingrediente que más te guste.";
                break;
            case 2:
                itemName = "2x1 Pizzas Medianas";
                price = 20.90;
                description = "2 Pizzas Medianas en Americana, Pepperoni o Mozzarella.";
                break;
            case 3:
                itemName = "Hut Completo Mediano";
                price = 39.90;
                description = "2 Pizzas M, 6 Palitos a la Siciliana y Bebida de 1L.";
                break;
            case 4:
                itemName = "Doble o Nada Familiar";
                price = 72.90;
                description = "2 Pizzas Fam. a un precio especial.";
                break;
            case 5:
                itemName = "Combo Pizza XL";
                price = 69.90;
                description = "1 Pizza XL Clásica y 1 Gas. 1L.";
                break;
            case 6:
                itemName = "Doble o Nada Grande";
                price = 44.90;
                description = "2 Pizzas Grandes a un precio especial.";
                break;
            case 7:
                itemName = "Súper Combo del Hincha";
                price = 49.90;
                description = "2 Pizzas Grandes + 6 palitos a la Siciliana + 1 Bebida 1L.";
                break;
            case 8:
                itemName = "Huts del Hincha";
                price = 39.90;
                description = "2 Pizzas Grandes a precio especial.";
                break;
            default:
                System.out.println("Selección no válida.");
                return;
        }

        printReceipt(itemName, price, description);
        scanner.close();
    }

    private static void printReceipt(String itemName, double price, String description) {
        System.out.println("\n----- BOLETA -----");
        System.out.println("Producto seleccionado: " + itemName);
        System.out.println("Descripción: " + description);
        System.out.println("Precio: S/ " + price);
        System.out.println("Gracias por su compra!");
    }
}

