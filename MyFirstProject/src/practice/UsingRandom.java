package practice;

import java.util.Random;

public class UsingRandom {
    public static void main(String[] args){

        Random random=new Random();

        int number;
        double dNumber;
        boolean isHeads;

        number=random.nextInt(1,100); // (inclusive, exclusive)
        dNumber=random.nextDouble();
        isHeads=random.nextBoolean();

        System.out.println(number);
        System.out.println(dNumber);

        if(isHeads){
            System.out.println("HEADS");
        }
        else{
            System.out.println("TAILS");
        }

    }
}
