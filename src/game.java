import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
public class game extends JFrame implements ActionListener{
//this class is the main and is responsible for making the game run
   JPanel game1 = new JPanel();
   JButton attack = new JButton("Attack");
   JButton flee = new JButton("Flee");
   //JButton skills = new JButton( "Skills" );
   Container contentPane = getContentPane();
   JPanel grid = new JPanel(new GridLayout(3,3));
   hero player = new hero();
   mob celldorado = new mob(15,12,900,6,0,0,new ImageIcon("cell1.png"));

   public game()
   {
      super ( "Swing Window" );
      setSize(1000,1000);
      setDefaultCloseOperation( EXIT_ON_CLOSE );
     
      JLabel meme = new JLabel("",celldorado.getImage(),JLabel.CENTER);
      JLabel meme2 = new JLabel("",player.getImage(),JLabel.CENTER);
      game1.add(attack);
      game1.add(flee);
      //game1.add(skills);
      game1.add(meme);
      game1.add(meme2);
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
		   celldorado.setHp(dealattack());
	   }
	   /*else if ( event.getSource() == skills);
	   {
		   
	   }*/
	   else if( event.getSource() == flee)
	   {
		   flee();
	   }
   }
   public static void main(String[]args){
   	//runs the game
    //  ImageIcon meme = new ImageIcon("Kamehameha.png");
      
      game gui = new game();
   }
   public int dealattack(){
	   int dmg = player.getAttack() - (celldorado.getDefense()/2);
	   int chp = celldorado.getHp() - dmg;
	   return chp;
   	//when attacking an enemy
   }
   public int takeattack(){
   	//when attacked by opponent
	   int dmg = celldorado.getAttack() - (player.getDefense()/2);
	   return dmg;
   }
   public boolean flee(){
   	//when you wanna be a little weenie
	   int sp = player.getSpeed();
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
