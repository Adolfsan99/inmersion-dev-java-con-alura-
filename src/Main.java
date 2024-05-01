import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //System.out.println("El pepazo");
        //System.out.println("Pelicula: El pepe");

        int fecha_lanzamiento = 1999;
        double evaluacion = 9.5;
        boolean incluido_en_plan_basico = true;
        String nombre = "El pepe";
        String sinopsis = """
        Pelicula apta para toda la familia
        """;
        double evaluacion_media_usuario = 0;
        System.out.println("Pelicula: "+ nombre);
        System.out.println("Fecha de lanzamiento: "+fecha_lanzamiento);
        System.out.println("Evaluación: "+evaluacion);
        System.out.println("Sinopsis: "+ sinopsis);
        System.out.println("¿Incluido en el plan basico?: "+incluido_en_plan_basico);

        double evaluacion_media = (4.5 + 4.8 + 3)/3;

        System.out.println("Evaluación media de "+nombre+" "+evaluacion_media);

        if (fecha_lanzamiento < 2023) {
            System.out.println("Pelicula re vieja weon ctm");
        } else {
            System.out.println("Pelicula popular del año");
        }

        for (int i = 0; i < 3; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingresa la nota de la pelicula");
            double nota_usuario = teclado.nextDouble();
            evaluacion_media_usuario = evaluacion_media_usuario + nota_usuario / 3;
        }
        System.out.println("La media de la pelicula calculada por el usuario es: "+evaluacion_media_usuario);

}}