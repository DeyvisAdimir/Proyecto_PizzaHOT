import java.io.File;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import java.io.FileWriter;
import java.io.IOException;
public class pizza3 {
    Scanner maiden = new Scanner(System.in);
    String[] promosfutboleras = {"COMBO GOLEADOR $35.90"
            , "BOX FUTBOLERO $49.90"
            , "COMBO PIZZA XL $69.90"
            , "DOBLE O NADA FAMILIAR $72.90"
            , "DOBLE O NADA HUT CHEESE $79.90"
            , "HUT COMPLETO MEDIANO $39.90"
            , "2*1 PIZZAS MEDIANAS $20.90"
            , "LA FIJA $19.90",};


    String[] enviogratis = {"TRIPACK GRANDE DE HUT $99.90"
            , "COMBO DOBLE O NADA GRANDE $59.90"
            , "COMBO SEMI FULL GRANDE $59.90"
            , "BANQUETE FAMILIAR HUT CHEESE $55.90"
            , "TRIPACK FAMILIAR $99.90"
            , "TRIPACK HUT BOX $64.90"
            , "COMBO TRIPE HUT BOX $69.90"
            , "TRIPACK GRANDE $79.90"
            , "COMBO TRIPACK GRANDE HUT CHEESE $99.90"
            , "COMBO SEMI FULL FAMILIAR $79.90"
            , "COMBO SEMI FULL FAMILIAR HUT CHEESE $89.90"
            , "COMBO DOBLE O NADA FAMILIAR $79.90"
            , "COMBO DOBLE O NADA FAMILIAR HUT CHEESE $89.90"};
    String[] ofertas = {"COMBO TRIPACK FAMILIAR $109.90"
            , "COMBO CHEESY BITES $49.90"
            , "DOBLE O NADA GRANDE $44.90"
            , "BANQUETE FAMILIAR $49.90"
            , "COMBO MEDIANO $19.90"
            , "HUT COMBO MEDIANO $22.90"
            , "COMBO LA FIJA $24.90"
            , "HUT CHEESE MEDIANO $26.90"
            , "PIZZA GRANDE HUT CHEESE $32.90"
            , "BANQUETE GRANDE HUT CHEESE $45.90"};
    String[] pizza = {"AMERICANA $26.90"
            , "PEPERONI $26.90"
            , "MOZARELLA $26.90"
            , "PERUANA $29.90"
            , "ARGENTINA $29.90"
            , "HAWAYANA $32.90"
            , "CONTINEMTAL $32.90"
            , "VEGETARIANA $32.90"
            , "SUPREMA $32.90"
            , "MEAT LOVERS $39.90"
            , "SUPER SUPREMA $39.90"
            , "LA CHILI HUT $39.90"
            , "CHIKEN BBQ $39.90"
            , "XL CLASICA $69.90"};
    String[] ntojitos = {"PÁLITOS ALA SECILIANA $11.90"
            , "PAN DE AJO $10.90"
            , "PAN AJO ESPECIAL $13.90"
            , "ROLLS DE JAMON Y QUESO $15.90"
            , "ALITAS $15.90"
            , "HUT BREAD $13.90"
            , "HUT CHURROS (4UN) $ 5.90"
            , "ROLLS DE MAJAR (6UN) $6.90"
            , "TARTA DE MANZANA $5.90"
            , "VOLCAN DE LIMON $ 7.90"
            , "VOLCAN DE CHOCALETE $7.90"
            , "MAYO HUT $1.50"
            , "SALSA HONEY BBQ 1 OZ $ 1.50"
            , "SALSA CHILI THAL 1OZ $1.50"
            , "SALSA MEDIATERRANEA 1OZ $1.50"
            , "SALSA AJI DE LA CASA 1OZ $1.50"


    };
    String[] bebidas = {" COCA COLA SIN  AZUCAR $4.90"
            , "INKA COLA SIN AZUCAR $4.90"
            , "SPRITE $4.90"
            , "FANTA $4.90"
            , "AGUA SAN LUIS"
    };

    Random random = new Random();
    int s = random.nextInt(ofertas.length);
    double[] Precio_promofutbolera = {35.90, 49.90, 69.90, 72.90, 39.90, 20.90, 19.90};
    double[] subtotal_extra = {99.90, 0, 0, 0, 0};
    double[] precio_enviogratis = {99.90
            , 59.90
            , 59.90
            , 55.90, 99.90, 64.90, 69.90, 79.90, 99.90, 79.90, 89.90, 79.90, 89.90};
    double[] precio_ofertas = {109.90, 49.90, 44.90, 49.90, 19.90, 22.90, 24.90, 26.90, 32.90, 39.90, 45.90,};
    double[] precio_pizza = {26.90, 26.90, 26.90, 29.90, 29.90, 32.90, 32.90, 32.90, 32.90, 39.90, 39.90, 39.90, 39.90, 69.90};
    double[] precio_antojitos = {11.90, 10.90, 13.90, 15.90, 15.90, 13.90, 5.90, 6.90, 5.90, 7.90, 7.90, 1.50, 1.50, 1.50, 1.50, 1.50};
    double[] precio_bebidas = {4.90, 4.90, 4.90, 4.90, 4.90};
    double igv, subtotal, totalpagar;
    int[] carrito = new int[promosfutboleras.length];
    int[] carrito_enviogratris = new int[enviogratis.length];
    int[] carrito_oferta = new int[ofertas.length];
    int[] carrito_pizza = new int[pizza.length];
    int[] carrito_ntojitos = new int[ntojitos.length];
    int[] carrito_bebidas = new int[bebidas.length];

    String respuesta;
    int opcion, cantidad;

    public String MenuPrincipal() {
        System.out.println("---------BIENVENIDO A PIZZA HUT -----------");
        System.out.println("   _____ _____ ____________           _    _ _    _ _______ \n" +
                " |  __ \\_   _|___  /___  /   /\\     | |  | | |  | |__   __|\n" +
                " | |__) || |    / /   / /   /  \\    | |__| | |  | |  | |   \n" +
                " |  ___/ | |   / /   / /   / /\\ \\   |  __  | |  | |  | |   \n" +
                " | |    _| |_ / /__ / /__ / ____ \\  | |  | | |__| |  | |   \n" +
                " |_|   |_____/_____/_____/_/    \\_\\ |_|  |_|\\____/   |_|   \n" +
                "                                                           \n" +
                "                                                            ");
        System.out.println(" ____                   \n" +
                "/\\\t\t\t\n" +
                "  uu| _______    \n" +
                "    \\ | .-''#%&%#``-.   \n" +
                "   = / ((%&%&VK&%&))  \n" +
                "    | `-._#%&##&%_.-'   \n" +
                " /\\/\\`--. `-.\"\".-'\n" +
                " | | \\ /`./          \n" +
                " |\\/| \\`-'/\n" +
                " || | \\ / VK");

        System.out.println("Marque alguna de las siguientes opciones");
        System.out.println(" 1.- PROMO FUTBOLERAS");
        System.out.println(" 2.- ENVIO GRATIS");
        System.out.println(" 3.- OFERTAS");
        System.out.println(" 4.- PIZZA");
        System.out.println(" 5.- ANTOJITOS");
        System.out.println(" 6.- BEBIDAS ");



        opcion = maiden.nextInt();
        maiden.nextLine();
        switch (opcion) {
            case 1:
                this.Comprarpromosfutboleras();
                break;

            case 2:
                this.Comprarenviogratis();
                break;

            case 3:
                this.comprarofertas();
                break;
            case 4:
                this.comprarpizza();
                break;
            case 5:
                this.comprarantojitos();
                break;
            case 6:
                this.comprarbebidas();
                break;

            default:
                System.out.println("Opcion no válida");
                this.MenuPrincipal();
                break;

        }

        return null;
    }

