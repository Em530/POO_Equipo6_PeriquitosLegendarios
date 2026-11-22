public class Auto extends Thread {

    private String nombre;
    private float distancia;
    private Carrera carrera;

    public Auto() {}

    public Auto(String nombre, float distancia, Carrera carrera) {
        this.nombre = nombre;
        this.distancia = distancia;
        this.carrera = carrera;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDistancia(float distancia) {
        this.distancia = distancia;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public String getNombre(){
        return nombre;
    }

    public float getDistancia() {
        return distancia;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    @Override
    public void run() {
        while (distancia < 100) {
            int avance = (int)(Math.random() * 11) + 5;

            distancia += avance;
            
            System.out.println("\n| " + nombre + " avanzo: " + avance + 
                " metros |\t| Distancia total: " + distancia + " metros |");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Hilo Interrumpido");
            }
        }
        carrera.registrarGanador(nombre);
    }
}
