public class BicicletaElectrica extends Bicicleta implements ConGarantiaExtendida {
        private int autonomiaKm;
        private boolean bateriaCertificada;
        private boolean garantiaExtendida;

        public BicicletaElectrica(String codigo, int ano, double peso, int autonomiaKm, boolean bateriaCertificada) {
            super(codigo, ano, peso);
            this.autonomiaKm = autonomiaKm;
            this.bateriaCertificada = bateriaCertificada;
            this.garantiaExtendida = false;
        }

        @Override
        public double calcularCostoMantencion() {
            double costo = 45000;
            if (!bateriaCertificada) {
                costo *= 1.25;
            }
            return costo;
        }

    @Override
        public boolean tieneGarantiaExtendida() {
            return garantiaExtendida;
        }

        @Override
        public void activarGarantiaExtendida() {
            this.garantiaExtendida = true;
        }

    @Override
    public String toString() {
        return "Tipo: Bicicleta Electrica | Codigo: " + getCodigo() +
                " | Ano: " + getAnoFabricacion() +
                " | Peso: " + getPeso() + " kg" +
                " | Autonomia: " + autonomiaKm + " km" +
                " | Bateria certificada: " + (bateriaCertificada ? "Si" : "No") +
                "\n  Garantia extendida: " + (tieneGarantiaExtendida() ? "Si" : "No") +
                " | Costo mantencion: $" + calcularCostoMantencion();
    }

}


