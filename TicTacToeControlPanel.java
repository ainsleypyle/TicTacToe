//package TicTacToeLab;

import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.*;

public class TicTacToeControlPanel extends JPanel {
    private JButton m_okButton;
    private JButton m_cancelButton;
    private TicTacToeFrame m_parent;

    public TicTacToeControlPanel (TicTacToeFrame parent) {
        m_parent = parent;
        m_okButton = new JButton("Ok");
        m_okButton.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent evnt) {
                //set the replay
                m_parent.tPanel.resetBoard();
            }
        });
        add(m_okButton);
        m_cancelButton = new JButton("Cancel");
        m_cancelButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evnt) {
                //set the end...
                System.exit(-1);
            }
        });
        add(m_cancelButton);
    }
    
}
