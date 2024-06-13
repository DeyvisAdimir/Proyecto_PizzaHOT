import java.util.Scanner;
public class pizzahut {
    private int cant_productos, opcion, subopcion ;

    private Scanner scanner = new Scanner(System.in);

    public void fSeleccionProducto() {

        System.out.println("Seleccione el tipo de producto");
        System.out.println(" 1 sona de hinchas ");

        System.out.println(" 2 ofertas");
        System.out.println(" 3 para Salsas \n4 para Bebidas \n5 para Antojitos");
        System.out.println(" 6 envio gratis");

        opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                fsonadeinchas();break;
            case 2:
                fseleccionofertas();
                break;
            case 3:
                fseleccionSalsas();
                break;
            case 4:
                fSeleccionBebidas();
                break;
            case 5:
                fSeleccionAntojitos();
                break;
            case 6:
                fseleccionenviogratis();break;


            default:
                System.out.println("Opción no válida.");
        }

    }
    public void fsonadeinchas(){
        System.out.println("sona de hinchas :");

        System.out.println("1: huts del hincha:");
        System.out.println("2: super combo del hincha: ");
        System.out.println("3: combo pizza xl: ");
        System.out.println("4: Combo doble o nada familiar: ");
        System.out.println("5: doble nada huts cheese");
        System.out.println("6: hut completo mediano: ");
        System.out.println("7: 2 *1 en pizzas medianas :");
        System.out.println("8: la fija: ");
        subopcion = scanner.nextInt();
        System.out.println("ingrese la cantidad de pedidos ");
        cant_productos = scanner.nextInt();
    }
    public void fseleccionofertas(){
        System.out.println("nuestras ofertasa son:");

        System.out.println("1: Combo Tripack Familiar:");
        System.out.println("2: Combo Cheesy Bites: ");
        System.out.println("3: Banquete: ");
        System.out.println("4: Combo Mediano: ");
        System.out.println("5: Combo La Fija:");
        System.out.println("6: Hut Cheese Mediano: ");
        System.out.println("7: Pizza Grande Cheese Hut:");
        System.out.println("8: Banquete Grande: ");
        System.out.println("9: Banquete Grande Hut Cheese: ");
        subopcion = scanner.nextInt();
        System.out.println("ingrese la cantidad de pedidos");
        cant_productos = scanner.nextInt();




    }
    public void fseleccionSalsas(){
        System.out.println("Seleccione el tipo de Salsa");
        System.out.println("Marque 1 para Mayohut \n2 para Salsa Honey \n3 para Salsa Aji de la Casa");
        subopcion = scanner.nextInt();
        System.out.println("Ingrese la cantidad de Salsas que desea pedir");
        cant_productos = scanner.nextInt();
    }

    public void fSeleccionBebidas() {
        System.out.println("Seleccione el tipo de Bebidas");
        System.out.println("Marque 1 para Coca-Cola \n2 para Pepsi \n3 para Sprite");
        subopcion = scanner.nextInt();
        System.out.println("Ingrese la cantidad de Gaseosas que desea pedir");
        cant_productos = scanner.nextInt();
    }

    public void fSeleccionAntojitos() {
        System.out.println("Seleccione el tipo de Antojitos");
        System.out.println("Marque 1 para Alitas \n2 para Nuggets \n3 para Papas Fritas");
        subopcion = scanner.nextInt();
        System.out.println("Ingrese la cantidad de Bocaditos que desea pedir");
        cant_productos = scanner.nextInt();
    }
    public void fseleccionenviogratis(){
        System.out.println("nuestras envios gratis son:");

        System.out.println("1:  Tripack grande hut cheese:");
        System.out.println("2: combo boble o nada grande: ");
        System.out.println("3: combo semi full grande: ");
        System.out.println("4: banquete familiar hut cheese: ");
        System.out.println("5: tripack familiar:");
        System.out.println("6: triple hut box: ");
        System.out.println("7: combo triple hut box:");
        System.out.println("8: tripack grande: ");
        System.out.println("9: combo tripack grande hut cheese: ");
        System.out.println("10: combo semi full familiar: ");
        System.out.println("11: combo semi full familiar hut cheese: ");
        System.out.println("12: combo doble o nada familiar: ");
        System.out.println("13: combo doble o nada familiar hut cheese: ");
        subopcion = scanner.nextInt();
        System.out.println("ingrese la cantridad de pedidos");
        cant_productos = scanner.nextInt();


    }

    public void fPago() {
        double precioPorProducto = 0;
        String producto = "";

        switch (opcion) {
            case 1:
                producto ="sonadehinchas";
                switch (subopcion){
                    case 1:
                        precioPorProducto = 39.90;
                        producto = "huts del hincha";break;
                    case 2:
                        precioPorProducto = 49.90;
                        producto = "super combo del hincha";break;
                    case 3:
                        precioPorProducto = 69.90;
                        producto = "combo pizza xl";break;
                    case 4:
                        precioPorProducto = 72.90;
                        producto = "combo doble o nada familiar";break;
                    case 5:
                        precioPorProducto = 79.90;
                        producto = "doble o nada huts cheese";break;
                    case 6:
                        precioPorProducto = 39.90;
                        producto = "hut completo mediano";break;
                    case 7:
                        precioPorProducto = 20.90;
                        producto = "2*1 pizza mediana";break;
                    case 8:
                        precioPorProducto = 19.90;
                        producto = "la fija";
                    default:
                        System.out.println("opcion no valida");
                }
                break;

            case 2:
                producto = "ofertas";
                switch (subopcion) {
                    case 1:
                        precioPorProducto = 109.90;
                        producto = "Combo Tripack Familiar";
                        break;
                    case 2:
                        precioPorProducto = 49.90;
                        producto = "Combo Cheesy Bites";
                        break;
                    case 3:
                        precioPorProducto = 49.90;
                        producto = "Banquete";
                        break;
                    case 4:
                        precioPorProducto = 19.90;
                        producto = "Combo Mediano";
                        break;
                    case 5:
                        precioPorProducto = 24.90;
                        producto = "Combo La Fija";
                        break;
                    case 6:
                        precioPorProducto = 26.90;
                        producto = "Hut Cheese Mediano";
                        break;
                    case 7:
                        precioPorProducto = 32.90;
                        producto = "Pizza Grande Cheese";
                        break;
                    case 8:
                        precioPorProducto = 39.90;
                        producto = "Banquete Grande";
                        break;
                    case 9:
                        precioPorProducto = 45.90;
                        producto = " Banquete Grande Hut Cheese";
                    default:
                        System.out.println("opcion no valida");
                }
                break;
            case 3:
                producto = "Salsas";
                switch (subopcion) {
                    case 1:
                        precioPorProducto = 1.50;
                        producto = "Mayohut";
                        break;
                    case 2:
                        precioPorProducto = 1.50;
                        producto = "Salsa Honey";
                        break;
                    case 3:
                        precioPorProducto = 1.50;
                        producto = "Salsa Aji de la Casa";
                        break;
                    default:
                        System.out.println("Opción no válida para Salsas.");
                        return;
                }
                break;
            case 4:
                producto = "Bebidas";
                switch (subopcion) {
                    case 1:
                        precioPorProducto = 4.90;
                        producto = "Coca-Cola";
                        break;
                    case 2:
                        precioPorProducto = 4.90;
                        producto = "Inca-kola";
                        break;
                    case 3:
                        precioPorProducto = 4.90;
                        producto = "Sprite";
                        break;
                    default:
                        System.out.println("Opción no válida para Bebidas.");
                        return;
                }
                break;
            case 5:
                producto = "Antojitos";
                switch (subopcion) {
                    case 1:
                        precioPorProducto = 15.90;
                        producto = "Alitas";
                        break;
                    case 2:
                        precioPorProducto = 13.90;
                        producto = "Hut Bread";
                        break;
                    case 3:
                        precioPorProducto = 10.90;
                        producto = "Pan al Ajo";
                        break;
                    default:
                        System.out.println("Opción no válida para Antojitos.");
                        return;
                }
                break;
            case 6:
                producto = "envio gratis ";
                switch (subopcion){
                    case 1:
                        precioPorProducto = 94.90;
                        producto = "Tripack grande hut cheese";
                        break;
                    case 2:
                        precioPorProducto =59.90;
                        producto = "combo boble o nada grande";
                        break;
                    case 3:
                        precioPorProducto = 59.90;
                        producto = "combo semi full grande";
                        break;
                    case 4:
                        precioPorProducto = 55.90;
                        producto = "banquete familiar hut cheese";
                        break;
                    case 5:
                        precioPorProducto =99.90;
                        producto = "tripack familiar";
                        break;
                    case 6:
                        precioPorProducto = 64.90;
                        producto = "triple hut box";
                        break;
                    case 7:
                        precioPorProducto = 69.90;
                        producto = "combo triple hut box";
                        break;
                    case 8:
                        precioPorProducto =79.90;
                        producto = "tripack grande";
                        break;
                    case 9:
                        precioPorProducto = 99.90;
                        producto = "combo tripack grande hut cheese";
                        break;
                    case 10:
                        precioPorProducto = 79.90;
                        producto = "combo semi full familiar";
                        break;
                    case 11:
                        precioPorProducto =89.90;
                        producto = "combo semi full familiar hut cheese";
                        break;
                    case 12:
                        precioPorProducto = 79.90;
                        producto = "combo doble o nada familiar";
                        break;
                    case 13:
                        precioPorProducto = 89.90;
                        producto = "combo doble o nada familiar hut cheese";
                        break;
                    default:
                        System.out.println("Opción no válida para Antojitos.");
                        return;


                }break;

        }

        double subtotal = cant_productos * precioPorProducto;
        double igv = subtotal * 0.18;
        double totalPagar = subtotal + igv;

        System.out.println("SUBTOTAL por " + cant_productos + " " + producto + ": " + subtotal);
        System.out.println("IGV: " + igv);
        System.out.println("TOTAL A PAGAR: " + totalPagar);
    }

    public void fUbicacionPedido() {
        System.out.println("Su pedido está siendo preparado.");
        System.out.println("Su pedido llegara en unos minutos.");
    }

    public static void main(String[] args) {
        System.out.println("----BIENVENIDO A PIZZA HUT----");
        int opcionSalir = 0;
        do {
            pizzahut pizzaHut = new pizzahut();
            pizzaHut.fSeleccionProducto();
            pizzaHut.fPago();
            pizzaHut.fUbicacionPedido();

            System.out.println("¿Desea realizar otro pedido? (1) Sí, (2) No");
            opcionSalir = pizzaHut.scanner.nextInt();

        }while (opcionSalir == 1);
    }



}
