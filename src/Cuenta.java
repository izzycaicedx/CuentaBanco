
public class Cuenta {
    

    protected float saldo;
    protected float tasaAnual; //la tasa en  %
    protected float comisionMensual =0;
    protected int numeroConsignacion = 0;
    protected int numeroRetiros = 0;

    public Cuenta(float saldo, float tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }
    
    public void imprimir (){
        System.out.println("saldo: " + saldo);
        System.out.println("Numero de consignaciones: "+ numeroConsignacion);
        System.out.println("Numero de retiros: "+ numeroRetiros);
        System.out.println("Tasa anual: " + tasaAnual);
        System.out.println("Comision mensual: " + comisionMensual);
    }
  
}
