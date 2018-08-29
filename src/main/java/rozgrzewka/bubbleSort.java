package rozgrzewka;

public class bubbleSort {

    public static void main(String[] args) {
        int[] tab = {1,4,2,8,5,3};

        bubSort(tab);
        for (int i = 0; i <tab.length ; i++) {
            System.out.println(tab[i]);

        }
    }

    public static void bubSort(int[] tab){

        for(int i =0; i < tab.length-1; i++){
            for(int j = 0; j <tab.length-1; j++){
                if(tab[j]> tab[j+1]){
                    int temp = tab[j];
                    tab[j] = tab[j+1];
                    tab[j+1]= temp;
                }
            }

        }
    }
}
