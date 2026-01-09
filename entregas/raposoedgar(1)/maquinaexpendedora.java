import java.util.Scanner;

public class MaquinaExpendedora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
         String[] productos = {"Coca-Cola", "Chips", "Chocolate", "Agua"};
         double[] precios = {1.50, 1.00, 1.25, 0.75};
          int[] stock = {10, 8, 12, 15};

        double saldo = 0.0;
        final double MAX_SALDO = 5.0;

        double[] monedasValidas = {0.10, 0.20, 0.50, 1.0, 2.0};

        System.out.println("Maquina Expendedora v1.1");

        
        while (true) {
            boolean salir = false;

            while (!salir) {
              System.out.println();
              System.out.println("Productos disponibles");
            for (int i = 0; i < prods.length; i++) {
               System.out.println("%d. %s | Precio: %.2f € | Stock: %d%n",
                                 i + 1, prods[i], precios[i], stock[i]);
    }

           System.out.println();

            
            System.out.printnl(
        "Saldo actual: %.2f € (Máx. %.2f €)%n",
        saldo, MAX_SALDO
      );

        System.out.print("[1] Insertar moneda (Válidas: ");
         for (int i = 0; i < monedasValidas.length; i++) {
        System.out.print(monedasValidas[i] + " ");
}
       System.out.println(")");
       System.out.println("[2] Seleccionar producto");
       System.out.println("[3] Salir y recuperar cambio");
       System.out.println("Opción: ");

          int opcion = sc.nextInt();
            
            if (opt == 1) {
                System.out.print("Introduce moneda: ");
                double m = sc.nextDouble();
                boolean m_valida = false;
                for(int i = 0; i < mon_val.length; i++) {
                    if (m == mon_val[i]) {
                        m_valida = true;
                        break;
                    }
                }
                
                if (m_valida) {
                    if (saldo + m > max_saldo_maq) {
                        System.out.println("ERROR: La maquina no acepta mas de " + max_saldo_maq + " euros. Se devuelve " + m + " euros.");
                    } else {
                        saldo = saldo + m;
                        System.out.println("Moneda aceptada.");
                    }
                } else {
                    System.out.println("Moneda no valida. Se devuelve " + m + " euros.");
                }
            } else if (opt == 2) {
                System.out.print("Introduce el numero del producto: ");
                int sel = sc.nextInt() - 1; // Ajustar a indice 0
                
                if (sel >= 0 && sel < prods.length) {
                    if (stock[sel] <= 0) {
                        System.out.println("Lo sentimos, producto agotado.");
                    } else if (saldo < precios[sel]) {
                        System.out.println("Saldo insuficiente. Necesitas " + precios[sel] + "eur.");
                    } else {
                        saldo = saldo - precios[sel];
                        stock[sel] = stock[sel] - 1;
                        System.out.println("¡Gracias! Aqui tienes tu " + prods[sel] + ".");
                    }
                } else {
                    System.out.println("Seleccion invalida.");
                }
            } else if (opt == 3) {
                if (saldo > 0) {
                    System.out.println("No olvides recoger tu cambio: " + ((int) saldo * 100) / 100 + " euros.");
                }
                System.out.println("Gracias por tu visita. ¡Hasta pronto!");
                break;
            } else {
                System.out.println("obcion no valida ."); 
            }
        }
        sc.close();
    }
}
