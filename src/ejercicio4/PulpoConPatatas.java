package ejercicio4;

/**
 *
 * @author oquintansocampo
 */
public class PulpoConPatatas {

    private int pulpo;
    private int patatas;
    private int clientes;

    public PulpoConPatatas() {

    }

    public PulpoConPatatas(int pulpo, int patatas) {

    }

    public int atenderClientes(int p, int t) {
        pulpo = p;
        patatas = t;
        do {
            pulpo -= 2;
            patatas -= 1;
            clientes += 3;
        } while (pulpo >= 2 && patatas >= 1);
        return clientes;
    }

    public void setPulpo(int x) {
        pulpo = x;
    }

    public void setPatatas(int y) {
        patatas = y;
    }

    public void getPulpo() {
        System.out.println("Pulpo: " + pulpo);
    }

    public void getPatatas() {
        System.out.println("Patatas: " + patatas);
    }
}
