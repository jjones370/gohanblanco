import java.awt.*;
import javax.swing.*;
public class game extends JFrame {
//this class is the main and is responsible for making the game run
   JPanel game1 = new JPanel();
   JButton attack = new JButton( "" );
   JButton flee = new JButton( "" );
   JButton skills = new JButton( "" );
   Container contentPane = getContentPane();
   JPanel grid = new JPanel(new GridLayout(3,3));
   public game(ImageIcon a,ImageIcon b)
   {
      super ( "Swing Window" );
      setSize(1000,1000);
      setDefaultCloseOperation( EXIT_ON_CLOSE );
      add( game1 );
      JLabel meme2 = new JLabel("",a,JLabel.CENTER);
      JLabel meme = new JLabel("",b,JLabel.CENTER);
      game1.add(attack);
      game1.add(flee);
      game1.add(skills);
      game1.add(meme);
  
      
      game1.add(meme2);
      setVisible( true );
   }
	
   public static void main(String[]args){
   	//runs the game
      hero player = new hero();
      cell_dorado cell_dorado = new cell_dorado();
      ImageIcon meme = new ImageIcon("Kamehameha.png");
      
      game gui = new game(null,cell_dorado.getImage());
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