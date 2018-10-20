import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class PawitaGUI {
    private JFrame jFrame;

    public PawitaGUI() {
        this.jFrame = new JFrame();
    }

    public void showGUI() {
        JButton b=new JButton("ME");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Yeah");
            }
        });//creating instance of JButton
        b.setBounds(130,100,100, 40);

        jFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        jFrame.add(b);//adding button in JFrame

        jFrame.setSize(400,500);//400 width and 500 height
        jFrame.setLayout(null);//using no layout managers
        jFrame.setVisible(true);
    }
}
