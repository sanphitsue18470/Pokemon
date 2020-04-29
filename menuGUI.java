import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class menuGUI extends JFrame{
    private Trainer trainer;

    public menuGUI(Trainer trainer){
        super("Pokemon Game");
        this.trainer = trainer;
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        
        Container c = getContentPane();
        ImageIcon img = new ImageIcon("menu.png");
        ImageIcon BTpokemonbag = new ImageIcon("BTpokemonbag.png");
        ImageIcon BTfindpokemon = new ImageIcon("BTfindpokemon.png");
        ImageIcon BTpotion = new ImageIcon("BTpotion.png");
        ImageIcon BTrename = new ImageIcon("BTrename.png");
        ImageIcon BTout = new ImageIcon("BTout.png");
        ImageIcon BTtutotial = new ImageIcon("BTtutotial.png");
        
        JLabel pic = new JLabel(img);
        c.add(pic);
        pack();

        // JLabel starterlabel = new JLabel("MENU");
        // starterlabel.setBounds(370,60,800,60);
        // starterlabel.setFont(new Font("Ketchum", Font.PLAIN, 80));
        // starterlabel.setForeground(Color.DARK_GRAY);

        JButton Bag = new JButton("");
        Bag.setBounds(380,350,250,80);
        Bag.setIcon(BTpokemonbag);
        // Bag.setFont(new Font("Pokemon X and Y", Font.PLAIN, 25));

        JButton Find = new JButton("");
        Find.setBounds(750,350,250,80);
        Find.setIcon(BTfindpokemon);
        // Find.setFont(new Font("Pokemon X and Y", Font.PLAIN, 25));

        JButton Potion = new JButton("");
        Potion.setBounds(380,450,250,80);
        Potion.setIcon(BTpotion);
        // Potion.setFont(new Font("Pokemon X and Y", Font.PLAIN, 25));

        JButton Rename = new JButton("");
        Rename.setBounds(750,450,250,80);
        Rename.setIcon(BTrename);
        // Rename.setFont(new Font("Pokemon X and Y", Font.PLAIN, 25));

        JButton tutorial = new JButton("");
        tutorial.setBounds(300,175,50,50);
        tutorial.setIcon(BTtutotial);


        JButton Quit = new JButton("");
        Quit.setBounds(20,20,100,40);
        Quit.setIcon(BTout);
        // Quit.setFont(new Font("Pokemon X and Y", Font.PLAIN, 20));

        // pic.add(starterlabel);
        pic.add(Bag);
        pic.add(Find);
        pic.add(Potion);
        pic.add(Rename);
        pic.add(Quit);
        pic.add(tutorial);



        Bag.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                new bagGUI(trainer);
                setVisible(false);
            }
        });

        Find.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                new FindGUI(trainer);
                setVisible(false);
            }
        });

        Potion.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                new PotionGUI(trainer);
                setVisible(false);
            }
        });

        tutorial.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                new tutorialGUI(trainer);
                setVisible(false);
            }
        });

        Rename.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                new renameGUI(trainer);
                setVisible(false);
            }
        });

        Quit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                setVisible(false);
            }
        });
    }
}