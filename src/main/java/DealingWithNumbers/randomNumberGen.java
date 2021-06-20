package DealingWithNumbers;

import java.util.Random;

public class randomNumberGen {


    protected static int stat;


    public static int makeFiveRandom(){
            Random random = new Random();

            stat = 0;

            int a = random.nextInt(10) + 25;
            for (int counter = 0; counter < 5; counter++) {
                stat += a;

            }
        return stat;}



}