package array;

import java.util.HashMap;
import java.util.Set;

/**
 * Created by jpulipati on 8/8/17.
 */
public class CompressArray {

    //using hashmap
    public void compress(String str){

        char[] ch = str.toCharArray();

        HashMap<Character,Integer> h = new HashMap<>();


        for(Character c: ch){
            if(h.keySet().contains(c))
                h.put(c,h.get(c)+1);
            else
                h.put(c,1);
        }

        StringBuilder sb = new StringBuilder();
        Set<Character> key = h.keySet();

        for(Character c: key)
        sb.append(c.toString()+h.get(c).toString());

        System.out.println(sb);

    }

    //using array
    public void compressA(String s){
        char[] ch = s.toCharArray();
        int count = 1;
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while(i<ch.length) {

                if (i != ch.length - 1 && ch[i] == ch[i+1]) {
                    count++;
                    i++;
                }
                else {
                        sb.append(ch[i] + String.valueOf(count));
                        i++;
                        count = 1;
                }

        }

        System.out.println(sb);

    }

    public static void main(String[] args){
        String str = "aaabbcd";
        CompressArray compressArray = new CompressArray();
        //CompressArray.compress(str);
        compressArray.compressA(str);
    }
}
