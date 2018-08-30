package rozgrzewka;

public class Insertsor {

    public static void main(String[] args) {


        int[] tab = {3, 6, 1, 4, 8, 1};
        insertSort(tab);
        for (int i = 0; i < tab.length ; i++) {
            System.out.println(tab[i]);


        }

        int[] tab1 = {3, 6, 1, 4, 8, 1};

//        System.out.println("+++++++++++++++");
//        insertSortRev(tab1);
//        for (int i = 0; i < tab.length ; i++) {
//            System.out.println(tab1[i]);

//
//        }

    }

    public static void insertSort(int[] tab){
        for (int i = 1; i <tab.length ; i++) {
            int j = i-1;
            int pom = tab[i];
            while((j > -1 )&& pom < tab[j]) {
                tab[j+1] = tab[j];
                j--;

                }
                tab[j+1] = pom;



                }
            }

//    public static void insertSortRev(int[] tab){
//        for (int i = tab.length -1; i >0 ; i--) {
//            int j = i-1;
//            int pom = tab[i];
//            while((j > -1 )&& pom < tab[j]) {
//                tab[j+1] = tab[j];
//                j++;
//
//            }
//            tab[j+1] = pom;
//
//
//
//        }
//    }

        }


