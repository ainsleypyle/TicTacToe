/**
 * First pass at the TicTacToe game UI
 * note: set the DISPLAY=:0.0 to run on my configuration.                        
 * @summary short description for the file
 * @author Ainsley Pyle
 *
 * Created at     : 2021-09-20 08:50:22 
 * Last modified  : 2023-10-16 19:32:00
 */
//package TicTacToeLab;

//import java.net.InetAddress;

//import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * This is the entry point class for the project.
 * 
 */
public class TicTacToeDemo {
    static TicTacToeFrame game = null;// = new TicTacToeFrame();
    /**
     * the main entry method as required by the JVM to run
     * 
     * @param args an array of string objects that can be passed into the method not
     *             used.
     */
    public static void main(String[] args) {
        /* Use an appropriate Look and Feel */
        try {
            // UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        } catch (InstantiationException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        game = new TicTacToeFrame(true, null);
        game.setVisible(true);
    }
}