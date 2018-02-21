import javax.swing.*;
public class hero {
//this class contains all the attributes for our hero
	
private int atk;
private int hp;
private int spd;
private int def;
private int spatk;
private int spdef;
private int exp;
private int lvl;
private int maxexp;
private ImageIcon img;
//private int lvlup[];

 public hero()
 {
	 atk = 10;
	 def = 10;
	 spd = 10;
	 spatk = 10;
	 spdef = 10;
	 hp = 20;
	 exp = 0;
	 img = new ImageIcon("joestar.jpg");
    lvl =1;
    maxexp = 20;
    //for(int i = 0; i<5;i++)
      //{
      //lvlup[i] = 1;
     // } I tried to make a lvlup int array but I kept getting a null pointer exception I'm just gonna leave this in for now and see if we can use it later.
 }
 /*
 public void levelUP()
 {
	 exp = exp-maxexp;
	 atk += lvlup[0];
	 def += lvlup[1];
	 spd += lvlup[2];
	 spatk += lvlup[3];
	 spdef += lvlup[4];
	 hp += lvlup[5];
 }
 public int getExp()
 	{
	return exp; 
 	}*/
 public ImageIcon getImage()
 {
 return img;
 }   
public int getHp()
	{
	return hp;
	}
public void sethp(int a)
	{
	hp = a;
	}
public int getDefense()
	{
	return def;
	}
public int getSpeed()
	{
	return spd;
	}
public int getSpecialD()
	{
	return spdef;
	}
public int getAttack()
	{
	return atk;
	}	
public int getSpecialA()
	{
	return spatk;
	}	
}