    public String Comprarpromosfutboleras() {
        System.out.println("------ PROMOS FUTBOLERAS------------");
        System.out.println(" ___\n" +
                "      .:::---:::.\n" +
                "    .'--: :--'.\n" +
                "   /.' \\ / `.\\\n" +
                "  | /'._ /:::\\ _.'\\ |\n" +
                "  |/ |:::::| \\|\n" +
                "  |:\\ .''-:::-''. /:|\n" +
                "   \\:| `|` |:/\n" +
                "    '.'._.:::._.'.'\n" +
                "   '-::::::::-'");
        System.out.println("Seleccione su pedido a  comprar");
        for (int i = 0; i < promosfutboleras.length; i++) {
            System.out.println("Opcion " + (i + 1) + " : " + promosfutboleras[i]);
        }
        opcion = maiden.nextInt();
        maiden.nextLine();
        switch (opcion) {
            case 1:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad = maiden.nextInt();
                carrito[0] += cantidad;
                System.out.println("Ud ha pedido " + carrito[0] + "pizza de " + promosfutboleras[0]);
                System.out.println("¿Desea elegir otro menú más?  1 SI/ 2 NO / 3 Menu Principal");
                opcion = maiden.nextInt();
                maiden.nextLine();
                if (opcion == 1) {
                    System.out.println("Volviendo a la opción de compra");
                    this.Comprarpromosfutboleras();
                } else if (opcion == 2) {
                    this.Pagopromosfutboleras();
                } else if (opcion == 3) {
                    this.Pagopromosfutboleras();
                } else if (opcion == 4) {
                    this.Pagopromosfutboleras();
                } else if (opcion == 5){
                    this.MenuPrincipal();
                } else {
                    System.out.println("Opcion no válida");
                }

                break;

            case 2:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad = maiden.nextInt();
                carrito[1] += cantidad;
                System.out.println("Ud ha pedido " + carrito[1] + "pizza de " + promosfutboleras[1]);

                System.out.println("¿Desea elegir otro menú más?  1 SI/ 2 NO / 3 Menu Principal");
                opcion = maiden.nextInt();
                maiden.nextLine();
                if (opcion == 1) {
                    System.out.println("Volviendo a la opción de compra");
                    this.Comprarenviogratis();
                } else if (opcion == 2) {
                    this.Pagopromosfutboleras();
                } else if (opcion == 3) {
                    this.Pagopromosfutboleras();
                }else if(opcion==4) {
                    this.Pagopromosfutboleras();
                }else if(opcion==5){
                    this.MenuPrincipal();
                } else {
                    System.out.println("Opcion no válida");
                }

                break;

            case 3:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad = maiden.nextInt();
                carrito[2] += cantidad;
                System.out.println("Ud ha pedido " + carrito[2] + "pizza de " + promosfutboleras[2]);

                System.out.println("¿Desea elegir otro menú más?  1 SI/ 2 NO / 3 Menu Principal");
                opcion = maiden.nextInt();
                maiden.nextLine();
                if (opcion == 1) {
                    System.out.println("Volviendo a la opción de compra");
                    this.Comprarenviogratis();
                } else if (opcion == 2) {
                    this.Pagopromosfutboleras();
                } else if (opcion == 3) {
                    this.Pagopromosfutboleras();
                }else if(opcion==4) {
                    this.Pagopromosfutboleras();
                }else if(opcion==5){
                    this.MenuPrincipal();
                } else {
                    System.out.println("Opcion no válida");
                }

                break;

            case 4:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad = maiden.nextInt();
                carrito[3] += cantidad;
                System.out.println("Ud ha pedido " + carrito[3] + "pizza de " + promosfutboleras[3]);

                System.out.println("¿Desea elegir otro menú más?  1 SI/ 2 NO / 3 Menu Principal");
                opcion = maiden.nextInt();
                maiden.nextLine();
                if (opcion == 1) {
                    System.out.println("Volviendo a la opción de compra");
                    this.Comprarenviogratis();
                } else if (opcion == 2) {
                    this.Pagopromosfutboleras();
                } else if (opcion == 3) {
                    this.Pagopromosfutboleras();
                }else if(opcion==4) {
                    this.Pagopromosfutboleras();
                }else if(opcion==5){
                    this.MenuPrincipal();
                } else {
                    System.out.println("Opcion no válida");
                }

                break;

            case 5:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad = maiden.nextInt();
                carrito[4] += cantidad;
                System.out.println("Ud ha pedido " + carrito[4] + "pizza de " + promosfutboleras[4]);

                System.out.println("¿Desea elegir otro menú más?  1 SI/ 2 NO / 3 Menu Principal");
                opcion = maiden.nextInt();
                maiden.nextLine();
                if (opcion == 1) {
                    System.out.println("Volviendo a la opción de compra");
                    this.Comprarenviogratis();
                } else if (opcion == 2) {
                    this.Pagopromosfutboleras();
                } else if (opcion == 3) {
                    this.Pagopromosfutboleras();
                }else if(opcion==4) {
                    this.Pagopromosfutboleras();
                }else if(opcion==5){
                    this.MenuPrincipal();
                } else {
                    System.out.println("Opcion no válida");
                }

                break;

            case 6:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad = maiden.nextInt();
                carrito[5] += cantidad;
                System.out.println("Ud ha pedido " + carrito[5] + "pizza de " + promosfutboleras[5]);

                System.out.println("¿Desea elegir otro menú más?  1 SI/ 2 NO / 3 Menu Principal");
                opcion = maiden.nextInt();
                maiden.nextLine();
                if (opcion == 1) {
                    System.out.println("Volviendo a la opción de compra");
                    this.Comprarenviogratis();
                } else if (opcion == 2) {
                    this.Pagopromosfutboleras();
                } else if (opcion == 3) {
                    this.Pagopromosfutboleras();
                }else if(opcion==4) {
                    this.Pagopromosfutboleras();
                }else if(opcion==5){
                    this.MenuPrincipal();
                } else {
                    System.out.println("Opcion no válida");
                }

                break;


            case 7:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad = maiden.nextInt();
                carrito[6] += cantidad;
                System.out.println("Ud ha pedido " + carrito[6] + "pizza de " + promosfutboleras[6]);

                System.out.println("¿Desea elegir otro menú más?  1 SI/ 2 NO / 3 Menu Principal");
                opcion = maiden.nextInt();
                maiden.nextLine();
                if (opcion == 1) {
                    System.out.println("Volviendo a la opción de compra");
                    this.Comprarenviogratis();
                } else if (opcion == 2) {
                    this.Pagopromosfutboleras();
                } else if (opcion == 3) {
                    this.Pagopromosfutboleras();
                }else if(opcion==4) {
                    this.Pagopromosfutboleras();
                }else if(opcion==5){
                    this.MenuPrincipal();
                } else {
                    System.out.println("Opcion no válida");
                }

                break;

            case 8:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad = maiden.nextInt();
                carrito[7] += cantidad;
                System.out.println("Ud ha pedido " + carrito[7] + "pizza de " + promosfutboleras[7]);

                System.out.println("¿Desea elegir otro menú más?  1 SI/ 2 NO / 3 Menu Principal");
                opcion = maiden.nextInt();
                maiden.nextLine();
                if (opcion == 1) {
                    System.out.println("Volviendo a la opción de compra");
                    this.Comprarenviogratis();
                } else if (opcion == 2) {
                    this.Pagopromosfutboleras();
                } else if (opcion == 3) {
                    this.Pagopromosfutboleras();
                }else if(opcion==4) {
                    this.Pagopromosfutboleras();
                }else if(opcion==5){
                    this.MenuPrincipal();
                } else {
                    System.out.println("Opcion no válida");
                }

                break;

            case 9:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad = maiden.nextInt();

                carrito[8] += cantidad;
                System.out.println("Ud ha pedido " + carrito[8] + "pizza de " + promosfutboleras[8]);

                System.out.println("¿Desea elegir otro menú más?  1 SI/ 2 NO / 3 Menu Principal");
                opcion = maiden.nextInt();
                maiden.nextLine();
                if (opcion == 1) {
                    System.out.println("Volviendo a la opción de compra");
                    this.Comprarenviogratis();
                } else if (opcion == 2) {
                    this.Pagopromosfutboleras();
                } else if (opcion == 3) {
                    this.MenuPrincipal();
                } else if (opcion == 4) {
                    this.pagopizza();
                } else if (opcion == 5) {
                    this.pagobebida();
                } else if (opcion == 6) {
                    this.pagoofertas();
                } else if (opcion == 7) {
                    this.Pagoantogitos();
                } else if (opcion == 8){
                    this.pagoenviogratis();


                } else {
                    System.out.println("Opcion no válida");
                }


                break;

            default:
                System.out.println("Opcion no válida");
                this.MenuPrincipal();
                break;


        }


        return null;
    }

    public double Pagopromosfutboleras() {
        double cantidadtotalpromofutboleras = Arrays.stream(carrito).sum();
        double subtotalenviosgratis=Arrays.stream(carrito_enviogratris).sum();

        double subtotalofertas = Arrays.stream(carrito_oferta).sum();
        double subtotalpizza = Arrays.stream(carrito_pizza).sum();
        double subtotalbebidas = Arrays.stream(carrito_bebidas).sum();
        double subtotalantojitos = Arrays.stream(carrito_ntojitos).sum();

        double subtotal0 = (cantidadtotalpromofutboleras * Precio_promofutbolera[0]) + subtotalenviosgratis+ subtotalpizza+subtotalofertas+subtotalantojitos+subtotalbebidas;
        igv = subtotal0
                *Precio_promofutbolera[1]
                *precio_enviogratis[1]
                *precio_ofertas[1]
                *precio_pizza[1]
                *precio_antojitos[1]
                *precio_bebidas[1];
        subtotal = subtotal0 - igv;
        totalpagar = subtotal + igv;

        System.out.println("----BOLETA DE VENTA---------");
        System.out.println(" SUBTOTAL :" + subtotal);
        System.out.println(" IGV :" + igv);
        System.out.println(" TOTAL :" + totalpagar);
        this.ExportarBoleta();
        return totalpagar;
    }

