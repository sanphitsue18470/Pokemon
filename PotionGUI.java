import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class PotionGUI extends JFrame{
    private Trainer trainer;
    private int [] potionbag = {0,0,0,0};
    public PotionGUI(Trainer trainer){
        super("Pokemon Game");
        this.trainer = trainer;
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        
        Container c = getContentPane();
        ImageIcon img = new ImageIcon("berrybag.png");
        ImageIcon BTuseBG = new ImageIcon("BTuseBG.png");
        ImageIcon BTBackPotion = new ImageIcon("BTBackPotion.png");
        
        JLabel pic = new JLabel(img);
        c.add(pic);
        pack();

        // JLabel title = new JLabel(""); 
        // title.setBounds(160,0,800,100);
        // title.setFont(new Font("Ketchum", Font.PLAIN, 80));
        // title.setForeground(Color.DARK_GRAY);
        // pic.add(title);

        JButton Back = new JButton("");
        Back.setBounds(20,20,100,40);
        Back.setIcon(BTBackPotion);
        // Back.setFont(new Font("Pokemon X and Y", Font.PLAIN, 20));
        pic.add(Back);

        potionbag = trainer.getPotionbag();

        JLabel numL_hp = new JLabel("X  " + potionbag[0]);
        JLabel numL_sp = new JLabel("X  " + potionbag[1]);
        JLabel numS_hp = new JLabel("X  " + potionbag[2]);
        JLabel numS_sp = new JLabel("X  " + potionbag[3]);
        numL_hp.setFont(new Font("Pokemon X and Y", Font.PLAIN, 30));
        numL_sp.setFont(new Font("Pokemon X and Y", Font.PLAIN, 30));
        numS_hp.setFont(new Font("Pokemon X and Y", Font.PLAIN, 30));
        numS_sp.setFont(new Font("Pokemon X and Y", Font.PLAIN, 30));

        numL_hp.setBounds(360,385,150,60);
        numL_sp.setBounds(715,395,150,60);
        numS_hp.setBounds(370,645,150,60);
        numS_sp.setBounds(720,645,150,60);

        pic.add(numL_hp);
        pic.add(numL_sp);
        pic.add(numS_hp);
        pic.add(numS_sp);

        ImageIcon L_HP_potion = new ImageIcon("berry1.png");
        ImageIcon S_HP_potion = new ImageIcon("berry2.png");
        ImageIcon L_SP_Potion = new ImageIcon("berry3.png");
        ImageIcon S_SP_Potion = new ImageIcon("berry5.png");
        

        JLabel L_HP = new JLabel(L_HP_potion);
        JLabel S_HP = new JLabel(S_HP_potion);
        JLabel L_SP = new JLabel(L_SP_Potion);
        JLabel S_SP = new JLabel(S_SP_Potion);

        L_HP.setBounds(200,180,500,300);
        S_HP.setBounds(200,450,500,300);
        L_SP.setBounds(550,180,500,300);
        S_SP.setBounds(550,450,500,300);

        pic.add(L_HP);
        pic.add(S_HP);
        pic.add(L_SP);
        pic.add(S_SP);


        JLabel details1 = new JLabel("( Heal : 100 Point )");
        JLabel details2 = new JLabel("( Stamina : 80 Point )");
        JLabel details3 = new JLabel("( Heal : 50 Point )");
        JLabel details4 = new JLabel("( Stamina : 40 Point )");

        details1.setFont(new Font("Pokemon X and Y", Font.PLAIN, 20));
        details2.setFont(new Font("Pokemon X and Y", Font.PLAIN, 20));
        details3.setFont(new Font("Pokemon X and Y", Font.PLAIN, 20));
        details4.setFont(new Font("Pokemon X and Y", Font.PLAIN, 20));

        details1.setBounds(500,250,150,60);
        details2.setBounds(850,250,150,60);
        details3.setBounds(500,540,150,60);
        details4.setBounds(850,540,150,60);

        pic.add(details1);
        pic.add(details2);
        pic.add(details3);
        pic.add(details4);

        JButton useLhp = new JButton("");
        JButton useLsp = new JButton("");
        JButton useShp = new JButton("");
        JButton useSsp = new JButton("");

        useLhp.setIcon(BTuseBG);
        useLsp.setIcon(BTuseBG);
        useShp.setIcon(BTuseBG);
        useSsp.setIcon(BTuseBG);

        

        useLhp.setBounds(550,390,80,50);
        useLsp.setBounds(900,390,80,50);
        useShp.setBounds(530,650,80,50);
        useSsp.setBounds(880,650,80,50);

        pic.add(useLhp);
        pic.add(useLsp);
        pic.add(useShp);
        pic.add(useSsp);



        useLhp.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(potionbag[0] > 0){
                    new usepotionGUI(trainer, 1);
                    setVisible(false);
                }
                else{
                    JOptionPane.showMessageDialog(null,
                    "Not Enough Potion",
                    "System Notification",
                    JOptionPane.WARNING_MESSAGE);
                }
                
            }
        });
        useLsp.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(potionbag[1] > 0){
                    new usepotionGUI(trainer, 2);
                    setVisible(false);
                }
                else{
                    JOptionPane.showMessageDialog(null,
                    "Not Enough Potion",
                    "System Notification",
                    JOptionPane.WARNING_MESSAGE);
                }
            }
        });
        useShp.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(potionbag[2] > 0){
                    new usepotionGUI(trainer, 3);
                    setVisible(false);
                }
                else{
                    JOptionPane.showMessageDialog(null,
                    "Not Enough Potion",
                    "System Notification",
                    JOptionPane.WARNING_MESSAGE);
                }
            }
        });
        useSsp.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(potionbag[3] > 0){
                    new usepotionGUI(trainer, 4);
                    setVisible(false);
                }
                else{
                    JOptionPane.showMessageDialog(null,
                    "Not Enough Potion",
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