import java.util.Scanner;

public class Sales_Tax{
  
  double itemPrice;
  double stateTax = .04;
  double countyTax = .02;

  public Sales_Tax(double price){
    
    itemPrice = price;

  }
  
  public double calcSalesTax(){
    
    double totalPrice = itemPrice + (itemPrice * stateTax) + (itemPrice * countyTax);
    return totalPrice;

  }
 
  public static void main(String[] agrs){
    Scanner keyboard = new Scanner(System.in);
    
    System.out.println("Enter the item's price: ");
    double price = keyboard.nextDouble();
      
    Sales_Tax item = new Sales_Tax(price);
    System.out.println(item.calcSalesTax());
  }
}
    
  
