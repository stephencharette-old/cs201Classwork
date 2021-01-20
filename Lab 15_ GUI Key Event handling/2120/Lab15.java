import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Lab15 extends JFrame implements KeyListener{
   private final LayoutManager layout;

   private JTextField tf0;
   private JTextArea ta0;

   public Lab15(){
      super("Add your title here");
      layout = new BorderLayout(); // add components with add(component, BorderLayout.CENTER (NORTH, SOUTH, EAST, WEST)
      setLayout(layout);
      tf0 = new JTextField("");
      ta0 = new JTextArea("",6,20);
      add(tf0, BorderLayout.SOUTH);
      add(new JScrollPane(ta0), BorderLayout.CENTER);
      //tf0.addKeyListener(this);
      tf0.addKeyListener(this);
   }

   public void keyPressed(KeyEvent event){
      //get key code/key text with KeyEvent.getKeyText(event.getKeyCode())
      //get keyChar with event.getKeyChar()
      
      
      
   }
   public void keyReleased(KeyEvent event){
      
      
   }
   public void keyTyped(KeyEvent event){
      String txt = ta0.getText() + event.getKeyChar();
      ta0.setText( txt );
      
   }
   public static void main(String[] args){
      Lab15 lab15 = new Lab15();
      lab15.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      lab15.setSize(450, 350);
      Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
      lab15.setLocation((int)screenSize.getWidth()/3, (int)screenSize.getHeight()/3);
      lab15.setVisible(true);
   }

}
