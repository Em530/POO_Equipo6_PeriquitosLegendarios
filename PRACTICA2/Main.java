import java.util.Scanner;

public static void main(String[] args) {
    Alumno [] alumnos = new Alumno[10];

    alumnos[0]  = new Alumno(20, 8.5f, "Pedro", "3er Semestre", "H");
    alumnos[1]  = new Alumno(22, 9.2f, "Ana", "6to Semestre", "M");
    Scanner sc = new Scanner(System.in);

    int edad;
    float promedio;
    String nombre, semestre;
    int i=2;
    while(i<10){
        
        alumnos[i] = new Alumno();

        System.out.println("Por favor proporcione el nombre del alumno: ");
        nombre = sc.next();
        alumnos[i].setNombre(nombre);

        System.out.println("Porfavor proporcione el semestre del alumno: ");
        sc.nextLine();
        semestre = sc.nextLine();
        alumnos[i].setSemestre(semestre);
        //sc.next();

        System.out.println("Por favor proporcione la edad del alumno: ");
        edad = sc.nextInt();
        alumnos[i].setEdad(edad);

        System.out.println("Por favor proporcione el promedio del alumno: ");
        promedio = sc.nextFloat();
        alumnos[i].setPromedio(promedio);

        boolean sexoValido = false;
        while(!sexoValido){
        System.out.println("Por favor proporcione el sexo(H/h o M/m): ");
        String sexoEntrada = sc.next();
        
        if(sexoEntrada.equalsIgnoreCase("H")){
            alumnos[i].setSexo("H");
            sexoValido = true;
        }else if(sexoEntrada.equalsIgnoreCase("M")){
            alumnos[i].setSexo("M");
            sexoValido = true;
        }else{
            System.out.println("Sexo no valido, por favor ingrese H/h o M/m");
            }
        }
        i++;
    }

    System.out.println("  LISTA DE ALUMNOS:  ");
    for (int j=0; j<i; j++){
        System.out.println("Nombre: "+alumnos[j].getNombre());
        System.out.println("Semestre: "+alumnos[j].getSemestre());
        System.out.println("Edad: "+alumnos[j].getEdad());
        System.out.println("Promedio: "+alumnos[j].getPromedio());
        System.out.println("Sexo: "+alumnos[j].getSexo());
    }
    sc.close();
}
