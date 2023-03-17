package laboratorio_2;
public class Opciones {
    public void Muestra(Plan P, Plan N){
     System.out.println("El total de clientes del plan "+ P.getTipo()+ " son: "+P.getTotal_C());
     System.out.println("El total de clientes del plan "+ N.getTipo()+ " son: "+N.getTotal_C());

    }
    
    public void Total_pago(Plan o, Cliente C){
        C.setTotal(o.getcM()+(o.getCm()*C.getMin_c()));
        System.out.println("- - - - - - - ");
        System.out.println(C.getNombre() +" el total a pagar es de: " + C.getTotal());
        System.out.println("- - - - - - - "); 
    }
}
