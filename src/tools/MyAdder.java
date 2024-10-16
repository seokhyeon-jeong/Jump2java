package tools;

public class MyAdder implements MyCalculator{
  public int adder(int a, int b){
    if(a>100)
      a = 10;
    if(b>100)
      b = 10;
    return a+b;
  }
}
