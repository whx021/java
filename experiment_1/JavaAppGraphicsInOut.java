import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
public class JavaAppGraphicsInOut extends Frame implements ActionListener {
    Label prompt;
    TextField input;
    TextArea output;
    Button btnSq, btnCount, btnSort;
    JavaAppGraphicsInOut() {
        super("Java Application Graphical Interface Program");
        prompt = new Label("Please input a string");
        input = new TextField(30);
        input.setFont(new Font("宋体", Font.BOLD, 18));
        output = new TextArea(5, 30);
        output.setFont(new Font("黑体", Font.BOLD, 18));
        output.setForeground(Color.blue);
        btnSq = new Button("Squared");
        btnCount = new Button("Count");
        btnSort = new Button("Sort");
        setLayout(new FlowLayout());
        add(prompt);
        add(input);
        add(btnSq);
        add(btnCount);
        add(btnSort);
        add(output);
        btnSq.addActionListener(this);
        btnCount.addActionListener(this);
        btnSort.addActionListener(this);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setSize(600, 260);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        String s = input.getText();
        char[] chs = s.toCharArray();
        int num_1 = 0, num_2 = 0, num_3 = 0, num_4 = 0;
        if (e.getSource() == btnSq) {
            double x = Double.parseDouble(s);
            output.setText("the num's square is = " + x * x);
        }
        if (e.getSource() == btnCount) {
            for (int i = 0; i < chs.length; ++i) {
                if (chs[i] >= '0' && chs[i] <= '9') {
                    ++num_1;
                } else if (chs[i] >= 'A' && chs[i] <= 'Z') {
                    ++num_2;
                } else if (chs[i] >= 'a' && chs[i] <= 'z') {
                    ++num_3;
                } else {
                    ++num_4;
                }
            }
            output.setText("数字个数 : " + num_1 + "\n大写字母个数 : " + num_2 + "\n小写字母个数 : " + num_3 + "\n其他字符个数 : " + num_4);
        }
        if (e.getActionCommand().equals("Sort")) {
            String ss = "";
            Arrays.sort(chs);
            for (char c : chs) {
                ss = ss + c;
            }
            output.setText(ss);
        }
    }
    public static void main(String[] args) {
        new JavaAppGraphicsInOut();
    }
}