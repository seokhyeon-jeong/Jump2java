package tools;

public class MyAdder implements MyCalculator{
  public int adder(int a, int b){
    if(a>50)
      a = 10;
    if(b>50)
      b = 50;
    return a+b;
  }
}
