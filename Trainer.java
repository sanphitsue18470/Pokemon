import java.util.*;

import javax.lang.model.util.ElementScanner6;

class Trainer{
    private String trainerName;
    private ArrayList<Pokemon> bag;
    private Scanner sc;

    private int num_hp = 5;
    private int num_sp = 5;
    private int num_smallhp = 10;
    private int num_smallsp = 10;
    private int [] Potionbag = {num_hp, num_sp, num_smallhp, num_smallsp};

    private int countPokemon = 0;
    private int Countselectskill = 0;

    public Trainer(String name){
        trainerName = name;
        sc = new Scanner(System.in);
        bag = new ArrayList<Pokemon>();
    
        // Pokemon Torchic = new Torchic("Torchic of Satochi ");
        // Pokemon Treecko = new Treecko("Treecko of Satochi ");
        // Pokemon Mudkip = new Mudkip("Mudkip of Satochi ");
        
        // System.out.println("\n\n\nChoose your Starter Pokemon");
        // System.out.println("No.1 : Torchic (Fire)");
        // System.out.println("No.2 : Treecko (Water)");
        // System.out.println("No.3 : Mudkip (Grass)");

        // int starter = 0;
        // System.out.print("Enter number of Pokemon :");
        // starter = sc.nextInt();
        // sc.nextLine();
        // if(starter == 1)
        //     bag.add(Torchic);
        // else if(starter == 2)
        //     bag.add(Treecko);
        // else if(starter == 3)
        //     bag.add(Mudkip);
        // else
        //     System.out.println("Out of range");

    }

    public void play(){
        // int cmd = 0; 
        // int i = 0;
        // Pokemon StarterPokemon = bag.get(i);
        // StarterPokemon.selectSkill();

        // while(!(cmd == 5)){
        //     System.out.println(" \n\n\n======== MEMU ======== ");
        //     System.out.println("\n1.Bag(Open Pokemon bag)        2.Find pokemon(Fight & Catch))");
        //     System.out.println("3.Potion(Open potion bag)       4.Rename(Change Nickname)");
        //     System.out.println("5.Quit(Out Game)");
        //     System.out.print("\nChoose command:");
        //     cmd = sc.nextInt();
        //     sc.nextLine();

        //     if(cmd == 1){
        //         System.out.println("\n\n ======= Pokemon in Bag ======= ");
        //         printPokemonAndSkill(bag);
        //     }

        //     else if(cmd == 2){
        //         catchPokemon();
        //     }

        //     else if(cmd == 3){
        //         Potion mypotion = new Potion();
        //         int check = mypotion.print(bag,Potionbag[0],Potionbag[1],Potionbag[2],Potionbag[3]);
        //         if(check == 1)
        //         Potionbag[0]--;
        //         else if(check == 2)
        //         Potionbag[1]--;
        //         else if(check == 3)
        //         Potionbag[2]--;
        //         else if(check == 4)
        //         Potionbag[3]--;
        //     }

        //     else if(cmd == 4){
        //         System.out.println("\n\nSelect you Pokemon for rename");
        //         printPokemon(bag);
        //         System.out.print("\n\nSelect Pokemon : ");
        //         int rename = sc.nextInt();
        //         sc.nextLine();
        //         rename = rename - 1;
        //         Pokemon selectrename = bag.get(rename);
        //         System.out.print("Enter new nickname for pokemon : ");
        //         String newname = sc.nextLine();
        //         selectrename.rename(newname);
                
        //     }
        // }
    }

