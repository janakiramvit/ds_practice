package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by jpulipati on 8/7/17.
 */
public class threeSum {

    public List<List<Integer>> findTriplets(int s[]) {

        List<List<Integer>> list = new ArrayList<>();

        int sum = 0;

        for (int i = 0; i< s.length; i++) {
            if (i == 0 || s[i] > s[i - 1]) {
                for (int j = i + 1; j < s.length; j++) {
                    if(s[j]==s[j-1])
                        continue;
                    for (int k = i + 2; k < s.length; k++) {
                        if(s[k]==s[k-1])
                            continue;
                        if (s[i] + s[j] + s[k] == 0) {
                            list.add(new ArrayList<>());

                            list.get(list.size() - 1).add(s[i]);
                            list.get(list.size() - 1).add(s[j]);
                            list.get(list.size() - 1).add(s[k]);

                        }
                    }
                }
            }
        }
        return list;
    }

    public static void main(String[] args){
        threeSum threeSum = new threeSum();
        int s[] = {-1, 0, 1, 2, -1, -4};
        Arrays.sort(s);
        List<List<Integer>> list = threeSum.findTriplets(s);
        System.out.println(list);

        for(int i = 0; i<list.size();i++) {
            for (int j = i+1; j+1 < list.size(); j++) {
                if (list.get(i).get(i) == list.get(j).get(j))
                    list.remove(j);
            }
        }

        System.out.println(list);
    }
}
