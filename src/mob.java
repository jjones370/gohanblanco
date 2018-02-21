import javax.swing.*;
public class mob {
	public int atk;
	public int hp;
	public int spd;
	public int def;
	public int spatk;
	public int spdef;
	public ImageIcon image;
mob(int a, int h, int s, int d, int spa, int sp, ImageIcon i )
   {
   atk = a;
   hp =h;
   spd = s;
   def = d;
   spatk = spa;
   spdef = sp;
   image = i;
   }
public int getHp()
	{
	return hp;
	}
public void setHp(int a){
	hp =- a;
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
public ImageIcon getImage()
   {
   return image;
   }   
}
