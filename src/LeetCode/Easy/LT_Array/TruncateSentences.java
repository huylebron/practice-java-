package LeetCode.Easy.LT_Array;

public class TruncateSentences {

    public static String truncateSentencesImp ( String s , int k ) {

        String[] words = s.split(" ");

        StringBuilder res = new StringBuilder();

        for( int i =0 ; i < k ; i++ ) {
            res.append(words[i]);
            if(i < k -1 ) {
                res.append(" ");
            }
        }

        return res.toString();
    }


    public static void main(String[] args) {
        System.out.println(truncateSentencesImp("huy le bron haha huy" , 4 ));

    }





}