package org.example;

public class EjemploHilos {
        // ===================
        // CLASE DEL HILO
        // ===================

        static class MiHilo extends Thread {

            private String nombre;

            public MiHilo(String nombre) {
                this.nombre = nombre;
            }

            @Override
            public void run() {

                System.out.println(nombre + " ha comenzado.");

                /* //Uso de sleep, donde esperará 1 segundo por cada paso del bucle
                for (int i = 1; i <= 5; i++) {

                    System.out.println(nombre + " -> paso " + i);

                    try {
                        // El hilo espera 1 segundo
                        Thread.sleep(1000);

                    } catch (InterruptedException e) {
                        System.out.println(nombre + " ha sido interrumpido.");
                        return;
                    }

                }

                 */

                System.out.println(nombre + " ha terminado.");
            }
        }

        // =============
        // MAIN
        // =============

        // En main, lanza (throws) la excepción InterruptedException ya que dentro estamos usando .join
        public static void main(String[] args) throws InterruptedException {

            System.out.println("=== INICIO DEL PROGRAMA ===");

            // Creamos 2 hilos con nombre, usando el constructor alterno
            MiHilo hilo1 = new MiHilo("Hilo 1");
            MiHilo hilo2 = new MiHilo("Hilo 2");

            /*
            // Usar isAlive ANTES de ejecutarlos, por lo que dará false
            System.out.println("Antes de start():");
            System.out.println("Hilo 1 vivo: " + hilo1.isAlive());
            System.out.println("Hilo 2 vivo: " + hilo2.isAlive());
            */

            // inciar los hilos
            hilo1.start();
            hilo2.start();

            /*
            // isAlive
            System.out.println("\nDespués de start():");
            System.out.println("Hilo 1 vivo: " + hilo1.isAlive());
            System.out.println("Hilo 2 vivo: " + hilo2.isAlive());


            // join
            hilo1.join();
            hilo2.join();


            /* // isAlive después de join
            System.out.println("\nDespués de join():");
            System.out.println("Hilo 1 vivo: " + hilo1.isAlive());
            System.out.println("Hilo 2 vivo: " + hilo2.isAlive());


            System.out.println("\n=== FIN DEL PROGRAMA ===");
            */
        }
}
