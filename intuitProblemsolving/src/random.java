import java.util.Random;

/**
 * Created by devin on 9/21/2016.
 */
public class random {

    public static int generate(){
        int out;
        Random rn = new Random();
        int set = rn.nextInt(2);
        if (set == 0) {
            out = rn.nextInt(4);
        }
        else{
            out = rn.nextInt(6)+4;
        }
        return out;
    }
    public static void main(String[] args) {
        for (int i = 0; i < 35; i++) {
            System.out.println(generate());
        }
    }
}
