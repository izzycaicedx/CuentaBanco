
public class Principal {
    public static void main(String[] args) {

        Cuenta cuenta1 = new Cuenta(10000,0);
        cuenta1.imprimir();
        
        cuenta1.Consignar(2501);
        System.out.println("");
        cuenta1.imprimir();
    }
    
        
}
