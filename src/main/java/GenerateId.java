import java.util.Random;

public class GenerateId {
    public String getId() {
        Random rand = new Random();
        int num = rand.nextInt(3);
        return  "userId_" + num;
    }
}