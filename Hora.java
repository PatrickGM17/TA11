package TA11.Composicion;

public class Hora {
    private int hora;
    private int minuto;

    public Hora() {
    }

    public Hora(int hora, int minuto) {
        /* se comprueban los valores de la hora */
        if (hora < 0 || hora > 23 || minuto < 0 || minuto > 59) {
            throw new IllegalArgumentException();
        } else {
            this.setHora(hora);
            this.setMinuto(minuto);
        }
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public String toString() {
        return "Hora hora:" + hora + ", minuto:" + minuto + "";
    }
}
