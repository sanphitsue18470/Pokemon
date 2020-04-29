import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class usepotionGUI extends JFrame{
    private Trainer trainer;
    private int typepotion;
    private int [] potionbag = {0,0,0,0};
    private int oldhp = 0;
    private int oldsp = 0;
    private JButton[] details = {new JButton(), new JButton(), new JButton(), new JButton(), new JButton()
                                , new JButton(), new JButton(), new JButton(), new JButton(), new JButton()};
    public usepotionGUI(Trainer trainer,int typepotion){
        super("PoKemon Game");
        this.trainer = trainer;
        this.typepotion = typepotion;
 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);

        Container c = getContentPane();
        ImageIcon img = new ImageIcon("inbag.png");
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

        potionbag = trainer.getPotionbag();

        details[0].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(typepotion == 1 || typepotion == 3 ){
                    if(potionbag[typepotion-1] < 1){
                        JOptionPane.showMessageDialog(null,
                        "Not Enough Potion",
                        "System Notification",
                        JOptionPane.WARNING_MESSAGE);
                    }

                    else if(trainer.GetPokemon(0).getHp() < trainer.GetPokemon(0).MaxHP()){
                        oldhp = trainer.GetPokemon(0).getHp();
                        new Potion(trainer ,trainer.GetPokemon(0), typepotion, potionbag[0], potionbag[1], potionbag[2], potionbag[3]);     
                        JOptionPane.showMessageDialog(null,
                        "HP: " + oldhp + "Point " + " --> " + trainer.GetPokemon(0).getHp() + " Point");
                    }
                    else{
                        JOptionPane.showMessageDialog(null,
                    "Your Pokemon HP is FULL !!",
                    "System Notification",
                    JOptionPane.WARNING_MESSAGE);
                        
                    }

                }
                else if(typepotion == 2 || typepotion == 4){
                    if(potionbag[typepotion-1] < 1){
                        JOptionPane.showMessageDialog(null,
                        "Not Enough Potion",
                        "System Notification",
                        JOptionPane.WARNING_MESSAGE);
                    }
                    else if(trainer.GetPokemon(0).getSp() < trainer.GetPokemon(0).MaxSP()){
                        oldsp = trainer.GetPokemon(0).getSp();
                        new Potion(trainer ,trainer.GetPokemon(0), typepotion, potionbag[0], potionbag[1], potionbag[2], potionbag[3]);     
                        JOptionPane.showMessageDialog(null,
                        "SP: " + oldsp + "Point " + " --> " + trainer.GetPokemon(0).getSp() + " Point");
                    }
                    else{
                        JOptionPane.showMessageDialog(null,
                    "Your Pokemon SP is FULL !!",
                    "System Notification",
                    JOptionPane.WARNING_MESSAGE);
                        
                    }        
                }
                new usepotionGUI(trainer, typepotion);
                setVisible(false);
            }
        });

        details[1].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(typepotion == 1 || typepotion == 3){
                    if(potionbag[typepotion-1] < 1){
                        JOptionPane.showMessageDialog(null,
                        "Not Enough Potion",
                        "System Notification",
                        JOptionPane.WARNING_MESSAGE);
                    }
                    else if(trainer.GetPokemon(1).getHp() < trainer.GetPokemon(1).MaxHP()){
                        oldhp = trainer.GetPokemon(1).getHp();
                        new Potion(trainer ,trainer.GetPokemon(1), typepotion, potionbag[0], potionbag[1], potionbag[2], potionbag[3]);     
                        JOptionPane.showMessageDialog(null,
                        "HP: " + oldhp + "Point " + " --> " + trainer.GetPokemon(1).getHp() + " Point");
                    }
                    else{
                        JOptionPane.showMessageDialog(null,
                    "Your Pokemon HP is FULL !!",
                    "System Notification",
                    JOptionPane.WARNING_MESSAGE);
                        
                    }

                }
                else if(typepotion == 2 || typepotion == 4){
                    if(potionbag[typepotion-1] < 1){
                        JOptionPane.showMessageDialog(null,
                        "Not Enough Potion",
                        "System Notification",
                        JOptionPane.WARNING_MESSAGE);
                    }
                    else if(trainer.GetPokemon(1).getSp() < trainer.GetPokemon(1).MaxSP()){
                        oldsp = trainer.GetPokemon(1).getSp();
                        new Potion(trainer ,trainer.GetPokemon(1), typepotion, potionbag[0], potionbag[1], potionbag[2], potionbag[3]);     
                        JOptionPane.showMessageDialog(null,
                        "SP: " + oldsp + "Point " + " --> " + trainer.GetPokemon(1).getSp() + " Point");
                    }
                    else{
                        JOptionPane.showMessageDialog(null,
                    "Your Pokemon SP is FULL !!",
                    "System Notification",
                    JOptionPane.WARNING_MESSAGE);
                        
                    }

                }
                new usepotionGUI(trainer, typepotion);
                setVisible(false);
            
            }
        });

        details[2].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(typepotion == 1 || typepotion == 3){
                    if(potionbag[typepotion-1] < 1){
                        JOptionPane.showMessageDialog(null,
                        "Not Enough Potion",
                        "System Notification",
                        JOptionPane.WARNING_MESSAGE);
                    }
                    else if(trainer.GetPokemon(2).getHp() < trainer.GetPokemon(2).MaxHP()){
                        oldhp = trainer.GetPokemon(2).getHp();
                        new Potion(trainer ,trainer.GetPokemon(2), typepotion, potionbag[0], potionbag[1], potionbag[2], potionbag[3]);     
                        JOptionPane.showMessageDialog(null,
                        "HP: " + oldhp + "Point " + " --> " + trainer.GetPokemon(2).getHp() + " Point");
                    }
                    else{
                        JOptionPane.showMessageDialog(null,
                    "Your Pokemon HP is FULL !!",
                    "System Notification",
                    JOptionPane.WARNING_MESSAGE);
                        
                    }

                }
                else if(typepotion == 2 || typepotion == 4){
                    if(potionbag[typepotion-1] < 1){
                        JOptionPane.showMessageDialog(null,
                        "Not Enough Potion",
                        "System Notification",
                        JOptionPane.WARNING_MESSAGE);
                    }
                    else if(trainer.GetPokemon(2).getSp() < trainer.GetPokemon(2).MaxSP()){
                        oldsp = trainer.GetPokemon(2).getSp();
                        new Potion(trainer ,trainer.GetPokemon(2), typepotion, potionbag[0], potionbag[1], potionbag[2], potionbag[3]);     
                        JOptionPane.showMessageDialog(null,
                        "SP: " + oldsp + "Point " + " --> " + trainer.GetPokemon(2).getSp() + " Point");
                    }
                    else{
                        JOptionPane.showMessageDialog(null,
                    "Your Pokemon SP is FULL !!",
                    "System Notification",
                    JOptionPane.WARNING_MESSAGE);
                        
                    }

                }
                new usepotionGUI(trainer, typepotion);
                setVisible(false);
            }
        });

        details[3].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(typepotion == 1 || typepotion == 3){
                    if(potionbag[typepotion-1] < 1){
                        JOptionPane.showMessageDialog(null,
                        "Not Enough Potion",
                        "System Notification",
                        JOptionPane.WARNING_MESSAGE);
                    }
                    else if(trainer.GetPokemon(3).getHp() < trainer.GetPokemon(3).MaxHP()){
                        oldhp = trainer.GetPokemon(3).getHp();
                        new Potion(trainer ,trainer.GetPokemon(3), typepotion, potionbag[0], potionbag[1], potionbag[2], potionbag[3]);     
                        JOptionPane.showMessageDialog(null,
                        "HP: " + oldhp + "Point " + " --> " + trainer.GetPokemon(3).getHp() + " Point");
                    }
                    else{
                        JOptionPane.showMessageDialog(null,
                    "Your Pokemon HP is FULL !!",
                    "System Notification",
                    JOptionPane.WARNING_MESSAGE);
                        
                    }

                }
                else if(typepotion == 2 || typepotion == 4){
                    if(potionbag[typepotion-1] < 1){
                        JOptionPane.showMessageDialog(null,
                        "Not Enough Potion",
                        "System Notification",
                        JOptionPane.WARNING_MESSAGE);
                    }
                    else if(trainer.GetPokemon(3).getSp() < trainer.GetPokemon(3).MaxSP()){
                        oldsp = trainer.GetPokemon(3).getSp();
                        new Potion(trainer ,trainer.GetPokemon(3), typepotion, potionbag[0], potionbag[1], potionbag[2], potionbag[3]);     
                        JOptionPane.showMessageDialog(null,
                        "SP: " + oldsp + "Point " + " --> " + trainer.GetPokemon(3).getSp() + " Point");
                    }
                    else{
                        JOptionPane.showMessageDialog(null,
                    "Your Pokemon SP is FULL !!",
                    "System Notification",
                    JOptionPane.WARNING_MESSAGE);
                        
                    }

                }
                new usepotionGUI(trainer, typepotion);
                setVisible(false);
            }
        });

        details[4].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(typepotion == 1 || typepotion == 3){
                    if(potionbag[typepotion-1] < 1){
                        JOptionPane.showMessageDialog(null,
                        "Not Enough Potion",
                        "System Notification",
                        JOptionPane.WARNING_MESSAGE);
                    }
                    else if(trainer.GetPokemon(4).getHp() < trainer.GetPokemon(4).MaxHP()){
                        oldhp = trainer.GetPokemon(4).getHp();
                        new Potion(trainer ,trainer.GetPokemon(4), typepotion, potionbag[0], potionbag[1], potionbag[2], potionbag[3]);     
                        JOptionPane.showMessageDialog(null,
                        "HP: " + oldhp + "Point " + " --> " + trainer.GetPokemon(4).getHp() + " Point");
                    }
                    else{
                        JOptionPane.showMessageDialog(null,
                    "Your Pokemon HP is FULL !!",
                    "System Notification",
                    JOptionPane.WARNING_MESSAGE);
                        
                    }

                }
                else if(typepotion == 2 || typepotion == 4){
                    if(potionbag[typepotion-1] < 1){
                        JOptionPane.showMessageDialog(null,
                        "Not Enough Potion",
                        "System Notification",
                        JOptionPane.WARNING_MESSAGE);
                    }
                    else if(trainer.GetPokemon(4).getSp() < trainer.GetPokemon(4).MaxSP()){
                        oldsp = trainer.GetPokemon(4).getSp();
                        new Potion(trainer ,trainer.GetPokemon(4), typepotion, potionbag[0], potionbag[1], potionbag[2], potionbag[3]);     
                        JOptionPane.showMessageDialog(null,
                        "SP: " + oldsp + "Point " + " --> " + trainer.GetPokemon(4).getSp() + " Point");
                    }
                    else{
                        JOptionPane.showMessageDialog(null,
                    "Your Pokemon SP is FULL !!",
                    "System Notification",
                    JOptionPane.WARNING_MESSAGE);
                        
                    }

                }
                new usepotionGUI(trainer, typepotion);
                setVisible(false);
            }
        });

        details[5].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(typepotion == 1 || typepotion == 3){
                    if(potionbag[typepotion-1] < 1){
                        JOptionPane.showMessageDialog(null,
                        "Not Enough Potion",
                        "System Notification",
                        JOptionPane.WARNING_MESSAGE);
                    }
                    else if(trainer.GetPokemon(5).getHp() < trainer.GetPokemon(5).MaxHP()){
                        oldhp = trainer.GetPokemon(5).getHp();
                        new Potion(trainer ,trainer.GetPokemon(5), typepotion, potionbag[0], potionbag[1], potionbag[2], potionbag[3]);     
                        JOptionPane.showMessageDialog(null,
                        "HP: " + oldhp + "Point " + " --> " + trainer.GetPokemon(5).getHp() + " Point");
                    }
                    else{
                        JOptionPane.showMessageDialog(null,
                    "Your Pokemon HP is FULL !!",
                    "System Notification",
                    JOptionPane.WARNING_MESSAGE);
                        
                    }

                }
                else if(typepotion == 2 || typepotion == 4){
                    if(potionbag[typepotion-1] < 1){
                        JOptionPane.showMessageDialog(null,
                        "Not Enough Potion",
                        "System Notification",
                        JOptionPane.WARNING_MESSAGE);
                    }
                    else if(trainer.GetPokemon(5).getSp() < trainer.GetPokemon(5).MaxSP()){
                        oldsp = trainer.GetPokemon(5).getSp();
                        new Potion(trainer ,trainer.GetPokemon(5), typepotion, potionbag[0], potionbag[1], potionbag[2], potionbag[3]);     
                        JOptionPane.showMessageDialog(null,
                        "SP: " + oldsp + "Point " + " --> " + trainer.GetPokemon(5).getSp() + " Point");
                    }
                    else{
                        JOptionPane.showMessageDialog(null,
                    "Your Pokemon SP is FULL !!",
                    "System Notification",
                    JOptionPane.WARNING_MESSAGE);
                        
                    }

                }
                new usepotionGUI(trainer, typepotion);
                setVisible(false);
            }
        });

        details[6].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(typepotion == 1 || typepotion == 3){
                    if(potionbag[typepotion-1] < 1){
                        JOptionPane.showMessageDialog(null,
                        "Not Enough Potion",
                        "System Notification",
                        JOptionPane.WARNING_MESSAGE);
                    }
                    else if(trainer.GetPokemon(6).getHp() < trainer.GetPokemon(6).MaxHP()){
                        oldhp = trainer.GetPokemon(6).getHp();
                        new Potion(trainer ,trainer.GetPokemon(6), typepotion, potionbag[0], potionbag[1], potionbag[2], potionbag[3]);     
                        JOptionPane.showMessageDialog(null,
                        "HP: " + oldhp + "Point " + " --> " + trainer.GetPokemon(6).getHp() + " Point");
                    }
                    else{
                        JOptionPane.showMessageDialog(null,
                    "Your Pokemon HP is FULL !!",
                    "System Notification",
                    JOptionPane.WARNING_MESSAGE);
                        
                    }

                }
                else if(typepotion == 2 || typepotion == 4){
                    if(potionbag[typepotion-1] < 1){
                        JOptionPane.showMessageDialog(null,
                        "Not Enough Potion",
                        "System Notification",
                        JOptionPane.WARNING_MESSAGE);
                    }
                    else if(trainer.GetPokemon(6).getSp() < trainer.GetPokemon(6).MaxSP()){
                        oldsp = trainer.GetPokemon(6).getSp();
                        new Potion(trainer ,trainer.GetPokemon(6), typepotion, potionbag[0], potionbag[1], potionbag[2], potionbag[3]);     
                        JOptionPane.showMessageDialog(null,
                        "SP: " + oldsp + "Point " + " --> " + trainer.GetPokemon(6).getSp() + " Point");
                    }
                    else{
                        JOptionPane.showMessageDialog(null,
                    "Your Pokemon SP is FULL !!",
                    "System Notification",
                    JOptionPane.WARNING_MESSAGE);
                        
                    }

                }
                new usepotionGUI(trainer, typepotion);
                setVisible(false);
            }
        });

        details[7].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(typepotion == 1 || typepotion == 3){
                    if(potionbag[typepotion-1] < 1){
                        JOptionPane.showMessageDialog(null,
                        "Not Enough Potion",
                        "System Notification",
                        JOptionPane.WARNING_MESSAGE);
                    }
                    else if(trainer.GetPokemon(7).getHp() < trainer.GetPokemon(7).MaxHP()){
                        oldhp = trainer.GetPokemon(7).getHp();
                        new Potion(trainer ,trainer.GetPokemon(7), typepotion, potionbag[0], potionbag[1], potionbag[2], potionbag[3]);     
                        JOptionPane.showMessageDialog(null,
                        "HP: " + oldhp + "Point " + " --> " + trainer.GetPokemon(7).getHp() + " Point");
                    }
                    else{
                        JOptionPane.showMessageDialog(null,
                    "Your Pokemon HP is FULL !!",
                    "System Notification",
                    JOptionPane.WARNING_MESSAGE);
                        
                    }

                }
                else if(typepotion == 2 || typepotion == 4){
                    if(potionbag[typepotion-1] < 1){
                        JOptionPane.showMessageDialog(null,
                        "Not Enough Potion",
                        "System Notification",
                        JOptionPane.WARNING_MESSAGE);
                    }
                    else if(trainer.GetPokemon(7).getSp() < trainer.GetPokemon(7).MaxSP()){
                        oldsp = trainer.GetPokemon(7).getSp();
                        new Potion(trainer ,trainer.GetPokemon(7), typepotion, potionbag[0], potionbag[1], potionbag[2], potionbag[3]);     
                        JOptionPane.showMessageDialog(null,
                        "SP: " + oldsp + "Point " + " --> " + trainer.GetPokemon(7).getSp() + " Point");
                    }
                    else{
                        JOptionPane.showMessageDialog(null,
                    "Your Pokemon SP is FULL !!",
                    "System Notification",
                    JOptionPane.WARNING_MESSAGE);
                        
                    }

                }
                new usepotionGUI(trainer, typepotion);
                setVisible(false);
            }
        });

        details[8].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(typepotion == 1 || typepotion == 3){
                    if(potionbag[typepotion-1] < 1){
                        JOptionPane.showMessageDialog(null,
                        "Not Enough Potion",
                        "System Notification",
                        JOptionPane.WARNING_MESSAGE);
                    }
                    else if(trainer.GetPokemon(8).getHp() < trainer.GetPokemon(8).MaxHP()){
                        oldhp = trainer.GetPokemon(8).getHp();
                        new Potion(trainer ,trainer.GetPokemon(8), typepotion, potionbag[0], potionbag[1], potionbag[2], potionbag[3]);     
                        JOptionPane.showMessageDialog(null,
                        "HP: " + oldhp + "Point " + " --> " + trainer.GetPokemon(8).getHp() + " Point");
                    }
                    else{
                        JOptionPane.showMessageDialog(null,
                    "Your Pokemon HP is FULL !!",
                    "System Notification",
                    JOptionPane.WARNING_MESSAGE);
                        
                    }

                }
                else if(typepotion == 2 || typepotion == 4){
                    if(potionbag[typepotion-1] < 1){
                        JOptionPane.showMessageDialog(null,
                        "Not Enough Potion",
                        "System Notification",
                        JOptionPane.WARNING_MESSAGE);
                    }

                    else if(trainer.GetPokemon(8).getSp() < trainer.GetPokemon(8).MaxSP()){
                        oldsp = trainer.GetPokemon(8).getSp();
                        new Potion(trainer ,trainer.GetPokemon(8), typepotion, potionbag[0], potionbag[1], potionbag[2], potionbag[3]);     
                        JOptionPane.showMessageDialog(null,
                        "SP: " + oldsp + "Point " + " --> " + trainer.GetPokemon(8).getSp() + " Point");
                    }
                    else{
                        JOptionPane.showMessageDialog(null,
                    "Your Pokemon SP is FULL !!",
                    "System Notification",
                    JOptionPane.WARNING_MESSAGE);
                        
                    }

                }
                new usepotionGUI(trainer, typepotion);
                setVisible(false);
            }
        });

        details[9].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(potionbag[typepotion-1] < 1){
                    JOptionPane.showMessageDialog(null,
                    "Not Enough Potion",
                    "System Notification",
                    JOptionPane.WARNING_MESSAGE);
                }
                else if(typepotion == 1 || typepotion == 3){
                    if(trainer.GetPokemon(9).getHp() < trainer.GetPokemon(9).MaxHP()){
                        oldhp = trainer.GetPokemon(9).getHp();
                        new Potion(trainer ,trainer.GetPokemon(9), typepotion, potionbag[0], potionbag[1], potionbag[2], potionbag[3]);     
                        JOptionPane.showMessageDialog(null,
                        "HP: " + oldhp + "Point " + " --> " + trainer.GetPokemon(9).getHp() + " Point");
                    }
                    else{
                        JOptionPane.showMessageDialog(null,
                    "Your Pokemon HP is FULL !!",
                    "System Notification",
                    JOptionPane.WARNING_MESSAGE);
                        
                    }

                }
                else if(typepotion == 2 || typepotion == 4){
                    if(potionbag[typepotion-1] < 1){
                        JOptionPane.showMessageDialog(null,
                        "Not Enough Potion",
                        "System Notification",
                        JOptionPane.WARNING_MESSAGE);
                    }
                    else if(trainer.GetPokemon(9).getSp() < trainer.GetPokemon(9).MaxSP()){
                        oldsp = trainer.GetPokemon(9).getSp();
                        new Potion(trainer ,trainer.GetPokemon(9), typepotion, potionbag[0], potionbag[1], potionbag[2], potionbag[3]);     
                        JOptionPane.showMessageDialog(null,
                        "SP: " + oldsp + "Point " + " --> " + trainer.GetPokemon(9).getSp() + " Point");
                    }
                    else{
                        JOptionPane.showMessageDialog(null,
                    "Your Pokemon SP is FULL !!",
                    "System Notification",
                    JOptionPane.WARNING_MESSAGE);
                        
                    }

                }
                new usepotionGUI(trainer, typepotion);
                setVisible(false);
            }
        });
    
        Back.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                new PotionGUI(trainer);
                setVisible(false);
            }
        });

    }
}