import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;
public class FileReader extends JFrame implements ActionListener{
   private final LayoutManager layout;

   private JButton btn0;
   private JTextField tf0;
   private JTextArea ta0;
   private JLabel lbl0;

   public FileReader(){
      super("Add your title here");
      layout = new BorderLayout(); // add components with add(component, BorderLayout.CENTER (NORTH, SOUTH, EAST, WEST)
      setLayout(layout);
      JPanel p = new JPanel( new FlowLayout());
      btn0 = new JButton("JButton0");
      tf0 = new JTextField("---------");
      ta0 = new JTextArea("",6,20);
      lbl0 = new JLabel("Enter File Name:");
      p.add( lbl0 );
      p.add( tf0 );
      add( p, BorderLayout.NORTH );
      add(btn0, BorderLayout.SOUTH);
      add(new JScrollPane(ta0),BorderLayout.CENTER);   
      btn0.addActionListener(this);
   }
   
   public void actionPerformed(ActionEvent event) throws RuntimeException{
      //event.getActionCommand() returns the label of the button
      //event.getSource() returns the button object
      //See sample code below
      Scanner scan = null;
      String fileName = tf0.getText();
      if( fileName.substring( fileName.length() - 4 ).equals( ".txt" ) ) {
         scan = new Scanner( getClass().getResourceAsStream( fileName ) );
      }
      else {
         JOptionPane.showMessageDialog( this, "Invalid File Name.","Invalid FIle Name",JOptionPane.INFORMATION_MESSAGE);
         
      }
      ta0.setText( "" );
      while( scan.hasNextLine() ) {
         ta0.append( scan.nextLine() + "\n" );
      }
      scan.close();
   }

   public static void main(String[] args){
      FileReader fileReader = new FileReader();
      fileReader.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      fileReader.setSize(450, 350);
      Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
      fileReader.setLocation((int)screenSize.getWidth()/3, (int)screenSize.getHeight()/3);
      fileReader.setVisible(true);
   }

}
