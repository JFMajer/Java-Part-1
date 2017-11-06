import java.util.Random;

public class PasswordRandomizer {
    private int length;
    private Random random;

    public PasswordRandomizer(int length) {
        this.length = length;
        this.random = new Random();
    }

    public String createPassword() {
        String pass = "";
        int counter = 0;
        while (counter < this.length) {
            pass += "abcdefghijklmnopqrstuvwxyz".charAt(this.random.nextInt(24));
            counter++;
        }
        return pass;
    }
}
