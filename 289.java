//2.289 Game of Life
public class Solution {
    public void gameOfLife(int[][] board) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                int lives=0;
                  if(i>0 && j>0 &&(board[i-1][j-1] &1)==1) lives++;
                  if(i>0 &&(board[i-1][j]&1)==1) lives++;
                  if(i>0 && j<board[0].length-1 &&(board[i-1][j+1]&1)==1) lives++;
                  if(j>0 && (board[i][j-1]&1)==1) lives++;
                  if( j<board[0].length-1 && (board[i][j+1]&1)==1) lives++;
                  if(i<board.length-1 && j>0 && (board[i+1][j-1]&1)==1) lives++;
                  if(i<board.length-1  && (board[i+1][j]&1)==1) lives++;
                  if(i<board.length-1 && j<board[0].length-1 && (board[i+1][j+1]&1)==1) lives++;  
                if(board[i][j]==0 && lives==3)  board[i][j]=2;
                else if(board[i][j]==1 && (lives<2 || lives>3)) board[i][j]=1;  
                else if(board[i][j]==1 && (lives==2 || lives==3)) board[i][j]=3; 
            }
        }
         for(int i=0;i<board.length;i++)
            for(int j=0;j<board[0].length;j++)
               board[i][j]=(board[i][j]&2)==2?1:0; 
    }
}