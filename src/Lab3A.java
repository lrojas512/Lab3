import java.util.Scanner;
public class Lab3A {
    public static void main(String[] args){
        Scanner myScan=new Scanner(System.in);
        float balance;
        float APR;
        float MPR;
        float MP;
        System.out.print("Amount owed: ");
        balance = myScan.nextFloat();
        System.out.print("$APR: ");
        APR = myScan.nextFloat();
        MP=(balance*(APR/100))/12;
        MPR=APR/12;
        System.out.print("Monthly percentage rate:"+String.format("%.3f",MPR));
        System.out.println("Minimum payment: $"+String.format("%.2f",MP));
        //String.format("%._f,__) is used to limit the amount of decimal places


    }
}
