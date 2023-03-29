import java.awt.*;
import java.applet.Applet;
public class JavaApplet2 extends Applet {
    Label prompt;
    public void init() {
        prompt = new Label("祝你学习顺利!");
        prompt.setBackground(Color.yellow);
        add(prompt);
    }
}