    public String Comprarenviogratis() {
        System.out.println("------ ENVIO GRATIS----------");
        System.out.println("            ___\n" +
                "             / _\\\n" +
                "             | /\\_|\n" +
                "          __-'' _'\n" +
                "         ----'-.\n" +
                "            |#\\#)_,_\n" +
                "            )##\\__ _\\__.-.\n" +
                "    - .- (###)'---. `.\n" +
                " - __\\____`.#\\( ) L(|\n" +
                "   .'__//\\ \\#)`-._.' /\\\\==.\n" +
                "  /_/_//\\_\\_ /#/ ### / //\\\\ \\\n" +
                "   |(________(##)___/-' '| (_) |\n" +
                "____\\___/_________________\\___/____________________________________");
        System.out.println("Seleccione envio gratis ");
        for (int i = 0; i < enviogratis.length; i++) {
            System.out.println("Opcion " + (i + 1) + " : " + enviogratis[i]);
        }
        opcion = maiden.nextInt();
        maiden.nextLine();
        switch (opcion) {
            case 1:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad = maiden.nextInt();
                carrito_enviogratris[0] += cantidad;
                System.out.println("Ud ha pedido " + carrito_enviogratris[0] + "PIZZA de " + enviogratis[0]);
                subtotal_extra[0] = carrito_enviogratris[0] * Precio_promofutbolera[2];
                System.out.println("¿Desea elegir otro menú más?  1 SI/ 2 NO / 3 Menu Principal");
                opcion = maiden.nextInt();
                maiden.nextLine();
                if (opcion == 1) {
                    System.out.println("Volviendo a la opción de compra");
                    this.Comprarpromosfutboleras();
                } else if (opcion == 2) {
                    this.Pagopromosfutboleras();
                } else if (opcion == 3) {
                    this.Pagopromosfutboleras();
                } else if (opcion == 4) {
                    this.Pagopromosfutboleras();
                } else if (opcion==5){
                    this.MenuPrincipal();
                } else {
                    System.out.println("Opcion no válida");
                }

                break;

            case 2:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad = maiden.nextInt();
                carrito_enviogratris[1] += cantidad;
                System.out.println("Ud ha pedido " + carrito_enviogratris[1] + "PIZZA de " + enviogratis[1]);
                subtotal_extra[1] = carrito_enviogratris[1] * Precio_promofutbolera[3];
                System.out.println("¿Desea elegir otro menú más?  1 SI/ 2 NO / 3 Menu Principal");
                opcion = maiden.nextInt();
                maiden.nextLine();
                if (opcion == 1) {
                    System.out.println("Volviendo a la opción de compra");
                    this.Comprarpromosfutboleras();
                } else if (opcion == 2) {
                    this.Pagopromosfutboleras();
                } else if (opcion == 3) {
                    this.Pagopromosfutboleras();
                }else if (opcion == 4) {
                    this.Pagopromosfutboleras();
                }else if (opcion==5){
                    this.MenuPrincipal();
                } else {
                    System.out.println("Opcion no válida");
                }

                break;
            case 3:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad = maiden.nextInt();

                carrito_enviogratris[2] += cantidad;
                System.out.println("Ud ha pedido " + carrito_enviogratris[2] + "PIZZA de " + enviogratis[2]);
                subtotal_extra[2] = carrito_enviogratris[2] * Precio_promofutbolera[4];
                System.out.println("¿Desea elegir otro menú más?  1 SI/ 2 NO / 3 Menu Principal");
                opcion = maiden.nextInt();
                maiden.nextLine();
                if (opcion == 1) {
                    System.out.println("Volviendo a la opción de compra");
                    this.Comprarpromosfutboleras();
                } else if (opcion == 2) {
                    this.Pagopromosfutboleras();
                } else if (opcion == 3) {
                    this.Pagopromosfutboleras();
                }else if (opcion == 4) {
                    this.Pagopromosfutboleras();
                }else if (opcion==5){
                    this.MenuPrincipal();
                } else {
                    System.out.println("Opcion no válida");
                }

            case 4:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad = maiden.nextInt();

                carrito_enviogratris[3] += cantidad;
                System.out.println("Ud ha pedido " + carrito_enviogratris[3] + "PIZZA de " + enviogratis[2]);
                subtotal_extra[3] = carrito_enviogratris[3] * Precio_promofutbolera[5];
                System.out.println("¿Desea elegir otro menú más?  1 SI/ 2 NO / 3 Menu Principal");
                opcion = maiden.nextInt();
                maiden.nextLine();
                if (opcion == 1) {
                    System.out.println("Volviendo a la opción de compra");
                    this.Comprarpromosfutboleras();
                } else if (opcion == 2) {
                    this.Pagopromosfutboleras();
                } else if (opcion == 3) {
                    this.Pagopromosfutboleras();
                }else if (opcion == 4) {
                    this.Pagopromosfutboleras();
                }else if (opcion==5){
                    this.MenuPrincipal();
                } else {
                    System.out.println("Opcion no válida");
                }


                break;

            case 5:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad = maiden.nextInt();

                carrito_enviogratris[4] += cantidad;
                System.out.println("Ud ha pedido " + carrito_enviogratris[4] + "PIZZA de " + enviogratis[2]);
                subtotal_extra[4] = carrito_enviogratris[4] * Precio_promofutbolera[5];
                System.out.println("¿Desea elegir otro menú más?  1 SI/ 2 NO / 3 Menu Principal");
                opcion = maiden.nextInt();
                maiden.nextLine();
                if (opcion == 1) {
                    System.out.println("Volviendo a la opción de compra");
                    this.Comprarpromosfutboleras();
                } else if (opcion == 2) {
                    this.Pagopromosfutboleras();
                } else if (opcion == 3) {
                    this.Pagopromosfutboleras();
                }else if (opcion == 4) {
                    this.Pagopromosfutboleras();
                }else if (opcion==5){
                    this.MenuPrincipal();
                } else {
                    System.out.println("Opcion no válida");
                }


                break;

            case 6:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad = maiden.nextInt();

                carrito_enviogratris[5] += cantidad;
                System.out.println("Ud ha pedido " + carrito_enviogratris[5] + "PIZZA de " + enviogratis[2]);
                subtotal_extra[5] = carrito_enviogratris[5] * Precio_promofutbolera[5];
                System.out.println("¿Desea elegir otro menú más?  1 SI/ 2 NO / 3 Menu Principal");
                opcion = maiden.nextInt();
                maiden.nextLine();
                if (opcion == 1) {
                    System.out.println("Volviendo a la opción de compra");
                    this.Comprarpromosfutboleras();
                } else if (opcion == 2) {
                    this.Pagopromosfutboleras();
                } else if (opcion == 3) {
                    this.Pagopromosfutboleras();
                }else if (opcion == 4) {
                    this.Pagopromosfutboleras();
                }else if (opcion==5){
                    this.MenuPrincipal();
                } else {
                    System.out.println("Opcion no válida");
                }


                break;

            case 7:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad = maiden.nextInt();

                carrito_enviogratris[6] += cantidad;
                System.out.println("Ud ha pedido " + carrito_enviogratris[6] + "PIZZA de " + enviogratis[2]);
                subtotal_extra[6] = carrito_enviogratris[6] * Precio_promofutbolera[5];
                System.out.println("¿Desea elegir otro menú más?  1 SI/ 2 NO / 3 Menu Principal");
                opcion = maiden.nextInt();
                maiden.nextLine();
                if (opcion == 1) {
                    System.out.println("Volviendo a la opción de compra");
                    this.Comprarpromosfutboleras();
                } else if (opcion == 2) {
                    this.Pagopromosfutboleras();
                } else if (opcion == 3) {
                    this.Pagopromosfutboleras();
                }else if (opcion == 4) {
                    this.Pagopromosfutboleras();
                }else if (opcion==5){
                    this.MenuPrincipal();
                } else {
                    System.out.println("Opcion no válida");
                }


                break;

            case 8:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad = maiden.nextInt();

                carrito_enviogratris[7] += cantidad;
                System.out.println("Ud ha pedido " + carrito_enviogratris[7] + "PIZZA de " + enviogratis[2]);
                subtotal_extra[7] = carrito_enviogratris[7] * Precio_promofutbolera[5];
                System.out.println("¿Desea elegir otro menú más?  1 SI/ 2 NO / 3 Menu Principal");
                opcion = maiden.nextInt();
                maiden.nextLine();
                if (opcion == 1) {
                    System.out.println("Volviendo a la opción de compra");
                    this.Comprarpromosfutboleras();
                } else if (opcion == 2) {
                    this.Pagopromosfutboleras();
                } else if (opcion == 3) {
                    this.Pagopromosfutboleras();
                }else if (opcion == 4) {
                    this.Pagopromosfutboleras();
                }else if (opcion==5){
                    this.MenuPrincipal();
                } else {
                    System.out.println("Opcion no válida");
                }


                break;

            case 9:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad = maiden.nextInt();

                carrito_enviogratris[8] += cantidad;
                System.out.println("Ud ha pedido " + carrito_enviogratris[8] + "PIZZA de " + enviogratis[2]);
                subtotal_extra[8] = carrito_enviogratris[8] * Precio_promofutbolera[5];
                System.out.println("¿Desea elegir otro menú más?  1 SI/ 2 NO / 3 Menu Principal");
                opcion = maiden.nextInt();
                maiden.nextLine();
                if (opcion == 1) {
                    System.out.println("Volviendo a la opción de compra");
                    this.Comprarpromosfutboleras();
                } else if (opcion == 2) {
                    this.Pagopromosfutboleras();
                } else if (opcion == 3) {
                    this.Pagopromosfutboleras();
                }else if (opcion == 4) {
                    this.Pagopromosfutboleras();
                }else if (opcion==5){
                    this.MenuPrincipal();
                } else {
                    System.out.println("Opcion no válida");
                }


                break;

            case 10:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad = maiden.nextInt();

                carrito_enviogratris[9] += cantidad;
                System.out.println("Ud ha pedido " + carrito_enviogratris[9] + "PIZZA de " + enviogratis[2]);
                subtotal_extra[9] = carrito_enviogratris[9] * Precio_promofutbolera[5];
                System.out.println("¿Desea elegir otro menú más?  1 SI/ 2 NO / 3 Menu Principal");
                opcion = maiden.nextInt();
                maiden.nextLine();
                if (opcion == 1) {
                    System.out.println("Volviendo a la opción de compra");
                    this.Comprarpromosfutboleras();
                } else if (opcion == 2) {
                    this.Pagopromosfutboleras();
                } else if (opcion == 3) {
                    this.Pagopromosfutboleras();
                }else if (opcion == 4) {
                    this.Pagopromosfutboleras();
                }else if (opcion==5){
                    this.MenuPrincipal();
                } else {
                    System.out.println("Opcion no válida");
                }


                break;

            case 11:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad = maiden.nextInt();

                carrito_enviogratris[10] += cantidad;
                System.out.println("Ud ha pedido " + carrito_enviogratris[10] + "PIZZA de " + enviogratis[2]);
                subtotal_extra[10] = carrito_enviogratris[10] * Precio_promofutbolera[5];
                System.out.println("¿Desea elegir otro menú más?  1 SI/ 2 NO / 3 Menu Principal");
                opcion = maiden.nextInt();
                maiden.nextLine();
                if (opcion == 1) {
                    System.out.println("Volviendo a la opción de compra");
                    this.Comprarpromosfutboleras();
                } else if (opcion == 2) {
                    this.Pagopromosfutboleras();
                } else if (opcion == 3) {
                    this.Pagopromosfutboleras();
                }else if (opcion == 4) {
                    this.Pagopromosfutboleras();
                }else if (opcion==5){
                    this.MenuPrincipal();
                } else {
                    System.out.println("Opcion no válida");
                }


                break;

            case 12:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad = maiden.nextInt();

                carrito_enviogratris[11] += cantidad;
                System.out.println("Ud ha pedido " + carrito_enviogratris[11] + "PIZZA de " + enviogratis[2]);
                subtotal_extra[11] = carrito_enviogratris[11] * Precio_promofutbolera[5];
                System.out.println("¿Desea elegir otro menú más?  1 SI/ 2 NO / 3 Menu Principal");
                opcion = maiden.nextInt();
                maiden.nextLine();
                if (opcion == 1) {
                    System.out.println("Volviendo a la opción de compra");
                    this.Comprarpromosfutboleras();
                } else if (opcion == 2) {
                    this.Pagopromosfutboleras();
                } else if (opcion == 3) {
                    this.Pagopromosfutboleras();
                }else if (opcion == 4) {
                    this.Pagopromosfutboleras();
                }else if (opcion==5){
                    this.MenuPrincipal();
                } else {
                    System.out.println("Opcion no válida");
                }


                break;

            case 13:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad = maiden.nextInt();

                carrito_enviogratris[12] += cantidad;
                System.out.println("Ud ha pedido " + carrito_enviogratris[12] + "PIZZA de " + enviogratis[2]);
                subtotal_extra[12] = carrito_enviogratris[12] * Precio_promofutbolera[5];
                System.out.println("¿Desea elegir otro menú más?  1 SI/ 2 NO / 3 Menu Principal");
                opcion = maiden.nextInt();
                maiden.nextLine();
                if (opcion == 1) {
                    System.out.println("Volviendo a la opción de compra");
                    this.Comprarpromosfutboleras();
                } else if (opcion == 2) {
                    this.Pagopromosfutboleras();
                } else if (opcion == 3) {
                    this.Pagopromosfutboleras();
                }else if (opcion == 4) {
                    this.Pagopromosfutboleras();
                }else if (opcion==5){
                    this.MenuPrincipal();
                } else {
                    System.out.println("Opcion no válida");
                }


                break;
            case 14:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad = maiden.nextInt();

                carrito_enviogratris[13] += cantidad;
                System.out.println("Ud ha pedido " + carrito_enviogratris[13] + "PIZZA de " + enviogratis[3]);
                subtotal_extra[13] = carrito_enviogratris[13] * Precio_promofutbolera[6];
                System.out.println("¿Desea elegir otro menú más?  1 SI/ 2 NO / 3 Menu Principal");
                opcion = maiden.nextInt();
                maiden.nextLine();
                if (opcion == 1) {
                    System.out.println("Volviendo a la opción de compra");
                    this.Comprarpromosfutboleras();
                } else if (opcion == 2) {
                    this.Pagopromosfutboleras();
                } else if (opcion == 3) {
                    this.Pagopromosfutboleras();
                }else if (opcion == 4) {
                    this.Pagopromosfutboleras();
                }else if(opcion==5){
                    this.MenuPrincipal();
                } else {
                    System.out.println("Opcion no válida");
                }


                break;


            default:
                System.out.println("Opcion no válida");
                this.MenuPrincipal();
                break;


        }


        return null;
    }
    public double pagoenviogratis() {
        double cantidadtotalpromofutboleras = Arrays.stream(carrito).sum();
        double subtotalenviosgratis=Arrays.stream(carrito_enviogratris).sum();

        double subtotalofertas = Arrays.stream(carrito_oferta).sum();
        double subtotalpizza = Arrays.stream(carrito_pizza).sum();
        double subtotalbebidas = Arrays.stream(carrito_bebidas).sum();
        double subtotalantojitos = Arrays.stream(carrito_ntojitos).sum();

        double subtotal0 = (cantidadtotalpromofutboleras * Precio_promofutbolera[0]) + subtotalenviosgratis+ subtotalpizza+subtotalofertas+subtotalantojitos+subtotalbebidas;
        igv = subtotal0 * Precio_promofutbolera[1]*precio_enviogratis[1]
                *precio_ofertas[1]
                *precio_pizza[1]
                *precio_antojitos[1]
                *precio_bebidas[1];
        subtotal = subtotal0 - igv;
        totalpagar = subtotal + igv;

        System.out.println("----BOLETA DE VENTA---------");
        System.out.println(" SUBTOTAL :" + subtotal);
        System.out.println(" IGV :" + igv);
        System.out.println(" TOTAL :" + totalpagar);
        this.ExportarBoleta();
        return totalpagar;
    }

