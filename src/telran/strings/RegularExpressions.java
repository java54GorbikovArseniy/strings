package telran.strings;

public class RegularExpressions {
    public static String javaVariable(){
        return "[A-Za-z$][\\w$]*|_[\\w$]+";
    }

    public static String zero_300(){
        return "[1-9]\\d?|[1-2]\\d\\d|300|0";
    }

    public static String ipOctet(){
        return "[0-1]\\d\\d|\\d|\\d\\d|[0-2][0-5][0-5]|[0-2][0-4][0-9]";
    }

    public static String mobileIsraelPhone(){
        return "^\\+972-?5\\d-?\\d{7}$|05\\d-?\\d{2}-?\\d{2}-?\\d{3}$";
    }

}