    public void catchPokemon(){
        // System.out.println("Find Pokemon");
        
        // ArrayList<Pokemon> pokemons = PokemonRandomizer.getPokemons(5);//not more then 5

        // System.out.println("\n\n ------ Pokemon around you ------ ");
        // int no_wild = 0;
        // int no = 0;

        // printPokemon(pokemons);
        
        // System.out.print("\n\nSelect pokemon number or run(-1) :  ");
        // no_wild = sc.nextInt();
        // sc.nextLine();
        // no_wild = no_wild - 1;
        // if(no_wild < 0)
        //     return;

        // Pokemon wildPokemon = pokemons.get(no_wild);
        
        // wildPokemon.randomskill();
        
        // System.out.println("\n\n ------ Pokemon in bag ------ ");
        // printPokemon(bag);
        // do{
        // System.out.print("Select Pokemon in bag or run (-1): ");
        // no = sc.nextInt();
        // sc.nextLine();
        // if(no < 0)
        //     return;
        // no = no - 1;
        // Pokemon myPokemon = bag.get(no);
        // if(myPokemon.getHp() > 0 && myPokemon.getSp() > 0){
        //     boolean isWin = false;
        //     do{
                
        //         do{
        //             System.out.println("---- Skill ----");
        //             myPokemon.getskill();
        //             System.out.print("Choose Skill or run (-1) : ");
        //             int skill = sc.nextInt();
        //             sc.nextLine();
        //             if(skill < 0){
        //                 return;
        //             }
        //             if(skill == 1){
        //                 if(myPokemon.getSp() >= myPokemon.getsp(1)){
        //                     myPokemon.attack(wildPokemon, myPokemon.AdditonalDmg(wildPokemon, myPokemon.getdmg(1)));
        //                     myPokemon.reduce(myPokemon, myPokemon.getsp(1));
        //                     break;
        //                 }
        //                 else{
        //                     System.out.println(" Not Enough SP ");
        //                     //break;
        //                 }
        //             }
        //             else if(skill == 2){
        //                 if(myPokemon.getSp() >= myPokemon.getsp(2)){
        //                     myPokemon.attack(wildPokemon, myPokemon.AdditonalDmg(wildPokemon, myPokemon.getdmg(2)));
        //                     myPokemon.reduce(myPokemon, myPokemon.getsp(2));
        //                     break;
        //                 }
        //                 else{
        //                     System.out.println(" Not Enough SP ");
        //                     //break;
        //                 }
        //             }
        //             else if(skill == 3){
        //                 if(myPokemon.getSp() >= myPokemon.getsp(3)){
        //                     myPokemon.attack(wildPokemon, myPokemon.AdditonalDmg(wildPokemon, myPokemon.getdmg(3)));
        //                     myPokemon.reduce(myPokemon, myPokemon.getsp(3));  
        //                     break;
        //                 }
        //                 else{
        //                     System.out.println(" Not Enough SP ");
        //                     //break;
        //                 } 
        //             }
        //             else if(skill == 4){
        //                 if(myPokemon.getSp() >= myPokemon.getsp(4)){
        //                     myPokemon.attack(wildPokemon, myPokemon.AdditonalDmg(wildPokemon, myPokemon.getdmg(4)));
        //                     myPokemon.reduce(myPokemon, myPokemon.getsp(4));
        //                     break;
        //                 }
        //                 else{
        //                     System.out.println(" \n ---- Not Enough SP ---- ");
        //                     //break;
        //                 }
        //             }
        //             else{
        //                 System.out.println(" ------- out of Range -------");
        //                 //break;
        //             }

        //         }while(true);

        //         if(wildPokemon.getHp() == 0){
        //             isWin = true;
        //             break;
        //         }
        //         else{
        //             int randskill = (int)((Math.random()*4)+1);
        //             if(randskill == 1){
        //                 if(wildPokemon.getSp() >= wildPokemon.getsp(1)){
        //                     wildPokemon.attack(myPokemon, wildPokemon.AdditonalDmg(myPokemon, wildPokemon.getdmg(randskill)));
        //                     wildPokemon.reduce(wildPokemon, wildPokemon.getsp(randskill));
        //                 }
        //             }
        //             else if(randskill == 2){
        //                 if(wildPokemon.getSp() >= wildPokemon.getsp(2)){
        //                     wildPokemon.attack(myPokemon, wildPokemon.AdditonalDmg(myPokemon, wildPokemon.getdmg(randskill)));
        //                     wildPokemon.reduce(wildPokemon, wildPokemon.getsp(randskill));    
        //                 }
        //             }
        //             else if(randskill == 3){
        //                 if(wildPokemon.getSp() >= wildPokemon.getsp(3)){
        //                     wildPokemon.attack(myPokemon, wildPokemon.AdditonalDmg(myPokemon, wildPokemon.getdmg(randskill)));
        //                     wildPokemon.reduce(wildPokemon, wildPokemon.getsp(randskill));    
        //                 }
        //             }
        //             else if(randskill == 4){
        //                 if(wildPokemon.getSp() >= wildPokemon.getsp(4)){
        //                     wildPokemon.attack(myPokemon, wildPokemon.AdditonalDmg(myPokemon, wildPokemon.getdmg(randskill)));
        //                     wildPokemon.reduce(wildPokemon, wildPokemon.getsp(randskill));    
        //                 }
        //             }

        //             System.out.println("\n\nMypokemon : " + myPokemon.getName()+" HP : "+myPokemon.getHp()
        //             +" SP : "+myPokemon.getSp() + " - - - VS - - - " + " Wild Pokemon " + wildPokemon.getName()
        //             + " HP : " + wildPokemon.getHp());
        //             if(myPokemon.getHp() == 0){
        //                 isWin = false;
        //                 break;
        //             }
        //         }
        //     }while(true);
        
        //     if(isWin){
        //         System.out.print("You catch: ");
        //         System.out.println(wildPokemon.getName());
        //         wildPokemon.selectSkill();
        //         bag.add(pokemons.get(no_wild));

        //         int current_HPpotion = Potionbag[0];
        //         int current_SPpotion = Potionbag[1];
        //         int current_PARALAYZEpotion = Potionbag[2];
        //         int current_POISONpotion = Potionbag[3];
        //         System.out.println(" --------- You Got!! --------- ");
        //         for(int i = 0; i < 4; i++){
        //             int givepotion = (int)((Math.random()*3));
        //             Potionbag[i] += givepotion;
        //         }
        //         System.out.println("HPpotion : " + (Potionbag[0] - current_HPpotion) + " ea ");
        //         System.out.println("current_SPpotion : " + (Potionbag[1] - current_SPpotion) + " ea ");
        //         System.out.println("current_PARALAYZEpotion : " + (Potionbag[2] - current_PARALAYZEpotion) + " ea ");
        //         System.out.println("current_POISOnpotion : " + (Potionbag[3] - current_POISONpotion) + " ea ");
        //     }
        //     else{
        //         System.out.println("!!! " + wildPokemon.getName() + " WIN !!!"); 
        //     }
        //     System.out.println("");
        //     break;
        // }
        // }while(true);
    }

