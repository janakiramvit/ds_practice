package array;

/**
 * Created by jpulipati on 8/7/17.
 */
public class SingleNumberII {

    public int findNumber(int s[]){
        int i = 0;
        int element = 0;
        while(i< s.length){
            System.out.println("i1 " + i);
            if(i == 0 && s[i] != s[i+1])
                return s[i];
            else if(i == s.length-1 && s[i] != s[i-1])
                return s[i];
            else if(i < s.length-2 && s[i] == s[i+2])
                i = i + 3;
            else if(i < s.length-2 && s[i] != s[i+2])
                return s[i];
        }
        return element;

    }
    public static void main(String[] args){
        SingleNumberII singleNumberII = new SingleNumberII();
        int s[] = {2,4,4,4};

        System.out.println(singleNumberII.findNumber(s));
    }
}
