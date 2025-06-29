public class JavaInterface {
    public static void main(String[] args) {
        // interface can be the type of the object of the subclass

        InnerJavaInterface inner=new Japan();
        Japan japan=new Japan();
        inner.like();
        japan.hike();

        // this is the another object from the constuctor of the class
        Indonesia indonesia=new Jakarta();
        Malaysia malaysia=new Jakarta();
        //indonesia.capital(); this is not correct as type Indonesia not contain capital();
        malaysia.capital();// this is work.as type MalaySia contain the method capital();
        System.out.println("this is ecomy of the malaysia"+" "+malaysia.economy());
        indonesia.vali();
        System.out.println("this is the method to call the java"+" "+indonesia.javaMan());

        // this is another object for the Jakarta
        Jakarta jakarta=new Jakarta();
        jakarta.capital();
        System.out.println("this is the direct object from the jakarta class"+" "+jakarta.economy());
        jakarta.vali();
        System.out.println("this is  the direct object to call the indonesia method"+" "+jakarta.javaMan());
    }
    
}
// An interface is a completely "abstract class" that is used to group related methods with empty bodies
 interface InnerJavaInterface {
    public void hike();// this is interface method .so it does not have a body
    public void like(); // does have a body

    
}

class Japan implements InnerJavaInterface{
     // implement means to override the method of the super class
     // override means to same name+ same parametetype +return type
     //On implementation of an interface, you must override all of its methods
     //Interface methods are by default abstract and public
     //Interface attributes are by default public, static and final
     //An interface cannot contain a constructor (as it cannot be used to create objects)
    public void hike(){
        System.out.println("this is given the body from the here");
    }
    public void like(){
        System.out.println("this is to given the body from the japan class ");
    }
}


// this is to multiple interface that can be implemented by the class
interface Malaysia{
    void capital();
    int economy();
}

interface Indonesia{
    void vali();
    String javaMan();
}

class Jakarta implements Malaysia,Indonesia{
     // you must have to implement the interface method
     public void capital(){
        int x=10;
        int y=20;
        if (x>y) {
            System.out.println("print x");
        }
        else{
            System.out.println("print y");
        }
     } 
     // this is anoter metod to override
     public int economy(){
        int income=1000;
        int revenew=10000;

        if(revenew>income){
            return revenew;
        }
        else{
            return income;
        }
     }

     // this is to overrice the Indonesia interface method
     public void vali(){
        System.out.println("the vali is the iceland in the Indonesia");
     }
    
     public String javaMan(){
        int height=100;
        int javaHeigth=10;
        if(height>javaHeigth){
            return  "this is not a javaman"+height;
        }
        else{
            return "this is a javaman"+javaHeigth;
        }
     }

}