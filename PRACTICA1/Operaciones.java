import java.util.Scanner;
import java.util.InputMismatchException;

public class CalculadoraBasica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Ingresa el primer número: ");
            double num1 = scanner.nextDouble();
            
            System.out.print("Ingresa el segundo número: ");
            double num2 = scanner.nextDouble();
            
            System.out.println("\n--- Resultados ---");
            System.out.println("Suma: " + (num1 + num2));
            System.out.println("Resta: " + (num1 - num2));
            System.out.println("Multiplicación: " + (num1 * num2));
            
            if (num2 != 0) {
                System.out.println("División: " + (num1 / num2));
            } else {
                System.out.println("División: Error (no se puede dividir entre cero)");
            }
            
        } catch (InputMismatchException e) {
            System.out.println("\nError: Por favor, ingresa solo valores numéricos válidos.");
        } finally {
            scanner.close(); // Es una buena práctica cerrar el Scanner para liberar recursos
        }
    }
}
