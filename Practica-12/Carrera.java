import java.util.ArrayList;

public class Carrera {

    private ArrayList<String> resultados = new ArrayList<>();

    public Carrera() {}

    public Carrera(ArrayList<String> resultados) {
        this.resultados = resultados;
    }

    public void setResultados(ArrayList<String> resultados) {
        this.resultados = resultados;
    }

    public ArrayList<String> getResultados() {
        return resultados;
    }

    public synchronized void registrarGanador(String nombre) {

        resultados.add(nombre);
    }

    public void mostrarResultados() {
        System.out.println("\n\t   ----Resultados----");

        for(int i = 0; i < resultados.size(); i++) {
            System.out.println((i + 1) + ". " + resultados.get(i));
        }
        System.out.println("\n\t----Fin de la Carrera----\n");
    }
}
