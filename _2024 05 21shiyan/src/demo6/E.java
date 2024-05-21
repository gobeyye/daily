package demo6;

//import demo4.ComputerFrame;

//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionListener;
/////////////////////////////////////////////////////////////////////////////////here
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-21
 * Time: 15:58
 */
public class E {
    public static void main(String[] args) {
        ComputerFrame fr = new ComputerFrame();
    }

}
class ComputerFrame extends JFrame implements ActionListener {
    JTextField text1,text2,text3;
    JButton buttonAdd,buttonSub,buttonMul,buttonDiv;
    JLabel label;

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public ComputerFrame(){
        setLayout(new FlowLayout());
        text1 = new JTextField(10);
        text2 = new JTextField(10);
    }
}
