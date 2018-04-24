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
	   int turn = 0, playerMod = 0, mobMod=0;
	   int choice2;
	   boolean game = true;
	   boolean failure=false;
	   hero player = new hero();
	   mob celldorado = new mob(5,50,10,6,0,0,new ImageIcon("cell1.png"));
   	//runs the game
     ImageIcon blast = new ImageIcon("Kamehameha.png");
	  while(game==true) 
	  {	  
	   if(turn%2 == 0)
      {
		   //for player turn
      String [] battleMenu={"Attack","Skills","Flee"};
      int choice;
      choice = JOptionPane.showOptionDialog(null,"That cell dorado is in fighting stance \nYour HP:"+player.getHp() + " Your energry:"+player.getEnergy(),"Boss fight",1,1,null,battleMenu,battleMenu[0]);
      switch(choice)
         {
      case 0:celldorado.setHp(dealattack(player.getAttack(),celldorado.getDefense(),celldorado.getHp()));turn++;break;
      case 1:choice2 =skills(player.getEnergy());
    	  switch(choice2)
    	  	{
    	  case 0: player.sethp(20); player.setEnergy(-20);JOptionPane.showMessageDialog(null,"at the cost of 20 energy you heal all of your injuries");break;
    	  case 1: celldorado.setHp(dealattack(20+player.getAttack(),celldorado.getDefense(),celldorado.getHp())); JOptionPane.showMessageDialog(null,"At the cost of 5 energy you blast cell dorado"); player.setEnergy(-5);break;
    	  case 2: celldorado.changeaAtk(-3);mobMod+=3; player.setEnergy(-5);JOptionPane.showMessageDialog(null,"at the cost of 5 energy you weaken cell dorado");break;
    	  case 3: player.changeAtk(3);playerMod+=3;player.setEnergy(-5);JOptionPane.showMessageDialog(null,"at the cost of 5 energy you strengthen");break;
    	  default: break;
    	  	}
    	  break; 
      case 2:break; 
         }
	   }
	   
	   else{
		 //for enemy turn  
		   if(turn%5>0)
		   		{
			   player.sethp(takeattack(celldorado.getAttack(),player.getDefense(),player.getHp()));
			   JOptionPane.showMessageDialog(null,"Cell Dorado hits you on the head");
		   		}
		   else
		   		{
			   player.sethp(takeattack(5+celldorado.getAttack(),player.getDefense(),player.getHp()));
			   JOptionPane.showMessageDialog(null,"Cell Dorado hits you with a big chop");
		   		}
		   turn+= 1;
		   }
	   	   }
	   if(playerMod>0)
	   	 {
		playerMod-=1;
		if(playerMod==0)
			{
			player.changeAtk(10);
			}
		 }
	   if(mobMod>0)
	   	 {
		mobMod-=1;
		if(mobMod==0)
			{
			player.changeAtk(10);
			}
		 }
	   if (celldorado.getHp()<=0)
     	{
   	game = false;
     	}
	   else if(player.getHp()<=0)
	   	{
		game=false; 
		failure=false;
	   	}
	   }
   
   public static int dealattack(int playerAt,int cellD, int cellHP){
	   int dmg = playerAt - (cellD/2);
	   int chp = cellHP - dmg;
	   return chp;
   }
   public static int takeattack(int cellAt, int playerDe, int playerhp){
   	//when attacked by opponent
	   int dmg = cellAt - (playerDe/2);
	   int chp = playerhp - dmg;
	   return chp;
   }
   /*public boolean flee(){
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
   
   }*/
   public static int skills(int e)
      {
      String Skills[] = {"Heal","Blast","Weaken","Bulk Up"};
      int input=0;
      input=JOptionPane.showOptionDialog(null,"Which skill would you like to use?","Skills",1,1,null,Skills,Skills[0]);
      if(e >=5)
      	{
    	  return input;
      	}
      
      	
      JOptionPane.showMessageDialog(null,"You don't have enough energy to do that");
      return 5;
      }
   
}
