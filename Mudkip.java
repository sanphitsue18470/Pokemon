
public class Mudkip extends Pokemon{
    public Mudkip(String name){
        super(name, 200, 250, "Water", 4);
    }
    
    public void attack(Pokemon enemy,int dmg){
        System.out.println("Pokemon " + name + " attack " + enemy.getName());
        enemy.damage(dmg);
    }
    
    public void reduce(Pokemon mypokemon,int value){
        mypokemon.reduceSP(value);
    }

    public int AdditonalDmg(Pokemon enemy, int dmg){
        if(enemy.gettype().equals("Fire")){
            return dmg + 15;
        }
        else if(enemy.gettype().equals("Grass")){
            return dmg - 15;
        }
        else
            return dmg;
    }
}