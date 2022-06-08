import javax.swing.*;
import java.awt.*;

public class GameTile{

  Button button1;
  Button button2;
  Button button3;
  Button button4;

  public GameTile(){
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();

    ButtonConstructor(panel);

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);

    panel.setLayout(new FlowLayout());

    frame.add(panel);
  }

  public void ButtonConstructor(JPanel thePanel){
    button1 = new Button(100, Color.GREEN);
    button2 = new Button(100, Color.BLUE);
    button3 = new Button(100, Color.RED);
    button4 = new Button(100, Color.YELLOW);
    
    button1.getActionListener();
    button2.getActionListener();
    button3.getActionListener();
    button4.getActionListener();

    thePanel.add(button1);
    thePanel.add(button2);
    thePanel.add(button3);
    thePanel.add(button4);
    
  }

  public static void main(String[] args){
    new GameTile();
  }

}
