
import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {

        AdivinhadorGUI agui = new AdivinhadorGUI();
        agui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        System.out.println(agui.getAh().getAdvinhador().getGerador().getNum());
    }
}
