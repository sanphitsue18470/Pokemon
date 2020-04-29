import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class tutorialGUI extends JFrame{
    private Trainer trainer;

    public tutorialGUI(Trainer trainer){
        super("Pokemon Game");
        this.trainer = trainer;
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        
        Container c = getContentPane();
        ImageIcon img = new ImageIcon("tuto.png");
        ImageIcon BTok = new ImageIcon("BTok.png");
        
        JLabel pic = new JLabel(img);
        c.add(pic);
        pack();

        JButton Play = new JButton("");
        Play.setBounds(550,690,200,50);
        Play.setIcon(BTok);
        // Play.setFont(new Font("Pokemon X and Y", Font.PLAIN, 60));    
        pic.add(Play);

        Play.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                new menuGUI(trainer);
                setVisible(false);
            }
        });
    }
}