import java.util.Scanner;
import java.lang.String;
import java.util.Arrays;
public class Matriz{
    public static void main(String [] args){
        String [][] nomes= {{"Shayane", "Taynara", "Laura"}, {"Silvana", "Alanda", "Keila"}, {"Camaragibe", "Recife", "Recife"}};
       String [] vnome = new String[3];
       vnome[0]= nomes[0][0];
       vnome[1]= nomes[0][1];
       vnome[2]= nomes[0][2];

       String [] vmae = new String[3];
       vmae[0]= nomes[1][0];
       vmae[1]= nomes[1][1];
       vmae[2]= nomes[1][2];

       String [] vcity = new String[3];
       vcity[0]= nomes[2][0];
       vcity[1]= nomes[2][1];
       vcity[2]= nomes[2][2];
        
       Arrays.sort(vnome);
       Arrays.sort(vmae);
       Arrays.sort(vcity);
       System.out.println("===================================");
       Scanner s= new Scanner(System.in);
        System.out.println("Qual lista você deseja ver? Digite 1 para nome, Digite 2 para mãe, Digite 3 para cidade. ");
        int dado= s.nextInt();
        System.out.println("===================================");
        if (dado == 1){
            for (String element: vnome) {
                System.out.println(element);
            }
        }
        if (dado == 2){
            for (String element1: vmae) {
                System.out.println(element1);
            } 
        }
        if (dado == 3){
            for (String element2: vcity) {
                System.out.println(element2);
            }
        }
        System.out.println("===================================");
         
    }
    
}