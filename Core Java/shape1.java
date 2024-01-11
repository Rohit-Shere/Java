package com.company;

//package com.codewithharry.shape;
import java.util.Scanner;

interface shap{
    void area();
    void volume();
}
class cuboid implements shap{
    public int l;
    public int h;
    public int w;
    void seta(int a, int b, int c){
        this.l=a;
        this.w=b;
        this.h=c;
    }

    public void area(){
        double ar= 2*(l*w+w*h+l*h);
        System.out.println("The area of cuboid is :"+ar+"sq units.");
    }
    public void volume(){
        int vol= l*w*h;
        System.out.println("The volume of cuboid is :"+vol+"cubic units.");
    }
}
class cube implements shap{

    int a;
   void seta(int a){
        this.a=a;
    }
    public void area(){
        int ar= 6*a*a;
        System.out.println("Area of cube is :"+ar+"sq units");
    }
    public void volume(){
        int vol = a*a*a;
        System.out.println("The volume of cube is :"+vol+"cubic units.");
    }
}

public class shape1{
    public static void main(String[]args){

        Scanner ac = new Scanner(System.in);
        cube c1= new cube();
        cuboid c2= new cuboid();
        String shape = ac.nextLine();
        int a;
        int b;
        int c;
        switch(shape){

            case "cube":
                System.out.println("Enter the side of cube: ");
                 a=ac.nextInt();
                c1.seta(a);
                c1.area();
                c1.volume();

                String cuboid;
            case "cuboid":
                System.out.println("Enter the dimentions of cuboid: ");
                 a=ac.nextInt();
                 b=ac.nextInt();
                 c=ac.nextInt();
                c2.seta(a,b,c);
                c2.area();
                c2.volume();
        }
    }
}