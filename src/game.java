import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
public class game extends JFrame implements ActionListener{
//this class is the main and is responsible for making the game run
   JPanel game1 = new JPanel();
   JButton attack = new JButton( "Attack" );
   JButton flee = new JButton( "Flee" );
   //JButton skills = new JButton( "Skills" );
   Container contentPane = getContentPane();
   JPanel grid = new JPanel(new GridLayout(3,3));
   hero player = new hero();
   public game(hero h,ImageIcon b)
   {
      super ( "Swing Window" );
      setSize(1000,1000);
      setDefaultCloseOperation( EXIT_ON_CLOSE );
     
      JLabel meme = new JLabel("",b,JLabel.CENTER);
      game1.add(attack);
      game1.add(flee);
      //game1.add(skills);
      game1.add(meme);
      attack.addActionListener( this );
      //skills.addActionListener( this );
      flee.addActionListener( this );
      
    
      setVisible( true );
      add( game1 );
   }
   public void  actionPerformed( ActionEvent event )
   {
	   
	   if( event.getSource() == attack )
	   {
		   dealattack();
	   }
	   /*else if ( event.getSource() == skills);
	   {
		   
	   }*/
	   else if( event.getSource() == flee)
	   {
		   flee(player);
	   }
   }
   public static void main(String[]args){
   	//runs the game
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
   public boolean flee(hero h){
   	//when you wanna be a little weenie
	   int sp = h.getSpeed();
	   boolean escape = false;
	   Random generator = new Random();
	   int roll = generator.nextInt(20) + 1;
	   if(sp > roll)
	   {
		  escape = true;
	   }
	   return escape;
   }
   public void battle(){
   	//uses jframe to display the battle
   	
   }

}
