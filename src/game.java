import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
public class game {
//this class is the main and is responsible for making the game run
   //JPanel game1 = new JPanel();
  // JButton attack = new JButton("Attack");
   //JButton flee = new JButton("Flee");
   //JButton skills = new JButton( "Skills" );
   //Container contentPane = getContentPane();
   //JPanel grid = new JPanel(new GridLayout(3,3));
   
   
/*bit off more than we could chew
   public game()
   {
      super ( "Swing Window" );
      setSize(1000,1000);
      setDefaultCloseOperation( EXIT_ON_CLOSE );
     
      JLabel meme = new JLabel("",celldorado.getImage(),JLabel.CENTER);
      JLabel meme2 = new JLabel("",player.getImage(),JLabel.CENTER);
      game1.add(attack);
      game1.add(flee);
      JLabel myText = new JLabel("I'm a label in the window, output : "+celldorado.getHp(),
    	        SwingConstants.CENTER);
      //game1.add(skills);
      game1.getContentPane().add(myText, BorderLayout.CENTER);
      game1.add(meme);
      game1.add(meme2);
      attack.addActionListener( this );
      //skills.addActionListener( this );
      flee.addActionListener( this );
      
    
      setVisible( true );
      add( game1 ); 
   } *//*
   public void  actionPerformed( ActionEvent event )
   {
	   
	   if( event.getSource() == attack )
	   {
		   celldorado.setHp(dealattack());
	   }
	   else if ( event.getSource() == skills);
	   {
		   
	   }
	   else if( event.getSource() == flee)
	   {
		   flee();
	   }
   }*/
   public static void main(String[]args){
	   hero player = new hero();
	   mob celldorado = new mob(15,12,900,6,0,0,new ImageIcon("cell1.png"));
   	//runs the game
    //  ImageIcon meme = new ImageIcon("Kamehameha.png");
      String [] battleMenu={"Attack","Items","Skills","Flee"};
      int choice;
      choice = JOptionPane.showOptionDialog(null,"Cell Dorado appears","Boss fight",1,1,null,battleMenu,battleMenu[0]);
      //switch(choice){case 0: celldorado.setHP(dealattack()), case 1, case 2, case 3}
      if(choice == 0){
    	  //celldorado.setHp(dealattack(player.getAttack(),celldorado.getDefense(),celldorado.getHp()));
    	  celldorado.setHp(celldorado.getHp()-(player.getAttack()-celldorado.getDefense()));
      	}
      }
   }
   public int dealattack(int playerAt,int cellD, int cellHP){
	   int dmg = playerAt - (cellD/2);
	   int chp = cellHP - dmg;
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

}
