public class EjecutarEstudiante {
    public static void main(String[] args) {

        //Creacion de objeto

        Estudiante objEstudiante1 = new Estudiante(11, "Juan", "Sistemas", 4.1, 4.0, 5.0);
        System.out.println(objEstudiante1.toString());
 System.out.print(objEstudiante1.calcularPromedio());
 }
}