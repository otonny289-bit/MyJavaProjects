
public class NestIf {

    public static void main(String[] args) {
        int y = 8;
        int z = 11;
        if (y < 6) {
            System.out.println("6 is less than y");
            if (z > 9) {
                System.out.println("z is greater than 9");
            }
        }
    }
}
