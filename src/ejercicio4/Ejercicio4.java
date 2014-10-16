
package ejercicio4;

/**
 *
 * @author oquintansocampo
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PulpoConPatatas parida1=new PulpoConPatatas();
        System.out.println("Clientes: "+parida1.atenderClientes(10, 20));
        parida1.getPatatas();
        parida1.getPulpo();
    }
    
}
