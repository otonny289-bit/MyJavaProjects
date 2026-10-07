
public class MyConstructor {

    int x;

    public MyConstructor() {
        this.x = 45;
    }

    public static void main(String[] args) {
        MyConstructor myObject = new MyConstructor();
        System.out.println(myObject.x);
    }
}
