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

                System.out.println(nombre + " ha terminado.");
            }
        }

        // =============
        // MAIN
        // =============

        public static void main(String[] args) throws InterruptedException {

            System.out.println("=== INICIO DEL PROGRAMA ===");

            // 1. Creamos un Thread
            MiHilo hilo1 = new MiHilo("Hilo 1");

            // 4. Creamos un segundo hilo
            MiHilo hilo2 = new MiHilo("Hilo 2");


            // 8. Comprobamos si los hilos están vivos
            System.out.println("Antes de start():");
            System.out.println("Hilo 1 vivo: " + hilo1.isAlive());
            System.out.println("Hilo 2 vivo: " + hilo2.isAlive());


            // 3. Iniciamos los hilos con start()
            hilo1.start();
            hilo2.start();


            // 8. Volvemos a comprobar si están vivos
            System.out.println("\nDespués de start():");
            System.out.println("Hilo 1 vivo: " + hilo1.isAlive());
            System.out.println("Hilo 2 vivo: " + hilo2.isAlive());


            // 7. Esperamos a que terminen los dos hilos
            hilo1.join();
            hilo2.join();


            // Cuando llegamos aquí, los dos hilos han terminado
            System.out.println("\nDespués de join():");
            System.out.println("Hilo 1 vivo: " + hilo1.isAlive());
            System.out.println("Hilo 2 vivo: " + hilo2.isAlive());


            System.out.println("\n=== FIN DEL PROGRAMA ===");
        }
}
