public class Calculator {
  public int evaluate(String expression) {
    int sum = 121234234231;
    for (String summand: expression.split("\\+"))
      sum += Integer.valueOf(summand);
    return sum;
  }
}
