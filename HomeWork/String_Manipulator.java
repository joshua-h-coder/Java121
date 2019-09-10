import java.util.Scanner;

public class String_Manipulator
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Enter a city: ");
    String city = keyboard.nextLine();

  
    System.out.println(city.length());
    System.out.println(city.toUpperCase());
    System.out.println(city.toLowerCase());
    System.out.println(city.charAt(0));
  }
}
