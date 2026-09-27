public class BicicletaMontana extends Bicicleta {
    private int suspensiones;

    public BicicletaMontana(String codigo, int ano, double peso, int suspensiones) {
        super(codigo, ano, peso);
        this.suspensiones = suspensiones;
    }

    @Override
    public double calcularCostoMantencion() {
        double costo = 30000;
        if (suspensiones > 1) {
            costo *= 1.15;
        }
        return costo;
    }

}

