package helpers;

import java.util.Random;

public class Uuid {
    private static Random random = new Random();

    public static int gerarIdAleatorio() {
        return random.nextInt(Integer.MAX_VALUE);
    }
}
