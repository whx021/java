import java.awt.*;
// 使用一个标签一个文本框显示文字
// public class JavaAppGraphics extends Frame {
//     Label prompt;
//     TextField output;
//     JavaAppGraphics() {
//         setTitle("Java图形界面示例");
//         prompt = new Label("勤能补拙");
//         output = new TextField(20);
//         output.setText("水滴石穿");
//         setLayout(new FlowLayout());
//         add(prompt);
//         add(output);
//         setSize(450, 150);
//         setVisible(true);
//     }
//     public static void main(String[] args) {
//         new JavaAppGraphics();
//     }
// }

// // 使用两个标签显示文字
// public class JavaAppGraphics extends Frame {
//     Label prompt_1;
//     Label prompt_2;
//     JavaAppGraphics() {
//         setTitle("Java图形界面示例");
//         prompt_1 = new Label("勤能补拙");
//         prompt_2 = new Label("水滴石穿");
//         setLayout(new FlowLayout());
//         add(prompt_1);
//         add(prompt_2);
//         setSize(450, 150);
//         setVisible(true);
//     }
//     public static void main(String[] args) {
//         new JavaAppGraphics();
//     }
// }

// 使用两个文本框显示文字
public class JavaAppGraphics extends Frame {
    TextField output_1;
    TextField output_2;
    JavaAppGraphics() {
        setTitle("Java图形界面示例");
        output_1 = new TextField(20);
        output_2 = new TextField(20);
        output_1.setText("勤能补拙");
        output_2 = new TextField(20);
        output_2.setText("水滴石穿");
        setLayout(new FlowLayout());
        add(output_1);
        add(output_2);
        setSize(450, 150);
        setVisible(true);
    }
    public static void main(String[] args) {
        new JavaAppGraphics();
    }
}