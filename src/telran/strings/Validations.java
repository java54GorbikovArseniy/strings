package telran.strings;

public class Validations {
    public static boolean isArithmeticExpression(String expression){
        int counterBrackets = 0;
        for (int i = 0; i < expression.length(); i++) {
            if ("(".contains(String.valueOf(expression.charAt(i)))) counterBrackets++;
            else if (")".contains(String.valueOf(expression.charAt(i)))){
                counterBrackets--;
            }
        }
        return counterBrackets == 0;
    }
}
