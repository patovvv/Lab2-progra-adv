package laboratorio_2;
import java.util.Scanner;


//Integrantes: 
//Fabiola Level
//Patricio Vargas


public class Laboratorio_3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int op=0;  
        int plan;
        int Minutos;
         
        Plan P = new Plan("preferencial",15000,80);
        Plan N =new Plan("normal",7000,120);
        Opciones O = new Opciones();
        
        
            try{
            do{
            System.out.println("\n-------------------------");
            System.out.println("Ingrese el nombre");
            String Nombre= leer.next();
            
            
            do{
                System.out.println("Ingrese los minutos hablados");
                Minutos=leer.nextInt();
            }while(Minutos<=0);
            
                      
            do{
                System.out.println("\nIngrese 1 para plan preferencial. \nIngrese 2 para plan normal.");
                plan = leer.nextInt();
            } while((plan<1)||(plan>2));
            
            
            if (plan ==1){//plan preferncial
                Cliente C = new Cliente(Nombre,P,Minutos);
                O.Total_pago(P,C);
                P.setTotal_C(P.getTotal_C()+1);
            }
            else{//plan normal
                Cliente C = new Cliente(Nombre,N,Minutos);
                O.Total_pago(N,C);
                N.setTotal_C(N.getTotal_C()+1);
            }
            System.out.println("\nIngresa 0 si deseas agregar otro cliente. Cualquier otra tecla para ver cantidad de clientes por plan");
            op = leer.nextInt();
            }while(op==0);
            O.Muestra(P,N);
        }catch(Exception ex){
            System.out.println("Error al ingresar datos, ejecutar codigo denuevo");
        }
        }
        
}
            
           