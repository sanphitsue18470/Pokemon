import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class SelectPokemonGUI extends JFrame{
    private Trainer trainer;
    private Pokemon wildPokemon;
    private JButton[] details = {new JButton(), new JButton(), new JButton(), new JButton(), new JButton()
                                , new JButton(), new JButton(), new JButton(), new JButton(), new JButton()};
    public SelectPokemonGUI(Trainer trainer , Pokemon wildPokemon){
        super("Pokemon Game");
        this.trainer = trainer;
        this.wildPokemon = wildPokemon;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);

        Container c = getContentPane();
        ImageIcon img = new ImageIcon("fight.png"); 
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
        //pokemonName.setText(pName);
        
        
        details[0].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if((trainer.GetPokemon(0).getHp() > 0) && (trainer.GetPokemon(0).getSp() > 0)){
                    new FightGUI(trainer,wildPokemon,trainer.GetPokemon(0));
                    setVisible(false);
                }
                else if(trainer.GetPokemon(0).getHp() <= 0){
                    JOptionPane.showMessageDialog(null,
                    "Your Pokemon Lower HP",
                    "System Notification",
                    JOptionPane.WARNING_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null,
                    "Your Pokemon Lower SP",
                    "System Notification",
                    JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        details[1].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if((trainer.GetPokemon(1).getHp() > 0) && (trainer.GetPokemon(1).getSp() > 0)){
                    new FightGUI(trainer,wildPokemon,trainer.GetPokemon(1));
                    setVisible(false);
                }
                else if(trainer.GetPokemon(1).getHp() <= 0){
                    JOptionPane.showMessageDialog(null,
                    "Your Pokemon Lower HP",
                    "System Notification",
                    JOptionPane.WARNING_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null,
                    "Your Pokemon Lower SP",
                    "System Notification",
                    JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        details[2].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if((trainer.GetPokemon(2).getHp() > 0) && (trainer.GetPokemon(2).getSp() > 0)){
                    new FightGUI(trainer,wildPokemon,trainer.GetPokemon(2));
                    setVisible(false);
                }
                else if(trainer.GetPokemon(2).getHp() <= 0){
                    JOptionPane.showMessageDialog(null,
                    "Your Pokemon Lower HP",
                    "System Notification",
                    JOptionPane.WARNING_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null,
                    "Your Pokemon Lower SP",
                    "System Notification",
                    JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        details[3].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if((trainer.GetPokemon(3).getHp() > 0) && (trainer.GetPokemon(3).getSp() > 0)){
                    new FightGUI(trainer,wildPokemon,trainer.GetPokemon(3));
                    setVisible(false);
                }
                else if(trainer.GetPokemon(3).getHp() <= 0){
                    JOptionPane.showMessageDialog(null,
                    "Your Pokemon Lower HP",
                    "System Notification",
                    JOptionPane.WARNING_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null,
                    "Your Pokemon Lower SP",
                    "System Notification",
                    JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        details[4].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if((trainer.GetPokemon(4).getHp() > 0) && (trainer.GetPokemon(4).getSp() > 0)){
                    new FightGUI(trainer,wildPokemon,trainer.GetPokemon(4));
                    setVisible(false);
                }
                else if(trainer.GetPokemon(4).getHp() <= 0){
                    JOptionPane.showMessageDialog(null,
                    "Your Pokemon Lower HP",
                    "System Notification",
                    JOptionPane.WARNING_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null,
                    "Your Pokemon Lower SP",
                    "System Notification",
                    JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        details[5].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if((trainer.GetPokemon(5).getHp() > 0) && (trainer.GetPokemon(5).getSp() > 0)){
                    new FightGUI(trainer,wildPokemon,trainer.GetPokemon(5));
                    setVisible(false);
                }
                else if(trainer.GetPokemon(5).getHp() <= 0){
                    JOptionPane.showMessageDialog(null,
                    "Your Pokemon Lower HP",
                    "System Notification",
                    JOptionPane.WARNING_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null,
                    "Your Pokemon Lower SP",
                    "System Notification",
                    JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        details[6].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if((trainer.GetPokemon(6).getHp() > 0) && (trainer.GetPokemon(6).getSp() > 0)){
                    new FightGUI(trainer,wildPokemon,trainer.GetPokemon(6));
                    setVisible(false);
                }
                else if(trainer.GetPokemon(6).getHp() <= 0){
                    JOptionPane.showMessageDialog(null,
                    "Your Pokemon Lower HP",
                    "System Notification",
                    JOptionPane.WARNING_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null,
                    "Your Pokemon Lower SP",
                    "System Notification",
                    JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        details[7].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if((trainer.GetPokemon(7).getHp() > 0) && (trainer.GetPokemon(7).getSp() > 0)){
                    new FightGUI(trainer,wildPokemon,trainer.GetPokemon(7));
                    setVisible(false);
                }
                else if(trainer.GetPokemon(7).getHp() <= 0){
                    JOptionPane.showMessageDialog(null,
                    "Your Pokemon Lower HP",
                    "System Notification",
                    JOptionPane.WARNING_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null,
                    "Your Pokemon Lower SP",
                    "System Notification",
                    JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        details[8].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if((trainer.GetPokemon(8).getHp() > 0) && (trainer.GetPokemon(8).getSp() > 0)){
                    new FightGUI(trainer,wildPokemon,trainer.GetPokemon(8));
                    setVisible(false);
                }
                else if(trainer.GetPokemon(8).getHp() <= 0){
                    JOptionPane.showMessageDialog(null,
                    "Your Pokemon Lower HP",
                    "System Notification",
                    JOptionPane.WARNING_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null,
                    "Your Pokemon Lower SP",
                    "System Notification",
                    JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        details[9].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if((trainer.GetPokemon(9).getHp() > 0) && (trainer.GetPokemon(9).getSp() > 0)){
                    new FightGUI(trainer,wildPokemon,trainer.GetPokemon(9));
                    setVisible(false);
                }
                else if(trainer.GetPokemon(9).getHp() <= 0){
                    JOptionPane.showMessageDialog(null,
                    "Your Pokemon Lower HP",
                    "System Notification",
                    JOptionPane.WARNING_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null,
                    "Your Pokemon Lower SP",
                    "System Notification",
                    JOptionPane.WARNING_MESSAGE);
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