package com.company.w3.regEx;

public class Main {
    public static void main(String[] args) {

        System.out.println(validate("SQL"));
        System.out.println(validate("Java"));
        System.out.println(validate("a1981bb.com"));
        System.out.println(validate2("pqr"));
        System.out.println(validate2("prr"));
        System.out.println(validate3("java_exercises"));
        System.out.println(validate3("Java_exercises"));
    }

    //whether a string contains only a certain set of characters (in this case a-z, A-Z and 0-9).
    public static boolean validate(String text) {
        return text.matches("^[\\w]+$");
    }

    // matches a string that has a p followed by zero or more q's
    public static String validate2(String text) {
        if (text.matches("pq*?"))
            return "Found a match!";
        else
            return "Not matched!";
    }

    public static String validate3(String text) {
        if (text.matches("^[a-z]+_[a-z]+$"))
            return "Found a match!";
        else
            return "Not matched!";
    }
}


