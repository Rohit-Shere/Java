package com.company;
class monkey{
    public void jumps (){
        System.out.println("Jumping...");
    }
    public void bite (){
        System.out.println("Biting...");
    }
}
interface basicAnimal{
    void eat();
    void sleep();
}
class humanBeing extends monkey implements basicAnimal{
    public void eat(){
        System.out.println("Eating ....");
    }
    public void sleep(){
        System.out.println("Sleeping....");
    }
}
public class chw_practiceSet_abstractClass {
    public static void main(String[] args) {
        humanBeing h1= new humanBeing();
        h1.eat();
        h1.sleep();
        h1.bite();
        h1.jumps();

    }

}
