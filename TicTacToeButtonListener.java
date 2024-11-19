/**
 * Tic Tac Toe listener
 * @author Ainsley Pyle
 *
 * Created at     : 2023-10-16 19:31:12 
 * Last modified  : 2023-10-16 19:31:45
 */



import java.awt.event.*;

public class TicTacToeButtonListener implements ActionListener {
    public static boolean imgChoice =true;

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        TicTacToeButton tButton= (TicTacToeButton) e.getSource();
        tButton.getParent().setActionPerformed(tButton.btnIDx,tButton.btnIDy, imgChoice);
        imgChoice=  ! imgChoice;
        
    }
    
}
