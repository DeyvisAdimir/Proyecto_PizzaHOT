import java.util.Scanner;
public class pizza_hut {
    public static double calcularCostoTotal(String ofertas) {
        double costoTotal = 0.0;

        switch (ofertas) {
            case "TRIPACK FAMILIAR":
                costoTotal = 109.90;
                break;
            case "CHEESE BITES":
                costoTotal = 49.90;
                break;
            case "BANQUETE FAMILIAR":
                costoTotal = 49.90;
                break;
            case "COMBO FIJA":
                costoTotal = 24.90;
                break;
            case "COMBO MEDIANO":
                costoTotal = 19.90;
                break;
            case "HUT CHEESE MEDIANO":
                costoTotal = 26.90;
                break;
            case "PIZZA GRANDE DE HUT CHEESE":
                costoTotal = 32.90;
                break;
            case "BANQUETE GRANDE":
                costoTotal = 39.90;
                break;
            case "BANQUETE GRANDE DE CHEESE":
                costoTotal = 45.90;
                break;
            default:
                System.out.println("oferta no disponible");
                costoTotal = 0.0;
                break;
        }

        return costoTotal;
    }

    public static void main(String[] args) {
        Scanner nyx = new Scanner(System.in);

        System.out.println("BIENVENIDO A PIZZA HUT!");
        System.out.println("ESTAS SON NUESTRAS OFERTAS");
        System.out.println("NUESTROS  COMBOS  DISPONIBLES SON:");
        System.out.println("1. TRIPACK FAMILIAR");
        System.out.println("2. CHEESE BITES");
        System.out.println("3. BANQUETE FAMILIAR");
        System.out.println("4. COMBO MEDIANO");
        System.out.println("5. COMBO FIJA");
        System.out.println("6. HUT CHEESE MEDIANO");
        System.out.println("7. PIZZA GRANDE DE HUT CHEESE");
        System.out.println("8. BANQUETE GRANDE");
        System.out.println("9. BANQUETE GRANDE DE CHEESE");

        System.out.print("Ingrese el nombre del combo que desea ordenar: ");
        String ofertas = nyx.nextLine();

        double costoTotal = calcularCostoTotal(ofertas.toUpperCase());

        if (costoTotal > 0) {
            System.out.println("El costo total de su orden es: $" + costoTotal);
        }



    }

}