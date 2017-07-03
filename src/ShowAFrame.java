import javax.swing.JFrame;

public class ShowAFrame {
    public static void main(String[] args) {
        JFrame myFrame = new JFrame();
        String myTitle = "Пустой фрейм";

        myFrame.setTitle(myTitle);
        myFrame.setSize(300, 200);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
    }
}
