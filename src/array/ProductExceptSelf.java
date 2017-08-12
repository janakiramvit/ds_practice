package array;

/**
 * Created by jpulipati on 8/8/17.
 */
public class ProductExceptSelf {

    public int[] product(int s[]){
        int i =0;
        int r[] = new int[(s.length)];
        while(i < s.length){
            r[i] = prodWithout(s,i);
            i++;
        }
        return r;
    }

    public int prodWithout(int s[], int i){
        int prod = 1;
        int j = 0;

            if(i == 0 ){
                while(j<= s.length-2) {
                    prod = prod * s[j + 1];
                    j++;
                }
                return prod;
            }
            else{
                while(j<s.length) {
                    if (j==i)
                        j++;
                    else {
                        prod = prod * s[j];
                        j++;
                    }
                }
                return prod;
            }

    }

    public static void main(String[] args){
        ProductExceptSelf productExceptSelf = new ProductExceptSelf();
        int s[] = {1,2,3,4};
        int a[] = productExceptSelf.product(s);
        for(int i = 0; i<a.length; i++){
            System.out.println(a[i]);
        }
    }
}
