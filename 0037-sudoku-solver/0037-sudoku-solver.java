class Solution {
    public static boolean isValid(char[][] board,int row,int col,char num){
        for(int i=0;i<board.length;i++){
            if(board[i][col]==num || board[row][i]==num) return false;
        }

        int newRow = row-row%3;
        int newCol=col-col%3;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(board[newRow+i][newCol+j]==num) return false;
            }
        }

        return true;
    }
    
    public boolean solveSudoku(char[][] board) {
        int n=board.length;

        for(int row=0;row<n;row++){
            for(int col=0;col<n;col++){
                if(board[row][col]=='.'){
                    for(char num='1';num<='9';num++){
                        if(isValid(board,row,col,num)){
                            board[row][col]=num;
                            if(solveSudoku(board)) return true;
                            board[row][col]='.';
                        }
                    }

                    return false;
                }
            }
        }

        return true;
    }
}