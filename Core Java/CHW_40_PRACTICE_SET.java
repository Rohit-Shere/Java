package com.company;

import java.util.Scanner;

        class  Employe{
    int salary;
    String name ;
    int getSalary(){
        return salary;
    }
    String getName(){
        return name;
    }

}
        class square {
            int side;
            int getArea(){
                return side*side;
            }
            int getPerimeter (){
                return 4*side;
            }
        }

        class rectangle {
            int l,b;
            int getArea(){
                return l*b;
            }
            int getPerimeter (){
                 return 2*(l+b);
            }
        }

        class Circle {
             float r;
             float getArea (){
                 return  3.14f*r*r ;
             }
        }

public class CHW_40_PRACTICE_SET {
    public static void main(String[] args) {
        Scanner as= new Scanner(System.in);
        /*    Employe A1= new Employe();
        System.out.println("ENter your name :"  );
        A1.name= as.nextLine();
        System.out.println("Enter your salary :");
        A1.salary= as.nextInt();

        System.out.println(A1.getName());
        System.out.println(A1.getSalary());

         */


        System.out.println("Enter the length of side :" );
        square a = new square();
        a.side= as.nextInt();
        System.out.println("The area of square is : " + a.getArea());
        System.out.println("The perimeter of square is : "+a.getPerimeter());

        System.out.println("CALCULATING AREA AND PERIMETER OF RECTANGLE");
        System.out.println( "Enter the length :"    );
        rectangle n= new rectangle();
        n.l= as.nextInt();
        System.out.println("Enter the breadth :"    );
        n.b= as.nextInt();
        System.out.println("The area of rectangle is : "+n.getArea());
        System.out.println("The perimeter of rectangle is : "+n.getPerimeter());


        System.out.println("CALCULATING THE AREA OF CIRCLE ");
        Circle m= new Circle();
        m.r= as.nextFloat();
        System.out.println("The area of circle is : "+m.getArea());

    }
}
