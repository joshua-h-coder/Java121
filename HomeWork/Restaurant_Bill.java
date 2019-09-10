import java.util.Scanner;

public class Restaurant_Bill
{
  private double mealPrice;
  private double saleTax;
  private double tipAmt;

  public Restaurant_Bill(double meal)
  {
    mealPrice = meal;
    saleTax = meal * .0675;
    tipAmt = meal * .2;
  }
  public void displayBill()
  {
    System.out.println("Meal: " + mealPrice);
    System.out.println("\n  Sale Tax: " + saleTax);
    System.out.println("\n     Tip: " + tipAmt);
    System.out.println("\n  Total: " + (mealPrice + saleTax + tipAmt));
  }
  public static void main(String[] args)
  {
   Scanner keyboard = new Scanner(System.in);
   
   System.out.print("Enter the amount of the meal: ");
   double mealAmt = keyboard.nextDouble();
    
    Restaurant_Bill bill = new Restaurant_Bill(mealAmt);
    
    bill.displayBill();

  }
}
