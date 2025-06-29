
public class InnerJava{
    public static void main(String[] args) {
    
        // now make the object
        Animal animal=new Animal();
        Animal.Camel camel=animal.new Camel();
        System.out.println("this is to print the inner clas properties"+" "+camel.leg);
        System.out.println("this is to print the outerClass properties"+" "+animal.name);

    }
}
// a class inside another class is called inner class
// this is inner class
class Animal{
    String name="tiger";

// this is Camel is a inner class

    class Camel{
        String leg="two";
    }
}