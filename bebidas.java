import java.util.Scanner;

public class bebidas {
    public static double calcularCostoTotal(String bebida) {
        double costoTotal = 0.0;

        switch (bebida.toLowerCase()) {
            case "coca cola sin azucar":
                costoTotal = 4.90;
                break;
            case "inka kola sin azucar":
                costoTotal = 4.90;
                break;
            case "sprite":
                costoTotal = 4.90;
                break;
            case "fanta":
                costoTotal = 4.90;
                break;
            case "agua san luis sin gas":
                costoTotal = 4.90;
                break;
            default:
                System.out.println("No disponible");
                costoTotal = 0.0;
                break;
        }

        return costoTotal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Bienvenido a Pizza Hut!");
        System.out.println("Nuestras bebidas disponibles son:");
        System.out.println("1. Coca Cola sin azucar");
        System.out.println("2. Inka Kola sin azucar");
        System.out.println("3. Sprite");
        System.out.println("4. Fanta");
        System.out.println("5. Agua San Luis sin gas");

        System.out.print("Ingrese el nombre de la bebida que desea ordenar: ");
        String bebida = scanner.nextLine();

        double costoTotal = calcularCostoTotal(bebida);

        if (costoTotal > 0) {
            System.out.println("El costo total de su orden es: $" + costoTotal);
        }
    }
}