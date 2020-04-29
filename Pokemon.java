public abstract class Pokemon{
    protected String name; 
    protected int hp;
    protected int sp;
    protected int Maxhp;
    protected int Maxsp;

    protected boolean paralayze = false;
    protected boolean poison = false;
    protected String type;
    protected int unit;
    
    Skill skill1 = new Skill();
    Skill skill2 = new Skill();
    Skill skill3 = new Skill();
    Skill skill4 = new Skill();

    public Pokemon(String name, int Maxhp, int Maxsp, String type, int unit){
        this.name = name;
        this.hp = (int)((Math.random()*Maxhp)+50);
        this.sp = Maxsp;
        this.Maxhp = hp;
        this.Maxsp = Maxsp;
        this.type = type;
        this.unit = unit;
    }

    public String getName(){
        return name;
    }

    public int getHp(){
        return hp;
    }
    public int getSp(){
        return sp;
    }
    public String gettype(){
        return type;
    }
    public int MaxHP(){
        return Maxhp;
    }
    public int MaxSP(){
        return Maxsp;
    }

    public int getunit(){
        return unit;
    }

    public String toString(){
        return name;
    }

    public abstract void attack(Pokemon enemy,int dmg);
    public abstract void reduce(Pokemon mypokemon,int value);
    public abstract int AdditonalDmg(Pokemon enemy, int dmg);

    public void damage(int value){
        int currentHP = hp - value;
        if(paralayze != true){
            if(currentHP >= 0){
                this.hp = currentHP;
            }
            else{
                this.hp = 0;
            }
        }
        else{
            System.out.println("Can't Attack because Paralayzed");
        }
    }

    public void reduceSP(int value){
        int currentSP = sp - value;
        if(currentSP >= 0)
            this.sp = currentSP;
        else
            this.sp = 0;
    }

    public void heal(int value){
        if((this.hp + value) > Maxhp){
            this.hp = Maxhp;
        }
        else
            this.hp += value;
    }

    public void sp(int value){
        if((this.sp + value) > Maxsp){
            this.sp = Maxsp;
        }
        else
            this.sp += value;
    }

   

    public void selectSkill(){
        // System.out.println("\n\n\nSelect Frist Skill for Pokemon");
        // skill1.select(type);
        // System.out.println("\n");
        // System.out.println("Select Second Skill for Pokemon");
        // skill2.select(type);
        // System.out.println("\n");
        // System.out.println("Select Third Skill for Pokemon");
        // skill3.select(type);
        // System.out.println("\n");
        // System.out.println("Select Forth Skill for Pokemon");
        // skill4.select(type);
    }

    public void selectSkillGUI(int numskill, int numskill2 , int numskill3, int numskill4){
        
        skill1.select(type, numskill);
        skill2.select(type, numskill2);
        skill3.select(type, numskill3);
        skill4.select(type, numskill4);
        System.out.println(skill1.getname());
        System.out.println(skill2.getname());
        System.out.println(skill3.getname());
        System.out.println(skill4.getname());
    }

    public void randomskill(){
        skill1.random(type);
        skill2.random(type);
        skill3.random(type);
        skill4.random(type);
    }
    
    public String getskillGUI(int num){
        if(num == 1)
            return "1. "+skill1.getname()+"  DMG :  "+skill1.getDmg()+"  SP :  "+skill1.getCost();
        else if(num == 2)
            return "2. "+skill2.getname()+"  DMG : "+skill2.getDmg()+"  SP :  "+skill2.getCost();
        else if(num == 3)
            return "3. "+skill3.getname()+"  DMG : "+skill3.getDmg()+"  SP :  "+skill3.getCost();
        else if(num == 4)
            return "4. "+skill4.getname()+"  DMG : "+skill4.getDmg()+"  SP :  "+skill4.getCost();
        return "";
    }

    public String getskillnameGUI(int num){
        if(num == 1)
            return ""+skill1.getname()+" (DMG :  "+skill1.getDmg() + ")";
        else if(num == 2)
            return ""+skill2.getname()+" (DMG : "+skill2.getDmg() + ")";
        else if(num == 3)
            return ""+skill3.getname()+" (DMG : "+skill3.getDmg() + ")";
        else if(num == 4)
            return ""+skill4.getname()+" (DMG : "+skill4.getDmg() + ")";
        return "";
    }

    public void getskill(){
        System.out.println("1. "+skill1.getname()+" DMG : "+skill1.getDmg()+" SP: "+skill1.getCost());  
        System.out.println("2. "+skill2.getname()+" DMG : "+skill2.getDmg()+" SP: "+skill2.getCost()); 
        System.out.println("3. "+skill3.getname()+" DMG : "+skill3.getDmg()+" SP: "+skill3.getCost()); 
        System.out.println("4. "+skill4.getname()+" DMG : "+skill4.getDmg()+" SP: "+skill4.getCost()); 
    }

    

    public void rename(String name){
        this.name = name;
    }

    public int getdmg(int num){
        if(num == 1)
            return skill1.getDmg();
        else if(num == 2)
            return skill2.getDmg();
        else if(num == 3)
            return skill3.getDmg();
        else if(num == 4)
            return skill4.getDmg();
        return 0;   
    }

    public int getsp(int num){
        if(num == 1)
            return skill1.getCost();
        else if(num == 2)
            return skill2.getCost();
        else if(num == 3)
            return skill3.getCost();
        else if(num == 4)
            return skill4.getCost();
        return 0;   
    }
    
} 