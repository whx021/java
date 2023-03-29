import java.awt.*;
import java.awt.event.*;
public class JavaAppGraphics extends Frame implements ActionListener {
    Label prompt;
    Button btnExit;
    public JavaAppGraphics() {
        setTitle("图形界面示例");
        setLayout(new FlowLayout());
        prompt = new Label("祝你学习顺利!");
        add(prompt);

        btnExit = new Button("关闭");
        btnExit.addActionListener(this);
        add(btnExit);
        setSize(400, 150);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
    public static void main(String ar[]) {
        new JavaAppGraphics();
    }
}