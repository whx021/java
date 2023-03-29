import java.awt.*;
import javax.swing.*;
public class JavaApplet3 extends JApplet {
    JTextField prompt;
    public void init() {
        prompt = new JTextField("祝你学习顺利!");
        prompt.setBackground(Color.yellow);
        add(prompt, BorderLayout.SOUTH);
    }
}
