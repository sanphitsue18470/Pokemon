import java.util.*;
public class Skill {
    private Scanner sc;
    private String skillname = "";
    private int Dmgskill = 0;
    private int spCost = 0;

    public String getname(){
        return skillname;
    }
    public int getDmg(){
        return Dmgskill;
    }
    public int getCost(){
        return spCost;
    }

    public void select(String type,int numskill){
        // sc = new Scanner(System.in);
        // int choice = 0;
        if(type == "Fire"){
            // System.out.println("1.Magma Storm  Dmg:50  Sp:20       2.Ember        Dmg:20  Sp:5");
            // System.out.println("3.Fire Punch   Dmg:15  Sp:3        4.Flamethrower Dmg:25  Sp:10");
            // System.out.println("5.Fusion Flare Dmg:30  Sp:15       6.Inferno      Dmg:80  Sp:40");
            // System.out.print("Select skill : ");
            // choice = sc.nextInt();
            // sc.nextLine();
            if(numskill == 1){
                skillname = "Magma Storm";
                Dmgskill = 50;
                spCost = 20;
            }
            else if(numskill == 2){
                skillname = "Ember";
                Dmgskill = 20;
                spCost = 5;
            }
            else if(numskill == 3){
                skillname = "Fire Punch";
                Dmgskill = 15;
                spCost = 3;
            }
            else if(numskill == 4){
                skillname = "Flamethrower";
                Dmgskill = 25;
                spCost = 10;
            }
            else if(numskill == 5){
                skillname = "Fusion Flare";
                Dmgskill = 30;
                spCost = 15;
            }
            else if(numskill == 6){
                skillname = "Inferno";
                Dmgskill = 80;
                spCost = 40;
            }

        }
        else if(type == "Water"){
            // System.out.println("1.Waterfall   Dmg:50  Sp:20       2.Aqua Jet       Dmg:20  Sp:5");
            // System.out.println("3.Aqua Tail   Dmg:15  Sp:3        4.Bubble         Dmg:25  Sp:10");
            // System.out.println("5.Bubble Beam Dmg:30  Sp:15       6.Hydro Pump     Dmg:80  Sp:40");
            // System.out.print("Select skill : ");
            // choice = sc.nextInt();
            // sc.nextLine();
            if(numskill == 1){
                skillname = "Waterfall";
                Dmgskill = 50;
                spCost = 20;
            }
            else if(numskill == 2){
                skillname = "Aqua Jet";
                Dmgskill = 20;
                spCost = 5;
            }
            else if(numskill == 3){
                skillname = "Aqua Tail";
                Dmgskill = 15;
                spCost = 3;
            }
            else if(numskill == 4){
                skillname = "Bubble";
                Dmgskill = 25;
                spCost = 10;
            }
            else if(numskill == 5){
                skillname = "Bubble Beam";
                Dmgskill = 30;
                spCost = 15;
            }
            else if(numskill == 6){
                skillname = "Hydro Pump";
                Dmgskill = 80;
                spCost = 40;
            }
        }
        else if(type == "Grass"){
            // System.out.println("1.Leaf Storm     Dmg:50  Sp:20       2.Petal Dance      Dmg:20  Sp:5");
            // System.out.println("3.Grass Cutter   Dmg:15  Sp:3        4.Forest's Curse   Dmg:25  Sp:10");
            // System.out.println("5.Leaf Tornado   Dmg:30  Sp:15       6.Solar Beam       Dmg:80  Sp:40");
            // System.out.print("Select skill : ");
            // choice = sc.nextInt();
            // sc.nextLine();
            if(numskill == 1){
                skillname = "Leaf Storm";
                Dmgskill = 50;
                spCost = 20;
            }
            else if(numskill == 2){
                skillname = "Petal Dance";
                Dmgskill = 20;
                spCost = 5;
            }
            else if(numskill == 3){
                skillname = "Grass Cutter";
                Dmgskill = 15;
                spCost = 3;
            }
            else if(numskill == 4){
                skillname = "Forest's Curse";
                Dmgskill = 25;
                spCost = 10;
            }
            else if(numskill == 5){
                skillname = "Leaf Tornado";
                Dmgskill = 30;
                spCost = 15;
            }
            else if(numskill == 6){
                skillname = "Solar Beam";
                Dmgskill = 80;
                spCost = 40;
            }
        }

        else if(type == "Electric"){
            // System.out.println("1.Thunderbolt   Dmg:50  Sp:20       2.Thunder Fang         Dmg:20  Sp:5");
            // System.out.println("3.Charge        Dmg:15  Sp:3        4.Electro Ball         Dmg:25  Sp:10");
            // System.out.println("5.Wild Charge   Dmg:30  Sp:15       6.Stoked Sparksurfer   Dmg:80  Sp:40");
            // System.out.print("Select skill : ");
            // choice = sc.nextInt();
            // sc.nextLine();
            if(numskill == 1){
                skillname = "Thunderbolt";
                Dmgskill = 50;
                spCost = 20;
            }
            else if(numskill == 2){
                skillname = "Thunder Fang";
                Dmgskill = 20;
                spCost = 5;
            }
            else if(numskill == 3){
                skillname = "Charge";
                Dmgskill = 15;
                spCost = 3;
            }
            else if(numskill == 4){
                skillname = "Electro Ball";
                Dmgskill = 25;
                spCost = 10;
            }
            else if(numskill == 5){
                skillname = "Wild Charge";
                Dmgskill = 30;
                spCost = 15;
            }
            else if(numskill == 6){
                skillname = "Sparksurfer";
                Dmgskill = 80;
                spCost = 40;
            }
        }
        else if(type == "Poison"){
            // System.out.println("1.Sludge Bomb   Dmg:50  Sp:20      2.Cross Poison    Dmg:20  Sp:5");
            // System.out.println("3.Acid          Dmg:15  Sp:3       4.Poison Fang     Dmg:25  Sp:10");
            // System.out.println("5.Toxic Spikes  Dmg:30  Sp:15      6.Gunk Shot       Dmg:80  Sp:40");
            // System.out.print("Select skill : ");
            // choice = sc.nextInt();
            // sc.nextLine();
            if(numskill == 1){
                skillname = "Sludge Bomb";
                Dmgskill = 50;
                spCost = 20;
            }
            else if(numskill == 2){
                skillname = "Cross Poison";
                Dmgskill = 20;
                spCost = 5;
            }
            else if(numskill == 3){
                skillname = "Acid";
                Dmgskill = 15;
                spCost = 3;
            }
            else if(numskill == 4){
                skillname = "Poison Fang";
                Dmgskill = 25;
                spCost = 10;
            }
            else if(numskill == 5){
                skillname = "Toxic Spikes";
                Dmgskill = 30;
                spCost = 15;
            }
            else if(numskill == 6){
                skillname = "Gunk Shot";
                Dmgskill = 80;
                spCost = 40;
            }
        }
    }

