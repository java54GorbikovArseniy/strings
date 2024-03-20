package telran.strings;

public class Validations {
    public static boolean isArithmeticExpression(String expression){
        int counterBrackets = 0;
        boolean validBrackets = true;
        for (int i = 0; i < expression.length(); i++) {
            if ('(' == expression.charAt(i)) counterBrackets++;
            else if (")".contains(String.valueOf(expression.charAt(i)))){
                counterBrackets--;
            }
            if (counterBrackets < 0){
                validBrackets = false;
            }
        }
        return counterBrackets == 0 && validBrackets;
    }
}
