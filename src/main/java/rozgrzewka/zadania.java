package rozgrzewka;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.IntStream.*;

public class zadania {

    public static void main(String[] args) {

       int[] tab = {7, 6, 1, 3, 8, 10, 13, 2};

        System.out.println(findMax(tab));
        System.out.println((findMin(tab)));

        int tab2[] = reverse(tab);

        System.out.println("zad 2");

        for (int i = 0; i < tab2.length; i++){
            System.out.print(tab2[i]+ " ");

        }

        System.out.printf("\nzad 3 \n");
        int tab3[] = doubled(tab2);

        for (int i = 0; i < tab3.length; i++){
            System.out.print(tab3[i]+" ");

        }

        System.out.printf("\nzad 4\n");
        int tab4[] = switchMaxMin(tab);

        printArray(tab4);






    }

    public static int findMax(int[] tab) {
//        int max = tab[0];
//        for(int i = 1; i < tab.length; i++){
//            if(tab[i]> max){
//                max = tab[i];
//            }
//    }
         int max = IntStream.of(tab).max().getAsInt();



        return  max;
    }

    public static int findMin(int[] tab){
//        int min = tab[0];
//        for(int i = 1; i < tab.length; i++){
//            if(tab[i]< min){
//                min = tab[i];
//            }
//
//        }

        int min = IntStream.of(tab).min().getAsInt();

        return  min;

    }

    public static  int[] reverse(int[] tab){
        int []tab2 = new int[tab.length];
        for(int i = 0; i < tab.length; i++){
            tab2[i] = tab[tab.length-1 - i];

        }
        return tab2;
    }

    public static int[] doubled(int[] tab){
        int[] tab3 = new int[tab.length];
        for(int i = 0; i < tab.length; i++){
            tab3[i] = tab[i] * 2;
        }
        return tab3;
    }

    public static int[] switchMaxMin(int[] tab){
        int min = tab[0];
        int indexMin = 0;
        for(int i = 1; i < tab.length; i++){
            if(tab[i]< min){
                min = tab[i];
                 indexMin = i;
            }



    }

        int max = tab[0];
        int indexMax = 0;
        for(int i = 1; i < tab.length; i++){
            if(tab[i]> max){
                max = tab[i];
                 indexMax = i;
            }

        }


        int pom = tab[indexMax];
        tab[indexMax] = tab[indexMin];
        tab[indexMin] = pom;


        return  tab;


    }

    static void printArray(int[] tab){
        of(tab).forEach(System.out::println);

    }


}

