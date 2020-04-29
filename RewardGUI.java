import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RewardGUI extends JFrame{
    private Trainer trainer;
    private Pokemon wildPokemon;
    public RewardGUI(Trainer trainer, Pokemon wildPokemon){
        super("Pokemon Game");
        this.trainer = trainer;
        this.wildPokemon = wildPokemon;

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        
        Container c = getContentPane();
        ImageIcon img = new ImageIcon("gotitem.png");
        ImageIcon BTcatch = new ImageIcon("BTcatch.png");
        ImageIcon BTdcatch = new ImageIcon("BTdcatch.png");

        JLabel pic = new JLabel(img);
        c.add(pic);
        pack();

        JButton Catch = new JButton("");
        Catch.setBounds(400,500,250,80);
        Catch.setIcon(BTcatch);
        // Catch.setFont(new Font("Ketchum", Font.PLAIN, 35));
        pic.add(Catch);    

        JButton notCatch = new JButton("");
        notCatch.setBounds(700,500,250,80);
        notCatch.setIcon(BTdcatch);
        // notCatch.setFont(new Font("Ketchum", Font.PLAIN, 35));
        pic.add(notCatch);  

        int L_hp = (int)((Math.random()*3)+1);
        int L_sp = (int)((Math.random()*3)+1);
        int S_hp = (int)((Math.random()*5)+1);
        int S_sp = (int)((Math.random()*5)+1);

        // JLabel title = new JLabel("You got Item");
        // title.setBounds(120,60,800,100);
        // title.setFont(new Font("Ketchum", Font.PLAIN, 80));
        // pic.add(title);

        JLabel Lhp = new JLabel("1. Large Health Potion : " + L_hp + " ea ");
        JLabel LSp = new JLabel("2. Large Stamina Potion : " + L_sp + " ea ");
        JLabel Shp = new JLabel("3. Small Health Potion : " + S_hp + " ea ");
        JLabel Ssp = new JLabel("4. Small Health Potion : " + S_sp + " ea ");

        Lhp.setFont(new Font("Ketchum", Font.PLAIN, 33));
        LSp.setFont(new Font("Ketchum", Font.PLAIN, 33));
        Shp.setFont(new Font("Ketchum", Font.PLAIN, 33));
        Ssp.setFont(new Font("Ketchum", Font.PLAIN, 33));

        Lhp.setBounds(300,220,700,80);
        LSp.setBounds(300,270,700,80);
        Shp.setBounds(300,320,700,80);
        Ssp.setBounds(300,370,700,80);

        pic.add(Lhp);
        pic.add(LSp);
        pic.add(Shp);
        pic.add(Ssp);

        
        Catch.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                trainer.getitem(L_hp, L_sp, S_hp, S_sp);
                if((trainer.getbag().size()) <= 9){
                    new SelectskillCatchGUI(trainer,wildPokemon);
                    setVisible(false);
                }
                else{
                    JOptionPane.showMessageDialog(null,
                        "You Bag in Full !!",
                        "System Notification",JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        notCatch.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                trainer.getitem(L_hp, L_sp, S_hp, S_sp);
                new menuGUI(trainer);
                setVisible(false);
            }
        });

    }
}