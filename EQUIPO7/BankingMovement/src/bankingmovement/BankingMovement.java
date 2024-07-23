package bankingmovement;
import java.util.Scanner;

public class BankingMovement {

    public static void main(String[] args) {
        int opc;
        Vertice origen, destino;        
        Scanner read = new Scanner(System.in);
        
        
        do{
            System.out.println("1. Insertar Vértice");
            System.out.println("2. Insertar Arista");
            System.out.println("3. Mostrar");
            System.out.println("4. Salir");
            opc = read.nextInt();
            switch(opc){
                case 1:
                    
                    break;
                    
                case 2:
                    
                    break;
                    
                case 3:
                    
                    break;
                    
                case 4:
                    
                    break;
                    
                default:
                    System.out.println("Opcion no valida");
            }
            
        }while(opc !=4);
    }
    
}