    public void printPokemon(ArrayList<Pokemon> pokemons){
        int number = 1;
        for(Pokemon p: pokemons){
            System.out.println("\nNo. " + number + " Name : " + p + "  Type :  " + p.gettype() + "  HP :  " + p.getHp()+ "  SP :  " + p.getSp());
            number++;
        }
    }
    public void printPokemonAndSkill(ArrayList<Pokemon> pokemons){
        int number = 1;
        for(Pokemon p: pokemons){
            System.out.println("\nNo." + number + " Name : " + p +"  Type :  " + p.gettype() + "  HP :  " + p.getHp()+ "  SP :  " + p.getSp());
            System.out.println("---- Skill ----");
            p.getskill();
            number++;
        }
    }

    public ArrayList<Pokemon> getbag(){
        return bag;
    }

    public void AddPokemon(Pokemon p){
        bag.add(p);
    }

    public Pokemon GetPokemon(int num){
        return bag.get(num);
    }

    public int[] getPotionbag(){
        return Potionbag;
    }

    public void reducepotion(int typepotion){
        if(typepotion == 1)
            Potionbag[0]--;
        else if(typepotion == 2)
            Potionbag[1]--;
        else if(typepotion == 3)
            Potionbag[2]--;
        else if(typepotion == 4)
            Potionbag[3]--;
        
    }

    public void getitem(int Lhp, int Lsp, int Shp, int Ssp){
            Potionbag[0] += Lhp;
            Potionbag[1] += Lsp;
            Potionbag[2] += Shp;
            Potionbag[3] += Ssp;
    }

    public int getCountselectskill(){
        System.out.println(""+Countselectskill);
        return Countselectskill;
    }

    public void addCountselectskill(){
        Countselectskill++;
    }
}