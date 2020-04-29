
public class Raichu extends Pokemon{
    public Raichu(String name){
        super(name, 200, 250, "Electric", 6);
    }

    public void attack(Pokemon enemy,int dmg){
        System.out.println("Pokemon " + name + " attack " + enemy.getName());
        enemy.damage(dmg); 
    }
    public void reduce(Pokemon mypokemon,int value){
        mypokemon.reduceSP(value);
    }
    public int AdditonalDmg(Pokemon enemy, int dmg){
        if(enemy.gettype().equals("Water")){
            return dmg + 15;
        }
        else if(enemy.gettype().equals("Grass")){
            return dmg - 15;
        }
        else
            return dmg;
    }
}
