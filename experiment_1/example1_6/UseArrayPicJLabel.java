import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class UseArrayPicJLabel extends JFrame implements ActionListener {
    ImageIcon[] myImages;
    int totalImages = 5;
    int currentImage = 0;
    JLabel pic;
    JButton btNext;
    public  UseArrayPicJLabel() {
        setTitle("Do you want to see the beauty of the campus?");
        myImages = new ImageIcon[totalImages];
        for (int i = 0; i < myImages.length; ++i) {
            myImages[i] = new ImageIcon("/data/home/whx/develop/java/experiment_1/example1_6/images/picture" + (i + 1) + ".jpg");
            myImages[i].setImage(myImages[i].getImage().getScaledInstance(450, 500, Image.SCALE_DEFAULT));
        }
        pic = new JLabel(myImages[0]);
        btNext = new JButton("下一张");
        add(pic, "Center");
        add(btNext, "South");
        btNext.addActionListener(this);
        setSize(500, 600);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        currentImage = ++currentImage % totalImages;
        pic.setIcon(myImages[currentImage]);
    }
    public static void main(String[] args) {
        new UseArrayPicJLabel();
    }
}