package com.company;


class Employee {
     int id;
    String name;

        public  void printfun(){
            System.out.println("The id is " + id);
            System.out.println("The name is : "+name);
        }
}

public class CHW_38_OOPs {
    public static void main(String[] args) {
        System.out.println("This is OOPs program.");

        Employee rohit = new Employee();
        Employee sumit = new Employee();
        sumit.id=25;
        sumit.name= "Sumit";


        rohit.id=03;
        rohit.name= "Rani ";
//        System.out.println(rohit.id);
//        System.out.println(rohit.name);
        rohit.printfun();
        sumit.printfun();

    }
}
