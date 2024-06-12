import java.util.Scanner;
public class PizzaHot{
    private Scanner ZOE = new Scanner(System.in);
    private String apodo;
    public void inicio_sesion() {
        String correo, correo_in, contraseña, contraseña_in;
        System.out.println("Bienvenido a PizzaHot");
        System.out.println("----INICIAR SECION----");
        System.out.println("------CREAR CUENTA------");
        System.out.println("Ingrese su nombre completo");
        apodo = ZOE.nextLine();
        System.out.println("Ingrese su correo");
        correo = ZOE.nextLine();
        System.out.println("Ingrese su contraseña");
        contraseña = ZOE.nextLine();
        System.out.println("-----INICIAR SESION-----");
        System.out.println("Ingrese su correo");
        correo_in = ZOE.nextLine();
        System.out.println("Ingrese su contraseña");
        contraseña_in = ZOE.nextLine();
        if (correo_in.equals(correo) && contraseña_in.equals(contraseña)) {
            this.menu();
        } else {
            System.out.println("Credenciales incorrectas. Inténtalo nuevamente.");
        }
    }
    public void menu() {
        System.out.println("---PIZZAHUT---");
        System.out.println("---MENU---");
        System.out.println("ELIJA SU PEDIDO");
        System.out.println("Bienvenido a pizzahut");
        System.out.println("Seleccione una opcion");
        System.out.println("1) ZONA DE HINCHAS");
        System.out.println("2) PIZZAS");
        int opcion = ZOE.nextInt();
        switch (opcion){
            case 1:
                this.op_zonadehinchas();
                break;
            case 2:
                this.op_pizzas();
                break;
            default:
                System.out.println("OPCION NO VALIDA");
        }
    }
    public String op_zonadehinchas(){
        ZOE.nextLine();
        System.out.println("Seleccione una opcion gracias");
        System.out.println("1)Huts del hincha");
        System.out.println("2)REGRESAR AL MENU");
        String subOpcion = ZOE.nextLine();
        switch (subOpcion) {
            case "1":
                System.out.println("1.Pizza americana =$/.25.50");
                System.out.println("2.Pizza peperoni = $/.27.00");
                System.out.println("3.Pizza suprema = $/.32.00");
                System.out.println("4.Pizza meat lover = $/.30.50");
                String modelo= ZOE.nextLine();
                switch (modelo){
                    case "1":
                        Double can;
                        System.out.println("Pizza americana =$/.25.50");
                        System.out.println("cuantos va a desear");
                        can=ZOE.nextDouble();
                        System.out.println("PARA PAGO EFECTIVO = 1");
                        System.out.println("PAGO CON TARJETA = 2");
                        int opcionpago = ZOE.nextInt();
                        if (opcionpago==1){
                            double precio = 25.50;
                            precio=precio*can;
                            System.out.println("ingrese el monto en efectivo");
                            double montoefectivo = ZOE.nextDouble();
                            if (montoefectivo >= precio){
                                Double cambio = montoefectivo - precio;
                                System.out.println("pedido:Pizza americana");
                                System.out.println("El total es:"+precio);
                                System.out.println("tu cambio es: $" + cambio);
                                System.out.println("PAGO REALIZADO GRACIAS POR SU COMPRA");
                            } else {
                                System.out.println("pedido:Pizza americana");
                                System.out.println("El total es:"+precio);
                                System.out.println("MONTO INSUFICIENTE");
                            }
                        }else if (opcionpago==2){
                            System.out.println("ingrese el numero de la tarjeta");
                            String numerotarjeta = ZOE.next();
                            System.out.println("ingrese la fecha de vencimiento MM/AA");
                            String fechadevencimiento = ZOE.next();
                            System.out.println("INGRESE EL CODIGO CVV");
                            int codigocvv = ZOE.nextInt();
                            System.out.println("-----BOLETA DE COMPRA-----");
                            System.out.println("PIZZA AMERICANA");
                            System.out.println("NOMBRE:" +apodo);
                            System.out.println("PRECIO: $25.50");
                            System.out.println("NUMERO DE TARJETA: ** ** ** **");
                            System.out.println("FECHA DE VENCIMIENTO:" +fechadevencimiento);
                            System.out.println("pago realizado gracias por su compra");
                        }
                        else {
                            System.out.println("OPCION DEE PAGO NO VALIDA");
                        }
                    case "2":
                        Double can1;
                        System.out.println("Pizza peperoni = $/.27.00");
                        System.out.println("cuantos va a desear");
                        can1=ZOE.nextDouble();
                        System.out.println("PARA PAGO EFECTIVO = 1");
                        System.out.println("PAGO CON TARJETA = 2");
                        int opcionpago1 = ZOE.nextInt();
                        if (opcionpago1==1){
                            double precio = 27.00;
                            precio=precio*can1;
                            System.out.println("ingrese el monto en efectivo");
                            double montoefectivo = ZOE.nextDouble();
                            if (montoefectivo >= precio){
                                Double cambio = montoefectivo - precio;
                                System.out.println("pedido:Pizza peperoni");
                                System.out.println("El total es:"+precio);
                                System.out.println("tu cambio es: $" + cambio);
                                System.out.println("PAGO REALIZADO GRACIAS POR SU COMPRA");
                            } else {
                                System.out.println("pedido:Pizza peperoni");
                                System.out.println("El total es:"+precio);
                                System.out.println("MONTO INSUFICIENTE");
                            }
                        }else if (opcionpago1==2){
                            System.out.println("ingrese el numero de la tarjeta");
                            String numerotarjeta = ZOE.next();
                            System.out.println("ingrese la fecha de vencimiento MM/AA");
                            String fechadevencimiento = ZOE.next();
                            System.out.println("INGRESE EL CODIGO CVV");
                            int codigocvv = ZOE.nextInt();
                            System.out.println("-----BOLETA DE COMPRA-----");
                            System.out.println("PIZZA PEPERONI");
                            System.out.println("NOMBRE:" +apodo);
                            System.out.println("PRECIO: $27.00");
                            System.out.println("NUMERO DE TARJETA: ** ** ** **");
                            System.out.println("FECHA DE VENCIMIENTO:" +fechadevencimiento);
                            System.out.println("pago realizado gracias por su compra");
                        }
                        else {
                            System.out.println("OPCION DEE PAGO NO VALIDA");
                        }
                    case "3":
                        Double can2;
                        System.out.println("Pizza suprema = $/.32.00");
                        System.out.println("cuantos va a desear");
                        can2=ZOE.nextDouble();
                        System.out.println("PARA PAGO EFECTIVO = 1");
                        System.out.println("PAGO CON TARJETA = 2");
                        int opcionpago2 = ZOE.nextInt();
                        if (opcionpago2==1){
                            double precio = 32.00;
                            precio=precio*can2;
                            System.out.println("ingrese el monto en efectivo");
                            double montoefectivo = ZOE.nextDouble();
                            if (montoefectivo >= precio){
                                Double cambio = montoefectivo - precio;
                                System.out.println("pedido:Pizza suprema");
                                System.out.println("El total es:"+precio);
                                System.out.println("tu cambio es: $" + cambio);
                                System.out.println("PAGO REALIZADO GRACIAS POR SU COMPRA");
                            } else {
                                System.out.println("pedido:Pizza suprema");
                                System.out.println("El total es:"+precio);
                                System.out.println("MONTO INSUFICIENTE");
                            }
                        }else if (opcionpago2==2){
                            System.out.println("ingrese el numero de la tarjeta");
                            String numerotarjeta = ZOE.next();
                            System.out.println("ingrese la fecha de vencimiento MM/AA");
                            String fechadevencimiento = ZOE.next();
                            System.out.println("INGRESE EL CODIGO CVV");
                            int codigocvv = ZOE.nextInt();
                            System.out.println("-----BOLETA DE COMPRA-----");
                            System.out.println("PIZZA SUPREMA");
                            System.out.println("NOMBRE:" +apodo);
                            System.out.println("PRECIO: $32.00");
                            System.out.println("NUMERO DE TARJETA: ** ** ** **");
                            System.out.println("FECHA DE VENCIMIENTO:" +fechadevencimiento);
                            System.out.println("pago realizado gracias por su compra");
                        }
                        else {
                            System.out.println("OPCION DEE PAGO NO VALIDA");
                        }
                    case "4":
                        Double can3;
                        System.out.println("Pizza meat lover = $/.30.50");
                        System.out.println("cuantos va a desear");
                        can3=ZOE.nextDouble();
                        System.out.println("PARA PAGO EFECTIVO = 1");
                        System.out.println("PAGO CON TARJETA = 2");
                        int opcionpago3 = ZOE.nextInt();
                        if (opcionpago3==1){
                            double precio = 30.50;
                            precio=precio*can3;
                            System.out.println("ingrese el monto en efectivo");
                            double montoefectivo = ZOE.nextDouble();
                            if (montoefectivo >= precio){
                                Double cambio = montoefectivo - precio;
                                System.out.println("pedido:Pizza meat lover");
                                System.out.println("El total es:"+precio);
                                System.out.println("tu cambio es: $" + cambio);
                                System.out.println("PAGO REALIZADO GRACIAS POR SU COMPRA");
                            } else {
                                System.out.println("pedido:Pizza meat lover");
                                System.out.println("El total es:"+precio);
                                System.out.println("MONTO INSUFICIENTE");
                            }
                        }else if (opcionpago3==2){
                            System.out.println("ingrese el numero de la tarjeta");
                            String numerotarjeta = ZOE.next();
                            System.out.println("ingrese la fecha de vencimiento MM/AA");
                            String fechadevencimiento = ZOE.next();
                            System.out.println("INGRESE EL CODIGO CVV");
                            int codigocvv = ZOE.nextInt();
                            System.out.println("-----BOLETA DE COMPRA-----");
                            System.out.println("PIZZA MEAT LOVER");
                            System.out.println("NOMBRE:" +apodo);
                            System.out.println("PRECIO: $30.50");
                            System.out.println("NUMERO DE TARJETA: ** ** ** **");
                            System.out.println("FECHA DE VENCIMIENTO:" +fechadevencimiento);
                            System.out.println("pago realizado gracias por su compra");
                        }
                        else {
                            System.out.println("OPCION DEE PAGO NO VALIDA");
                        }
                }
                break;
            case "2":
                System.out.println("¿SEGURO QUE QUIERES VOLVER AL MENU?");
                System.out.println("1. SI");
                System.out.println("2. NO");
                String modelo2= ZOE.nextLine();
                switch (modelo2){
                    case "1":
                        this.menu();
                        break;
                    case "2":
                        this.op_zonadehinchas();
                    default:
                        System.out.println("OPCION NO VALIDA");
                }
                break;
        }
        return null;
    }
    public String op_pizzas(){
        ZOE.nextLine();
        System.out.println("Seleccione una opcion gracias");
        System.out.println("1)Pizzas");
        System.out.println("2)REGRESAR AL MENU");
        String subOpcion = ZOE.nextLine();
        switch (subOpcion) {
            case "1":
                System.out.println("1.Pizza mozarella = $/.26.00");
                System.out.println("2.Pizza continental = $/.32.00");
                System.out.println("3.Pizza vegetariana = $/.32.00");
                System.out.println("4.Pizza hawaiana = $/.36.00");
                String modelo= ZOE.nextLine();
                switch (modelo){
                    case "1":
                        Double can;
                        System.out.println("Pizza mozarella = $/.26.00");
                        System.out.println("cuantos va a desear");
                        can=ZOE.nextDouble();
                        System.out.println("PARA PAGO EFECTIVO = 1");
                        System.out.println("PAGO CON TARJETA = 2");
                        int opcionpago = ZOE.nextInt();
                        if (opcionpago==1){
                            double precio = 26.00;
                            precio=precio*can;
                            System.out.println("ingrese el monto en efectivo");
                            double montoefectivo = ZOE.nextDouble();
                            if (montoefectivo >= precio){
                                Double cambio1 = montoefectivo - precio;
                                System.out.println("pedido:Pizza mozarella");
                                System.out.println("El total es:"+precio);
                                System.out.println("tu cambio es: $" + cambio1);
                                System.out.println("PAGO REALIZADO GRACIAS POR SU COMPRA");
                            } else {
                                System.out.println("pedido:Pizza mozarella");
                                System.out.println("El total es:"+precio);
                                System.out.println("MONTO INSUFICIENTE");
                            }
                        }else if (opcionpago==2){
                            System.out.println("ingrese el numero de la tarjeta");
                            String numerotarjeta = ZOE.next();
                            System.out.println("ingrese la fecha de vencimiento MM/AA");
                            String fechadevencimiento = ZOE.next();
                            System.out.println("INGRESE EL CODIGO CVV");
                            int codigocvv = ZOE.nextInt();
                            System.out.println("-----BOLETA DE COMPRA-----");
                            System.out.println("PIZZA MOZARELLA");
                            System.out.println("NOMBRE:" +apodo);
                            System.out.println("PRECIO: $26.00");
                            System.out.println("NUMERO DE TARJETA: ** ** ** **");
                            System.out.println("FECHA DE VENCIMIENTO:" +fechadevencimiento);
                            System.out.println("pago realizado gracias por su compra");
                        }
                        else {
                            System.out.println("OPCION DEE PAGO NO VALIDA");
                        }
                    case "2":
                        Double can1;
                        System.out.println("Pizza continental = $/.32.00");
                        System.out.println("cuantos va a desear");
                        can1=ZOE.nextDouble();
                        System.out.println("PARA PAGO EFECTIVO = 1");
                        System.out.println("PAGO CON TARJETA = 2");
                        int opcionpago1 = ZOE.nextInt();
                        if (opcionpago1==1){
                            double precio = 32.00;
                            precio=precio*can1;
                            System.out.println("ingrese el monto en efectivo");
                            double montoefectivo = ZOE.nextDouble();
                            if (montoefectivo >= precio){
                                Double cambio = montoefectivo - precio;
                                System.out.println("pedido:Pizza continental");
                                System.out.println("El total es:"+precio);
                                System.out.println("tu cambio es: $" + cambio);
                                System.out.println("PAGO REALIZADO GRACIAS POR SU COMPRA");
                            } else {
                                System.out.println("pedido:Pizza continental");
                                System.out.println("El total es:"+precio);
                                System.out.println("MONTO INSUFICIENTE");
                            }
                        }else if (opcionpago1==2){
                            System.out.println("ingrese el numero de la tarjeta");
                            String numerotarjeta = ZOE.next();
                            System.out.println("ingrese la fecha de vencimiento MM/AA");
                            String fechadevencimiento = ZOE.next();
                            System.out.println("INGRESE EL CODIGO CVV");
                            int codigocvv = ZOE.nextInt();
                            System.out.println("-----BOLETA DE COMPRA-----");
                            System.out.println("PIZZA CONTINENTAL");
                            System.out.println("NOMBRE:" +apodo);
                            System.out.println("PRECIO: $32.00");
                            System.out.println("NUMERO DE TARJETA: ** ** ** **");
                            System.out.println("FECHA DE VENCIMIENTO:" +fechadevencimiento);
                            System.out.println("pago realizado gracias por su compra");
                        }
                        else {
                            System.out.println("OPCION DEE PAGO NO VALIDA");
                        }
                    case "3":
                        Double can2;
                        System.out.println("Pizza vegetariana = $/.32.00");
                        System.out.println("cuantos va a desear");
                        can2=ZOE.nextDouble();
                        System.out.println("PARA PAGO EFECTIVO = 1");
                        System.out.println("PAGO CON TARJETA = 2");
                        int opcionpago2 = ZOE.nextInt();
                        if (opcionpago2==1){
                            double precio = 32.00;
                            precio=precio*can2;
                            System.out.println("ingrese el monto en efectivo");
                            double montoefectivo = ZOE.nextDouble();
                            if (montoefectivo >= precio){
                                Double cambio = montoefectivo - precio;
                                System.out.println("pedido:Pizza vegetariana");
                                System.out.println("El total es:"+precio);
                                System.out.println("tu cambio es: $" + cambio);
                                System.out.println("PAGO REALIZADO GRACIAS POR SU COMPRA");
                            } else {
                                System.out.println("pedido:Pizza vegetariana");
                                System.out.println("El total es:"+precio);
                                System.out.println("MONTO INSUFICIENTE");
                            }
                        }else if (opcionpago2==2){
                            System.out.println("ingrese el numero de la tarjeta");
                            String numerotarjeta = ZOE.next();
                            System.out.println("ingrese la fecha de vencimiento MM/AA");
                            String fechadevencimiento = ZOE.next();
                            System.out.println("INGRESE EL CODIGO CVV");
                            int codigocvv = ZOE.nextInt();
                            System.out.println("-----BOLETA DE COMPRA-----");
                            System.out.println("PIZZA VEGETARIANA");
                            System.out.println("NOMBRE:" +apodo);
                            System.out.println("PRECIO: $32.00");
                            System.out.println("NUMERO DE TARJETA: ** ** ** **");
                            System.out.println("FECHA DE VENCIMIENTO:" +fechadevencimiento);
                            System.out.println("pago realizado gracias por su compra");
                        }
                        else {
                            System.out.println("OPCION DEE PAGO NO VALIDA");
                        }
                    case "4":
                        Double can3;
                        System.out.println("Pizza hawaiana = $/.36.00");
                        System.out.println("cuantos va a desear");
                        can3=ZOE.nextDouble();
                        System.out.println("PARA PAGO EFECTIVO = 1");
                        System.out.println("PAGO CON TARJETA = 2");
                        int opcionpago3 = ZOE.nextInt();
                        if (opcionpago3==1){
                            double precio = 36.00;
                            precio=precio*can3;
                            System.out.println("ingrese el monto en efectivo");
                            double montoefectivo = ZOE.nextDouble();
                            if (montoefectivo >= precio){
                                Double cambio = montoefectivo - precio;
                                System.out.println("pedido:Pizza hawaiana");
                                System.out.println("El total es:"+precio);
                                System.out.println("tu cambio es: $" + cambio);
                                System.out.println("PAGO REALIZADO GRACIAS POR SU COMPRA");
                            } else {
                                System.out.println("pedido:Pizza hawaiana");
                                System.out.println("El total es:"+precio);
                                System.out.println("MONTO INSUFICIENTE");
                            }
                        }else if (opcionpago3==2){
                            System.out.println("ingrese el numero de la tarjeta");
                            String numerotarjeta = ZOE.next();
                            System.out.println("ingrese la fecha de vencimiento MM/AA");
                            String fechadevencimiento = ZOE.next();
                            System.out.println("INGRESE EL CODIGO CVV");
                            int codigocvv = ZOE.nextInt();
                            System.out.println("-----BOLETA DE COMPRA-----");
                            System.out.println("PIZZA HAWAIANA");
                            System.out.println("NOMBRE:" +apodo);
                            System.out.println("PRECIO: $36.00  ");
                            System.out.println("NUMERO DE TARJETA: ** ** ** **");
                            System.out.println("FECHA DE VENCIMIENTO:" +fechadevencimiento);
                            System.out.println("pago realizado gracias por su compra");
                        }
                        else {
                            System.out.println("OPCION DEE PAGO NO VALIDA");
                        }
                }
                break;
            case "2":
                System.out.println("¿SEGURO QUE QUIERES VOLVER AL MENU?");
                System.out.println("1. SI");
                System.out.println("2. NO");
                String modelo2= ZOE.nextLine();
                switch (modelo2){
                    case "1":
                        this.menu();
                        break;
                    case "2":
                        this.op_zonadehinchas();
                    default:
                        System.out.println("OPCION NO VALIDA");
                }
                break;
        }
        return null;
    }
    public static void main (String[]args){
        PizzaHot LEITO = new PizzaHot();
        LEITO.inicio_sesion();
    }
}
