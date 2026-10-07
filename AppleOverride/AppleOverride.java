
public class AppleOverride {

    int z = 350;

    public static void main(String[] args) {
        AppleOverride myObject = new AppleOverride();
        myObject.z = 480;
        System.out.println(myObject.z);
    }
}