    public String comprarofertas() {
        System.out.println("------ OFERTAS-----------");
        System.out.println(" ._ \n" +
                "                                   ,( `-. \n" +
                "                                 ,': `. `. \n" +
                "                               ,` * `-. \\ \n" +
                "                             ,' ` :+ = `. `. \n" +
                "                           ,~ (o): ., `. `. \n" +
                "                         ,' ; : ,(__ ) x;` ; \n" +
                "                       ,' :' itz ; ; _,-' ; \n" +
                "                     = _  OFERTAS\n" +
                "                   ' C , OFERTAS\n" +
                "                 ; ;(_) 0 ; ',' : \n" +
                "               .';6 ; ' ,-'~ \n" +
                "             ,' Q ,& ;',-.' \n" +
                "           ,( :` ; _,-'~ ; \n" +
                "         ,~.`c _', ' \n" +
                "       .';^_,-' ~ \n" +
                "     ,'_;-'' \n" +
                "    ,,~ \n" +
                "    i' \n" +
                "    : ");
        System.out.println("   ___  _____ _____ ____ _____  _    ____  \n" +
                "  / _ \\|  ___| ____|  _ \\_   _|/ \\  / ___| \n" +
                " | | | | |_  |  _| | |_) || | / _ \\ \\___ \\ \n" +
                " | |_| |  _| | |___|  _ < | |/ ___ \\ ___) |\n" +
                "  \\___/|_|   |_____|_| \\_\\|_/_/   \\_\\____/ \n" +
                "                                           ");
        System.out.println("Seleccione su pedido a  comprar");
        for (int i = 0; i < ofertas.length; i++) {
            System.out.println("Opcion " + (i + 1) + " : " + ofertas[i]);
        }
        opcion = maiden.nextInt();
        maiden.nextLine();
        switch (opcion) {
            case 1:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad = maiden.nextInt();
                carrito[0] += cantidad;
                System.out.println("Ud ha pedido " + carrito[0] + "pizza de " + promosfutboleras[0]    );
                System.out.println("¿Desea elegir otro menú más?  1 SI/ 2 NO / 3 Menu Principal");
                opcion = maiden.nextInt();
                maiden.nextLine();
                if (opcion == 1) {
                    System.out.println("Volviendo a la opción de compra");
                    this.Comprarenviogratis();
                } else if (opcion == 2) {
                    this.Pagopromosfutboleras();
                } else if (opcion == 3) {
                    this.MenuPrincipal();
                } else {
                    System.out.println("Opcion no válida");
                }

                break;

            case 2:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad = maiden.nextInt();
                carrito[1] += cantidad;
                System.out.println("Ud ha pedido " + carrito[1] + "pizza de " + promosfutboleras[1]);

                System.out.println("¿Desea elegir otro menú más?  1 SI/ 2 NO / 3 Menu Principal");
                opcion = maiden.nextInt();
                maiden.nextLine();
                if (opcion == 1) {
                    System.out.println("Volviendo a la opción de compra");
                    this.Comprarenviogratis();
                } else if (opcion == 2) {
                    this.Pagopromosfutboleras();
                } else if (opcion == 3) {
                    this.MenuPrincipal();
                } else {
                    System.out.println("Opcion no válida");
                }

                break;

            case 3:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad = maiden.nextInt();
                carrito[2] += cantidad;
                System.out.println("Ud ha pedido " + carrito[2] + "pizza de " + promosfutboleras[2]);

                System.out.println("¿Desea elegir otro menú más?  1 SI/ 2 NO / 3 Menu Principal");
                opcion = maiden.nextInt();
                maiden.nextLine();
                if (opcion == 1) {
                    System.out.println("Volviendo a la opción de compra");
                    this.Comprarenviogratis();
                } else if (opcion == 2) {
                    this.Pagopromosfutboleras();
                } else if (opcion == 3) {
                    this.MenuPrincipal();
                } else {
                    System.out.println("Opcion no válida");
                }

                break;

            case 4:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad = maiden.nextInt();
                carrito[3] += cantidad;
                System.out.println("Ud ha pedido " + carrito[3] + "pizza de " + promosfutboleras[3]);

                System.out.println("¿Desea elegir otro menú más?  1 SI/ 2 NO / 3 Menu Principal");
                opcion = maiden.nextInt();
                maiden.nextLine();
                if (opcion == 1) {
                    System.out.println("Volviendo a la opción de compra");
                    this.Comprarenviogratis();
                } else if (opcion == 2) {
                    this.Pagopromosfutboleras();
                } else if (opcion == 3) {
                    this.MenuPrincipal();
                } else {
                    System.out.println("Opcion no válida");
                }

                break;

            case 5:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad = maiden.nextInt();
                carrito[4] += cantidad;
                System.out.println("Ud ha pedido " + carrito[4] + "pizza de " + promosfutboleras[4]);

                System.out.println("¿Desea elegir otro menú más?  1 SI/ 2 NO / 3 Menu Principal");
                opcion = maiden.nextInt();
                maiden.nextLine();
                if (opcion == 1) {
                    System.out.println("Volviendo a la opción de compra");
                    this.Comprarenviogratis();
                } else if (opcion == 2) {
                    this.Pagopromosfutboleras();
                } else if (opcion == 3) {
                    this.MenuPrincipal();
                } else {
                    System.out.println("Opcion no válida");
                }

                break;

            case 6:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad = maiden.nextInt();
                carrito[5] += cantidad;
                System.out.println("Ud ha pedido " + carrito[5] + "pizza de " + promosfutboleras[5]);

                System.out.println("¿Desea elegir otro menú más?  1 SI/ 2 NO / 3 Menu Principal");
                opcion = maiden.nextInt();
                maiden.nextLine();
                if (opcion == 1) {
                    System.out.println("Volviendo a la opción de compra");
                    this.Comprarenviogratis();
                } else if (opcion == 2) {
                    this.Pagopromosfutboleras();
                } else if (opcion == 3) {
                    this.MenuPrincipal();
                } else {
                    System.out.println("Opcion no válida");
                }

                break;

            case 7:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad = maiden.nextInt();
                carrito[6] += cantidad;
                System.out.println("Ud ha pedido " + carrito[6] + "pizza de " + promosfutboleras[6]);

                System.out.println("¿Desea elegir otro menú más?  1 SI/ 2 NO / 3 Menu Principal");
                opcion = maiden.nextInt();
                maiden.nextLine();
                if (opcion == 1) {
                    System.out.println("Volviendo a la opción de compra");
                    this.Comprarenviogratis();
                } else if (opcion == 2) {
                    this.Pagopromosfutboleras();
                } else if (opcion == 3) {
                    this.MenuPrincipal();
                } else {
                    System.out.println("Opcion no válida");
                }

                break;

            case 8:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad = maiden.nextInt();
                carrito[7] += cantidad;
                System.out.println("Ud ha pedido " + carrito[7] + "pizza de " + promosfutboleras[7]);

                System.out.println("¿Desea elegir otro menú más?  1 SI/ 2 NO / 3 Menu Principal");
                opcion = maiden.nextInt();
                maiden.nextLine();
                if (opcion == 1) {
                    System.out.println("Volviendo a la opción de compra");
                    this.Comprarenviogratis();
                } else if (opcion == 2) {
                    this.Pagopromosfutboleras();
                } else if (opcion == 3) {
                    this.MenuPrincipal();
                } else {
                    System.out.println("Opcion no válida");
                }

                break;

            case 9:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad = maiden.nextInt();
                carrito[8] += cantidad;
                System.out.println("Ud ha pedido " + carrito[8] + "pizza de " + promosfutboleras[8]);

                System.out.println("¿Desea elegir otro menú más?  1 SI/ 2 NO / 3 Menu Principal");
                opcion = maiden.nextInt();
                maiden.nextLine();
                if (opcion == 1) {
                    System.out.println("Volviendo a la opción de compra");
                    this.Comprarenviogratis();
                } else if (opcion == 2) {
                    this.Pagopromosfutboleras();
                } else if (opcion == 3) {
                    this.MenuPrincipal();
                } else {
                    System.out.println("Opcion no válida");
                }

                break;

            case 10:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad = maiden.nextInt();
                carrito[9] += cantidad;
                System.out.println("Ud ha pedido " + carrito[9] + "pizza de " + promosfutboleras[9]);

                System.out.println("¿Desea elegir otro menú más?  1 SI/ 2 NO / 3 Menu Principal");
                opcion = maiden.nextInt();
                maiden.nextLine();
                if (opcion == 1) {
                    System.out.println("Volviendo a la opción de compra");
                    this.Comprarenviogratis();
                } else if (opcion == 2) {
                    this.Pagopromosfutboleras();
                } else if (opcion == 3) {
                    this.MenuPrincipal();
                } else {
                    System.out.println("Opcion no válida");
                }

                break;

            case 11:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad = maiden.nextInt();

                carrito[10] += cantidad;
                System.out.println("Ud ha pedido " + carrito[10] + "pizza de " + promosfutboleras[10]);

                System.out.println("¿Desea elegir otro menú más?  1 SI/ 2 NO / 3 Menu Principal");
                opcion = maiden.nextInt();
                maiden.nextLine();
                if (opcion == 1) {
                    System.out.println("Volviendo a la opción de compra");
                    this.Comprarenviogratis();
                } else if (opcion == 2) {
                    this.Pagopromosfutboleras();
                } else if (opcion == 3) {
                    this.MenuPrincipal();
                } else {
                    System.out.println("Opcion no válida");
                }


                break;

            default:
                System.out.println("Opcion no válida");
                this.MenuPrincipal();
                break;


        }


        return null;
    }

