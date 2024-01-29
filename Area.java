import java.lang.Math;
import java.util.Scanner;
public class Area {
      public static void main(String[]args){
      //r and l.
      double area;
      int r= 623;
      int l=700;
      //calulate the area using PI.
      area=r*l* Math.PI;
      System.out.println("Area of a cone:" +area);
      Scanner  scanner =new Scanner(System.in);
           String name = scanner.nextLine();
        System.out.println(r +"radius");
        System.out.println(l +"length");
    }     
}
