import java.util.Scanner;
public class Lab3C {
    public static void main(String[] args){
        Scanner myScan= new Scanner(System.in);
        int quarters;
        int dimes;
        int nickles;
        int pennies;
        int sum1;
        int sum2;
        int sum3;
        int sum4;
        int total;
        int dollars;
        int cents;

        System.out.print("Enter the number of quarters: ");
        quarters =myScan.nextInt();
        sum1 = quarters * 25;
        System.out.print("Enter the number of dimes: ");
        dimes =myScan.nextInt();
        sum2 = dimes * 10;
        System.out.print("Enter the number of nickels: ");
        nickles =myScan.nextInt();
        sum3 = nickles * 5;
        System.out.print("Enter the number of pennies: ");
        pennies = myScan.nextInt();
        sum4 = pennies;
        total = sum1+sum2+sum3+sum4;
        cents=total%100;
        // Used modulus to get leftovers that do not reach 100
        dollars = total/100;
        //This is how you convert the cents into dollars
        System.out.println("");
        System.out.println("You entered " +quarters +" quarters.");
        System.out.println("You entered " + dimes +" dimes.");
        System.out.println("You entered " +nickles+" nickels.");
        System.out.println("You entered "+pennies+" pennies.");
        System.out.println();
        System.out.println("Your total is " +dollars+" dollars and "+ cents +" cents.");




    }
}
