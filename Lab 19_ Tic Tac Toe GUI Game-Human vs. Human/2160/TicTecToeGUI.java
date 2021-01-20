import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class TicTecToeGUI extends JFrame implements ActionListener{
   private final LayoutManager layout;

   private JButton[] btns;

   public TicTecToeGUI(){
      super("Add your title here");
      layout = new GridLayout(3, 3);
      setLayout(layout);
      btns = new JButton[9];
      for(int i=0;  i<btns.length; i++){
         btns[i]=new JButton(" W ");
         add(btns[i]);
         btns[i].addActionListener(this);
      }
      
   }

   public void actionPerformed(ActionEvent event){
      //event.getActionCommand() returns the label of the button
      //event.getSource() returns the button object
      //See sample code below
      //if there is winner, stop the game, how to do it?? think about it.
      String tmp=event.getActionCommand().trim();
      if(tmp.equals("X") || tmp.equals("O")){
           JOptionPane.showMessageDialog(this,"This spot have bee occupied, try another spot.","Demo",JOptionPane.INFORMATION_MESSAGE);
           return;
      }
      JButton btn = (JButton)event.getSource();
      //can you replace following multiple lines with single line?
      if(btn==btns[0]){ // this is the first one with index of 0
         btn.setText(whoseTurn(get1DBoard())); //simply use the whoseTurn ,thod you did for hw5?? TicTecToe game
      }else if(btn==btns[1]){// second one with index of 1
         btn.setText( whoseTurn(get1DBoard()) ); 
      }else if(btn==btns[2]) {
         btn.setText( whoseTurn(get1DBoard()) );
      }else if(btn==btns[3]) {
         btn.setText( whoseTurn(get1DBoard()) );
      }else if(btn==btns[4]) {
         btn.setText( whoseTurn(get1DBoard()) );
      }else if(btn==btns[5]) {
         btn.setText( whoseTurn(get1DBoard()) );
      }else if(btn==btns[6]) {
         btn.setText( whoseTurn(get1DBoard()) );
      }else if(btn==btns[7]) {
         btn.setText( whoseTurn(get1DBoard()) );
      }else if(btn==btns[8]) {
         btn.setText( whoseTurn(get1DBoard()) );
      }
      
      // the above lines can be replaced with the following single line, please think about your self, I expect you spendt 10 minutes to study why
      //((JButton)(event.getSource())).setText(whoseTurn());
      //check winner,
      if(winner(get1DBoard()) != null){
         JOptionPane.showMessageDialog(this,"Winner: " + getWinnerSymbol(),"Done",JOptionPane.INFORMATION_MESSAGE);
      }
   }
   private String get1DBoard(){// call this method in winner and whoseTurn  
      String tmp="";
      for(int i=0; i<btns.length; i++){
         tmp += btns[i].getText();
      }
      
      return tmp;
   }
   public static void main(String[] args){
      TicTecToeGUI ticTecToeGUI = new TicTecToeGUI();
      ticTecToeGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      ticTecToeGUI.setSize(450, 350);
      Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
      ticTecToeGUI.setLocation((int)screenSize.getWidth()/3, (int)screenSize.getHeight()/3);
      ticTecToeGUI.setVisible(true);
   }
   public static String whoseTurn(String board){
      int x=0, o=0;
      for(int i=0; i<board.length(); i++)
         switch(board.charAt(i)){
            case 'X': x++; break;
            case 'O': o++;
         }
      if(x+o==9) return null;
      if(x>o){
         return "O";
       }else{
          return "X";
       }
   }
   public String getWinnerSymbol() {
      if( whoseTurn(get1DBoard()).equals("X") ) return "O";
      return "X";
   }
   public static String winner(String board){
      String[] lookup=new String[8];
      for(int i=0; i<3; i++)//rows
         lookup[i]=board.substring(i*3,i*3+3);
      for(int i=0; i<3; i++)//col
         lookup[i+3]=""+board.charAt(i)+board.charAt(i+3)+board.charAt(i+6);
      lookup[6]=""+board.charAt(0)+board.charAt(4)+board.charAt(8);
      lookup[7]=""+board.charAt(2)+board.charAt(4)+board.charAt(6);
      for(int i=0; i<lookup.length; i++)
         if(lookup[i].equals("XXX") || lookup[i].equals("OOO"))
            return lookup[i].substring(0,1);
      return null;
   }
}