    public double pagoofertas() {
        double cantidadtotalpromofutboleras = Arrays.stream(carrito).sum();
        double subtotalenviosgratis=Arrays.stream(carrito_enviogratris).sum();

        double subtotalofertas = Arrays.stream(carrito_oferta).sum();
        double subtotalpizza = Arrays.stream(carrito_pizza).sum();
        double subtotalbebidas = Arrays.stream(carrito_bebidas).sum();
        double subtotalantojitos = Arrays.stream(carrito_ntojitos).sum();

        double subtotal0 = (cantidadtotalpromofutboleras * Precio_promofutbolera[0]) + subtotalenviosgratis+ subtotalpizza+subtotalofertas+subtotalantojitos+subtotalbebidas;
        igv = subtotal0 * Precio_promofutbolera[1]*precio_enviogratis[1]
                *precio_ofertas[1]
                *precio_pizza[1]
                *precio_antojitos[1]
                *precio_bebidas[1];
        subtotal = subtotal0 - igv;
        totalpagar = subtotal + igv;
        System.out.println("----BOLETA DE VENTA---------");
        System.out.println(" SUBTOTAL :" + subtotal);
        System.out.println(" IGV :" + igv);
        System.out.println(" TOTAL :" + totalpagar);
        this.ExportarBoleta();
        return totalpagar;
    }

