package TA11.Agregacion;

public class Panal {
    public Abeja enjambre [];
    public Panal() {
        enjambre = new Abeja[2];
        enjambre[0] = new Abeja("Obrera");
        enjambre[1] = new Abeja("Reina");
    }
}
