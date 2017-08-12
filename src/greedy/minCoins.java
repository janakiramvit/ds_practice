package greedy;

/**
 * Created by jpulipati on 7/23/17.
 */
public class minCoins {
    int array[] = { 1, 2, 5, 10, 20, 50, 100, 500, 1000};

    public int[] findMin(int n){


        int coins = 0;
        int j = 0;
        for(int i = 0; i<array.length;i++){
            if(n> array[i]) {
             j = i;
            }
        }

        int array_m[]=new  int[j+1];

        for(int i = 0; i<=j; i++){
            System.out.println("new array = "+ array[i]);
            array_m[i] = array[i];
        }
        int i =array_m.length;
        System.out.println("new array size= "+ i);
        int m=0;
        int[] cons = new int[10];
        cons[0] = array_m[i-1];
        int sum = cons[0];
        System.out.println("cons[0]="+ cons[0]);
        while(i>0){
            if(n == sum + array_m[i-1]) {
                System.out.println("match= "+ array_m[i-1]);
                m++;
                cons[m] = array_m[i - 1];
                System.out.println("cons[m]= "+ cons[m]);
                return cons;
            }
            else if((sum + array_m[i-1])<n) {
                System.out.println("less= "+ array_m[i-1]);
                m++;
                cons[m] = array_m[i - 1];
                sum += array_m[i-1];
                System.out.println("sum= "+ sum);
                i--;
            }
            else i--;
        }
        for(int k= 0;k<cons.length;k++)
        System.out.println(cons[k]);

        coins = cons.length;

        return cons;
    }

    public static void main(String[] args){
        minCoins minCoins = new minCoins();
        int[] a = minCoins.findMin(72);
        for(int i =0; i< a.length; i++)
            System.out.println(a[i]);
    }
}
