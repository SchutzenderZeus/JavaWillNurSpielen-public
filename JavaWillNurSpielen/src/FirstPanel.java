import javax.swing.*;

public class FirstPanel extends JPanel {
    @Override public void paintComponent(java.awt.Graphics g){
        g.fillRect(30,50,45,80);
        g.fillOval(123,345,567,189);
        g.fillRect(700,50,45,80);
        g.fillRect(365,200,75,80);
    }

    public static void main(String[] args) {
        JFrame f=new JFrame("First Panel: Test");
        f.add(new FirstPanel());
        f.setVisible(true);
    }
}