    public String comprarpizza() {
        System.out.println("------ PIZZA------------");
        System.out.println("___ \n" +
                "                        | ~~--. \n" +
                "                        |%=@%%/ \n" +
                "                        |o%%%/ \n" +
                "                     __ |%%o/ \n" +
                "               _,--~~ | |(_/ ._ \n" +
                "            ,/' m%%%%| |o/ / `\\. \n" +
                "           /' m%%o(_)%| |/ /o%%m `\\ \n" +
                "         /' %%@=%o %%%o| /(_)o%%% `\\ \n" +
                "        / %o%%%%%=@%% /%%o%%@=%% \\ \n" +
                "       | %%| /%%%=@(_)%%% | \n" +
                "       %%o%%%%o%%%(_|/%o%%o%%%%o%%% | \n" +
                "       | %%o %(_)%%%%%o%(_)%%%o%%o%o%% ( \n" +
                "       _)%%=@%(_)%o%o%%(_)%o( | _)% | \n" +
                "        \\ ~%%o%%%%%o%o%=@%%o%%@%%o%~ / \n" +
                "         \\. ~o%%(_)%%%o%(_)% %(_)o~ ,/ \n" +
                "           \\_ ~o%=@%(_)%o%%(_)%~ _/ \n" +
                "             `\\_~~o%%%o%%%%%~~_/' \n" +
                "                `--..____,,--' ");
        System.out.println("Seleccione su pedido a  comprar");
        for (int i = 0; i < pizza.length; i++) {
            System.out.println("Opcion " + (i + 1) + " : " + pizza[i]);
        }
        opcion = maiden.nextInt();
        maiden.nextLine();
        switch (opcion) {
            case 1:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad = maiden.nextInt();
                carrito[0] += cantidad;
                System.out.println("Ud ha pedido " + carrito[0] + "pizza de " + pizza[0]);
                System.out.println("¿Desea elegir otro menú más?  1 SI/ 2 NO / 3 Menu Principal");
                opcion = maiden.nextInt();
                maiden.nextLine();
                if (opcion == 1) {
                    System.out.println("Volviendo a la opción de compra");
                    this.Comprarenviogratis();
                } else if (opcion == 2) {
                    this.Pagopromosfutboleras();
                } else if (opcion == 3) {
                    this.MenuPrincipal();
                } else {
                    System.out.println("Opcion no válida");
                }

                break;

            case 2:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad = maiden.nextInt();
                carrito[1] += cantidad;
                System.out.println("Ud ha pedido " + carrito[1] + "pizza de " + pizza[1]);

                System.out.println("¿Desea elegir otro menú más?  1 SI/ 2 NO / 3 Menu Principal");
                opcion = maiden.nextInt();
                maiden.nextLine();
                if (opcion == 1) {
                    System.out.println("Volviendo a la opción de compra");
                    this.Comprarenviogratis();
                } else if (opcion == 2) {
                    this.Pagopromosfutboleras();
                } else if (opcion == 3) {
                    this.MenuPrincipal();
                } else {
                    System.out.println("Opcion no válida");
                }

                break;
            case 3:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad = maiden.nextInt();
                carrito[2] += cantidad;
                System.out.println("Ud ha pedido " + carrito[2] + "pizza de " + pizza[2]);

                System.out.println("¿Desea elegir otro menú más?  1 SI/ 2 NO / 3 Menu Principal");
                opcion = maiden.nextInt();
                maiden.nextLine();
                if (opcion == 1) {
                    System.out.println("Volviendo a la opción de compra");
                    this.Comprarenviogratis();
                } else if (opcion == 2) {
                    this.Pagopromosfutboleras();
                } else if (opcion == 3) {
                    this.MenuPrincipal();
                } else {
                    System.out.println("Opcion no válida");
                }

                break;

            case 4:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad = maiden.nextInt();
                carrito[3] += cantidad;
                System.out.println("Ud ha pedido " + carrito[3] + "pizza de " + pizza[3]);

                System.out.println("¿Desea elegir otro menú más?  1 SI/ 2 NO / 3 Menu Principal");
                opcion = maiden.nextInt();
                maiden.nextLine();
                if (opcion == 1) {
                    System.out.println("Volviendo a la opción de compra");
                    this.Comprarenviogratis();
                } else if (opcion == 2) {
                    this.Pagopromosfutboleras();
                } else if (opcion == 3) {
                    this.MenuPrincipal();
                } else {
                    System.out.println("Opcion no válida");
                }

                break;
            case 5:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad = maiden.nextInt();
                carrito[4] += cantidad;
                System.out.println("Ud ha pedido " + carrito[4] + "pizza de " + pizza[4]);

                System.out.println("¿Desea elegir otro menú más?  1 SI/ 2 NO / 3 Menu Principal");
                opcion = maiden.nextInt();
                maiden.nextLine();
                if (opcion == 1) {
                    System.out.println("Volviendo a la opción de compra");
                    this.Comprarenviogratis();
                } else if (opcion == 2) {
                    this.Pagopromosfutboleras();
                } else if (opcion == 3) {
                    this.MenuPrincipal();
                } else {
                    System.out.println("Opcion no válida");
                }

                break;
            case 6:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad = maiden.nextInt();
                carrito[5] += cantidad;
                System.out.println("Ud ha pedido " + carrito[5] + "pizza de " + pizza[5]);

                System.out.println("¿Desea elegir otro menú más?  1 SI/ 2 NO / 3 Menu Principal");
                opcion = maiden.nextInt();
                maiden.nextLine();
                if (opcion == 1) {
                    System.out.println("Volviendo a la opción de compra");
                    this.Comprarenviogratis();
                } else if (opcion == 2) {
                    this.Pagopromosfutboleras();
                } else if (opcion == 3) {
                    this.MenuPrincipal();
                } else {
                    System.out.println("Opcion no válida");
                }

                break;
            case 7:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad = maiden.nextInt();
                carrito[6] += cantidad;
                System.out.println("Ud ha pedido " + carrito[6] + "pizza de " + pizza[6]);

                System.out.println("¿Desea elegir otro menú más?  1 SI/ 2 NO / 3 Menu Principal");
                opcion = maiden.nextInt();
                maiden.nextLine();
                if (opcion == 1) {
                    System.out.println("Volviendo a la opción de compra");
                    this.Comprarenviogratis();
                } else if (opcion == 2) {
                    this.Pagopromosfutboleras();
                } else if (opcion == 3) {
                    this.MenuPrincipal();
                } else {
                    System.out.println("Opcion no válida");
                }

                break;
            case 8:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad = maiden.nextInt();
                carrito[7] += cantidad;
                System.out.println("Ud ha pedido " + carrito[7] + "pizza de " + pizza[7]);

                System.out.println("¿Desea elegir otro menú más?  1 SI/ 2 NO / 3 Menu Principal");
                opcion = maiden.nextInt();
                maiden.nextLine();
                if (opcion == 1) {
                    System.out.println("Volviendo a la opción de compra");
                    this.Comprarenviogratis();
                } else if (opcion == 2) {
                    this.Pagopromosfutboleras();
                } else if (opcion == 3) {
                    this.MenuPrincipal();
                } else {
                    System.out.println("Opcion no válida");
                }

                break;
            case 9:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad = maiden.nextInt();
                carrito[8] += cantidad;
                System.out.println("Ud ha pedido " + carrito[8] + "pizza de " + pizza[8]);

                System.out.println("¿Desea elegir otro menú más?  1 SI/ 2 NO / 3 Menu Principal");
                opcion = maiden.nextInt();
                maiden.nextLine();
                if (opcion == 1) {
                    System.out.println("Volviendo a la opción de compra");
                    this.Comprarenviogratis();
                } else if (opcion == 2) {
                    this.Pagopromosfutboleras();
                } else if (opcion == 3) {
                    this.MenuPrincipal();
                } else {
                    System.out.println("Opcion no válida");
                }

                break;
            case 10:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad = maiden.nextInt();
                carrito[9] += cantidad;
                System.out.println("Ud ha pedido " + carrito[9] + "pizza de " + pizza[9]);

                System.out.println("¿Desea elegir otro menú más?  1 SI/ 2 NO / 3 Menu Principal");
                opcion = maiden.nextInt();
                maiden.nextLine();
                if (opcion == 1) {
                    System.out.println("Volviendo a la opción de compra");
                    this.Comprarenviogratis();
                } else if (opcion == 2) {
                    this.Pagopromosfutboleras();
                } else if (opcion == 3) {
                    this.MenuPrincipal();
                } else {
                    System.out.println("Opcion no válida");
                }

                break;
            case 11:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad = maiden.nextInt();
                carrito[10] += cantidad;
                System.out.println("Ud ha pedido " + carrito[10] + "pizza de " + pizza[10]);

                System.out.println("¿Desea elegir otro menú más?  1 SI/ 2 NO / 3 Menu Principal");
                opcion = maiden.nextInt();
                maiden.nextLine();
                if (opcion == 1) {
                    System.out.println("Volviendo a la opción de compra");
                    this.Comprarenviogratis();
                } else if (opcion == 2) {
                    this.Pagopromosfutboleras();
                } else if (opcion == 3) {
                    this.MenuPrincipal();
                } else {
                    System.out.println("Opcion no válida");
                }

                break;
            case 12:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad = maiden.nextInt();
                carrito[11] += cantidad;
                System.out.println("Ud ha pedido " + carrito[11] + "pizza de " + pizza[11]);

                System.out.println("¿Desea elegir otro menú más?  1 SI/ 2 NO / 3 Menu Principal");
                opcion = maiden.nextInt();
                maiden.nextLine();
                if (opcion == 1) {
                    System.out.println("Volviendo a la opción de compra");
                    this.Comprarenviogratis();
                } else if (opcion == 2) {
                    this.Pagopromosfutboleras();
                } else if (opcion == 3) {
                    this.MenuPrincipal();
                } else {
                    System.out.println("Opcion no válida");
                }

                break;
            case 13:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad = maiden.nextInt();
                carrito[12] += cantidad;
                System.out.println("Ud ha pedido " + carrito[12] + "pizza de " + pizza[12]);

                System.out.println("¿Desea elegir otro menú más?  1 SI/ 2 NO / 3 Menu Principal");
                opcion = maiden.nextInt();
                maiden.nextLine();
                if (opcion == 1) {
                    System.out.println("Volviendo a la opción de compra");
                    this.Comprarenviogratis();
                } else if (opcion == 2) {
                    this.Pagopromosfutboleras();
                } else if (opcion == 3) {
                    this.MenuPrincipal();
                } else {
                    System.out.println("Opcion no válida");
                }

                break;
            case 14:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad = maiden.nextInt();
                carrito[13] += cantidad;
                System.out.println("Ud ha pedido " + carrito[13] + "pizza de " + pizza[13]);

                System.out.println("¿Desea elegir otro menú más?  1 SI/ 2 NO / 3 Menu Principal");
                opcion = maiden.nextInt();
                maiden.nextLine();
                if (opcion == 1) {
                    System.out.println("Volviendo a la opción de compra");
                    this.Comprarenviogratis();
                } else if (opcion == 2) {
                    this.Pagopromosfutboleras();
                } else if (opcion == 3) {
                    this.MenuPrincipal();
                } else {
                    System.out.println("Opcion no válida");
                }

                break;
            case 15:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad = maiden.nextInt();

                carrito[14] += cantidad;
                System.out.println("Ud ha pedido " + carrito[14] + "pizza de " + pizza[14]);

                System.out.println("¿Desea elegir otro menú más?  1 SI/ 2 NO / 3 Menu Principal");
                opcion = maiden.nextInt();
                maiden.nextLine();
                if (opcion == 1) {
                    System.out.println("Volviendo a la opción de compra");
                    this.Comprarenviogratis();
                } else if (opcion == 2) {
                    this.Pagopromosfutboleras();
                } else if (opcion == 3) {
                    this.MenuPrincipal();
                } else {
                    System.out.println("Opcion no válida");
                }


                break;

            default:
                System.out.println("Opcion no válida");
                this.MenuPrincipal();
                break;


        }


        return null;
    }

    public double pagopizza() {
        double cantidadtotalpromofutboleras = Arrays.stream(carrito).sum();
        double subtotalenviosgratis=Arrays.stream(carrito_enviogratris).sum();

        double subtotalofertas = Arrays.stream(carrito_oferta).sum();
        double subtotalpizza = Arrays.stream(carrito_pizza).sum();
        double subtotalbebidas = Arrays.stream(carrito_bebidas).sum();
        double subtotalantojitos = Arrays.stream(carrito_ntojitos).sum();

        double subtotal0 = (cantidadtotalpromofutboleras * Precio_promofutbolera[0]) + subtotalenviosgratis+ subtotalpizza+subtotalofertas+subtotalantojitos+subtotalbebidas;
        igv = subtotal0 * Precio_promofutbolera[1];
        subtotal = subtotal0 - igv;
        totalpagar = subtotal + igv;
        System.out.println("----BOLETA DE VENTA---------");
        System.out.println(" SUBTOTAL :" + subtotal);
        System.out.println(" IGV :" + igv);
        System.out.println(" TOTAL :" + totalpagar);
        this.ExportarBoleta();
        return totalpagar;
    }

