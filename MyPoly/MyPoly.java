class MyPoly {
    public void honk() {
        System.out.println("Vuum vuum!");
    }
public static void main(String[] args) {
    
    MyPoly m1 = new MyPoly();
    MyPoly m2 = new Prado();
    MyPoly m3 = new Truck();
       m1.honk();
       m2.honk();
       m3.honk();
    }
}
class Prado extends MyPoly {
    public void honk(){
System.out.println("waaa waa!");
    }
}
class Truck extends MyPoly {
    public void honk(){
        System.out.println("Poom Poom!");
    }
}