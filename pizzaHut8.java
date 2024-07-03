import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class pizzaHut8 {

    private Scanner scanner = new Scanner(System.in);
    private Random random = new Random();

    private String[] promosFutboleras = {
            "COMBO GOLEADOR $35.90", "BOX FUTBOLERO $49.90", "COMBO PIZZA XL $69.90",
            "DOBLE O NADA FAMILIAR $72.90", "DOBLE O NADA HUT CHEESE $79.90",
            "HUT COMPLETO MEDIANO $39.90", "2*1 PIZZAS MEDIANAS $20.90", "LA FIJA $19.90"
    };
    private double[] preciosPromosFutboleras = {35.90, 49.90, 69.90, 72.90, 79.90, 39.90, 20.90, 19.90};

    private String[] envioGratis = {
            "TRIPACK GRANDE DE HUT $99.90", "COMBO DOBLE O NADA GRANDE $59.90",
            "COMBO SEMI FULL GRANDE $59.90", "BANQUETE FAMILIAR HUT CHEESE $55.90",
            "TRIPACK FAMILIAR $99.90", "TRIPACK HUT BOX $64.90", "COMBO TRIPE HUT BOX $69.90",
            "TRIPACK GRANDE $79.90", "COMBO TRIPACK GRANDE HUT CHEESE $99.90",
            "COMBO SEMI FULL FAMILIAR $79.90", "COMBO SEMI FULL FAMILIAR HUT CHEESE $89.90",
            "COMBO DOBLE O NADA FAMILIAR $79.90", "COMBO DOBLE O NADA FAMILIAR HUT CHEESE $89.90"
    };
    private double[] preciosEnvioGratis = {99.90, 59.90, 59.90, 55.90, 99.90, 64.90, 69.90, 79.90, 99.90, 79.90, 89.90, 79.90, 89.90};

    private String[] ofertas = {
            "COMBO TRIPACK FAMILIAR $109.90", "COMBO CHEESY BITES $49.90", "DOBLE O NADA GRANDE $44.90",
            "BANQUETE FAMILIAR $49.90", "COMBO MEDIANO $19.90", "HUT COMBO MEDIANO $22.90",
            "COMBO LA FIJA $24.90", "HUT CHEESE MEDIANO $26.90", "PIZZA GRANDE HUT CHEESE $32.90",
            "BANQUETE GRANDE HUT CHEESE $45.90"
    };
    private double[] preciosOfertas = {109.90, 49.90, 44.90, 49.90, 19.90, 22.90, 24.90, 26.90, 32.90, 45.90};

    private String[] pizzas = {
            "AMERICANA $26.90", "PEPERONI $26.90", "MOZARELLA $26.90", "PERUANA $29.90", "ARGENTINA $29.90",
            "HAWAIIANA $32.90", "CONTINENTAL $32.90", "VEGETARIANA $32.90", "SUPREMA $32.90",
            "MEAT LOVERS $39.90", "SUPER SUPREMA $39.90", "LA CHILI HUT $39.90", "CHICKEN BBQ $39.90", "XL CLASICA $69.90"
    };
    private double[] preciosPizzas = {26.90, 26.90, 26.90, 29.90, 29.90, 32.90, 32.90, 32.90, 32.90, 39.90, 39.90, 39.90, 39.90, 69.90};

    private String[] antojitos = {
            "PALITOS A LA SICILIANA $11.90", "PAN DE AJO $10.90", "PAN AJO ESPECIAL $13.90",
            "ROLLS DE JAMÓN Y QUESO $15.90", "ALITAS $15.90", "HUT BREAD $13.90", "HUT CHURROS (4UN) $5.90",
            "ROLLS DE MANJAR (6UN) $6.90", "TARTA DE MANZANA $5.90", "VOLCÁN DE LIMÓN $7.90",
            "VOLCÁN DE CHOCOLATE $7.90", "MAYO HUT $1.50", "SALSA HONEY BBQ 1 OZ $1.50",
            "SALSA CHILI THAI 1 OZ $1.50", "SALSA MEDITERRÁNEA 1 OZ $1.50", "SALSA AJÍ DE LA CASA 1 OZ $1.50"
    };
    private double[] preciosAntojitos = {11.90, 10.90, 13.90, 15.90, 15.90, 13.90, 5.90, 6.90, 5.90, 7.90, 7.90, 1.50, 1.50, 1.50, 1.50, 1.50};

    private String[] bebidas = {
            "COCA COLA SIN AZÚCAR $4.90", "INKA COLA SIN AZÚCAR $4.90", "SPRITE $4.90", "FANTA $4.90", "AGUA SAN LUIS $4.90"
    };
    private double[] preciosBebidas = {4.90, 4.90, 4.90, 4.90, 4.90};

    private int[] carritoPromosFutboleras = new int[promosFutboleras.length];
    private int[] carritoEnvioGratis = new int[envioGratis.length];
    private int[] carritoOfertas = new int[ofertas.length];
    private int[] carritoPizzas = new int[pizzas.length];
    private int[] carritoAntojitos = new int[antojitos.length];
    private int[] carritoBebidas = new int[bebidas.length];

    private double igv, subtotal, totalPagar;

    private String numeroTarjeta;
    private String nombreTitular;
    private String fechaExpiracion;
    private String cvv;
    private String metodoPago;

    private User[] usuarios = new User[100];
    private int numeroUsuarios = 0;
    private User usuarioActual;

    public static void main(String[] args) {
        pizzaHut8 pizzaHut = new pizzaHut8();
        pizzaHut.mostrarMenuPrincipal();
    }

    public void mostrarMenuPrincipal() {
        System.out.println("--------- BIENVENIDO A PIZZA HUT -----------");
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

        System.out.println("Seleccione una de las siguientes opciones:");
        System.out.println("1. PROMO FUTBOLERAS");
        System.out.println("2. ENVÍO GRATIS");
        System.out.println("3. OFERTAS");
        System.out.println("4. PIZZA");
        System.out.println("5. ANTOJITOS");
        System.out.println("6. BEBIDAS");
        System.out.println("7. LIBRO DE RECLAMOS");
        System.out.println("8. CREA TU CUENTA");
        System.out.println("9. INICIAR SESIÓN");
        System.out.println("10. METODOS DE PAGO");

        int opcion = scanner.nextInt();
        scanner.nextLine();

        switch (opcion) {
            case 1:
                comprarPromosFutboleras();
                break;
            case 2:
                comprarEnvioGratis();
                break;
            case 3:
                comprarOfertas();
                break;
            case 4:
                comprarPizzas();
                break;
            case 5:
                comprarAntojitos();
                break;
            case 6:
                comprarBebidas();
                break;
            case 7:
                libro_de_reclamos();
                break;
            case 8:
                crearCuenta();
                break;
            case 9:
                iniciarSesion();
                break;
            case 10:
                elegirMetodoPago();
                mostrarMenuPrincipal();
                break;
            default:
                System.out.println("Opción no válida. Intente de nuevo.");
                mostrarMenuPrincipal();
                break;
        }
    }

    private void crearCuenta() {
        System.out.println("------ CREAR CUENTA DE PIZZA HUT ------");
        System.out.println("Ingrese su nombre completo:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese su correo:");
        String correo = scanner.nextLine();
        System.out.println("Ingrese su contraseña:");
        String contraseña = scanner.nextLine();

        User nuevoUsuario = new User(nombre, correo, contraseña);
        if (añadirUsuario(nuevoUsuario)) {
            System.out.println("Cuenta creada exitosamente.");
        } else {
            System.out.println("Error al crear la cuenta. Intente nuevamente.");
        }
        mostrarMenuPrincipal();
    }

    private void iniciarSesion() {
        System.out.println("------ INICIAR SESIÓN ------");
        System.out.println("Ingrese su correo:");
        String correo = scanner.nextLine();
        System.out.println("Ingrese su contraseña:");
        String contraseña = scanner.nextLine();

        if (validarCredenciales(correo, contraseña)) {
            System.out.println("Sesión iniciada correctamente.");
        } else {
            System.out.println("Credenciales incorrectas. Inténtalo nuevamente.");
        }
        mostrarMenuPrincipal();
    }

    private boolean validarCredenciales(String correo, String contraseña) {
        for (int i = 0; i < numeroUsuarios; i++) {
            if (usuarios[i].getCorreo().equals(correo) && usuarios[i].getContraseña().equals(contraseña)) {
                usuarioActual = usuarios[i];
                return true;
            }
        }
        return false;
    }

    private boolean añadirUsuario(User usuario) {
        if (numeroUsuarios < usuarios.length) {
            usuarios[numeroUsuarios] = usuario;
            numeroUsuarios++;
            return true;
        }
        return false;
    }

    private void mostrarYComprarItems(String[] items, double[] precios, int[] carrito) {
        for (int i = 0; i < items.length; i++) {
            System.out.println("Opción " + (i + 1) + ": " + items[i]);
        }

        int opcion = scanner.nextInt();
        scanner.nextLine();

        if (opcion < 1 || opcion > items.length) {
            System.out.println("Opción no válida. Intente de nuevo.");
            mostrarYComprarItems(items, precios, carrito);
            return;
        }

        System.out.println("¿Cuántos comprará? Ingrese la cantidad:");
        int cantidad = scanner.nextInt();
        carrito[opcion - 1] += cantidad;

        System.out.println("Ud ha pedido " + carrito[opcion - 1] + " de " + items[opcion - 1]);
        System.out.println("¿Desea elegir otro pizza más? 1. SI / 2. NO / 3. Menú Principal");

        opcion = scanner.nextInt();
        scanner.nextLine();

        if (opcion == 1) {
            mostrarYComprarItems(items, precios, carrito);
        } else if (opcion == 2) {
            calcularPago(carrito, precios, items);
        } else {
            mostrarMenuPrincipal();
        }
    }

    private void comprarPromosFutboleras() {
        System.out.println("------ PROMOS FUTBOLERAS ------------");
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
        mostrarYComprarItems(promosFutboleras, preciosPromosFutboleras, carritoPromosFutboleras);
    }

    private void comprarEnvioGratis() {
        System.out.println("------ ENVÍO GRATIS ------------");
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
        mostrarYComprarItems(envioGratis, preciosEnvioGratis, carritoEnvioGratis);
    }

    private void comprarOfertas() {
        System.out.println("------ OFERTAS ------------");
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
        mostrarYComprarItems(ofertas, preciosOfertas, carritoOfertas);
    }

    private void comprarPizzas() {
        System.out.println("------ PIZZAS ------------");
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
        mostrarYComprarItems(pizzas, preciosPizzas, carritoPizzas);
    }

    private void comprarAntojitos() {
        System.out.println("------ ANTOJITOS ------------");
        System.out.println("------      _    _   _ _____ ___      _ ___ _____ ___  ____  \n" +
                "    / \\  | \\ | |_   _/ _ \\    | |_ _|_   _/ _ \\/ ___| \n" +
                "   / _ \\ |  \\| | | || | | |_  | || |  | || | | \\___ \\ \n" +
                "  / ___ \\| |\\  | | || |_| | |_| || |  | || |_| |___) |\n" +
                " /_/   \\_\\_| \\_| |_| \\___/ \\___/|___| |_| \\___/|____/ \n" +
                "                                                       ------------");
        mostrarYComprarItems(antojitos, preciosAntojitos, carritoAntojitos);
    }

    private void comprarBebidas() {
        System.out.println("------ BEBIDAS ------------");
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
        mostrarYComprarItems(bebidas, preciosBebidas, carritoBebidas);
    }

    private void calcularPago(int[] carrito, double[] precios, String[] items) {
        double subtotal = 0;
        for (int i = 0; i < carrito.length; i++) {
            subtotal += carrito[i] * precios[i];
        }
        double igv = subtotal * 0.18;
        double totalPagar = subtotal + igv;

        System.out.println("---- BOLETA DE VENTA ---------");
        System.out.println("Nombre del Cliente: " + usuarioActual.getNombre());
        System.out.println("Fecha: " + new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date()));
        System.out.println("Productos Comprados:");
        for (int i = 0; i < carrito.length; i++) {
            if (carrito[i] > 0) {
                System.out.println(items[i] + " x " + carrito[i] + " = " + (carrito[i] * precios[i]));
            }
        }
        System.out.println("SUBTOTAL: " + subtotal);
        System.out.println("IGV: " + igv);
        System.out.println("TOTAL: " + totalPagar);
        System.out.println("Método de Pago: " + metodoPago);

        if (metodoPago.equals("Tarjeta Visa") && validarPagoVisa()) {
            System.out.println("Pago realizado con éxito con la tarjeta Visa.");
            exportarBoleta(subtotal, igv, totalPagar, metodoPago, items, carrito, subtotal);
        } else if (metodoPago.equals("Efectivo")) {
            System.out.println("Ingrese la cantidad de efectivo recibido:");
            double efectivoRecibido = scanner.nextDouble();
            double cambio = efectivoRecibido - totalPagar;
            System.out.println("Cambio: " + cambio);
            exportarBoleta(subtotal, igv, totalPagar, metodoPago, items, carrito, cambio);
        } else {
            System.out.println("Error en el pago con la tarjeta Visa. Intente nuevamente.");
        }
    }

    private void exportarBoleta(double subtotal, double igv, double totalPagar, String metodoPago, String[] items, int[] carrito, double cambio) {
        try {
            File archivo = new File("c:\\boleta.txt");
            FileWriter escritor = new FileWriter(archivo);
            escritor.write("---- BOLETA DE VENTA ---------\n");
            escritor.write("Nombre del Cliente: " + usuarioActual.getNombre() + "\n");
            escritor.write("Fecha: " + new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date()) + "\n");
            escritor.write("Productos Comprados:\n");
            for (int i = 0; i < carrito.length; i++) {
                if (carrito[i] > 0) {
                    escritor.write(items[i] + " x " + carrito[i] + " = " + (carrito[i] * preciosPromosFutboleras[i]) + "\n");
                }
            }
            escritor.write("SUBTOTAL: " + subtotal + "\n");
            escritor.write("IGV: " + igv + "\n");
            escritor.write("TOTAL: " + totalPagar + "\n");
            escritor.write("Método de Pago: " + metodoPago + "\n");
            if (metodoPago.equals("Efectivo")) {
                escritor.write("Cambio: " + cambio + "\n");
            }
            escritor.write("Gracias por su preferencia.");
            escritor.close();
        } catch (IOException e) {
            System.out.println("Error al exportar la factura.");
            e.printStackTrace();
        }
    }

    private void libro_de_reclamos() {
        Scanner reclamo = new Scanner(System.in);
        String[] lineas = new String[1000];
        int contadorlineas = 0;

        System.out.println("libro de reclamos ");
        while (true) {
            System.out.println("Opciones:");
            System.out.println("1 - agregar sugerencias para mejorar la atencion ");
            System.out.println("2 - Mostrar contenido");
            System.out.println("3 - Guardar y salir");
            System.out.print("Elige una opción: ");

            int option = reclamo.nextInt();
            reclamo.nextLine();

            if (option == 1) {
                System.out.print("Ingrese su queja o suguerencia para mejorar el servicio: ");
                String line = reclamo.nextLine();
                if (contadorlineas < lineas.length) {
                    lineas[contadorlineas] = line;
                    contadorlineas++;
                } else {
                    System.out.println("Se ha alcanzado el límite de líneas.");
                }
            } else if (option == 2) {
                System.out.println("Contenido:");
                for (int i = 0; i < contadorlineas; i++) {
                    System.out.println(lineas[i]);
                }
            } else if (option == 3) {
                this.mostrarMenuPrincipal();
                break;
            } else {
                System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        }
        try {
            File archivo = new File("c:\\libro de reclamos.txt");
            FileWriter escritor = new FileWriter(archivo);
            escritor.write("----reclamos ---------\n");
            for (int i = 0; i < contadorlineas; i++) {
                escritor.write("reclamo:" + lineas[i] + "\n");
            }
            escritor.close();
        } catch (IOException e) {
            System.out.println("Error al exportar la queja.");
            e.printStackTrace();
        }
    }

    private void elegirMetodoPago() {
        System.out.println("Seleccione el método de pago:");
        System.out.println("1. Tarjeta Visa");
        System.out.println("2. Efectivo");

        int opcion = scanner.nextInt();
        scanner.nextLine();

        if (opcion == 1) {
            metodoPago = "Tarjeta Visa";
            System.out.println("Ingrese el número de su tarjeta Visa:");
            numeroTarjeta = scanner.nextLine();
            System.out.println("Ingrese el nombre del titular de la tarjeta:");
            nombreTitular = scanner.nextLine();
            System.out.println("Ingrese la fecha de expiración (MM/AA):");
            fechaExpiracion = scanner.nextLine();
            System.out.println("Ingrese el CVV:");
            cvv = scanner.nextLine();
        } else if (opcion == 2) {
            metodoPago = "Efectivo";
        } else {
            System.out.println("Opción no válida. Intente de nuevo.");
            elegirMetodoPago();
        }
    }

    private boolean validarPagoVisa() {
        return numeroTarjeta != null && numeroTarjeta.length() == 16 &&
                nombreTitular != null && !nombreTitular.isEmpty() &&
                fechaExpiracion != null && fechaExpiracion.matches("\\d{2}/\\d{2}") &&
                cvv != null && cvv.length() == 3;
    }

    private static class User {
        private String nombre;
        private String correo;
        private String contraseña;

        public User(String nombre, String correo, String contraseña) {
            this.nombre = nombre;
            this.correo = correo;
            this.contraseña = contraseña;
        }

        public String getNombre() {
            return nombre;
        }

        public String getCorreo() {
            return correo;
        }

        public String getContraseña() {
            return contraseña;
        }
    }
}
