public class NQueensProblem {

    private int[][] chessBoard;
    private int numOfQueens;

    public NQueensProblem(int numOfQueens){
        this.numOfQueens = numOfQueens;
        this.chessBoard = new int[numOfQueens][numOfQueens];
    }

    public void solve(){
        //start from column 0 solving
        if(setQueens(0)){
            printQueens();
        }else{
            System.out.println("There is no solution...");
        }
    }

    private boolean setQueens(int colIndex){
        //base case
        if(colIndex == numOfQueens){
            return true;
        }
        //iterate over rows considering all possible positions
        for(int rowIndex = 0; rowIndex < numOfQueens; rowIndex++){
            if(isPlaceValid(rowIndex, colIndex)){
                chessBoard[rowIndex][colIndex] = 1;

                if(setQueens(colIndex + 1)){
                    return true;
                }

                //backtrack
                chessBoard[rowIndex][colIndex] = 0;

            }
        }

        //if no valid position is found, return false 
        return false;
    }

    private boolean isPlaceValid(int rowIndexm, int columnIndex){

        //check if there is a queen in the same column
        for(int i = 0; i< columnIndex; i++){
            if(chessBoard[i][columnIndex] == 1){
                return false;
            }
        }

        //check if there is a queen in the upper left diagonal
        for(int i = rowIndexm, j = columnIndex; i>=0 && j>=0; i--, j--){
            if(chessBoard[i][j] == 1){
                return false;
            }
        }

        //check if there is a queen in the lower left diagonal
        for(int i = rowIndexm, j = columnIndex; i<chessBoard.length && j>=0; i++, j--){
            if(chessBoard[i][j] == 1){
                return false;
            }
        }

        //if no queen is found in the same column, upper left diagonal, or lower left diagonal, return true
        return true;
    }

    private void printQueens(){
        for(int i = 0; i < chessBoard.length; i++){
            for(int j = 0; j < chessBoard.length; j++){

                if(chessBoard[i][j] == 1){
                    System.out.print(" ♕ ");
                }else{
                    System.out.println(" - ");
                }

                System.out.println();                
            }

    }
    
}

}
