package others;   
import java.util.Random;
import java.util.Scanner;
public class arreglar {

    public static void main(String[] args) {
        // TODO code application logic here
        int n1,n2,n3,n4,n5,opc=0,aciertos=0;
        int cat3=0,cat2=0,cat1=0,contOpMenor=0,PSI=0,igual=0;
        
        Random azar = new Random();
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese Número de participantes");
        int cantPart = leer.nextInt();
        int contPart = 0;
        int contOp;
                
        do{
            n1 = azar.nextInt(30) +1;
            do{
                n2 = azar.nextInt(30) + 1;
            }while(n2==n1);
            do{
                n3 = azar.nextInt(30) + 1;
            }while(n3==n1 || n3==n2);
            do{
                n4 = azar.nextInt(30) + 1;
            }while(n4==n1 || n4==n2 || n4==n3);
            do{
                n5 = azar.nextInt(30) + 1;
            }while(n5==n1 || n5==n2 || n5==n3 || n5==n4);
            contOp = 1;
            do{
                System.out.println("Ingrese Número - oportunidad "+contOp);
                do{    
                    do{
                       igual=opc;   
                     opc = leer.nextInt();
                    }while(opc<0||opc>30);
                    if(opc==igual)
                        System.out.println("ese numero no cuenta, ya lo dijo.\n diga otro");
                }while(opc==igual);
                
                if (opc==n1 || opc==n2 || opc==n3 || opc==n4 || opc==n5){  
                    System.out.println("acierto");
                    aciertos++;
                    System.out.println("Lleva "+aciertos+" aciertos");
                }
                contOp++;        
                
            }while(contOp<10 && aciertos<5);
            System.out.println("Psiquico "+(contPart+1)+ " acertó "+aciertos+" números");
            switch (aciertos){
                case 3: cat3++; System.out.println("Gana $ 500.000"); break;
                case 4: cat2++; System.out.println("Gana $ 2.000.000"); break;
                case 5: cat1++; System.out.println("Gana $ 5.000.000");
                    if (contOpMenor>contOp){
                        contOpMenor = contOp;
                        PSI = contPart+1;
                    }
                    break;
            }
            aciertos = 0;  
            cantPart++;   
        }while(cantPart>=contPart);
        System.out.println("El jugador del año es: "+PSI+" - Ganó en "+contOpMenor+" intentos");
    }
}
