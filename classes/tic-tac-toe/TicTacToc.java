import java.io.*;
import java.util.*;
class Player{
	private String playerName;
	

	public void setPlayerName(String name){
		this.playerName=name;
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
	
	public static  boolean checkGameStatus(int s){
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
		for(int i=0;i<3;i++){
			int flag=1;
			for(int j=0;j<3;j++){
				if(board[i][j]!=s && i+j==2)
					flag=0;
			}
			if(flag==1)
				return true;
		}
		for(int i=0;i<3;i++){
			int flag=1;
			for(int j=0;j<3;j++){
				if(board[i][j]!=s && i==j)
					flag=0;
			}
			if(flag==1)
				return true;
		}
		
		
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
			System.out.println("Enter row :");
			int row=sc.nextInt();
			System.out.println("Enter col :");
			int col=sc.nextInt();
			if(board[row][col]!=0)
				continue;
				
			if(count%2==0)
				board[row][col]=1;
			else
				board[row][col]=2;
			
			if(checkGameStatus(1)){
				p_1=true;
				break;
			}
			if(checkGameStatus(2)){
				p_2=true;
				break;
			}
			obj.showBoard();
			count++;
			
		}
				
		
		
		
		
	}
}

