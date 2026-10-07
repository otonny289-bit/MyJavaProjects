
class Vehicles {

    protected String brand = "Toyota";

    public void hollow() {
        System.out.println("Land Ranger");
    }
}

public class MyInheritance extends Vehicles {

    private final String modelName = "Prado";

    public static void main(String[] args) {
        MyInheritance myObj = new MyInheritance();
        myObj.hollow();
        System.out.println(myObj.brand + " " + myObj.modelName);
    }
}
