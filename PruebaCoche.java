public class PruebaCoche {
    public static void main(String[] args) {
        Coche coche = new Coche();
        // coche.marca = "Toyota"; 
        // Error: marca tiene acceso privado
        coche.setMarca("Toyota");
        coche.setModelo("Corolla");
        coche.setVelocidadMaxima(180);
        coche.acelerar(20);

        System.out.println("Marca: " + coche.getMarca());
        System.out.println("Modelo: " + coche.getModelo());
        System.out.println("Velocidad Máxima: " + coche.getVelocidadMaxima());
    }
}