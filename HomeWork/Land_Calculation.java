public class Land_Calculation {
    int totalLand;
  public Land_Calculation(int land){
    totalLand = land;
  }
  
  public int CalcTotalLand(){
    return totalLand / 43560;
  }
  public static void main(String[] agrs){
    Land_Calculation totalLand = new Land_Calculation(389767);
    System.out.println(totalLand.CalcTotalLand());

  }
}
