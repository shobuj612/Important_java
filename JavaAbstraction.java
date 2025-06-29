public class JavaAbstraction {
    public static void main(String[] args) {
        SouthAmerica southAmerica=new Brazil("sorinam","chille");
        southAmerica.screeming();
        southAmerica.sound();

        
    }
    
}

//Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).

//Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).
//An abstract class can have both abstract and regular methods:

 abstract class SouthAmerica{
    String name;
    
    public SouthAmerica(String name) {
        this.name = name;
    }
    // this is abstract method
    public abstract void sound(); // this is abstarct method.so it has no body
    public void screeming(){ // this is regular method .as it has a body
        System.out.println("this is to show the reguler method" +" "+name);
    }
}

// we cannot make dircet object from the abstract class
// so we have to extend it to make the object
//A concrete class is a normal class that:
//Can be instantiated (you can create objects from it)
//Provides full implementations of all its methods
// here i omit the abstract keyword because it has body now.as we know abstract method does not have a body

class Brazil extends SouthAmerica{
    String myName;
    public Brazil(String name, String myName) {
        // super class constructor parameter is extra.so you have to take parameter with respect to the superclass and the sublcass
        super(name);
        this.myName = myName;
    }


    public void sound(){
        System.out.println("brasil is famous for the football");
    }
}