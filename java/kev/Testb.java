import java.util.Random;

public class TestB {
    public int a;
    public int sum;

    public  static double mean(int a){
        int sum = 0;
        for (int i=0;i<a;i++){
            int random = (int) (Math.random() * 10);
            sum = sum+random;
            System.out.println(random);


        }
        double mean = (float) sum / 10.0;
        return mean;

    }

    public static void main(String[] args){
        System.out.println(mean(10));
    }
}
