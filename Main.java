import java.util.Scanner;
/**
 * Finds the maximum of three given numbers
 * @author Rose
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create scanner for user input
    Scanner input = new Scanner(System.in);

    //ask user for three integers
    System.out.println("Please enter three integers on seperate lines");

    int firstNumber = input.nextInt();
    int secondNumber = input.nextInt();
    int thirdNumber = input.nextInt();

    //determine the largest number and tell the user
    if (firstNumber > secondNumber && firstNumber > thirdNumber){
      System.out.println("Maximum: " + firstNumber);
    }else if (secondNumber > firstNumber && secondNumber > thirdNumber){
      System.out.println("Maximum: " + secondNumber);
    }else if (thirdNumber > secondNumber && thirdNumber > firstNumber){
      System.out.println("Maximum: " + thirdNumber);
    }else {
      System.out.println("Please enter a valid number");
    }
    
  }
}
