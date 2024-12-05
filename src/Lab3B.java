import java.util.Scanner;
public class Lab3B {
    public static void main(String[] args){
        Scanner myScan = new Scanner(System.in);
        float c1;
        float g1;
        float c2;
        float g2;
        float c3;
        float g3;
        float c4;
        float g4;
        float TotalHours;
        float QP;
        float GPA;
        // Gots to create the variables my boy//
        System.out.print("Course 1 hours: ");
        c1 = myScan.nextFloat();
        System.out.print("Grade for Course 1: ");
        g1 = myScan.nextFloat();
        System.out.print("Course 2 hours: ");
        c2 = myScan.nextFloat();
        System.out.print("Grade for Course 2: ");
        g2 = myScan.nextFloat();
        System.out.print("Course 3 hours: ");
        c3 = myScan.nextFloat();
        System.out.print("Grade for Course 3: ");
        g3 = myScan.nextFloat();
        System.out.print("Course 4 hours: ");
        c4 = myScan.nextFloat();
        System.out.print("Grade for Course 4: ");
        g4 = myScan.nextFloat();
        TotalHours = c1+c2+c3+c4;
        QP=((c1*g1)+(c2*g2)+(c3*g3)+(c4*g4));
        GPA = QP/TotalHours;
        //Formulas go near the end for next time
        System.out.print("Total hours is: "+String.format("%.1f",TotalHours));
        System.out.print("Total Quality points is: "+String.format("%.1f",QP));
        System.out.println("Your GPA for this semester is "+GPA);


    }
}
