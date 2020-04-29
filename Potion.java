import java.util.*;

public class Potion{

    private Pokemon myPokemon;
    private Trainer trainer;
    public Potion(Trainer trainer ,Pokemon mypokemon, int typepotion, int num_hp, int num_sp, int num_smallhp, int num_smallsp){
        myPokemon = mypokemon;
        this.trainer = trainer;

                if((typepotion == 1) && (myPokemon.getHp() < myPokemon.MaxHP())){
                    myPokemon.heal(100);
                    trainer.reducepotion(1);
                }
                else if((typepotion == 2) && (myPokemon.getSp() < myPokemon.MaxSP())){
                    myPokemon.sp(80);
                    trainer.reducepotion(2);
                }
                else if((typepotion == 3) && (myPokemon.getHp() < myPokemon.MaxHP())){
                    myPokemon.heal(50);
                    trainer.reducepotion(3);
                }
                else if((typepotion == 4) && (myPokemon.getSp() < myPokemon.MaxSP())){
                    myPokemon.sp(40);
                    trainer.reducepotion(4);
                }
                else{
                }
           
        }      
}