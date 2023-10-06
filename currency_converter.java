import java.util.*;
public class currency_converter{

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the currency: ");
        double currency=sc.nextDouble();
        System.out.println("Enter the country to covert the currency:");
        System.out.println("press 1:US Dollar To INR");
        System.out.println("press 2:EURO To INR");
        System.out.println("press 3:British Pound To INR");
        System.out.println("press 4:Australian Dollar  To INR");
        int country=sc.nextInt();
        switch(country){
          case 1:System.out.println("your convert currency is :" +(currency * 83.2057));
          break;
          case 2:System.out.println("your convert currency is :" +(currency * 87.7359));
          break;
           case 3:System.out.println("your convert currency is :" +(currency * 101.3686));
          break;
          case 4:System.out.println("your convert currency is :" +(currency * 53.0196));
          break;

          default:System.out.println("you have entered wrong choice currency converter");
        }
    }
}