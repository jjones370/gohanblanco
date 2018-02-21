
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
    lvl =1;
    maxexp = 20;
    //for(int i = 0; i<5;i++)
      //{
      //lvlup[i] = 1;
     // } I tried to make a lvlup int array but I kept getting a null pointer exception I'm just gonna leave this in for now and see if we can use it later.
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
