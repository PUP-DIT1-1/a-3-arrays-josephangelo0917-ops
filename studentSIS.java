/**
 *
 * @author Rog
 */
import java.util.*;

public class StudentSIS
{

    public static void main(String[] args)
    {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in); 
        
        //variables sa input
        
        int tennames = 10;
        int numgrades = 9;
        String[] student = new String[tennames];
        double[] average = new double[tennames];
        double sum;
        
        //variable sa pag rank
        double lol;
        String noun;
        
        //variable pag search
        String search;
        boolean nasearch;
                
        //dito input muna ng names tas grades ng kada isa
        for(int a = 0; a < tennames; a++)
        {
            System.out.println("enter name of student: " + (a + 1));
            student[a] = scan.nextLine();
            
            sum = 0;
            for(int b = 0; b < numgrades; b++)
            {
                System.out.println("enter grade: " + (b + 1));
                sum += scan.nextDouble();
            }
            
            average[a] = sum / numgrades;
            
            scan.nextLine();
        }  
        
        //pag rank
        for (int a = 0; a < tennames - 1; a++)
        {
            for (int b = 0; b < tennames - a - 1; b++)
            {
                if (average[b] > average[b + 1])
                {
                    
                    lol = average[b];
                    average[b] = average[b + 1];
                    average[b + 1] = lol;

                    noun = student[b];
                    student[b] = student[b + 1];
                    student[b + 1] = noun;
                }
            }
        }
        
        System.out.println("rankings");
        for (int a = 0; a < tennames; a++)
        {
            System.out.printf("top %d: %s  Average: %.2f\n", (a + 1), student[a], average[a]);
        }
        
        //pag search
        System.out.print("Search student: ");
        search = scan.nextLine();
        nasearch = false;
        
        for (int a = 0; a < 10; a++)
        {
            if (student[a].equalsIgnoreCase(search)) 
            {
                System.out.printf("Student: %s  Average: %.2f\n", student[a], average[a]);
                nasearch = true;
                break;
            }
        }
    } 
}
