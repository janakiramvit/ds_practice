package general;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jpulipati on 8/6/17.
 */
public class divide {
    public static void main(String[] args){

        List<List<Integer>> list = new ArrayList<>();

        list.add(new ArrayList<Integer>());

        list.get(0).add(1);
        list.get(0).add(2);
        System.out.println(list);
    }
}
