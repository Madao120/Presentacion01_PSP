package org.example;

public class CrearRunnable {
        // Creamos una tarea que implementa Runnable
        static class MiTarea implements Runnable {

            @Override
            public void run() {
                System.out.println("Hola, estoy ejecutando una tarea Runnable.");
            }
        }

        public static void main(String[] args) {

            // Creamos nuestra tarea
            MiTarea tarea = new MiTarea();

            // Creamos un Thread y le damos nuestra tarea
            Thread hilo = new Thread(tarea);

            // Iniciamos el hilo
            hilo.start();
        }
}
