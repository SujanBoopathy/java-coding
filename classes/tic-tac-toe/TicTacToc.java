import java.io.*;
import java.util.*;
class Player{
	private String playerName;

	public void setPlayerName(String name){
		this.playerName=name;
	}
}

class TicTacToe{
	private int[][]  board=new int[3][3];
	
	public void showBoard(){
		for(int j=0;j<3;j++){
			for(int i=0;i<3;i++){
				if(board[j][i]==1){
					System.out.print(" X |");
				}
				else if(board[j][i]==2){
					System.out.print(" O |");
				}
				else{
					System.out.print("   |");
				}
			}
			System.out.println("\n_ _ _ _ _ _ _\n");
		}
	}
	
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in); 
		TicTacToe obj=new TicTacToe();
		
		Player p1=new Player();
		Player p2=new Player();
		
		System.out.println("Enter player 1 name:");
		p1.setPlayerName(sc.next());
		
		System.out.println("Enter player 2 name:");
		p2.setPlayerName(sc.next());
		
		obj.showBoard();
			
		
		
		
		
	}
}