    public String comprarantojitos() {
        System.out.println("------      _    _   _ _____ ___      _ ___ _____ ___  ____  \n" +
                "    / \\  | \\ | |_   _/ _ \\    | |_ _|_   _/ _ \\/ ___| \n" +
                "   / _ \\ |  \\| | | || | | |_  | || |  | || | | \\___ \\ \n" +
                "  / ___ \\| |\\  | | || |_| | |_| || |  | || |_| |___) |\n" +
                " /_/   \\_\\_| \\_| |_| \\___/ \\___/|___| |_| \\___/|____/ \n" +
                "                                                       ------------");
        System.out.println(" ");
        System.out.println("Seleccione su pedido a  comprar");
        for (int i = 0; i < ntojitos.length; i++) {
            System.out.println("Opcion " + (i + 1) + " : " + ntojitos[i]);
        }
        opcion = maiden.nextInt();
        maiden.nextLine();
        switch (opcion) {
            case 1:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad = maiden.nextInt();
                carrito[0] += cantidad;
                System.out.println("Ud ha pedido " + carrito[0] + "pedido de " + ntojitos[0]);
                System.out.println("¿Desea elegir otro menú más?  1 SI/ 2 NO / 3 Menu Principal");
                opcion = maiden.nextInt();
                maiden.nextLine();
                if (opcion == 1) {
                    System.out.println("Volviendo a la opción de compra");
                    this.Comprarenviogratis();
                } else if (opcion == 2) {
                    this.Pagopromosfutboleras();
                } else if (opcion == 3) {
                    this.MenuPrincipal();
                } else {
                    System.out.println("Opcion no válida");
                }

                break;

            case 2:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad = maiden.nextInt();
                carrito[1] += cantidad;
                System.out.println("Ud ha pedido " + carrito[1] + "pedido de " + ntojitos[1]);

                System.out.println("¿Desea elegir otro menú más?  1 SI/ 2 NO / 3 Menu Principal");
                opcion = maiden.nextInt();
                maiden.nextLine();
                if (opcion == 1) {
                    System.out.println("Volviendo a la opción de compra");
                    this.Comprarenviogratis();
                } else if (opcion == 2) {
                    this.Pagopromosfutboleras();
                } else if (opcion == 3) {
                    this.MenuPrincipal();
                } else {
                    System.out.println("Opcion no válida");
                }

                break;
            case 3:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad = maiden.nextInt();
                carrito[2] += cantidad;
                System.out.println("Ud ha pedido " + carrito[2] + "pedido de " + ntojitos[2]);

                System.out.println("¿Desea elegir otro menú más?  1 SI/ 2 NO / 3 Menu Principal");
                opcion = maiden.nextInt();
                maiden.nextLine();
                if (opcion == 1) {
                    System.out.println("Volviendo a la opción de compra");
                    this.Comprarenviogratis();
                } else if (opcion == 2) {
                    this.Pagopromosfutboleras();
                } else if (opcion == 3) {
                    this.MenuPrincipal();
                } else {
                    System.out.println("Opcion no válida");
                }

                break;
            case 4:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad = maiden.nextInt();
                carrito[3] += cantidad;
                System.out.println("Ud ha pedido " + carrito[3] + "pedido de " + ntojitos[3]);

                System.out.println("¿Desea elegir otro menú más?  1 SI/ 2 NO / 3 Menu Principal");
                opcion = maiden.nextInt();
                maiden.nextLine();
                if (opcion == 1) {
                    System.out.println("Volviendo a la opción de compra");
                    this.Comprarenviogratis();
                } else if (opcion == 2) {
                    this.Pagopromosfutboleras();
                } else if (opcion == 3) {
                    this.MenuPrincipal();
                } else {
                    System.out.println("Opcion no válida");
                }

                break;
            case 5:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad = maiden.nextInt();
                carrito[4] += cantidad;
                System.out.println("Ud ha pedido " + carrito[4] + "pedido de " + ntojitos[4]);

                System.out.println("¿Desea elegir otro menú más?  1 SI/ 2 NO / 3 Menu Principal");
                opcion = maiden.nextInt();
                maiden.nextLine();
                if (opcion == 1) {
                    System.out.println("Volviendo a la opción de compra");
                    this.Comprarenviogratis();
                } else if (opcion == 2) {
                    this.Pagopromosfutboleras();
                } else if (opcion == 3) {
                    this.MenuPrincipal();
                } else {
                    System.out.println("Opcion no válida");
                }

                break;
            case 6:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad = maiden.nextInt();
                carrito[5] += cantidad;
                System.out.println("Ud ha pedido " + carrito[5] + "pedido de " + ntojitos[5]);

                System.out.println("¿Desea elegir otro menú más?  1 SI/ 2 NO / 3 Menu Principal");
                opcion = maiden.nextInt();
                maiden.nextLine();
                if (opcion == 1) {
                    System.out.println("Volviendo a la opción de compra");
                    this.Comprarenviogratis();
                } else if (opcion == 2) {
                    this.Pagopromosfutboleras();
                } else if (opcion == 3) {
                    this.MenuPrincipal();
                } else {
                    System.out.println("Opcion no válida");
                }

                break;
            case 7:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad = maiden.nextInt();
                carrito[6] += cantidad;
                System.out.println("Ud ha pedido " + carrito[6] + "pedido de " + ntojitos[6]);

                System.out.println("¿Desea elegir otro menú más?  1 SI/ 2 NO / 3 Menu Principal");
                opcion = maiden.nextInt();
                maiden.nextLine();
                if (opcion == 1) {
                    System.out.println("Volviendo a la opción de compra");
                    this.Comprarenviogratis();
                } else if (opcion == 2) {
                    this.Pagopromosfutboleras();
                } else if (opcion == 3) {
                    this.MenuPrincipal();
                } else {
                    System.out.println("Opcion no válida");
                }

                break;
            case 8:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad = maiden.nextInt();
                carrito[7] += cantidad;
                System.out.println("Ud ha pedido " + carrito[7] + "pedido de " + ntojitos[7]);

                System.out.println("¿Desea elegir otro menú más?  1 SI/ 2 NO / 3 Menu Principal");
                opcion = maiden.nextInt();
                maiden.nextLine();
                if (opcion == 1) {
                    System.out.println("Volviendo a la opción de compra");
                    this.Comprarenviogratis();
                } else if (opcion == 2) {
                    this.Pagopromosfutboleras();
                } else if (opcion == 3) {
                    this.MenuPrincipal();
                } else {
                    System.out.println("Opcion no válida");
                }

                break;
            case 9:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad = maiden.nextInt();
                carrito[8] += cantidad;
                System.out.println("Ud ha pedido " + carrito[8] + "pedido de " + ntojitos[8]);

                System.out.println("¿Desea elegir otro menú más?  1 SI/ 2 NO / 3 Menu Principal");
                opcion = maiden.nextInt();
                maiden.nextLine();
                if (opcion == 1) {
                    System.out.println("Volviendo a la opción de compra");
                    this.Comprarenviogratis();
                } else if (opcion == 2) {
                    this.Pagopromosfutboleras();
                } else if (opcion == 3) {
                    this.MenuPrincipal();
                } else {
                    System.out.println("Opcion no válida");
                }

                break;
            case 10:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad = maiden.nextInt();
                carrito[9] += cantidad;
                System.out.println("Ud ha pedido " + carrito[9] + "pedido de " + ntojitos[9]);

                System.out.println("¿Desea elegir otro menú más?  1 SI/ 2 NO / 3 Menu Principal");
                opcion = maiden.nextInt();
                maiden.nextLine();
                if (opcion == 1) {
                    System.out.println("Volviendo a la opción de compra");
                    this.Comprarenviogratis();
                } else if (opcion == 2) {
                    this.Pagopromosfutboleras();
                } else if (opcion == 3) {
                    this.MenuPrincipal();
                } else {
                    System.out.println("Opcion no válida");
                }

                break;
            case 11:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad = maiden.nextInt();
                carrito[10] += cantidad;
                System.out.println("Ud ha pedido " + carrito[10] + "pedido de " + ntojitos[10]);

                System.out.println("¿Desea elegir otro menú más?  1 SI/ 2 NO / 3 Menu Principal");
                opcion = maiden.nextInt();
                maiden.nextLine();
                if (opcion == 1) {
                    System.out.println("Volviendo a la opción de compra");
                    this.Comprarenviogratis();
                } else if (opcion == 2) {
                    this.Pagopromosfutboleras();
                } else if (opcion == 3) {
                    this.MenuPrincipal();
                } else {
                    System.out.println("Opcion no válida");
                }

                break;
            case 12:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad = maiden.nextInt();
                carrito[11] += cantidad;
                System.out.println("Ud ha pedido " + carrito[11] + "pedido de " + ntojitos[11]);

                System.out.println("¿Desea elegir otro menú más?  1 SI/ 2 NO / 3 Menu Principal");
                opcion = maiden.nextInt();
                maiden.nextLine();
                if (opcion == 1) {
                    System.out.println("Volviendo a la opción de compra");
                    this.Comprarenviogratis();
                } else if (opcion == 2) {
                    this.Pagopromosfutboleras();
                } else if (opcion == 3) {
                    this.MenuPrincipal();
                } else {
                    System.out.println("Opcion no válida");
                }

                break;
            case 13:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad = maiden.nextInt();
                carrito[12] += cantidad;
                System.out.println("Ud ha pedido " + carrito[12] + "pedido de " + ntojitos[12]);

                System.out.println("¿Desea elegir otro menú más?  1 SI/ 2 NO / 3 Menu Principal");
                opcion = maiden.nextInt();
                maiden.nextLine();
                if (opcion == 1) {
                    System.out.println("Volviendo a la opción de compra");
                    this.Comprarenviogratis();
                } else if (opcion == 2) {
                    this.Pagopromosfutboleras();
                } else if (opcion == 3) {
                    this.MenuPrincipal();
                } else {
                    System.out.println("Opcion no válida");
                }

                break;
            case 14:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad = maiden.nextInt();
                carrito[13] += cantidad;
                System.out.println("Ud ha pedido " + carrito[13] + "pedido de " + ntojitos[13]);

                System.out.println("¿Desea elegir otro menú más?  1 SI/ 2 NO / 3 Menu Principal");
                opcion = maiden.nextInt();
                maiden.nextLine();
                if (opcion == 1) {
                    System.out.println("Volviendo a la opción de compra");
                    this.Comprarenviogratis();
                } else if (opcion == 2) {
                    this.Pagopromosfutboleras();
                } else if (opcion == 3) {
                    this.MenuPrincipal();
                } else {
                    System.out.println("Opcion no válida");
                }

                break;
            case 15:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad = maiden.nextInt();
                carrito[14] += cantidad;
                System.out.println("Ud ha pedido " + carrito[14] + "pedido de " + ntojitos[14]);

                System.out.println("¿Desea elegir otro menú más?  1 SI/ 2 NO / 3 Menu Principal");
                opcion = maiden.nextInt();
                maiden.nextLine();
                if (opcion == 1) {
                    System.out.println("Volviendo a la opción de compra");
                    this.Comprarenviogratis();
                } else if (opcion == 2) {
                    this.Pagopromosfutboleras();
                } else if (opcion == 3) {
                    this.MenuPrincipal();
                } else {
                    System.out.println("Opcion no válida");
                }

                break;


            case 16:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad = maiden.nextInt();

                carrito[15] += cantidad;
                System.out.println("Ud ha pedido " + carrito[15] + "pedidos de " + ntojitos[15]);

                System.out.println("¿Desea elegir otro menú más?  1 SI/ 2 NO / 3 Menu Principal");
                opcion = maiden.nextInt();
                maiden.nextLine();
                if (opcion == 1) {
                    System.out.println("Volviendo a la opción de compra");
                    this.Comprarenviogratis();
                } else if (opcion == 2) {
                    this.Pagopromosfutboleras();
                } else if (opcion == 3) {
                    this.MenuPrincipal();
                } else {
                    System.out.println("Opcion no válida");
                }


                break;

            default:
                System.out.println("Opcion no válida");
                this.MenuPrincipal();
                break;


        }


        return null;
    }

