import javax.swing.*;
import javax.swing.text.AttributeSet.ColorAttribute;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class minigame extends JFrame{
    private Trainer trainer;
    private int num;
    private JTextField txt;
    public minigame(Trainer trainer){
        super("Pokemon Game");
        this.trainer = trainer;
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        
        Container c = getContentPane();
        ImageIcon img = new ImageIcon("fadeTorchic.png");
        ImageIcon BTBackPotion = new ImageIcon("BTBackPotion.png");
        ImageIcon BTcommit = new ImageIcon("BTcommit.png");

        ImageIcon torchic = new ImageIcon("fadeTorchic.png");
        ImageIcon Evee = new ImageIcon("fadeEvee.png");
        ImageIcon Kabigon = new ImageIcon("fadeKabigon.png");
        ImageIcon Mudkip = new ImageIcon("fadeMudkip.png");
        ImageIcon Pikachu = new ImageIcon("fadePikachu.png");
        ImageIcon Raichu = new ImageIcon("fadeRaichu.png");
        ImageIcon Senikame = new ImageIcon("fadeSenikame.png");
        ImageIcon Treecko = new ImageIcon("fadeTreecko.png");

        JLabel pic = new JLabel(img);
        c.add(pic);
        pack();

        JLabel text1 = new JLabel("1. Torchic");
        JLabel text2 = new JLabel("2. Evee");
        JLabel text3 = new JLabel("3. Kabigon");
        JLabel text4 = new JLabel("4. Mudkip");
        JLabel text5 = new JLabel("5. Pikachu");
        JLabel text6 = new JLabel("6. Raichu");
        JLabel text7 = new JLabel("7. Senikame");
        JLabel text8 = new JLabel("8. Treecko");

        text1.setBounds(50,350,150,50);
        text2.setBounds(50,400,150,50);
        text3.setBounds(50,450,150,50);
        text4.setBounds(50,500,150,50);
        text5.setBounds(50,550,150,50);
        text6.setBounds(50,600,150,50);
        text7.setBounds(50,650,150,50);
        text8.setBounds(50,700,150,50);

        text1.setFont(new Font("Ketchum", Font.PLAIN, 20));
        text2.setFont(new Font("Ketchum", Font.PLAIN, 20));
        text3.setFont(new Font("Ketchum", Font.PLAIN, 20));
        text4.setFont(new Font("Ketchum", Font.PLAIN, 20));
        text5.setFont(new Font("Ketchum", Font.PLAIN, 20));
        text6.setFont(new Font("Ketchum", Font.PLAIN, 20));
        text7.setFont(new Font("Ketchum", Font.PLAIN, 20));
        text8.setFont(new Font("Ketchum", Font.PLAIN, 20));

        pic.add(text1);
        pic.add(text2);
        pic.add(text3);
        pic.add(text4);
        pic.add(text5);
        pic.add(text6);
        pic.add(text7);
        pic.add(text8);

        int rand = (int)((Math.random()*8)+1);
        if(rand == 1){
            pic.setIcon(torchic);
        }
        else if(rand == 2){
            pic.setIcon(Evee);
        }
        else if(rand == 3){
            pic.setIcon(Kabigon);
        }
        else if(rand == 4){
            pic.setIcon(Mudkip);
        }
        else if(rand == 5){
            pic.setIcon(Pikachu);
        }
        else if(rand == 6){
            pic.setIcon(Raichu);
        }
        else if(rand == 7){
            pic.setIcon(Senikame);
        }
        else if(rand == 8){
            pic.setIcon(Treecko);
        }

        txt = new JTextField();
        txt.setBounds(250, 630, 150, 40);
        pic.add(txt); 
        //jtf.setColumns(10);
        JButton ans = new JButton("");
        ans.setBounds(420, 630, 100, 40);
        ans.setIcon(BTcommit);
        pic.add(ans);
        //txt.gettext();

        JButton Back = new JButton("");
        Back.setBounds(20,20,100,40);
        Back.setIcon(BTBackPotion);
        // Back.setFont(new Font("Pokemon X and Y", Font.PLAIN, 20));
        pic.add(Back);


        ans.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){       
                try {
                    num = Integer.parseInt(txt.getText());
                        if((rand == 1) && (num == 1)){
                            JOptionPane.showMessageDialog( null,
                            "You Answer Correct !! \n==== You Got Item ==== \n1.Large Health Potion : 1 \n2. Large Stamina Potion : 1\n3. Small Health Potion : 1\n4. Small Health Potion : 1","Notification",JOptionPane.WARNING_MESSAGE);
                            trainer.getitem(1, 1, 1, 1);
                            setVisible(false);
                            new menuGUI(trainer);
                        }
                        else if((rand == 2) && (num == 2)){
                            JOptionPane.showMessageDialog( null,
                            "You Answer Correct !! \n==== You Got Item ==== \n1.Large Health Potion : 1 \n2. Large Stamina Potion : 1\n3. Small Health Potion : 1\n4. Small Health Potion : 1","Notification",JOptionPane.WARNING_MESSAGE);
                            trainer.getitem(1, 1, 1, 1);
                            setVisible(false);
                            new menuGUI(trainer);
                        }
                        else if((rand == 3) && (num == 3)){
                            JOptionPane.showMessageDialog( null,
                            "You Answer Correct !! \n==== You Got Item ==== \n1.Large Health Potion : 1 \n2. Large Stamina Potion : 1\n3. Small Health Potion : 1\n4. Small Health Potion : 1","Notification",JOptionPane.WARNING_MESSAGE);
                            trainer.getitem(1, 1, 1, 1);
                            setVisible(false);
                            new menuGUI(trainer);
                        }
                        else if((rand == 4) && (num == 4)){
                            JOptionPane.showMessageDialog( null,
                            "You Answer Correct !! \n==== You Got Item ==== \n1.Large Health Potion : 1 \n2. Large Stamina Potion : 1\n3. Small Health Potion : 1\n4. Small Health Potion : 1","Notification",JOptionPane.WARNING_MESSAGE);
                            trainer.getitem(1, 1, 1, 1);
                            setVisible(false);
                            new menuGUI(trainer);
                        }
                        else if((rand == 5) && (num == 5)){
                            JOptionPane.showMessageDialog( null,
                            "You Answer Correct !! \n==== You Got Item ==== \n1.Large Health Potion : 1 \n2. Large Stamina Potion : 1\n3. Small Health Potion : 1\n4. Small Health Potion : 1","Notification",JOptionPane.WARNING_MESSAGE);
                            trainer.getitem(1, 1, 1, 1);
                            setVisible(false);
                            new menuGUI(trainer);
                        }
                        else if((rand == 6) && (num == 6)){
                            JOptionPane.showMessageDialog( null,
                            "You Answer Correct !! \n==== You Got Item ==== \n1.Large Health Potion : 1 \n2. Large Stamina Potion : 1\n3. Small Health Potion : 1\n4. Small Health Potion : 1","Notification",JOptionPane.WARNING_MESSAGE);
                            trainer.getitem(1, 1, 1, 1);
                            setVisible(false);
                            new menuGUI(trainer);
                        }
                        else if((rand == 7) && (num == 7)){
                            JOptionPane.showMessageDialog( null,
                            "You Answer Correct !! \n==== You Got Item ==== \n1.Large Health Potion : 1 \n2. Large Stamina Potion : 1\n3. Small Health Potion : 1\n4. Small Health Potion : 1","Notification",JOptionPane.WARNING_MESSAGE);
                            trainer.getitem(1, 1, 1, 1);
                            setVisible(false);
                            new menuGUI(trainer);
                        }
                        else if((rand == 8) && (num == 8)){
                            JOptionPane.showMessageDialog( null,
                            "You Answer Correct !! \n==== You Got Item ==== \n1.Large Health Potion : 1 \n2. Large Stamina Potion : 1\n3. Small Health Potion : 1\n4. Small Health Potion : 1","Notification",JOptionPane.WARNING_MESSAGE);
                            trainer.getitem(1, 1, 1, 1);
                            setVisible(false);
                            new menuGUI(trainer);
                        }
                        else{
                            JOptionPane.showMessageDialog( null,"You Answer Wrong !!","Notification",JOptionPane.ERROR_MESSAGE );
                        }

                }
                catch ( NumberFormatException nfe ) {
                        JOptionPane.showMessageDialog( null,"You must enter integers","Invalid Number Format",JOptionPane.ERROR_MESSAGE );
                    }
            
            }
        });


        Back.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                new menuGUI(trainer);
                setVisible(false);
            }
        });


    }
}