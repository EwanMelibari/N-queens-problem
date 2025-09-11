public class NQueensProblem {

    private int[][] chessBoard;
    private int numOfQueens;

    public NQueensProblem(int numOfQueens){
        this.numOfQueens = numOfQueens;
        this.chessBoard = new int[numOfQueens][numOfQueens];
    }

    public void solve(){
        if(setQueens(0)){
            printQueens();
        }
    }

    private boolean setQueens(int colIndex){
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
