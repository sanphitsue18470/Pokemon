import javax.swing.*;
import javax.swing.text.AttributeSet.ColorAttribute;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class FindGUI extends JFrame{
    private Trainer trainer;
    private Pokemon wildPokemon;
    public FindGUI(Trainer trainer){
        super("Pokemon Game");
        this.trainer = trainer;
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        
        Container c = getContentPane();
        ImageIcon img = new ImageIcon("fadeTorchic.png");

        ImageIcon torchic = new ImageIcon("fadeTorchic.png");
        ImageIcon Evee = new ImageIcon("fadeEvee.png");
        ImageIcon Kabigon = new ImageIcon("fadeKabigon.png");
        ImageIcon Mudkip = new ImageIcon("fadeMudkip.png");
        ImageIcon Pikachu = new ImageIcon("fadePikachu.png");
        ImageIcon Raichu = new ImageIcon("fadeRaichu.png");
        ImageIcon Senikame = new ImageIcon("fadeSenikame.png");
        ImageIcon Treecko = new ImageIcon("fadeTreecko.png");

        ImageIcon BTfight = new ImageIcon("BTfight.png");
        ImageIcon BTnext = new ImageIcon("BTnext.png");
        ImageIcon BTBackPotion = new ImageIcon("BTBackPotion.png");

        JLabel pic = new JLabel(img);
        c.add(pic);
        pack();
        
        // JLabel starterlabel = new JLabel("You found Unknow Pokemon");
        // starterlabel.setBounds(70,40,800,60);
        // starterlabel.setFont(new Font("Ketchum", Font.PLAIN, 55));
        // starterlabel.setForeground(Color.DARK_GRAY);
        // pic.add(starterlabel);

        JButton Fight = new JButton("");
        Fight.setBounds(150,630,200,80);
        Fight.setIcon(BTfight);
        // Fight.setFont(new Font("Pokemon X and Y", Font.PLAIN, 50));
        pic.add(Fight);

        JButton Next = new JButton("");
        Next.setBounds(430,630,200,80);
        Next.setIcon(BTnext);
        // Run.setFont(new Font("Pokemon X and Y", Font.PLAIN, 50));
        pic.add(Next);
        
        JButton Back = new JButton("");
        Back.setBounds(20,20,100,40);
        // Back.setFont(new Font("Pokemon X and Y", Font.PLAIN, 20));
        Back.setIcon(BTBackPotion);
        pic.add(Back);
     

        int rand = (int)((Math.random()*8)+1);
        if(rand == 1){
            wildPokemon = new Torchic("Wild Torchic");
            pic.setIcon(torchic);
        }
        else if(rand == 2){
            wildPokemon = new Evee("Wild Evee");
            pic.setIcon(Evee);
        }
        else if(rand == 3){
            wildPokemon = new Kabigon("Wild Kabigon");
            pic.setIcon(Kabigon);
        }
        else if(rand == 4){
            wildPokemon = new Mudkip("Wild Mudkip");
            pic.setIcon(Mudkip);
        }
        else if(rand == 5){
            wildPokemon = new Pikachu("Wild Pikachu");
            pic.setIcon(Pikachu);
        }
        else if(rand == 6){
            wildPokemon = new Raichu("Wild Raichu");
            pic.setIcon(Raichu);
        }
        else if(rand == 7){
            wildPokemon = new Senikame("Wild Senikame");
            pic.setIcon(Senikame);
        }
        else if(rand == 8){
            wildPokemon = new Treecko("Wild Treecko");
            pic.setIcon(Treecko);
        }

        JLabel wildhp = new JLabel("HP : " + wildPokemon.getHp());
        wildhp.setBounds(700,400,500,60);
        wildhp.setFont(new Font("Pokemon X and Y", Font.PLAIN, 40));
        // wildhp.setForeground(Color.DARK_GRAY);
        pic.add(wildhp);

        Back.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                new menuGUI(trainer);
                setVisible(false);
            }
        });
    

        Next.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                new FindGUI(trainer);
                setVisible(false);
            }
        });
    


        Fight.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                new SelectPokemonGUI(trainer, wildPokemon);
                setVisible(false);
            }
        });
    }
}