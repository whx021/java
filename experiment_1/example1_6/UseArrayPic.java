import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
public class UseArrayPic extends Applet implements ActionListener {
    Image[] myImages;
    int totalImages = 5;
    int currentImage = 0;
    Label pic;
    Button btNext;
    public void init() {
        pic = new Label("想看看校园美景吗?");
        btNext = new Button("下一张");
        add(pic);
        add(btNext);
        btNext.addActionListener(this);
        myImages = new Image[totalImages];
        for (int i = 0; i < myImages.length; ++i) {
            myImages[i] = getImage(getDocumentBase(), "/data/home/whx/develop/java/experiment_1/example1_6/images/picture" + (i + 1) + ".jpg");
        }
        setSize(500, 600);
    }
    public void actionPerformed(ActionEvent e) {
        currentImage = ++currentImage %  totalImages;
        repaint();
    }
    public void paint(Graphics g) {
        g.drawImage(myImages[currentImage], 40, 50, 450, 500, this);
    }
}