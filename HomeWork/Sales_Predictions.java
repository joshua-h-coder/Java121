public class Sales_Predictions {
   double totalSales;
  
  public Sales_Predictions(double total) {
    totalSales = total;
    }
  
  public double calcPercentage(){
    
    return totalSales * .62;

  }
  public static void main(String[] args){
    
    Sales_Predictions eastCoast = new Sales_Predictions(4600000);
    System.out.println(eastCoast.calcPercentage());

    }
}
