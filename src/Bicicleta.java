
    // Clase abstracta Bicicleta
    public abstract class Bicicleta {
        private String codigo;
        private int anoFabricacion;
        private double peso;

        public abstract double calcularCostoMantencion();


        public Bicicleta(String codigo, int anoFabricacion, double peso) {
            this.codigo = codigo;
            this.anoFabricacion = anoFabricacion;
            this.peso = peso;
        }

        public String getCodigo() {
            return codigo;
        }

        public void setCodigo(String codigo) {
            if (codigo == null || codigo.isEmpty()) {
                throw new IllegalArgumentException("Codigo no puede ser nulo o vacio");
            }
            this.codigo = codigo;
        }

        public int getAnoFabricacion() {
            return anoFabricacion;
        }

        public void setAnoFabricacion(int anoFabricacion) {
            if (anoFabricacion < 2000 || anoFabricacion > 2026) {
                throw new IllegalArgumentException("Ano fuera de rango (2000-2026)");
            }
            this.anoFabricacion = anoFabricacion;
        }

        public double getPeso() {
            return peso;
        }

        public void setPeso(double peso) {
            if (peso <= 0) {
                throw new IllegalArgumentException("Peso debe ser mayor que cero");
            }
            this.peso = peso;
        }

        @Override
        public String toString() {
            return "Bicicleta{" +
                    "codigo='" + codigo + '\'' +
                    ", anoFabricacion=" + anoFabricacion +
                    ", peso=" + peso +
                    '}';
        }
    }






