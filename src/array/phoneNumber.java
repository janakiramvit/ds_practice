package array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jpulipati on 8/10/17.
 */
public class phoneNumber {

    public void combo(String s1, String s2){
        char x[] = s1.toCharArray();
        char y[] = s2.toCharArray();
        List<String> list = new ArrayList<>();
       // generate(list, new String(), s1,s2,);

    }

    public List<String> combo1(String s1,String s2){
        List<String> list = new ArrayList<>();
        char x[] = s1.toCharArray();
        char y[] = s2.toCharArray();
          for(int i = 0; i<x.length;i++){
              for(int j = 0; j<y.length;j++){
                list.add(String.valueOf(x[i])+String.valueOf(y[j]));
              }
          }
        return list;
    }

    public static void main(String[] args){

        phoneNumber phoneNumber = new phoneNumber();
        String s1 = "abc";
        String s2 = "def";
        //phoneNumber.combo(s1, s2);
        System.out.println(phoneNumber.combo1(s1,s2));
    }
}
