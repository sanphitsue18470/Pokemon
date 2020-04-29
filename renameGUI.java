import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class renameGUI extends JFrame{
    private Trainer trainer;
    private JButton[] details = {new JButton(), new JButton(), new JButton(), new JButton(), new JButton()
                                , new JButton(), new JButton(), new JButton(), new JButton(), new JButton()};
    public renameGUI(Trainer trainer){
        super("Pokemon Game");
        this.trainer = trainer;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);

        Container c = getContentPane();
        ImageIcon img = new ImageIcon("selectpoke.png");
        ImageIcon BTBackPotion = new ImageIcon("BTBackPotion.png");
        JLabel pic = new JLabel(img);
        c.add(pic);
        pack();

        JButton Back = new JButton("");
        Back.setBounds(20,20,100,40);
        Back.setIcon(BTBackPotion);
        // Back.setFont(new Font("Pokemon X and Y", Font.PLAIN, 20));
        pic.add(Back);
        
        JLabel pokemonName = new JLabel();
        pokemonName.setBounds(50,200,700,150);
        pokemonName.setFont(new Font("Ketchum", Font.PLAIN, 25));

        // JLabel pokemoninbag = new JLabel("Pokemon in Bag"); 
        // pokemoninbag.setBounds(120,60,800,100);
        // pokemoninbag.setFont(new Font("Ketchum", Font.PLAIN, 80));
        // pokemoninbag.setForeground(Color.DARK_GRAY);

        // pic.add(pokemoninbag);
        pic.add(pokemonName);


        int i = 0;

        // trainer.AddPokemon(new Mudkip("Mudkip"));
        // trainer.AddPokemon(new Treecko("Treecko"));
        // trainer.AddPokemon(new Evee("Evee"));
        // trainer.AddPokemon(new Kabigon("Kabigon"));
        // trainer.AddPokemon(new Pikachu("Pikachu"));
        // trainer.AddPokemon(new Raichu("Raichu"));
        // trainer.AddPokemon(new Senikame("Senikame"));

        int y = 200;
        int z = 200;

        for(Pokemon p : trainer.getbag()){
            if(i<5){
                details[i].setText(trainer.GetPokemon(i).getName());
                details[i].setBounds(300,y,300,60);
                details[i].setFont(new Font("Ketchum", Font.PLAIN, 25));
                details[i].setBackground(Color.WHITE);
                pic.add(details[i]);
                y += 90;
            }
            else if(i>=5 && i<10){
                details[i].setText(trainer.GetPokemon(i).getName());
                details[i].setBounds(750,z,300,60);
                details[i].setFont(new Font("Ketchum", Font.PLAIN, 25));
                details[i].setBackground(Color.WHITE);
                pic.add(details[i]);
                z += 90;
            }
            i++;

        }

        details[0].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String s = (String)JOptionPane.showInputDialog(null, "Enter New name","Rename",
                JOptionPane.PLAIN_MESSAGE);
                if((s != null) && (s.length() > 0)) {
                    trainer.GetPokemon(0).rename(s);
                }
                setVisible(false);
                new renameGUI(trainer);
                
            }
        });

        details[1].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String s = (String)JOptionPane.showInputDialog(null, "Enter New name","Rename",
                JOptionPane.PLAIN_MESSAGE);
                if((s != null) && (s.length() > 0)) {
                    trainer.GetPokemon(1).rename(s);
                }
                setVisible(false);
                new renameGUI(trainer);
            }
        });

        details[2].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String s = (String)JOptionPane.showInputDialog(null, "Enter New name","Rename",
                JOptionPane.PLAIN_MESSAGE);
                if((s != null) && (s.length() > 0)) {
                    trainer.GetPokemon(2).rename(s);
                }
                setVisible(false);
                new renameGUI(trainer);
            }
        });

        details[3].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String s = (String)JOptionPane.showInputDialog(null, "Enter New name","Rename",
                JOptionPane.PLAIN_MESSAGE);
                if((s != null) && (s.length() > 0)) {
                    trainer.GetPokemon(3).rename(s);
                }
                setVisible(false);
                new renameGUI(trainer);
            }
        });

        details[4].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String s = (String)JOptionPane.showInputDialog(null, "Enter New name","Rename",
                JOptionPane.PLAIN_MESSAGE);
                if((s != null) && (s.length() > 0)) {
                    trainer.GetPokemon(4).rename(s);
                }
                setVisible(false);
                new renameGUI(trainer);
            }
        });

        details[5].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String s = (String)JOptionPane.showInputDialog(null, "Enter New name","Rename",
                JOptionPane.PLAIN_MESSAGE);
                if((s != null) && (s.length() > 0)) {
                    trainer.GetPokemon(5).rename(s);
                }
                setVisible(false);
                new renameGUI(trainer);
            }
        });

        details[6].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String s = (String)JOptionPane.showInputDialog(null, "Enter New name","Rename",
                JOptionPane.PLAIN_MESSAGE);
                if((s != null) && (s.length() > 0)) {
                    trainer.GetPokemon(6).rename(s);
                }
                setVisible(false);
                new renameGUI(trainer);
            }
        });

        details[7].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String s = (String)JOptionPane.showInputDialog(null, "Enter New name","Rename",
                JOptionPane.PLAIN_MESSAGE);
                if((s != null) && (s.length() > 0)) {
                    trainer.GetPokemon(7).rename(s);
                }
                setVisible(false);
                new renameGUI(trainer);
            }
        });

        details[8].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String s = (String)JOptionPane.showInputDialog(null, "Enter New name","Rename",
                JOptionPane.PLAIN_MESSAGE);
                if((s != null) && (s.length() > 0)) {
                    trainer.GetPokemon(8).rename(s);
                }
                setVisible(false);
                new renameGUI(trainer);
            }
        });

        details[9].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String s = (String)JOptionPane.showInputDialog(null, "Enter New name","Rename",
                JOptionPane.PLAIN_MESSAGE);
                if((s != null) && (s.length() > 0)) {
                    trainer.GetPokemon(9).rename(s);
                }
                setVisible(false);
                new renameGUI(trainer);
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