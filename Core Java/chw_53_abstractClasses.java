package com.company;

 abstract class parent{
    parent(){
        System.out.println("This  is parent constructor");

    }
    public void swagat(){
        System.out.println("Aap ka Swagat hai");

    }
    abstract public void greet();
}

class child extends parent{

    @Override
    public void greet() {
        System.out.println("Good morning");
    }

}

public class chw_53_abstractClasses {
    public static void main(String[] args) {
        parent a= new child();
        a.greet();
    }
}
