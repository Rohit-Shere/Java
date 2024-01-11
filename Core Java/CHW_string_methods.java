package com.company;

public class CHW_string_methods {


    public static void main(String[] args) {
        String a ="        Rohit";
        String a1= new String("rohit");
        String a3= new String("Harry");
        System.out.println(a);
        System.out.println(a1.replace("r","m"));
       int b= a.length();
        System.out.println(b);
        String lstring = a.toLowerCase();
        System.out.println(lstring);
        String ustring = a.toUpperCase();
        System.out.println(ustring);
        System.out.println(a.trim());
        System.out.println(a1.substring(2,5));
        System.out.println(a.startsWith("  "));
        System.out.println(a1.charAt(3));
        System.out.println(a1.indexOf("o"));
        System.out.println(a1.indexOf("i",3));
        System.out.println(a3.lastIndexOf("r"));
        System.out.println(a3.equals("Harry"));
        System.out.println(a3.equalsIgnoreCase("harry"));
    }
}