    public void random(String type){
        int choice = 0;
        if(type == "Fire"){
            choice = (int)((Math.random()*6)+1);
            if(choice == 1){
                skillname = "Magma Storm";
                Dmgskill = 50;
                spCost = 20;
            }
            else if(choice == 2){
                skillname = "Ember";
                Dmgskill = 20;
                spCost = 5;
            }
            else if(choice == 3){
                skillname = "Fire Punch";
                Dmgskill = 15;
                spCost = 3;
            }
            else if(choice == 4){
                skillname = "Flamethrower";
                Dmgskill = 25;
                spCost = 10;
            }
            else if(choice == 5){
                skillname = "Fusion Flare";
                Dmgskill = 30;
                spCost = 15;
            }
            else if(choice == 6){
                skillname = "Inferno";
                Dmgskill = 80;
                spCost = 40;
            }

        }
        else if(type == "Water"){
            choice = (int)((Math.random()*6)+1);
            if(choice == 1){
                skillname = "Waterfall";
                Dmgskill = 50;
                spCost = 20;
            }
            else if(choice == 2){
                skillname = "Aqua Jet";
                Dmgskill = 20;
                spCost = 5;
            }
            else if(choice == 3){
                skillname = "Aqua Tail";
                Dmgskill = 15;
                spCost = 3;
            }
            else if(choice == 4){
                skillname = "Bubble";
                Dmgskill = 25;
                spCost = 10;
            }
            else if(choice == 5){
                skillname = "Bubble Beam";
                Dmgskill = 30;
                spCost = 15;
            }
            else if(choice == 6){
                skillname = "Hydro Pump";
                Dmgskill = 80;
                spCost = 40;
            }
        }
        else if(type == "Grass"){
            choice = (int)((Math.random()*6)+1);
            if(choice == 1){
                skillname = "Leaf Storm";
                Dmgskill = 50;
                spCost = 20;
            }
            else if(choice == 2){
                skillname = "Petal Dance";
                Dmgskill = 20;
                spCost = 5;
            }
            else if(choice == 3){
                skillname = "Grass Cutter";
                Dmgskill = 15;
                spCost = 3;
            }
            else if(choice == 4){
                skillname = "Forest's Curse";
                Dmgskill = 25;
                spCost = 10;
            }
            else if(choice == 5){
                skillname = "Leaf Tornado";
                Dmgskill = 30;
                spCost = 15;
            }
            else if(choice == 6){
                skillname = "Solar Beam";
                Dmgskill = 80;
                spCost = 40;
            }
        }

        else if(type == "Electric"){
            choice = (int)((Math.random()*6)+1);
            if(choice == 1){
                skillname = "Thunderbolt";
                Dmgskill = 50;
                spCost = 20;
            }
            else if(choice == 2){
                skillname = "Thunder Fang";
                Dmgskill = 20;
                spCost = 5;
            }
            else if(choice == 3){
                skillname = "Charge";
                Dmgskill = 15;
                spCost = 3;
            }
            else if(choice == 4){
                skillname = "Electro Ball";
                Dmgskill = 25;
                spCost = 10;
            }
            else if(choice == 5){
                skillname = "Wild Charge";
                Dmgskill = 30;
                spCost = 15;
            }
            else if(choice == 6){
                skillname = "Sparksurfer";
                Dmgskill = 80;
                spCost = 40;
            }
        }
        else if(type == "Poison"){
            choice = (int)((Math.random()*6)+1);
            if(choice == 1){
                skillname = "Sludge Bomb";
                Dmgskill = 50;
                spCost = 20;
            }
            else if(choice == 2){
                skillname = "Cross Poison";
                Dmgskill = 20;
                spCost = 5;
            }
            else if(choice == 3){
                skillname = "Acid";
                Dmgskill = 15;
                spCost = 3;
            }
            else if(choice == 4){
                skillname = "Poison Fang";
                Dmgskill = 25;
                spCost = 10;
            }
            else if(choice == 5){
                skillname = "Toxic Spikes";
                Dmgskill = 30;
                spCost = 15;
            }
            else if(choice == 6){
                skillname = "Gunk Shot";
                Dmgskill = 80;
                spCost = 40;
            }
        }
    }
}