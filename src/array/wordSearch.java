package array;

/**
 * Created by jpulipati on 8/10/17.
 */
public class wordSearch {

    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        boolean result = false;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.println("loop1 - dfs(" + board +","+word +","+i+","+j+","+0 +")" );
                if(dfs(board,word,i,j,0)){
                    result = true;
                }
            }
        }
        return result;
    }

    public boolean dfs(char[][] board, String word, int i, int j, int k){
        int m = board.length;
        int n = board[0].length;
        System.out.println("m " + m);
        System.out.println("n " + n);
        if(i<0 || j<0 || i>=m || j>=n){
            System.out.println("Inside false loop " + i +","+ j);
            return false;
        }
        if(board[i][j] == word.charAt(k)){
            System.out.println("i + j + k: " + i + ", " + j +"," + k);
            System.out.println("board[i][j] " + board[i][j]);
            char temp = board[i][j];
            board[i][j]='#';
            if(k==word.length()-1){
                System.out.println("word.length()-1 " + Integer.valueOf(word.length()-1));
                return true;
            }else if(dfs(board, word, i-1, j, k+1)
                    ||dfs(board, word, i+1, j, k+1)
                    ||dfs(board, word, i, j-1, k+1)
                    ||dfs(board, word, i, j+1, k+1)){
                System.out.println("loop2 - dfs(" + board +","+word +","+i+","+j+","+0 +")" );
                return true;
            }
            board[i][j]=temp;
        }
        return false;
    }

    public static void main(String[] args){
        wordSearch wordSearch = new wordSearch();
        char[][] board = {{'A','B'},{'S','F'}};
        String word = "ASF";
        System.out.println(wordSearch.exist(board,word));
    }
}
