
public class hero {
//this class contains all the attributes for our hero
	
private int atk;
private int hp;
private int spd;
private int def;
private int spatk;
private int spdef;
private int exp;

 public hero()
 {
	 atk = 10;
	 def = 10;
	 spd = 10;
	 spatk = 10;
	 spdef = 10;
	 hp = 20;
	 exp = 0;
 }
 
 public void levelUP(int[]a)
 {
	 exp = 0;
	 atk += a[0];
	 def += a[1];
	 spd += a[2];
	 spatk += a[3];
	 spdef += a[4];
	 hp += a[5];
 }
 public int getExp()
 	{
	return exp; 
 	}
public int getHp()
	{
	return hp;
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
