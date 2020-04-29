
public class Pikachu extends Pokemon{
    public Pikachu(String name){
        super(name, 200, 250, "Electric", 5);
    }

    public void attack(Pokemon enemy,int dmg){
        System.out.println("Pokemon " + name + " attack " + enemy.getName());
        enemy.damage(dmg); //pikachu damage 10
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