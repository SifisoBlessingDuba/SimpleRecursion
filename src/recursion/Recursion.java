package recursion;

/**
 *
 * @author sifiso
 */
public class Recursion {
//recursion is calling a class inside of its self resulting in an infinate loop
//the loop can be controlled by adding if statments and a value to meet the statement to stop the loop from execuuting. 
//can either be static or not. but if not static the create an object of the whole class in teh main methord as it waas doen with number 2 
//if not done correctly the recursion statement will run until it reaches stackoverflow 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        sayHello(10);
        Recursion rec = new Recursion();
        rec.sayHi(10);
        countDown(100);
    }
    //choice number 1
    public static void sayHello(int value){
        if(value == 0){
        System.out.println("Bye"); // base case
        }
        else {
            System.out.println("Hello");
            value --;
        sayHello(value);
        }

    }
    //choice number 2
    public void sayHi(int details){
        if (details ==0){
            System.out.println("Done");
            return; //base case
        }
        System.out.println("Hi");
        details --;
        sayHi(details);

            }
    private static void countDown(int number){
        if(number == 0){
            System.out.println("Finish!!");
            return; // base case
        }
        System.out.println(number);
        number--;
        countDown(number);

    }
    
}
