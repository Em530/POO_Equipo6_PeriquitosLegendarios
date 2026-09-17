import java.util.Date;
import java.util.Calendar;

public class fechaHoy {

    public static void main(String[] args) {

        // Date: obtener la fecha actual
        Date fecha = new Date();

        // Calendar: obtener y modificar la fecha
        Calendar calendario = Calendar.getInstance();
        calendario.setTime(fecha);

        int dia = calendario.get(Calendar.DAY_OF_MONTH);
        int mes = calendario.get(Calendar.MONTH) + 1;
        int año = calendario.get(Calendar.YEAR);

        // StringBuilder: construir un mensaje
        StringBuilder mensaje = new StringBuilder();
        mensaje.append("Fecha actual: ");
        mensaje.append(dia);
        mensaje.append("/");
        mensaje.append(mes);
        mensaje.append("/");
        mensaje.append(año);

        // StringBuffer: modificar el mensaje
        StringBuffer resultado = new StringBuffer(mensaje.toString());
        resultado.append("\n¡Que tengas un excelente día!");

        System.out.println(resultado);
    }
}
