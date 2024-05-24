package shiyan1;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-24
 * Time: 13:16
 */
class Windom extends JFrame implements ActionListener{
     Lader lader;
     JTextField textAbove,textBottom,textHeight;
     JTextArea showArea;
     JButton controlButton;
     Windom(){
         init();
         setVisible(true);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }
     void init(){
         lader = new Lader();
         textAbove = new JTextField(5);
         textBottom = new JTextField(5);
         textHeight = new JTextField(5);
         showArea = new JTextArea();
         controlButton = new JButton("计算面积");
         JPanel pNorth = new JPanel();
         pNorth.add(new JLabel("上底："));
         pNorth.add(textAbove);
         pNorth.add(new JLabel("下底："));
         pNorth.add(textBottom);
         pNorth.add(new JLabel("高"));
         pNorth.add(textHeight);
         pNorth.add(controlButton);
         controlButton.addActionListener(this);
         add(pNorth,BorderLayout.NORTH);
         add(new JScrollPane(showArea),BorderLayout.CENTER);
     }
     public void actionPerformed(ActionEvent e){
         try{
             double above = Double.parseDouble(textAbove.getText().trim());
             double bottom = Double.parseDouble(textBottom.getText().trim());
             double height = Double.parseDouble(textHeight.getText().trim());
             lader.setAbove(above);
             lader.setBottom(bottom);
             lader.setHeight(height);
             double area = lader.getArea();
         }catch(Exception ex){
             showArea.append("\n" + ex + "\n");
         }
     }

}
class Lader{
    double above,bottom,height;
    public double getArea(){
        double area = (above + bottom) * height / 2.0;
        return area;
    }
    public void setAbove(double a){
        above = a;
    }
    public void setBottom(double b){
        bottom = b;
    }
    public void setHeight(double e){
        height = e;
    }
}
public class E {
    public static void main(String[] args) {
        Window win = new Windom();
        win.setBounds(100,100,420,260);

    }
}
