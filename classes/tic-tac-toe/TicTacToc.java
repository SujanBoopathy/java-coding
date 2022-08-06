import java.io.*;
import java.util.*;
class Player{
	private String playerName;
	

	public void setPlayerName(String name){
		this.playerName=name;
	}
	public String getName(){
		return playerName;
	}
}

class TicTacToe{
	private static  int[][]  board=new int[3][3];
	
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
	
	
	public static boolean checkStatus(int s){
		for(int i=0;i<3;i++){
			int flag=1;
			for(int j=0;j<3;j++){
				if(board[i][j]!=s)
					flag=0;
			}
			if(flag==1)
				return true;
			
		}
		
		for(int i=0;i<3;i++){
			int flag=1;
			for(int j=0;j<3;j++){
				if(board[j][i]!=s)
					flag=0;
			}
			if(flag==1)
				return true;
		}
		
		if(board[0][0] ==s && board[1][1]==s && board[2][2]==s)
			return true;
		if(board[1][1]==s && board[0][2]==s && board[2][0]==s)
			return true;
		
		return false;
		
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
		
		boolean p_1=false,p_2=false;
		int count=0;
		while(true){
			if(count%2==0)
				System.out.println("Player 1 :");
			else
				System.out.println("Player 2 :");
				
			System.out.println("Enter row :");
			int row=sc.nextInt();
			System.out.println("Enter col :");
			int col=sc.nextInt();
			
				
				
			if(board[row][col]==0){
				if(count%2==0)
					board[row][col]=1;
				else
					board[row][col]=2;
				
				
				obj.showBoard();
				if(checkStatus(1)){
					p_1=true;
					break;
				}
				if(checkStatus(2)){
					p_2=true;
					break;
				}
				
				count++;
			}
			
		}
		
		System.out.println();
		if(p_1)
			System.out.println(p1.getName()+" won the match");
		else if(p_2)
			System.out.println(p1.getName()+" won the match");
		else
			System.out.println("Match Tie");
				
		
		
		
		
	}
}

