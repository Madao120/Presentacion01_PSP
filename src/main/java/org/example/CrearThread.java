package org.example;

public class CrearThread {
        // Creamos una clase que hereda de Thread
        static class MiHilo extends Thread {

            // Override se escribe para sobrescribir el run de la clase padre (Thread)
            @Override
            public void run() {
                System.out.println("Hola, estoy ejecutándome en un hilo.");
            }
        }

        public static void main(String[] args) {

            // Creamos un objeto de nuestro hilo
            MiHilo hilo = new MiHilo();

            // Iniciamos el hilo
            hilo.start();

            //Código para demostrar que main NO ESPERA a que s eejecute el hilo
            System.out.println("Hola, la JVM sigue activa así que el hilo se seguirá ejecutando");
        }
}

