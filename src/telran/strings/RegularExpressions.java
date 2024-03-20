package telran.strings;

public class RegularExpressions {
    public static String javaVariable() {
        return "[A-Za-z$][\\w$]*|_[\\w$]+";
    }

    public static String zero_300() {
        return "[1-9]\\d?|[1-2]\\d\\d|300|0";
    }

    public static String ipOctet() {
        return "([0-1]?\\d{1,2}|2([0-5][0-5]|[0-4][0-9]))";
    }

    public static String mobileIsraelPhone() {
        return "(\\+972-?|0)5\\d-?\\d{2}-?\\d{2}-?\\d{3}";
    }

    public static String ipV4Address() {
        String ipOctetExpression = ipOctet();
        return String.format("%1$s(\\.%1$s){3}", ipOctetExpression);
    }

    public static String simpleArithmeticExpression() {
        //TODO
        //operation only binary +,-,*,/
        //operands only integer numbers
        //no brackets
        String operand = integerNumberExp();
        String operation = operationExp();
        return String.format("%1$s(%2$s%1$s)*", operand, operation);
    }

    private static String operationExp() {
        return "[-+*/]";
    }

    private static String integerNumberExp() {
        return "(\\s*\\d+\\s*)";
    }

    private static String doubleNumbersAndVariablesExp() {
        return "(\\s*\\(*\\s*((\\d+\\.?\\d*)|(" + javaVariable() + "))\\s*\\)*\\s*)";
    }

    public static String arithmeticExpression() {
        return String.format("%1$s(%2$s%1$s)*", doubleNumbersAndVariablesExp(), operationExp());
    }

}
