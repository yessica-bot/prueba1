import java.util.ArrayList;

public class GestorTaller {
    private ArrayList<Bicicleta> bicicletas = new ArrayList<>();

    public void registrarBicicleta(Bicicleta b) {
        bicicletas.add(b);
        System.out.println(b.getCodigo() +"( " + b.getClass().getSimpleName() + ") correctamente.");
    }

    public Bicicleta buscarPorCodigo(String codigo) {
        for (Bicicleta b : bicicletas) {
            if (b.getCodigo().equalsIgnoreCase(codigo)) {
                return b;
            }
        }
        return null;
    }

    public void listarBicicletas() {
        for (Bicicleta b : bicicletas) {
            System.out.println("Codigo: " + b.getCodigo() + " | Ano: " + b.getAnoFabricacion());
        }
    }

}

