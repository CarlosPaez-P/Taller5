public class PruebaEstudiante {
    public static void main(String[] args) {
        Estudiante est = new Estudiante();
        est.setNombre("Ana");
        est.setEdad(20);
        est.setNotaPromedio(4.5);

        System.out.println("Nombre: " + est.getNombre());
        System.out.println("Edad: " + est.getEdad());
        System.out.println("Nota Promedio: " + est.getNotaPromedio());
    }
}