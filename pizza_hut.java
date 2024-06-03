import java.util.Scanner;
public class pizza_hut {

        public static double calcularCostoTotal(String pizza ) {
            double costoTotal = 0.0;

            switch (pizza) {
                case "TRIPACK GRANDE HUT CHEESE":
                    costoTotal = 94.90;
                    break;
                case "COMBO DOBLE GRANDE O NADA":
                    costoTotal = 59.90;
                    break;
                case "COMBO SEMI FULL GRATIS":
                    costoTotal = 59.90;
                    break;
                case "BANQUETE FAMIAR HUT CHEESE":
                    costoTotal = 55.90;
                    break;
                case "TRIPAKC FAMILIAR":
                    costoTotal = 99.90;
                    break;
                case "TRIPE HUT BOX":
                    costoTotal = 64.90;
                    break;
                case "COMBO TRIPLE HUT BOX":
                    costoTotal = 69.90;
                    break;
                case "TRIPAKC GRANDE":
                    costoTotal = 79.90;
                    break;
                case "COMBO TRIPAKC GRANDE HUT CHEESE":
                    costoTotal = 99.90;
                    break;
                case"COMBO SEMI FULL FAMILIAR":
                    costoTotal = 79.90;
                    break;
                case"COMBO SEMI FAMILIAR FULL FAMILIAR HUT CHEESE":
                    costoTotal = 89.90;
                    break;
                case"COMBO DOBLE O NADA FAMILIAR ":
                    costoTotal = 79.90;
                    break;
                case"COMBO DOBLE O NADA FAMILIAR HUT CHEESE ":
                    costoTotal = 79.90;
                    break;
                default: System.out.println("los pizzas no existen");


            }

            return costoTotal;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Bienvenido a Pizza Hut!");
            System.out.println("Nuestros combos disponibles son:");
            System.out.println("1. TRIPACK GRANDE HUT CHEESE");
            System.out.println("2. COMBO DOBLE GRANDE O NADA");
            System.out.println("3. COMBO SEMI FULL GRATIS ");
            System.out.println("4. BANQUETE FAMIAR HUT CHEESE");
            System.out.println("5. TRIPAKC FAMILIAR");
            System.out.println("6. TRIPE HUT BOX");
            System.out.println("7. COMBO TRIPLE HUT BOX");
            System.out.println("8. TRIPAKC GRANDE");
            System.out.println("9. COMBO TRIPAKC GRANDE HUT CHEESE");
            System.out.println("10. COMBO SEMI FULL FAMILIAR");
            System.out.println("11. COMBO SEMI FAMILIAR FULL FAMILIAR HUT CHEESE");
            System.out.println("12. COMBO DOBLE O NADA FAMILIAR ");
            System.out.println("13. COMBO DOBLE O NADA FAMILIAR HUT CHEESE ");


            System.out.print("Ingrese el nombre del combo que desea ordenar: ");
            String combo = scanner.nextLine();

            double costoTotal = calcularCostoTotal(combo.toUpperCase());

            if (costoTotal > 0) {
                System.out.println("El costo total de su orden es: $" + costoTotal);
            }
        }
    }
