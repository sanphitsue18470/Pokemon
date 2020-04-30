import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SelectskillGUI extends JFrame{
    private Trainer trainer;
    private int[] x = {0, 0, 0, 0};
    private int i = 0;
    private int j = 0;
    
    public SelectskillGUI(Trainer trainer){
        super("Pokemon Game");

        this.trainer = trainer;
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        Container c = getContentPane();
        ImageIcon background = new ImageIcon("selectskill.png");
        ImageIcon BTcomfirm = new ImageIcon("BTcomfirm.png");
        JLabel pic = new JLabel(background);
        c.add(pic);
        pack();

        // JLabel starterlabel = new JLabel("Choose your skill Pokemon");
        // starterlabel.setBounds(30,50,600,40);
        // starterlabel.setFont(new Font("Ketchum", Font.PLAIN, 30));
        // //starterlabel.setForeground(Color.red);
        
        Pokemon myPokemon = trainer.GetPokemon(0);
        
        

        JButton skill1 = new JButton("");
        skill1.setBounds(90,150,520,50);
        skill1.setFont(new Font("Ketchum", Font.PLAIN, 30));
        skill1.setBackground(Color.WHITE);

        JButton skill2 = new JButton("");
        skill2.setBounds(90,250,520,50);
        skill2.setFont(new Font("Ketchum", Font.PLAIN, 30));
        skill2.setBackground(Color.WHITE);

        JButton skill3 = new JButton("");
        skill3.setBounds(90,350,520,50);
        skill3.setFont(new Font("Ketchum", Font.PLAIN, 30));
        skill3.setBackground(Color.WHITE);

        JButton skill4 = new JButton("");
        skill4.setBounds(90,450,520,50);
        skill4.setFont(new Font("Ketchum", Font.PLAIN, 30));
        skill4.setBackground(Color.WHITE);

        JButton skill5 = new JButton("");
        skill5.setBounds(90,550,520,50);
        skill5.setFont(new Font("Ketchum", Font.PLAIN, 30));
        skill5.setBackground(Color.WHITE);

        JButton skill6 = new JButton("");
        skill6.setBounds(90,650,520,50);
        skill6.setFont(new Font("Ketchum", Font.PLAIN, 30));
        skill6.setBackground(Color.WHITE);


        
        JButton confirm = new JButton("");
        // confirm.setFont(new Font("Pokemon X and Y", Font.PLAIN, 30));
        confirm.setBounds(850,580,300,100);
        confirm.setIcon(BTcomfirm);

        if(myPokemon.gettype().equals("Fire")){
            skill1.setText("1.Magma Storm  Dmg:50  Sp:20");
            skill2.setText("2.Ember        Dmg:20  Sp:5");
            skill3.setText("3.Fire Punch   Dmg:15  Sp:3");
            skill4.setText("4.Flamethrower Dmg:25  Sp:10");
            skill5.setText("5.Fusion Flare Dmg:30  Sp:15");
            skill6.setText("6.Inferno      Dmg:80  Sp:40");
        }
        else if(myPokemon.gettype().equals("Water")){
            skill1.setText("1.Waterfall      Dmg:50  Sp:20");
            skill2.setText("2.Aqua Jet      Dmg:20  Sp:5");
            skill3.setText("3.Aqua Tail      Dmg:15  Sp:3");
            skill4.setText("4.Bubble         Dmg:25  Sp:10");
            skill5.setText("5.Bubble Beam   Dmg:30  Sp:15");
            skill6.setText("6.Hydro Pump   Dmg:80  Sp:40");
        }
        else if(myPokemon.gettype().equals("Grass")){
            skill1.setText("1.Leaf Storm     Dmg:50  Sp:20");
            skill2.setText("2.Petal Dance    Dmg:20  Sp:5");
            skill3.setText("3.Grass Cutter   Dmg:15  Sp:3");
            skill4.setText("4.Forest's Curse Dmg:25  Sp:10");
            skill5.setText("5.Leaf Tornado   Dmg:30  Sp:15");
            skill6.setText("6.Solar Beam     Dmg:80  Sp:40");
        }
        else if(myPokemon.gettype().equals("Electric")){
            skill1.setText("1.Thunderbolt    Dmg:50  Sp:20");
            skill2.setText("2.Thunder Fang   Dmg:20  Sp:5");
            skill3.setText("3.Charge         Dmg:15  Sp:3");
            skill4.setText("4.Electro Ball   Dmg:25  Sp:10");
            skill5.setText("5.Wild Charge    Dmg:30  Sp:15");
            skill6.setText("6.Sparksurfer    Dmg:80  Sp:40");
        }
        else if(myPokemon.gettype().equals("Poison")){
            skill1.setText("1.Sludge Bomb    Dmg:50  Sp:20");
            skill2.setText("2.Cross Poison   Dmg:20  Sp:5");
            skill3.setText("3.Acid           Dmg:15  Sp:3");
            skill4.setText("4.Poison Fang    Dmg:25  Sp:10");
            skill5.setText("5.Toxic Spikes   Dmg:30  Sp:15");
            skill6.setText("6.Gunk Shot      Dmg:80  Sp:40");
        }
       
        // pic.add(starterlabel);
        pic.add(skill1);
        pic.add(skill2);
        pic.add(skill3);
        pic.add(skill4);
        pic.add(skill5);
        pic.add(skill6);
        pic.add(confirm);

        // JLabel myskill = new JLabel("My Pokemon Skill");
        // myskill.setBounds(530,50,600,40);
        // myskill.setFont(new Font("Ketchum", Font.PLAIN, 35));

        // pic.add(myskill);
        
        JLabel myskill1 = new JLabel("( Skill one ) ");
        myskill1.setBounds(800,150,500,80);
        myskill1.setFont(new Font("Ketchum", Font.PLAIN, 30));
        JLabel myskill2 = new JLabel("( skill two )");
        myskill2.setBounds(800,250,500,80);
        myskill2.setFont(new Font("Ketchum", Font.PLAIN, 30));
        JLabel myskill3 = new JLabel("( skill three )");
        myskill3.setBounds(800,350,500,80);
        myskill3.setFont(new Font("Ketchum", Font.PLAIN, 30));
        JLabel myskill4 = new JLabel("( skill four )");
        myskill4.setBounds(800,450,500,80);
        myskill4.setFont(new Font("Ketchum", Font.PLAIN, 30));

        pic.add(myskill1);
        pic.add(myskill2);
        pic.add(myskill3);
        pic.add(myskill4);
        
        
            skill1.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    try{
                        x[i] = 1;
                        if(i == 0)
                            if(myPokemon.gettype().equals("Fire"))
                                myskill1.setText("Magma Storm  Dmg:50  Sp:20");
                            else if(myPokemon.gettype().equals("Water"))
                                myskill1.setText("Waterfall    Dmg:50  Sp:20");
                            else if(myPokemon.gettype().equals("Grass"))
                                myskill1.setText("Leaf Storm   Dmg:50  Sp:20");
                            else if(myPokemon.gettype().equals("Electric"))
                                myskill1.setText("Thunderbolt  Dmg:50  Sp:20");
                            else if(myPokemon.gettype().equals("Poison"))
                                myskill1.setText("Sludge Bomb  Dmg:50  Sp:20");

                        if(i == 1)
                            if(myPokemon.gettype().equals("Fire"))
                                myskill2.setText("Magma Storm  Dmg:50  Sp:20");
                            else if(myPokemon.gettype().equals("Water"))
                                myskill2.setText("Waterfall    Dmg:50  Sp:20");
                            else if(myPokemon.gettype().equals("Grass"))
                                myskill2.setText("Leaf Storm   Dmg:50  Sp:20");
                            else if(myPokemon.gettype().equals("Electric"))
                                myskill2.setText("Thunderbolt  Dmg:50  Sp:20");
                            else if(myPokemon.gettype().equals("Poison"))
                                myskill2.setText("Sludge Bomb  Dmg:50  Sp:20");
                        if(i == 2)
                            if(myPokemon.gettype().equals("Fire"))
                                myskill3.setText("Magma Storm  Dmg:50  Sp:20");
                            else if(myPokemon.gettype().equals("Water"))
                                myskill3.setText("Waterfall    Dmg:50  Sp:20");
                            else if(myPokemon.gettype().equals("Grass"))
                                myskill3.setText("Leaf Storm   Dmg:50  Sp:20");
                            else if(myPokemon.gettype().equals("Electric"))
                                myskill3.setText("Thunderbolt  Dmg:50  Sp:20");
                            else if(myPokemon.gettype().equals("Poison"))
                                myskill3.setText("Sludge Bomb  Dmg:50  Sp:20");
                                
                        if(i == 3)
                            if(myPokemon.gettype().equals("Fire"))
                                myskill4.setText("Magma Storm  Dmg:50  Sp:20");
                            else if(myPokemon.gettype().equals("Water"))
                                myskill4.setText("Waterfall    Dmg:50  Sp:20");
                            else if(myPokemon.gettype().equals("Grass"))
                                myskill4.setText("Leaf Storm   Dmg:50  Sp:20");
                            else if(myPokemon.gettype().equals("Electric"))
                                myskill4.setText("Thunderbolt  Dmg:50  Sp:20");
                            else if(myPokemon.gettype().equals("Poison"))
                                myskill4.setText("Sludge Bomb  Dmg:50  Sp:20");
                        
                        i++;
                    }catch(ArrayIndexOutOfBoundsException asd){
                        JOptionPane.showMessageDialog( null,
                            "Skill is Full Slot","Notification",JOptionPane.WARNING_MESSAGE);
                            
                    }
                      
                }
            });

            skill2.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    try{
                        x[i] = 2;
                        if(i == 0)
                            if(myPokemon.gettype().equals("Fire"))
                                myskill1.setText("Ember        Dmg:20  Sp:5");
                            else if(myPokemon.gettype().equals("Water"))
                                myskill1.setText("Aqua Jet     Dmg:20  Sp:5");
                            else if(myPokemon.gettype().equals("Grass"))
                                myskill1.setText("Petal Dance   Dmg:20  Sp:5");
                            else if(myPokemon.gettype().equals("Electric"))
                                myskill1.setText("Thunder Fang Dmg:20  Sp:5");
                            else if(myPokemon.gettype().equals("Poison"))
                                myskill1.setText("Cross Poison Dmg:20  Sp:5");

                        if(i == 1)
                            if(myPokemon.gettype().equals("Fire"))
                                myskill2.setText("Ember        Dmg:20  Sp:5");
                            else if(myPokemon.gettype().equals("Water"))
                                myskill2.setText("Aqua Jet     Dmg:20  Sp:5");
                            else if(myPokemon.gettype().equals("Grass"))
                                myskill2.setText("Petal Dance   Dmg:20  Sp:5");
                            else if(myPokemon.gettype().equals("Electric"))
                                myskill2.setText("Thunder Fang Dmg:20  Sp:5");
                            else if(myPokemon.gettype().equals("Poison"))
                                myskill2.setText("Cross Poison Dmg:20  Sp:5");
                        if(i == 2)
                            if(myPokemon.gettype().equals("Fire"))
                                myskill3.setText("Ember        Dmg:20  Sp:5");
                            else if(myPokemon.gettype().equals("Water"))
                                myskill3.setText("Aqua Jet     Dmg:20  Sp:5");
                            else if(myPokemon.gettype().equals("Grass"))
                                myskill3.setText("Petal Dance   Dmg:20  Sp:5");
                            else if(myPokemon.gettype().equals("Electric"))
                                myskill3.setText("Thunder Fang Dmg:20  Sp:5");
                            else if(myPokemon.gettype().equals("Poison"))
                                myskill3.setText("Cross Poison Dmg:20  Sp:5");
                                
                        if(i == 3)
                            if(myPokemon.gettype().equals("Fire"))
                                myskill4.setText("Ember        Dmg:20  Sp:5");
                            else if(myPokemon.gettype().equals("Water"))
                                myskill4.setText("Aqua Jet     Dmg:20  Sp:5");
                            else if(myPokemon.gettype().equals("Grass"))
                                myskill4.setText("Petal Dance   Dmg:20  Sp:5");
                            else if(myPokemon.gettype().equals("Electric"))
                                myskill4.setText("Thunder Fang Dmg:20  Sp:5");
                            else if(myPokemon.gettype().equals("Poison"))
                                myskill4.setText("Cross Poison Dmg:20  Sp:5");
                        
                        i++;
                    }catch(ArrayIndexOutOfBoundsException asd){
                        JOptionPane.showMessageDialog( null,
                            "Skill is Full Slot","Notification",JOptionPane.WARNING_MESSAGE);
                            
                    }
                    
                }
            });

            skill3.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    try{
                        x[i] = 3;
                        if(i == 0)
                            if(myPokemon.gettype().equals("Fire"))
                                myskill1.setText("Fire Punch     Dmg:15  Sp:3");
                            else if(myPokemon.gettype().equals("Water"))
                                myskill1.setText("Aqua Tail     Dmg:15  Sp:3");
                            else if(myPokemon.gettype().equals("Grass"))
                                myskill1.setText("Grass Cutter  Dmg:15  Sp:3");
                            else if(myPokemon.gettype().equals("Electric"))
                                myskill1.setText("Charge        Dmg:15  Sp:3");
                            else if(myPokemon.gettype().equals("Poison"))
                                myskill1.setText("Acid          Dmg:15  Sp:3");

                        if(i == 1)
                            if(myPokemon.gettype().equals("Fire"))
                                myskill2.setText("Fire Punch     Dmg:15  Sp:3");
                            else if(myPokemon.gettype().equals("Water"))
                                myskill2.setText("Aqua Tail     Dmg:15  Sp:3");
                            else if(myPokemon.gettype().equals("Grass"))
                                myskill2.setText("Grass Cutter  Dmg:15  Sp:3");
                            else if(myPokemon.gettype().equals("Electric"))
                                myskill2.setText("Charge        Dmg:15  Sp:3");
                            else if(myPokemon.gettype().equals("Poison"))
                                myskill2.setText("Acid          Dmg:15  Sp:3");
                        if(i == 2)
                            if(myPokemon.gettype().equals("Fire"))
                                myskill3.setText("Fire Punch     Dmg:15  Sp:3");
                            else if(myPokemon.gettype().equals("Water"))
                                myskill3.setText("Aqua Tail     Dmg:15  Sp:3");
                            else if(myPokemon.gettype().equals("Grass"))
                                myskill3.setText("Grass Cutter  Dmg:15  Sp:3");
                            else if(myPokemon.gettype().equals("Electric"))
                                myskill3.setText("Charge        Dmg:15  Sp:3");
                            else if(myPokemon.gettype().equals("Poison"))
                                myskill3.setText("Acid          Dmg:15  Sp:3");
                                
                        if(i == 3)
                            if(myPokemon.gettype().equals("Fire"))
                                myskill4.setText("Fire Punch     Dmg:15  Sp:3");
                            else if(myPokemon.gettype().equals("Water"))
                                myskill4.setText("Aqua Tail     Dmg:15  Sp:3");
                            else if(myPokemon.gettype().equals("Grass"))
                                myskill4.setText("Grass Cutter  Dmg:15  Sp:3");
                            else if(myPokemon.gettype().equals("Electric"))
                                myskill4.setText("Charge        Dmg:15  Sp:3");
                            else if(myPokemon.gettype().equals("Poison"))
                                myskill4.setText("Acid          Dmg:15  Sp:3");
                        
                        i++;
                    }catch(ArrayIndexOutOfBoundsException asd){
                        JOptionPane.showMessageDialog( null,
                            "Skill is Full Slot","Notification",JOptionPane.WARNING_MESSAGE);
                            
                    }
                    
                }
            });

            skill4.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    try{
                        x[i] = 4;
                        if(i == 0)
                            if(myPokemon.gettype().equals("Fire"))
                                myskill1.setText("Flamethrower  Dmg:25  Sp:10");
                            else if(myPokemon.gettype().equals("Water"))
                                myskill1.setText("Bubble        Dmg:25  Sp:10");
                            else if(myPokemon.gettype().equals("Grass"))
                                myskill1.setText("Forest's Curese Dmg:25  Sp:10");
                            else if(myPokemon.gettype().equals("Electric"))
                                myskill1.setText("Electro Ball  Dmg:25  Sp:10");
                            else if(myPokemon.gettype().equals("Poison"))
                                myskill1.setText("Poison Fang   Dmg:25  Sp:10");

                        if(i == 1)
                            if(myPokemon.gettype().equals("Fire"))
                                myskill2.setText("Flamethrower  Dmg:25  Sp:10");
                            else if(myPokemon.gettype().equals("Water"))
                                myskill2.setText("Bubble        Dmg:25  Sp:10");
                            else if(myPokemon.gettype().equals("Grass"))
                                myskill2.setText("Forest's Curese Dmg:25  Sp:10");
                            else if(myPokemon.gettype().equals("Electric"))
                                myskill2.setText("Electro Ball  Dmg:25  Sp:10");
                            else if(myPokemon.gettype().equals("Poison"))
                                myskill2.setText("Poison Fang   Dmg:25  Sp:10");
                        if(i == 2)
                            if(myPokemon.gettype().equals("Fire"))
                                myskill3.setText("Flamethrower  Dmg:25  Sp:10");
                            else if(myPokemon.gettype().equals("Water"))
                                myskill3.setText("Bubble        Dmg:25  Sp:10");
                            else if(myPokemon.gettype().equals("Grass"))
                                myskill3.setText("Forest's Curese Dmg:25  Sp:10");
                            else if(myPokemon.gettype().equals("Electric"))
                                myskill3.setText("Electro Ball  Dmg:25  Sp:10");
                            else if(myPokemon.gettype().equals("Poison"))
                                myskill3.setText("Poison Fang   Dmg:25  Sp:10");
                                
                        if(i == 3)
                            if(myPokemon.gettype().equals("Fire"))
                                myskill4.setText("Flamethrower  Dmg:25  Sp:10");
                            else if(myPokemon.gettype().equals("Water"))
                                myskill4.setText("Bubble        Dmg:25  Sp:10");
                            else if(myPokemon.gettype().equals("Grass"))
                                myskill4.setText("Forest's Curese Dmg:25  Sp:10");
                            else if(myPokemon.gettype().equals("Electric"))
                                myskill4.setText("Electro Ball   Dmg:25  Sp:10");
                            else if(myPokemon.gettype().equals("Poison"))
                                myskill4.setText("Poison Fang   Dmg:25  Sp:10");
                        
                        i++;
                    }catch(ArrayIndexOutOfBoundsException asd){
                        JOptionPane.showMessageDialog( null,
                            "Skill is Full Slot","Notification",JOptionPane.WARNING_MESSAGE);
                            
                    }
                    
                }
            });

            skill5.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    try{
                        x[i] = 5;
                        if(i == 0)
                            if(myPokemon.gettype().equals("Fire"))
                                myskill1.setText("Fusion Flare   Dmg:30  Sp:15");
                            else if(myPokemon.gettype().equals("Water"))
                                myskill1.setText("Bubble Beam   Dmg:30  Sp:15");
                            else if(myPokemon.gettype().equals("Grass"))
                                myskill1.setText("Leaf Tornado  Dmg:30  Sp:15");
                            else if(myPokemon.gettype().equals("Electric"))
                                myskill1.setText("Wild Charge   Dmg:30  Sp:15");
                            else if(myPokemon.gettype().equals("Poison"))
                                myskill1.setText("Toxic Spikes  Dmg:30  Sp:15");

                        if(i == 1)
                            if(myPokemon.gettype().equals("Fire"))
                                myskill2.setText("Fusion Flare   Dmg:30  Sp:15");
                            else if(myPokemon.gettype().equals("Water"))
                                myskill2.setText("Bubble Beam   Dmg:30  Sp:15");
                            else if(myPokemon.gettype().equals("Grass"))
                                myskill2.setText("Leaf Tornado  Dmg:30  Sp:15");
                            else if(myPokemon.gettype().equals("Electric"))
                                myskill2.setText("Wild Charge   Dmg:30  Sp:15");
                            else if(myPokemon.gettype().equals("Poison"))
                                myskill2.setText("Toxic Spikes  Dmg:30  Sp:15");

                        if(i == 2)
                            if(myPokemon.gettype().equals("Fire"))
                                myskill3.setText("Fusion Flare   Dmg:30  Sp:15");
                            else if(myPokemon.gettype().equals("Water"))
                                myskill3.setText("Bubble Beam   Dmg:30  Sp:15");
                            else if(myPokemon.gettype().equals("Grass"))
                                myskill3.setText("Leaf Tornado  Dmg:30  Sp:15");
                            else if(myPokemon.gettype().equals("Electric"))
                                myskill3.setText("Wild Charge   Dmg:30  Sp:15");
                            else if(myPokemon.gettype().equals("Poison"))
                                myskill3.setText("Toxic Spikes  Dmg:30  Sp:15");

                        if(i == 3)
                            if(myPokemon.gettype().equals("Fire"))
                                myskill4.setText("Fusion Flare   Dmg:30  Sp:15");
                            else if(myPokemon.gettype().equals("Water"))
                                myskill4.setText("Bubble Beam   Dmg:30  Sp:15");
                            else if(myPokemon.gettype().equals("Grass"))
                                myskill4.setText("Leaf Tornado  Dmg:30  Sp:15");
                            else if(myPokemon.gettype().equals("Electric"))
                                myskill4.setText("Wild Charge   Dmg:30  Sp:15");
                            else if(myPokemon.gettype().equals("Poison"))
                                myskill4.setText("Toxic Spikes  Dmg:30  Sp:15");
                        
                        i++;
                    }catch(ArrayIndexOutOfBoundsException asd){
                        JOptionPane.showMessageDialog( null,
                            "Skill is Full Slot","Notification",JOptionPane.WARNING_MESSAGE);
                            
                    }
                }
            });

            skill6.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    try{
                        x[i] = 6;
                        if(i == 0)
                            if(myPokemon.gettype().equals("Fire"))
                                myskill1.setText("Inferno       Dmg:80  Sp:40");
                            else if(myPokemon.gettype().equals("Water"))
                                myskill1.setText("Hydro Pump    Dmg:80  Sp:40");
                            else if(myPokemon.gettype().equals("Grass"))
                                myskill1.setText("Solar Beam    Dmg:80  Sp:40");
                            else if(myPokemon.gettype().equals("Electric"))
                                myskill1.setText("Sparksurfer   Dmg:80  Sp:40");
                            else if(myPokemon.gettype().equals("Poison"))
                                myskill1.setText("Gunk Shot     Dmg:80  Sp:40");

                        if(i == 1)
                            if(myPokemon.gettype().equals("Fire"))
                                myskill2.setText("Inferno       Dmg:80  Sp:40");
                            else if(myPokemon.gettype().equals("Water"))
                                myskill2.setText("Hydro Pump    Dmg:80  Sp:40");
                            else if(myPokemon.gettype().equals("Grass"))
                                myskill2.setText("Solar Beam    Dmg:80  Sp:40");
                            else if(myPokemon.gettype().equals("Electric"))
                                myskill2.setText("Sparksurfer   Dmg:80  Sp:40");
                            else if(myPokemon.gettype().equals("Poison"))
                                myskill2.setText("Gunk Shot     Dmg:80  Sp:40");
                        if(i == 2)
                            if(myPokemon.gettype().equals("Fire"))
                                myskill3.setText("Inferno       Dmg:80  Sp:40");
                            else if(myPokemon.gettype().equals("Water"))
                                myskill3.setText("Hydro Pump    Dmg:80  Sp:40");
                            else if(myPokemon.gettype().equals("Grass"))
                                myskill3.setText("Solar Beam    Dmg:80  Sp:40");
                            else if(myPokemon.gettype().equals("Electric"))
                                myskill3.setText("Sparksurfer   Dmg:80  Sp:40");
                            else if(myPokemon.gettype().equals("Poison"))
                                myskill3.setText("Gunk Shot     Dmg:80  Sp:40");
                                
                        if(i == 3)
                            if(myPokemon.gettype().equals("Fire"))
                                myskill4.setText("Inferno       Dmg:80  Sp:40");
                            else if(myPokemon.gettype().equals("Water"))
                                myskill4.setText("Hydro Pump    Dmg:80  Sp:40");
                            else if(myPokemon.gettype().equals("Grass"))
                                myskill4.setText("Solar Beam    Dmg:80  Sp:40");
                            else if(myPokemon.gettype().equals("Electric"))
                                myskill4.setText("Sparksurfer   Dmg:80  Sp:40");
                            else if(myPokemon.gettype().equals("Poison"))
                                myskill4.setText("Gunk Shot     Dmg:80  Sp:40");
                        
                        i++;
                    }catch(ArrayIndexOutOfBoundsException asd){
                        JOptionPane.showMessageDialog( null,
                            "Skill is Full Slot","Notification",JOptionPane.WARNING_MESSAGE);
                            
                    }
                    
                }
            });
        

        confirm.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(i > 3){
                    myPokemon.selectSkillGUI(x[0],x[1],x[2],x[3]);
                    trainer.addCountselectskill();
                    new tutorialGUI(trainer);
                    setVisible(false);
                }
                else{
                    JOptionPane.showMessageDialog( null,
                            "Please Select 4 skill","Notification",JOptionPane.WARNING_MESSAGE);
                            
                }
                    
                
            }
        });
        
    }
}