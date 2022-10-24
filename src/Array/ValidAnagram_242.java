package Array;

import java.util.Arrays;

public class ValidAnagram_242 {

    public static void main (String [] args){

        String s1 = "anagram";
        String s2 = "nagaram";
        boolean result = false;

        char [] charArray1 = s1.toCharArray();
        char [] charArray2 = s2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        System.out.println(Arrays.toString(charArray1));
        System.out.println(Arrays.toString(charArray2));

        if(Arrays.equals(charArray1, charArray2)){
            result = true;
        }
        else{
            result = false;
        }

        System.out.println(result);

    }
}