    public double Pagoantogitos() {
        double cantidadtotalpromofutboleras = Arrays.stream(carrito).sum();
        double subtotalenviosgratis=Arrays.stream(carrito_enviogratris).sum();

        double subtotalofertas = Arrays.stream(carrito_oferta).sum();
        double subtotalpizza = Arrays.stream(carrito_pizza).sum();
        double subtotalbebidas = Arrays.stream(carrito_bebidas).sum();
        double subtotalantojitos = Arrays.stream(carrito_ntojitos).sum();

        double subtotal0 = (cantidadtotalpromofutboleras * Precio_promofutbolera[0]) + subtotalenviosgratis+ subtotalpizza+subtotalofertas+subtotalantojitos+subtotalbebidas;
        igv = subtotal0 * Precio_promofutbolera[1]*precio_enviogratis[1]
                *precio_ofertas[1]
                *precio_pizza[1]
                *precio_antojitos[1]
                *precio_bebidas[1];
        subtotal = subtotal0 - igv;
        totalpagar = subtotal + igv;
        System.out.println("----BOLETA DE VENTA---------");
        System.out.println(" SUBTOTAL :" + subtotal);
        System.out.println(" IGV :" + igv);
        System.out.println(" TOTAL :" + totalpagar);
        System.out.println("gracias por su preferencia :");
        this.ExportarBoleta();
        return totalpagar;
    }

    public String comprarbebidas() {
        System.out.println("------ BEBIDAS------------");
        System.out.println("     _                                   \n" +
                "          .!.!.                             \n" +
                "           ! !                                   \n" +
                "           ; :                                \n" +
                "          ; :                                \n" +
                "         ;_____:                                 \n" +
                "         ! ¡BEBIDAS!                                 \n" +
                "         !_____!                                 \n" +
                "         : :\n" +
                "         : ;                                       \n" +
                "         .' '.                             \n" +
                "         : : k&n                           \n" +
                "          '''''");
        System.out.println("Seleccione su pedido a  comprar");
        for (int i = 0; i < bebidas.length; i++) {
            System.out.println("Opcion " + (i + 1) + " : " + bebidas[i]);
        }
        opcion = maiden.nextInt();
        maiden.nextLine();
        switch (opcion) {
            case 1:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad = maiden.nextInt();
                carrito[0] += cantidad;
                System.out.println("Ud ha pedido " + carrito[0] + "bebida de " + bebidas[0]);
                System.out.println("¿Desea elegir otro menú más?  1 SI/ 2 NO / 3 Menu Principal");
                opcion = maiden.nextInt();
                maiden.nextLine();
                if (opcion == 1) {
                    System.out.println("Volviendo a la opción de compra");
                    this.Comprarenviogratis();
                } else if (opcion == 2) {
                    this.Pagopromosfutboleras();
                } else if (opcion == 3) {
                    this.MenuPrincipal();
                } else {
                    System.out.println("Opcion no válida");
                }

                break;

            case 2:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad = maiden.nextInt();
                carrito[1] += cantidad;
                System.out.println("Ud ha pedido " + carrito[1] + "bebida de " + bebidas[1]);

                System.out.println("¿Desea elegir otro menú más?  1 SI/ 2 NO / 3 Menu Principal");
                opcion = maiden.nextInt();
                maiden.nextLine();
                if (opcion == 1) {
                    System.out.println("Volviendo a la opción de compra");
                    this.Comprarenviogratis();
                } else if (opcion == 2) {
                    this.Pagopromosfutboleras();
                } else if (opcion == 3) {
                    this.MenuPrincipal();
                } else {
                    System.out.println("Opcion no válida");
                }

                break;
            case 3:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad = maiden.nextInt();
                carrito[2] += cantidad;
                System.out.println("Ud ha pedido " + carrito[2] + "bebida de " + bebidas[2]);

                System.out.println("¿Desea elegir otro menú más?  1 SI/ 2 NO / 3 Menu Principal");
                opcion = maiden.nextInt();
                maiden.nextLine();
                if (opcion == 1) {
                    System.out.println("Volviendo a la opción de compra");
                    this.Comprarenviogratis();
                } else if (opcion == 2) {
                    this.Pagopromosfutboleras();
                } else if (opcion == 3) {
                    this.MenuPrincipal();
                } else {
                    System.out.println("Opcion no válida");
                }

                break;
            case 4:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad = maiden.nextInt();
                carrito[3] += cantidad;
                System.out.println("Ud ha pedido " + carrito[3] + "bebida de " + bebidas[3]);

                System.out.println("¿Desea elegir otro menú más?  1 SI/ 2 NO / 3 Menu Principal");
                opcion = maiden.nextInt();
                maiden.nextLine();
                if (opcion == 1) {
                    System.out.println("Volviendo a la opción de compra");
                    this.Comprarenviogratis();
                } else if (opcion == 2) {
                    this.Pagopromosfutboleras();
                } else if (opcion == 3) {
                    this.MenuPrincipal();
                } else {
                    System.out.println("Opcion no válida");
                }

                break;


            case 5:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad = maiden.nextInt();

                carrito[4] += cantidad;
                System.out.println("Ud ha pedido " + carrito[4] + "bebida de " + bebidas[4]);

                System.out.println("¿Desea elegir otro menú más?  1 SI/ 2 NO / 3 Menu Principal");
                opcion = maiden.nextInt();
                maiden.nextLine();
                if (opcion == 1) {
                    System.out.println("Volviendo a la opción de compra");
                    this.Comprarenviogratis();
                } else if (opcion == 2) {
                    this.Pagopromosfutboleras();
                } else if (opcion == 3) {
                    this.MenuPrincipal();
                } else {
                    System.out.println("Opcion no válida");
                }


                break;

            default:
                System.out.println("Opcion no válida");
                this.MenuPrincipal();
                break;


        }


        return null;
    }

    public double pagobebida() {
        double cantidadtotalpromofutboleras = Arrays.stream(carrito).sum();
        double subtotalenviosgratis=Arrays.stream(carrito_enviogratris).sum();

        double subtotalofertas = Arrays.stream(carrito_oferta).sum();
        double subtotalpizza = Arrays.stream(carrito_pizza).sum();
        double subtotalbebidas = Arrays.stream(carrito_bebidas).sum();
        double subtotalantojitos = Arrays.stream(carrito_ntojitos).sum();

        double subtotal0 = (cantidadtotalpromofutboleras * Precio_promofutbolera[0]) + subtotalenviosgratis+ subtotalpizza+subtotalofertas+subtotalantojitos+subtotalbebidas;
        igv = subtotal0 * Precio_promofutbolera[1]*precio_enviogratis[1]
                *precio_ofertas[1]
                *precio_pizza[1]
                *precio_antojitos[1]
                *precio_bebidas[1];
        subtotal = subtotal0 - igv;
        totalpagar = subtotal + igv;
        System.out.println("----BOLETA DE VENTA---------");
        System.out.println(" SUBTOTAL :" + subtotal);
        System.out.println(" IGV :" + igv);
        System.out.println(" TOTAL :" + totalpagar);
        this.ExportarBoleta();

        return totalpagar;
    }

    public String ExportarBoleta() {
        try {
            File archivo = new File("d:\\boleta.txt");
            FileWriter escritor = new FileWriter(archivo);
            escritor.write("----BOLETA DE VENTA---------");
            escritor.write(" SUBTOTAL :" + subtotal);
            escritor.write(" IGV :" + igv);
            escritor.write(" TOTAL :" + totalpagar);
            escritor.write("gracias por su preferencia:");
            escritor.close();

        } catch (IOException e) {
            System.out.println("Error al exportar la factura.");
            e.printStackTrace();

        }
        return null;
    }

    public static void main(String[] args) {
        pizza3 nyx = new pizza3();
        nyx.MenuPrincipal();


    }

}
