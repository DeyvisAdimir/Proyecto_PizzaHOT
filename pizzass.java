import java.util.Scanner;

public class pizzass {
    public static void main(String[] args) {
        Scanner JOEY = new Scanner(System.in);
        int elejir;

        do {
            System.out.println("Bienvenido a Pizza Hut");
            System.out.println("1. Ordenar pizza");
            System.out.println("2. Ver menú");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            elejir = JOEY.nextInt();

            switch (elejir) {
                case 1:
                    ordenarpizza();
                    break;
                case 2:
                    mostrarmenu();
                    break;
                case 3:
                    System.out.println("Gracias por su visita a nuestro local");
                    break;
                default:
                    System.out.println("Opción no válida, escoja otra");
            }
        } while (elejir != 3);

        JOEY.close();
    }

    public static void ordenarpizza() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione su pedido porfavor");
        System.out.println("1.Americana");
        System.out.println("2.Peperoni");
        System.out.println("3.Mozarella");
        System.out.println("4.Hawaiana");
        System.out.println("5.Continental");
        System.out.println("6.Vegetariana");
        System.out.println("7.Suprema");
        System.out.println("8.Meat lovers");
        System.out.println("9.Super suprema");
        System.out.println("10.La chili hut");
        System.out.println("11.Chicken BBQ");
        System.out.println("12.XL clasica");
        System.out.println("13.Con 3 ingredientes");
        System.out.print("Ingrese el número correspondiente a la pizza que desea: ");
        int mostrarpizza = scanner.nextInt();

        switch (mostrarpizza) {
            case 1:
                System.out.println("Ha ordenado una pizza Americana");
                break;
            case 2:
                System.out.println("Ha ordenado una pizza de Peperoni");
                break;
            case 3:
                System.out.println("Ha ordenado una pizza de Mozarella");
                break;
            case 4:
                System.out.println("Ha ordenado una pizza Hawaiana");
                break;
            case 5:
                System.out.println("Ha ordenado una pizza Continental");
                break;
            case 6:
                System.out.println("Ha ordenado una pizza Vegetariana");
                break;
            case 7:
                System.out.println("Ha ordenado una pizza Suprema");
                break;
            case 8:
                System.out.println("Ha ordenado una pizza Meta lovers");
                break;
            case 9:
                System.out.println("Ha ordenado una pizza Super suprema");
                break;
            case 10:
                System.out.println("Ha ordenado una pizza La chili hut");
                break;
            case 11:
                System.out.println("Ha ordenado una pizza Chicken BBQ");
                break;
            case 12:
                System.out.println("Ha ordenado una pizza XL clasica");
                break;
            default:
                System.out.println("Opción no válida, seleccione otra opcion");
        }
    }

    public static void mostrarmenu() {
        System.out.println("------Menu pizza hut------");
        System.out.println("Bienvenido a pizzaHut ");
        System.out.println("Seleccione una opcion");
        System.out.println("1.Americana - S/.26.90");
        System.out.println("2.Peperoni - S/.26.90");
        System.out.println("3.Mozarella - S/.26.90");
        System.out.println("4.Hawaiana - S/.32.90");
        System.out.println("5.Continental - S/.32.90");
        System.out.println("6.Vegetariana - S/.32.90");
        System.out.println("7.Suprema - S/.32.90");
        System.out.println("8.Meat lovers - S/.39.90");
        System.out.println("9.Super suprema - S/.39.90");
        System.out.println("10.La chili hut- S/.39.90");
        System.out.println("11.Chicken BBQ - S/.39.90");
        System.out.println("12.XL clasica - S/.64.90");
        System.out.println("13.Con 3 ingredientes - S/.27.90");
    }
}