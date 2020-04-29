import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class FightGUI extends JFrame{
    private final Trainer trainer;
    private final Pokemon wildPokemon;
    private final Pokemon mypokemon;
    private final JButton[] details = {new JButton(), new JButton(), new JButton(), new JButton(), new JButton()
                                , new JButton(), new JButton(), new JButton(), new JButton(), new JButton()};
    public FightGUI(final Trainer trainer ,final Pokemon wildPokemon, final Pokemon mypokemon){
        super("Pokemon Game");
        this.trainer = trainer;
        this.wildPokemon = wildPokemon;
        this.mypokemon = mypokemon;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        
        final Container c = getContentPane();
        final ImageIcon img = new ImageIcon("battlefeild.png");
        final ImageIcon BTruninbattle = new ImageIcon("BTruninbattle.png");

        ImageIcon LTorchic = new ImageIcon("torl.png");
        ImageIcon LEvee = new ImageIcon("Eeveel.png");
        ImageIcon LKabigon = new ImageIcon("kabigonl.png");
        ImageIcon LMudkip = new ImageIcon("mudkip1.png");
        ImageIcon LPikachu = new ImageIcon("picachu.png");
        ImageIcon LRaichu = new ImageIcon("raichu.png");
        ImageIcon LSenikame = new ImageIcon("senikamel.png");
        ImageIcon LTreecko = new ImageIcon("Treecko.png");

        ImageIcon RTorchic = new ImageIcon("Ltorchic.png");
        ImageIcon REvee = new ImageIcon("Eeveer.png");
        ImageIcon RKabigon = new ImageIcon("Kabigon.png");
        ImageIcon RMudkip = new ImageIcon("Mudkip.png");
        ImageIcon RPikachu = new ImageIcon("pikachu1.png");
        ImageIcon RRaichu = new ImageIcon("raichur.png");
        ImageIcon RSenikame = new ImageIcon("senikame1.png");
        ImageIcon RTreecko = new ImageIcon("Treecko1.png");

        

        final JLabel pic = new JLabel(img);
        c.add(pic);
        pack();

        wildPokemon.randomskill();

        final JButton Run = new JButton("");
        Run.setBounds(1200,20,150,60);
        Run.setIcon(BTruninbattle);
        // Run.setFont(new Font("Pokemon X and Y", Font.PLAIN, 20));
        pic.add(Run);

        final JLabel mypoke = new JLabel("");
        final JLabel wildpoke = new JLabel("");
        mypoke.setBounds(120,250,420,300);
        wildpoke.setBounds(750,180,420,300);
        pic.add(mypoke);
        pic.add(wildpoke);

        if(mypokemon.getunit() == 1){
            mypoke.setIcon(RTorchic);
        }
        else if(mypokemon.getunit() == 2){
            mypoke.setIcon(REvee);
        }
        else if(mypokemon.getunit() == 3){
            mypoke.setIcon(RKabigon);
        }
        else if(mypokemon.getunit() == 4){
            mypoke.setIcon(RMudkip);
        }
        else if(mypokemon.getunit() == 5){
            mypoke.setIcon(RPikachu);
        }
        else if(mypokemon.getunit() == 6){
            mypoke.setIcon(RRaichu);
        }
        else if(mypokemon.getunit() == 7){
            mypoke.setIcon(RSenikame);
        }
        else if(mypokemon.getunit() == 8){
            mypoke.setIcon(RTreecko);
        }

        if(wildPokemon.getunit() == 1){
            wildpoke.setIcon(LTorchic);
        }
        else if(wildPokemon.getunit() == 2){
            wildpoke.setIcon(LEvee);
        }
        else if(wildPokemon.getunit() == 3){
            wildpoke.setIcon(LKabigon);
        }
        else if(wildPokemon.getunit() == 4){
            wildpoke.setIcon(LMudkip);
        }
        else if(wildPokemon.getunit() == 5){
            wildpoke.setIcon(LPikachu);
        }
        else if(wildPokemon.getunit() == 6){
            wildpoke.setIcon(LRaichu);
        }
        else if(wildPokemon.getunit() == 7){
            wildpoke.setIcon(LSenikame);
        }
        else if(wildPokemon.getunit() == 8){
            wildpoke.setIcon(LTreecko);
        }


        final JButton myskill1 = new JButton(mypokemon.getskillGUI(1));
        final JButton myskill2 = new JButton(mypokemon.getskillGUI(2));
        final JButton myskill3 = new JButton(mypokemon.getskillGUI(3));
        final JButton myskill4 = new JButton(mypokemon.getskillGUI(4));

        myskill1.setBounds(200,610,440,60);
        myskill2.setBounds(690,610,440,60);
        myskill3.setBounds(200,690,440,60);
        myskill4.setBounds(690,690,440,60);

        myskill1.setFont(new Font("Ketchum", Font.PLAIN, 20));
        myskill2.setFont(new Font("Ketchum", Font.PLAIN, 20));
        myskill3.setFont(new Font("Ketchum", Font.PLAIN, 20));
        myskill4.setFont(new Font("Ketchum", Font.PLAIN, 20));

        myskill1.setBackground(Color.WHITE);
        myskill2.setBackground(Color.WHITE);
        myskill3.setBackground(Color.WHITE);
        myskill4.setBackground(Color.WHITE);

        pic.add(myskill1);
        pic.add(myskill2);
        pic.add(myskill3);
        pic.add(myskill4);



        final JLabel hp_spMypokemon = new JLabel("hp:" + mypokemon.getHp() + " / sp:" + mypokemon.getSp());
        final JLabel hp_spWildpokemon = new JLabel("hp:" + wildPokemon.getHp() + " / sp:" + wildPokemon.getSp());

        hp_spMypokemon.setBounds(410,240,560,50);
        hp_spWildpokemon.setBounds(1060,170,560,50);

        hp_spMypokemon.setFont(new Font("Ketchum", Font.PLAIN, 34));
        hp_spWildpokemon.setFont(new Font("Ketchum", Font.PLAIN, 34));

        pic.add(hp_spMypokemon);
        pic.add(hp_spWildpokemon);
        

        
            

        myskill1.addActionListener(new ActionListener(){
            public void actionPerformed(final ActionEvent e){
                boolean isWin = false;
                if(mypokemon.getSp() >= mypokemon.getsp(1)){
                    mypokemon.attack(wildPokemon, mypokemon.AdditonalDmg(wildPokemon, mypokemon.getdmg(1)));
                    mypokemon.reduce(mypokemon, mypokemon.getsp(1));

                    hp_spMypokemon.setText("HP : " + mypokemon.getHp() + "/ SP : " + mypokemon.getSp());
                    hp_spWildpokemon.setText("HP : " + wildPokemon.getHp() + "/ SP : " + wildPokemon.getSp());

                    JOptionPane.showMessageDialog(null,
                        "" + mypokemon.getName() + " Use " + mypokemon.getskillnameGUI(1));

                    if((wildPokemon.getHp() <= 0) && (mypokemon.getHp() > 0)){
                        JOptionPane.showMessageDialog(null,
                        "==== YOU WIN ====",
                        "System Notification",
                        JOptionPane.WARNING_MESSAGE);
                        isWin = true;
                        new RewardGUI(trainer, wildPokemon);
                        setVisible(false);
                        }
                    if(!(isWin)){                    
                        final int randskill = (int)((Math.random()*4)+1);
                        if(randskill == 1){
                            if(wildPokemon.getSp() >= wildPokemon.getsp(1)){
                                wildPokemon.attack(mypokemon, wildPokemon.AdditonalDmg(mypokemon, wildPokemon.getdmg(randskill)));
                                wildPokemon.reduce(wildPokemon, wildPokemon.getsp(randskill));
                            }
                        }
                        else if(randskill == 2){
                            if(wildPokemon.getSp() >= wildPokemon.getsp(2)){
                                wildPokemon.attack(mypokemon, wildPokemon.AdditonalDmg(mypokemon, wildPokemon.getdmg(randskill)));
                                wildPokemon.reduce(wildPokemon, wildPokemon.getsp(randskill));    
                            }
                        }
                        else if(randskill == 3){
                            if(wildPokemon.getSp() >= wildPokemon.getsp(3)){
                                wildPokemon.attack(mypokemon, wildPokemon.AdditonalDmg(mypokemon, wildPokemon.getdmg(randskill)));
                                wildPokemon.reduce(wildPokemon, wildPokemon.getsp(randskill));    
                            }
                        }
                        else if(randskill == 4){
                            if(wildPokemon.getSp() >= wildPokemon.getsp(4)){
                                wildPokemon.attack(mypokemon, wildPokemon.AdditonalDmg(mypokemon, wildPokemon.getdmg(randskill)));
                                wildPokemon.reduce(wildPokemon, wildPokemon.getsp(randskill));    
                            }
                        }

                        hp_spMypokemon.setText("HP : " + mypokemon.getHp() + "/ SP : " + mypokemon.getSp());
                        hp_spWildpokemon.setText("HP : " + wildPokemon.getHp() + "/ SP : " + wildPokemon.getSp());

                        JOptionPane.showMessageDialog(null,
                            "" + wildPokemon.getName() + " Use " + wildPokemon.getskillnameGUI(randskill));
                            
                        if((wildPokemon.getHp() > 0) && (mypokemon.getHp() <= 0)){
                            JOptionPane.showMessageDialog(null,
                            " ==== You Lose ==== ",
                            "System Notification",
                            JOptionPane.WARNING_MESSAGE);
                            new menuGUI(trainer);
                            setVisible(false);
                        }
                    }   
                    // new FightGUI(trainer, wildPokemon, mypokemon);
                    // setVisible(false);
                }
                else{
                    JOptionPane.showMessageDialog(null,
                    "Not Enough Stamina",
                    "System Notification",
                    JOptionPane.WARNING_MESSAGE);
                }      
           
            }
        });
        myskill2.addActionListener(new ActionListener(){
            public void actionPerformed(final ActionEvent e){
                boolean isWin = false;
                if(mypokemon.getSp() >= mypokemon.getsp(2)){
                    mypokemon.attack(wildPokemon, mypokemon.AdditonalDmg(wildPokemon, mypokemon.getdmg(2)));
                    mypokemon.reduce(mypokemon, mypokemon.getsp(2));

                    hp_spMypokemon.setText("HP : " + mypokemon.getHp() + "/ SP : " + mypokemon.getSp());
                    hp_spWildpokemon.setText("HP : " + wildPokemon.getHp() + "/ SP : " + wildPokemon.getSp());

                    JOptionPane.showMessageDialog(null,
                        "" + mypokemon.getName() + " Use " + mypokemon.getskillnameGUI(2));

                    if((wildPokemon.getHp() <= 0) && (mypokemon.getHp() > 0)){
                        JOptionPane.showMessageDialog(null,
                        "==== YOU WIN ====",
                        "System Notification",
                        JOptionPane.WARNING_MESSAGE);
                        isWin = true;
                        new RewardGUI(trainer, wildPokemon);
                        setVisible(false);
                        }
                    if(!(isWin)){                    
                        final int randskill = (int)((Math.random()*4)+1);
                        if(randskill == 1){
                            if(wildPokemon.getSp() >= wildPokemon.getsp(1)){
                                wildPokemon.attack(mypokemon, wildPokemon.AdditonalDmg(mypokemon, wildPokemon.getdmg(randskill)));
                                wildPokemon.reduce(wildPokemon, wildPokemon.getsp(randskill));
                            }
                        } 
                        else if(randskill == 2){
                            if(wildPokemon.getSp() >= wildPokemon.getsp(2)){
                                wildPokemon.attack(mypokemon, wildPokemon.AdditonalDmg(mypokemon, wildPokemon.getdmg(randskill)));
                                wildPokemon.reduce(wildPokemon, wildPokemon.getsp(randskill));    
                            }
                        }
                        else if(randskill == 3){
                            if(wildPokemon.getSp() >= wildPokemon.getsp(3)){
                                wildPokemon.attack(mypokemon, wildPokemon.AdditonalDmg(mypokemon, wildPokemon.getdmg(randskill)));
                                wildPokemon.reduce(wildPokemon, wildPokemon.getsp(randskill));    
                            }
                        }
                        else if(randskill == 4){
                            if(wildPokemon.getSp() >= wildPokemon.getsp(4)){
                                wildPokemon.attack(mypokemon, wildPokemon.AdditonalDmg(mypokemon, wildPokemon.getdmg(randskill)));
                                wildPokemon.reduce(wildPokemon, wildPokemon.getsp(randskill));    
                            }
                        }

                        hp_spMypokemon.setText("HP : " + mypokemon.getHp() + "/ SP : " + mypokemon.getSp());
                        hp_spWildpokemon.setText("HP : " + wildPokemon.getHp() + "/ SP : " + wildPokemon.getSp());

                        JOptionPane.showMessageDialog(null,
                            "" + wildPokemon.getName() + " Use " + wildPokemon.getskillnameGUI(randskill));
                            
                        if((wildPokemon.getHp() > 0) && (mypokemon.getHp() <= 0)){
                            JOptionPane.showMessageDialog(null,
                            " ==== You Lose ==== ",
                            "System Notification",
                            JOptionPane.WARNING_MESSAGE);
                            new menuGUI(trainer);
                            setVisible(false);
                        }
                    }   
                    // new FightGUI(trainer, wildPokemon, mypokemon);
                    // setVisible(false);
                }
                else{
                    JOptionPane.showMessageDialog(null,
                    "Not Enough Stamina",
                    "System Notification",
                    JOptionPane.WARNING_MESSAGE);
                }      
     

            }
        });
        myskill3.addActionListener(new ActionListener(){
            public void actionPerformed(final ActionEvent e){
            
                boolean isWin = false;
                if(mypokemon.getSp() >= mypokemon.getsp(3)){
                    mypokemon.attack(wildPokemon, mypokemon.AdditonalDmg(wildPokemon, mypokemon.getdmg(3)));
                    mypokemon.reduce(mypokemon, mypokemon.getsp(3));

                    hp_spMypokemon.setText("HP : " + mypokemon.getHp() + "/ SP : " + mypokemon.getSp());
                    hp_spWildpokemon.setText("HP : " + wildPokemon.getHp() + "/ SP : " + wildPokemon.getSp());

                    JOptionPane.showMessageDialog(null,
                        "" + mypokemon.getName() + " Use " + mypokemon.getskillnameGUI(3));

                    if((wildPokemon.getHp() <= 0) && (mypokemon.getHp() > 0)){
                        JOptionPane.showMessageDialog(null,
                        "==== YOU WIN ====",
                        "System Notification",
                        JOptionPane.WARNING_MESSAGE);
                        isWin = true;
                        new RewardGUI(trainer, wildPokemon);
                        setVisible(false);
                        }
                    if(!(isWin)){                    
                        final int randskill = (int)((Math.random()*4)+1);
                        if(randskill == 1){
                            if(wildPokemon.getSp() >= wildPokemon.getsp(1)){
                                wildPokemon.attack(mypokemon, wildPokemon.AdditonalDmg(mypokemon, wildPokemon.getdmg(randskill)));
                                wildPokemon.reduce(wildPokemon, wildPokemon.getsp(randskill));
                            }
                        } 
                        else if(randskill == 2){
                            if(wildPokemon.getSp() >= wildPokemon.getsp(2)){
                                wildPokemon.attack(mypokemon, wildPokemon.AdditonalDmg(mypokemon, wildPokemon.getdmg(randskill)));
                                wildPokemon.reduce(wildPokemon, wildPokemon.getsp(randskill));    
                            }
                        }
                        else if(randskill == 3){
                            if(wildPokemon.getSp() >= wildPokemon.getsp(3)){
                                wildPokemon.attack(mypokemon, wildPokemon.AdditonalDmg(mypokemon, wildPokemon.getdmg(randskill)));
                                wildPokemon.reduce(wildPokemon, wildPokemon.getsp(randskill));    
                            }
                        }
                        else if(randskill == 4){
                            if(wildPokemon.getSp() >= wildPokemon.getsp(4)){
                                wildPokemon.attack(mypokemon, wildPokemon.AdditonalDmg(mypokemon, wildPokemon.getdmg(randskill)));
                                wildPokemon.reduce(wildPokemon, wildPokemon.getsp(randskill));    
                            }
                        }

                        hp_spMypokemon.setText("HP : " + mypokemon.getHp() + "/ SP : " + mypokemon.getSp());
                        hp_spWildpokemon.setText("HP : " + wildPokemon.getHp() + "/ SP : " + wildPokemon.getSp());

                        JOptionPane.showMessageDialog(null,
                            "" + wildPokemon.getName() + " Use " + wildPokemon.getskillnameGUI(randskill));
                            
                        if((wildPokemon.getHp() > 0) && (mypokemon.getHp() <= 0)){
                            JOptionPane.showMessageDialog(null,
                            " ==== You Lose ==== ",
                            "System Notification",
                            JOptionPane.WARNING_MESSAGE);
                            new menuGUI(trainer);
                            setVisible(false);
                        }
                    }   
                    // new FightGUI(trainer, wildPokemon, mypokemon);
                    // setVisible(false);
                }
                else{
                    JOptionPane.showMessageDialog(null,
                    "Not Enough Stamina",
                    "System Notification",
                    JOptionPane.WARNING_MESSAGE);
                }      
  

            }
        });
        myskill4.addActionListener(new ActionListener(){
            public void actionPerformed(final ActionEvent e){
            
                boolean isWin = false;
                if(mypokemon.getSp() >= mypokemon.getsp(4)){
                    mypokemon.attack(wildPokemon, mypokemon.AdditonalDmg(wildPokemon, mypokemon.getdmg(4)));
                    mypokemon.reduce(mypokemon, mypokemon.getsp(4));

                    hp_spMypokemon.setText("HP : " + mypokemon.getHp() + "/ SP : " + mypokemon.getSp());
                    hp_spWildpokemon.setText("HP : " + wildPokemon.getHp() + "/ SP : " + wildPokemon.getSp());

                    JOptionPane.showMessageDialog(null,
                        "" + mypokemon.getName() + " Use " + mypokemon.getskillnameGUI(4));

                    if((wildPokemon.getHp() <= 0) && (mypokemon.getHp() > 0)){
                        JOptionPane.showMessageDialog(null,
                        "==== YOU WIN ====",
                        "System Notification",
                        JOptionPane.WARNING_MESSAGE);
                        isWin = true;
                        new RewardGUI(trainer, wildPokemon);
                        setVisible(false);
                        }
                    if(!(isWin)){                    
                        final int randskill = (int)((Math.random()*4)+1);
                        if(randskill == 1){
                            if(wildPokemon.getSp() >= wildPokemon.getsp(1)){
                                wildPokemon.attack(mypokemon, wildPokemon.AdditonalDmg(mypokemon, wildPokemon.getdmg(randskill)));
                                wildPokemon.reduce(wildPokemon, wildPokemon.getsp(randskill));
                            }
                        } 
                        else if(randskill == 2){
                            if(wildPokemon.getSp() >= wildPokemon.getsp(2)){
                                wildPokemon.attack(mypokemon, wildPokemon.AdditonalDmg(mypokemon, wildPokemon.getdmg(randskill)));
                                wildPokemon.reduce(wildPokemon, wildPokemon.getsp(randskill));    
                            }
                        }
                        else if(randskill == 3){
                            if(wildPokemon.getSp() >= wildPokemon.getsp(3)){
                                wildPokemon.attack(mypokemon, wildPokemon.AdditonalDmg(mypokemon, wildPokemon.getdmg(randskill)));
                                wildPokemon.reduce(wildPokemon, wildPokemon.getsp(randskill));    
                            }
                        }
                        else if(randskill == 4){
                            if(wildPokemon.getSp() >= wildPokemon.getsp(4)){
                                wildPokemon.attack(mypokemon, wildPokemon.AdditonalDmg(mypokemon, wildPokemon.getdmg(randskill)));
                                wildPokemon.reduce(wildPokemon, wildPokemon.getsp(randskill));    
                            }
                        }

                        hp_spMypokemon.setText("HP : " + mypokemon.getHp() + "/ SP : " + mypokemon.getSp());
                        hp_spWildpokemon.setText("HP : " + wildPokemon.getHp() + "/ SP : " + wildPokemon.getSp());

                        JOptionPane.showMessageDialog(null,
                            "" + wildPokemon.getName() + " Use " + wildPokemon.getskillnameGUI(randskill));
                            
                        if((wildPokemon.getHp() > 0) && (mypokemon.getHp() <= 0)){
                            JOptionPane.showMessageDialog(null,
                            " ==== You Lose ==== ",
                            "System Notification",
                            JOptionPane.WARNING_MESSAGE);
                            new menuGUI(trainer);
                            setVisible(false);
                        }
                    }   
                    // new FightGUI(trainer, wildPokemon, mypokemon);
                    // setVisible(false);
                }
                else{
                    JOptionPane.showMessageDialog(null,
                    "Not Enough Stamina",
                    "System Notification",
                    JOptionPane.WARNING_MESSAGE);
                }      


            }
        });


        Run.addActionListener(new ActionListener(){
            public void actionPerformed(final ActionEvent e){
                new menuGUI(trainer);
                setVisible(false);
            }
        });

    }
}