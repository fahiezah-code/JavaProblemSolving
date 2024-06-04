package inheritancePractice;

public class Splendor extends Bike{


    public void run(){
        System.out.println("I am running by Splendor");
    }



    public static void main(String[] args) {
        Bike b = new Splendor();
        //method overriding
        b.run(); // it will take from child class first
        // if child class don't have run(), it will call from Parent class
    }
}
