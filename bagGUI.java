import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class bagGUI extends JFrame{
    private Trainer trainer;
    private JButton[] details = {new JButton(), new JButton(), new JButton(), new JButton(), new JButton()
                                , new JButton(), new JButton(), new JButton(), new JButton(), new JButton()};
    public bagGUI(Trainer trainer){
        super("Pokemon Game");
        this.trainer = trainer;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);

        Container c = getContentPane();
        ImageIcon img = new ImageIcon("back1.png");
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
                new statusGUI(trainer,0);
                setVisible(false);
            }
        });

        details[1].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                new statusGUI(trainer,1);
                setVisible(false);
            }
        });

        details[2].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                new statusGUI(trainer,2);
                setVisible(false);
            }
        });

        details[3].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                new statusGUI(trainer,3);
                setVisible(false);
            }
        });

        details[4].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                new statusGUI(trainer,4);
                setVisible(false);
            }
        });

        details[5].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                new statusGUI(trainer,5);
                setVisible(false);
            }
        });

        details[6].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                new statusGUI(trainer,6);
                setVisible(false);
            }
        });

        details[7].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                new statusGUI(trainer,7);
                setVisible(false);
            }
        });

        details[8].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                new statusGUI(trainer,8);
                setVisible(false);
            }
        });

        details[9].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                new statusGUI(trainer,9);
                setVisible(false);
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