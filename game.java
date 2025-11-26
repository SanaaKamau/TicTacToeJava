public class game {
    private boolean multiplayerMode;
    private int player1Score;
    private int player2Score;
    private boolean player1Turn; 
    private int winner;
   int[][] board;
       
    public game(boolean multiplayer){
        multiplayerMode = multiplayer;
        player1Turn = true;
        player1Score = 0;
        player2Score = 0;
        winner = -1; // -1 for no winner, 1 for P1, 2 for P2, 0 for tie
        board = new int[][]{
            {0, 0, 0},
            {0, 0, 0},
            {0, 0, 0}
        };

    }

    public void update(){

    }
    private void switchTurns(){
        if(player1Turn){
            player1Turn = false;
        }else{
            player1Turn = true;
        }

    }

    private void checkForWinner(){   
        int slot1 = board[0][0]; 
        int slot2 = board[0][1];
        int slot3 = board[0][2];
        int slot4 = board[1][0];
        int slot5 = board[1][1];
        int slot6 = board[1][2];
        int slot7 = board[2][0];
        int slot8 = board[2][1];
        int slot9 = board[2][2];

        int win1 = sum(slot1,slot2,slot3);
        int win2 = sum(slot4,slot5,slot6);
        int win3 = sum(slot7,slot8,slot9);
        int win4 = sum(slot1,slot4,slot7);
        int win5 = sum(slot2,slot5,slot8);
        int win6 = sum(slot3,slot6,slot9);
        int win7 = sum(slot1,slot5,slot9);
        int win8 = sum(slot3,slot5,slot7);
        int[] wins = {win1,win2,win3,win4,win5,win6,win7,win8};
        
        for(int i =0;i<8;i++){
            if(wins[i] == 3){
                winner = 1;
                
            }else if(wins[i] == 6){
                winner = 2;

            }

        }
    }

    private int sum(int one, int two, int three){
        return one + two + three;
    }

    
}
