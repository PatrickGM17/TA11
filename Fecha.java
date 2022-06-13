package TA11.Composicion;

    public class Fecha {
        private int dia;
        private int mes;
        private int año;

        public Fecha(int dia, int mes, int año) {
            this.setDia(dia);
            this.setMes(mes);
            this.setAño(año);
        }

        public int getDia() {
            return dia;
        }

        public void setDia(int dia) {
            this.dia = dia;
        }

        public int getMes() {
            return mes;
        }

        public void setMes(int mes) {
            this.mes = mes;
        }

        public int getAño() {
            return año;
        }

        public void setAño(int año) {
            this.año = año;
        }


        public String toString() {
            return "Fecha dia:" + dia + ", mes:" + mes + ", anio:" + año + "\n";
        }
    }

