
package others;
import java.util.Scanner;
public class Others {

    public static void main(String[] args) {
        int i=0,op=0,puntos=0,cont=0;
        char tecla;
        Scanner intro= new Scanner(System.in);
        char letra[] = new char[8];
        letra[0]='w';
        letra[1]='a';
        letra[2]='s';
        letra[3]='d';
        letra[4]='2';
        letra[5]='4';
        letra[6]='6';
        letra[7]='8';
        do{
            i=(int)(Math.random()*7);
            System.out.println(letra[i]);
            tecla=intro.nextLine().charAt(0);
            if(tecla==letra[i]){
                puntos++;
            }else {
                puntos--;
            }
            cont++;
            System.out.print("\n\n\n\n\n\n\n\n");
        }while(cont<20);
        System.out.println("la cantidad total de puntos obtenidos es de: "+puntos);
        
        
                
    }

    private static void getchar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
