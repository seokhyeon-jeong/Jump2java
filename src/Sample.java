import tools.MyAdder;
import tools.MyCalculator;
import tools.MyDivider;

import java.util.Scanner;

public class Sample {
  public static void main(String[] args) {
    System.out.println("Hello sample");
    System.out.println("hello second");
    System.out.println("hello third");

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println("(1) Adder, (2) Divider");
    int input = sc.nextInt();
    if(input==1){
      MyAdder mc = new MyAdder();
      System.out.println(mc.adder(a,b));
    }
    else if(input == 2){
      MyDivider md = new MyDivider();
      System.out.println(md.divider(a,b));
    }
  }
}
