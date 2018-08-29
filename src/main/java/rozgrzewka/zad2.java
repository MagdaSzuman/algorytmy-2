package rozgrzewka;

import java.util.stream.IntStream;

public class zad2 {

    public static void main(String[] args) {
        int[] tab = {1, -2, 3, -5, -1, 4};

        System.out.println("liczba ujemnych " + counterOfnegative(tab));
        System.out.println("suma licz dodatnich " + sumOfPositive(tab));


    }

    public static  int counterOfnegative(int[] tab){
        //int counter = 0;
//        for(int i = 0; i < tab.length; i++){
//            if(tab[i] < 0){
//                counter++;
//            }

            int counter2 = (int) IntStream.of(tab).filter(x -> x <0).count();

        return counter2;

    }

    public static int sumOfPositive(int [] tab){
//        int sum = 0;
//        for (int i = 0; i < tab.length; i++){
//            if(tab[i]> 0){
//                sum+=tab[i];
//            }
//        }
        int sum = IntStream.of(tab).filter(x -> x > 0).sum();

        return sum;
    }


}
