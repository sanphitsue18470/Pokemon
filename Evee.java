
public class Evee extends Pokemon{
    public Evee(String name){
        super(name, 200, 250, "Poison", 2);
    }

    public void attack(Pokemon enemy,int dmg){
        System.out.println("Pokemon " + name + " attack " + enemy.getName());
        enemy.damage(dmg);
    }
    public void reduce(Pokemon mypokemon,int value){
        mypokemon.reduceSP(value);
    }
    public int AdditonalDmg(Pokemon enemy, int dmg){
            return dmg + 15;
    }
    
}