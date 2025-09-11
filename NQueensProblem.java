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
        return false;
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
