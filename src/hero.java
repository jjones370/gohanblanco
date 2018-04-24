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
private int energy;
private ImageIcon img;


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
    energy =20;
    maxexp = 20;
  
     
 }
 
 public void levelUP()
 {
	 exp = exp-maxexp;
	 atk += 1;
	 def += 1;
	 spd += 1;
	 spatk += 1;
	 spdef += 1;
	 hp += 1;
 }
 public int getExp()
 	{
	return exp; 
 	}
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
public int getEnergy()
   {
   return energy;
   }
public void setEnergy(int e)
   {
   energy += e;
   }
public void changeHp(int e)
   {
	hp+=e;
   }
public void changeAtk(int e)
	{
	atk += e;
	}
public void setAtk(int e)
	{
	atk = e;
	}

}
