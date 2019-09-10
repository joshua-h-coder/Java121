// Write a program that asks the user to enter three test scores.
// The program should display each test score, as well as the 
// average of the scores.
//  =================================================================
import java.util.Scanner;

public class Test_Average{
  
   
  private double test1;
  private double test2;
  private double test3;

  public void getTestScores(){
      Scanner keyboard = new Scanner(System.in);
    
      System.out.println("Enter the score to test #1 : ");
      test1 = keyboard.nextDouble();
      
      System.out.println("Enter the score to test #2 : ");
      test2 = keyboard.nextDouble();
    
      System.out.println("Enter the score to test #3 : ");
      test3 = keyboard.nextDouble();
    }

  public double getAvgScore(){
      return (test1 + test2 + test3)/3;
  }

  public static void main(String[] args){
   
  Test_Average test = new Test_Average();

  test.getTestScores();
  
  System.out.println("Your average test score is " + test.getAvgScore());
  }
}
