package rozgrzewka;

public class Palindrom {

    public static void main(String[] args) {
        String word = "kajak";
        String nowyString = word.substring(1, word.length() - 1);
        boolean isEq = word.charAt(0) == word.charAt(word.length() - 1);
        boolean isPalind = isPalindrom(word);
        System.out.println(isPalind);




    }

    public static boolean isPalindromRek(String word){
        if(word.length() ==1 || word.length() == 0){
            return true;

        }

        if(word.charAt(0) == word.charAt(word.length() - 1)){
            return isPalindromRek(word.substring(1, word.length() -1));
        }else{
            return false;

        }
    }

    public static boolean isPalindrom(String word){
        int indexFirst = 0;
        int indexLast = word.length()-1;
        while(indexFirst<indexLast){
            if( word.charAt(indexFirst) != word.charAt(indexLast)){
                return false;

            }
            indexFirst++;
            indexLast--;
        }
        return true;

    }
}
