package tools;

public class MyDivider {
  double divider(int a, int b) throws IllegalArgumentException{
    if(b==0)
      throw new IllegalArgumentException();
    return a/b;
  }
}
