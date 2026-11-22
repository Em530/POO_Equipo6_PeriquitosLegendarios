public class Main { 
    public static void main(String[] args) {

        Carrera carrera = new Carrera();

        Auto auto1 = new Auto("Ferrari", 0, carrera);
        Auto auto2 = new Auto("Bugatti", 0, carrera);
        Auto auto3 = new Auto("Koenigsegg", 0, carrera);
        Auto auto4 = new Auto("McLaren", 0, carrera);
        Auto auto5 = new Auto("Porsche", 0, carrera);
        Auto auto6 = new Auto("Pagani", 0, carrera);
        Auto auto7 = new Auto("Lamborghini", 0, carrera);

        System.out.println("\n\t\t\t\t----¡Que comience la carrera!----\n");

        auto1.start();
        auto2.start();
        auto3.start();
        auto4.start();
        auto5.start();
        auto6.start();
        auto7.start();

        try {
            auto1.join();
            auto2.join();
            auto3.join();
            auto4.join();
            auto5.join();
            auto6.join();
            auto7.join();
        } catch(InterruptedException e) {
            System.out.println("Error al esperar los hilos");
        }
        carrera.mostrarResultados();
    }
}
