import javax.swing.*;
import java.awt.*;

public class Button extends JButton{
  private int width;
  private Dimension buttonSize;

  public Button(int setWidth, Color theColor){
    this.getWidth(setWidth);
    this.getColor(theColor);
  }

  public void getWidth(int setWidth){
    this.width = setWidth;
    this.buttonSize = new Dimension(this.width, this.width);
    this.setPreferredSize(buttonSize);
    this.setOpaque(true);
  }

  public void getColor(Color theColor){
    this.setBorder(BorderFactory.createLineBorder(theColor.darker(), 2));
  }

}