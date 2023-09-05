import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(printInfo(20, 25));
        System.out.println(printInfo(22, 21));
        System.out.println(printInfo(10, 15));
        System.out.println(printInfo(13, 32));
        System.out.println(printInfo(generateRandomAge(), 18));

    }

    public static String printInfo(int age, int temperature) {
        String canWalk = "Можно идти гулять";

        if (temperature > -20 && temperature < 30 && age > 20 && age < 45) {
            return canWalk;
        } else if (age < 20 && temperature > 0 && temperature < 28) {
            return canWalk;
        } else if (age > 45 && temperature > -10 && temperature < 25) {
            return canWalk;
        } else {
            return "Оставайтесь дома!";
        }
    }

    public static int generateRandomAge() {
        Random age = new Random();
        return age.nextInt(20);

    }
}


