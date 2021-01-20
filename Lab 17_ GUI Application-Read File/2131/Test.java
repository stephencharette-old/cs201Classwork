import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Test extends JFrame{
   private final LayoutManager layout;

   private JTextField tf0;
   private JLabel lbl0;

   public Test(){
      super("Add your title here");
      layout = new FlowLayout(1);
      setLayout(layout);
      tf0 = new JTextField("JTextField0");
      lbl0 = new JLabel("JLabel0");
      add(tf0);
      add(lbl0);
   }

   public static void main(String[] args){
      Test test = new Test();
      test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      test.setSize(450, 350);
      Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
      test.setLocation((int)screenSize.getWidth()/3, (int)screenSize.getHeight()/3);
      test.setVisible(true);
   }

}