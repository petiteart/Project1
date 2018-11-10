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

        JTextField box1 = new JTextField(20);
        box1.setBounds(130,150,100, 40);


        JTextField box2 = new JTextField(20);
        box2.setBounds(130,200,100, 40);

        JButton calculate = new JButton("Result");
        calculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int int1 = Integer.parseInt(box1.getText());
                int int2 = Integer.parseInt(box2.getText());
                int answer = int1 + int2;
                System.out.println(answer);
            }
        });//creating instance of JButton
        calculate.setBounds(130,300,100, 40);

        jFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        jFrame.add(box1);
        jFrame.add(box2);
        jFrame.add(calculate);//adding button in JFrame

        jFrame.setSize(400,500);//400 width and 500 height
        jFrame.setLayout(null);//using no layout managers
        jFrame.setVisible(true);
    }
}
