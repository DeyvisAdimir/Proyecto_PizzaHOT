import java.util.Scanner;
public class PIZZA {
    public static void main(String[] args) {
        Scanner nyx = new Scanner(System.in);
        System.out.println("BIENVENIDO A PIZZA HUT!");
        System.out.println("NUESTRAS OFERTAS SON:");
        System.out.println("1. TRIPACK FAMILIAR : contiene 3 pizzas F .10 palitos ala ceciliana .2 gaseosas - $109.90");
        System.out.println("2. CHEESY BITES: 1 pizza cheesy bites F .1 bebida    - $49.90");
        System.out.println("3. BANQUETE FAMILIAR: 1 pizza familiar . 6 palitos ala ceciliana. 1 bebida - $49.90");
        System.out.println("4. COMBO MEDIANO: 1 pizza mediana .1 bebida personal- $19.90");
        System.out.println("5. COMBO FIJA: 1 pizza grande 1 ingrediente adicional 1bebida - $24.90");
        System.out.println("6. HUT CHEESE MEDIANO: 1 pizza mediana hut cheese- $26.90");
        System.out.println("7. PIZZA GRANDE DE HUT CHEESE: 1 pizza grande de hut cheese - $32.90");
        System.out.println("8. BANQUETE GRANDE: 1 ´pizza gramde 6 palitos ala ceciliana 1 bebida - $39.90");
        System.out.println("9. BANQUETE GRANDE DE CHEESE: 1 pizza grande hut cheese 6 palitos ala ceciliana 1 bebida - $49.90");

        System.out.print("Ingrese el número del combo que desea ordenar: ");
        int oferta = nyx.nextInt();
        double costoTotal = 0;

        switch (oferta) {
            case 1: costoTotal = 109.90; break;
            case 2: costoTotal = 49.90; break;
            case 3: costoTotal = 49.90; break;
            case 4: costoTotal = 19.90; break;
            case 5: costoTotal = 24.90; break;
            case 6: costoTotal = 26.90; break;
            case 7: costoTotal = 32.90; break;
            case 8: costoTotal = 39.90; break;
            case 9: costoTotal = 49.90; break;
            default: System.out.println("Lo sentimos, no tenemos ese combo disponible."); return;
        }

        System.out.println("El costo total de su orden es: $" + costoTotal);


    }

}
