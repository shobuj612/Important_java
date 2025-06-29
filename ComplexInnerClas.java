public class ComplexInnerClas {
    public static void main(String[] args) {
        // this is the first class for object
        Plane plane=new Plane("Balaka", "Russian company", 1200000);
        // now call the myPlane method that return String
        System.out.println("thisi is the method  to return the string"+" "+plane.myPlane());
        // this is to call the planeMehtod to the by the object
        System.out.println("this is to call the method that return the Object fo the plane class"+" "+plane.planeMethod());

        // now this is the inner class method to the classs
        Plane.JetPlane jetPlane=plane.new JetPlane("usa", "Bewing company", 120000000);
        System.out.println("this is to call the inner class method "+" "+jetPlane.jetPlane());
        System.out.println("this is to call the innermethod from the main"+" "+jetPlane.string());
        
    }
    
}
class Plane{
    String name;
    String manufacturer;
    int cost;
    public Plane(String name, String manufacturer, int cost) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.cost = cost;
    }
   // in the concatenation java treat the int as a string

    public String myPlane(){
        return name+" "+manufacturer+" "+cost;
    }
    
    // this method return type is a class that is Plane . so this method return the object of this class
    public Plane planeMethod(){
        return new Plane(name, manufacturer, cost);
    }

    class JetPlane{
        String name;
        String manu;
        int cost;
        public JetPlane(String name, String manu, int cost) {
            this.name = name;
            this.manu = manu;
            this.cost = cost;
        }
        
        // this is the method to return the JetPlane object

        public JetPlane jetPlane(){
            return new JetPlane(name, manu, cost);
        }

        // this is the method to return the object as a string
        public String string(){
            return name+" "+manu+" "+cost;
        }
    }
}