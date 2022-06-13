package TA11.Composicion;

public class Main {
    public static void main(String[] args) {


        Examen examen = new Examen();

        Fecha fecha = new Fecha(18, 6, 2022);
        Hora hora = new Hora(17, 15);

        examen.setAsignatura("Programacion en Java");
        examen.setAula("27");

        examen = new Examen((examen.getAsignatura()), (examen.getAula()),
                fecha, hora);

        System.out.println(examen.toString());
    }
}