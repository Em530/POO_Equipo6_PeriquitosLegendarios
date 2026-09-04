import java.util.Scanner;

public static void main(String[] args) {
    Alumno [] alumnos = new  [10]

    alumnos[0]  = new Alumno(20, 8.5f, "Pedro", "3er Semestre", "H");
    alumnos[1]  = new Alumno(22, 9.2f, "Juan", "6to Semestre", "H");
    Scanner sc = new Scanner(System.in);

    int edad;
    float promedio;
    String nombre, semestre;

    System.out.println("Por favor proporcione el nombre del alumno A1: ");
    nombre = sc.next();
    System.out.println("Porfavor proporcione el semestre del alumno A1: ");
    sc.nextLine();
    semestre = sc.nextLine();
    //sc.next();
    System.out.println("Por favor proporcione la edad del alumno A1: ");
    edad = sc.nextInt();
    System.out.println("Por favor proporcione el promedio del alumno A1: ");
    promedio = sc.nextFloat();

    A1.setEdad(edad);
    A1.setPromedio(promedio);
    A1.setNombre(nombre);
    A1.setSemestre(semestre);

    System.out.println("El nombre de nuestro alumno A1 es: "+A1.getNombre());
    System.out.println("El semestre de nuestro alumno A1 es: "+A1.getSemestre());
    System.out.println("La edad de nuestro alumno A1 es: "+A1.getEdad());
    System.out.println("El promedio de nuestro alumno A1 es: "+A1.getPromedio());
}
