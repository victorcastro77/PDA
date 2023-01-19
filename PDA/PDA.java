import java.util.Scanner;
import java.util.InputMismatchException;
public class PDA
{
    int age;
    int youngerAge;
    int olderAge;
    /**
     * Constructor for objects of class PDA
     */
    public PDA()
    {
        //ydsffffffffffffffffffffffffffffffffffffff
    }
    
    public double getYoungerAge(double age) {
        age = ((age/2)+7);
        return Math.ceil(age);
    }
    
    public double getOlderAge(double age) {
        age = (age-7)*2;
        return Math.ceil(age);
    }
    
    /**
     * This is the main event loop for our PDA program
     */
    public void runEventLoop() {
        Scanner scanner = new Scanner(System.in);
        boolean shouldContinue = true;
        while (shouldContinue == true) {
            System.out.println("How old are you?");
            try {
            age = scanner.nextInt();            
            
            if (age < 14) {
                System.out.println(age+" is too young!");
            } else if (age < 0) {
                System.out.println("Please enter a real age");
            } else if (getYoungerAge(age) > age || getOlderAge(age) < age) {
                System.out.println(age+" is too young!");
            } else {
            System.out.println("Minimum age: "+getYoungerAge(age));
            System.out.println("Maximum age: "+getOlderAge(age));
            }
            } catch (InputMismatchException error) {
                scanner.next();
                System.out.println("Please enter an integer");
            }
            if (age == 0) {
                shouldContinue = false;
            } else {
                shouldContinue = true;
            }
            
            System.out.println("Press 0 to quit at anytime.");
        }
    }

    /**
     * The main method instantiates and runs the program
     */
    public static void main (String[] args) {
        PDA pda = new PDA();
        pda.runEventLoop();
    }
}
