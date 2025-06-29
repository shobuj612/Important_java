public class ComplexInnerClas {
    public static void main(String[] args) {
        
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

    public String myPlane(String name,String manufacturer,int cost){
        return name+" "+manufacturer+" "+cost;
    }
    
    // this method return type is a class that is Plane . so this method return the object of this class
    public Plane planeMethod(String name,String manufacturer,int cost){
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

        public JetPlane jetPlane(String name, String manu, int cost){
            return new JetPlane(name, manu, cost);
        }

        // this is the method to return the object as a string
        public String string(String name, String manu, int cost){
            return name+" "+manu+" "+cost;
        }
    }
}