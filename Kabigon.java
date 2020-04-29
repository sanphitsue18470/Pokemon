
public class Kabigon extends Pokemon{
    public Kabigon(String name){
        super(name, 200, 250, "Grass", 3);
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
        else if(enemy.gettype().equals("Fire")){
            return dmg - 15;
        }
        else
            return dmg;
    }
}