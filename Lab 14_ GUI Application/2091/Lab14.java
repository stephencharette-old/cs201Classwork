import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Lab14 extends JFrame implements ActionListener{
   private final LayoutManager layout;

   private JButton btn0;
   private JButton btn1;
   private JButton btn2;
   private JTextArea ta0;
   private JTextArea ta1;

   public Lab14(){
      super("Add your title here");
      layout = new FlowLayout(0);
      setLayout(layout);
      btn0 = new JButton("Copy");
      btn1 = new JButton("Append");
      btn2 = new JButton("Clear");
      ta0 = new JTextArea("Something goes here",6,20);
      ta1 = new JTextArea("This is the textarea on the right",6,20);
      JPanel panel = new JPanel();
      panel.setLayout( new GridLayout(3,1) );
      panel.add(btn0);
      panel.add(btn1);
      panel.add(btn2);
      add(new JScrollPane(ta0));
      add( panel );
      add(new JScrollPane(ta1));
      btn0.addActionListener(this);
      btn1.addActionListener(this);
      btn2.addActionListener(this);
   }

   public void actionPerformed(ActionEvent event){
      //event.getActionCommand() returns the label of the button
      //event.getSource() returns the button object
      //See sample code below
      String label = event.getActionCommand();
      String txt = null;
      switch( label ) {
         case "Copy": txt = ta0.getText();
                      ta1.setText( txt ); break;
         case "Append": txt = ta1.getText() + "\n" + ta0.getText();
                        ta1.setText( txt ); break;
         case "Clear": ta1.setText( "" );
                       ta0.setText( "" );
      }
   }
   public static void main(String[] args){
      Lab14 lab14 = new Lab14();
      lab14.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      lab14.setSize(450, 350);
      Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
      lab14.setLocation((int)screenSize.getWidth()/3, (int)screenSize.getHeight()/3);
      lab14.setVisible(true);
   }

}
