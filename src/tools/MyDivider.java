package tools;

public class MyDivider {
  public double divider(int a, int b) throws IllegalArgumentException{
    if(b==0)
      throw new IllegalArgumentException();
    return a/b;
  }
}
