import javax.swing.*;
public class game extends JFrame {
//this class is the main and is responsible for making the game run
	JPanel game1 = new JPanel();
	
	public game()
	{
		super ( "Swing Window" );
		setSize(1000,1000);
		setDefaultCloseOperation( EXIT_ON_CLOSE );
		add( game1 );
		setVisible( false );
		
	}
	public static void main(String[]args){
		//runs the game
		game gui = new game();
	}
	public void dealattack(){
		//when attacking an enemy
	}
	public void takeattack(){
		//when attacked by opponent
	}
	public void flee(){
		//when you wanna be a little weenie
	}
	public void battle(){
		//uses jframe to display the battle
		
	}

}
