
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*
    This program still has no tic tac toe Win Check
 */

/**
 *
 * @author 
 */


public class TicTacToe extends JFrame implements ActionListener{
    private static final JButton[] TICTAC_BTN = new JButton[9];
    private static final JLabel TICTACT_LBL = new JLabel("Player One's", JLabel.CENTER);
    private boolean playerTurn = true;
    public TicTacToe(){
        super("Tic-Tac-Toe");
        setLayout(new GridLayout(4,3));
        
        for(int i=0; i<TICTAC_BTN.length; i++){
            TICTAC_BTN[i] = new JButton("");
            add(TICTAC_BTN[i]);
            TICTAC_BTN[i].addActionListener(this);
        }
        
        add(TICTACT_LBL);
        add(new JLabel("Turn"));
    }
    
    public static void main(String args[]){
        TicTacToe x = new TicTacToe();
        x.setSize(300,300);
        x.setDefaultCloseOperation(EXIT_ON_CLOSE);
        x.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        for(int i=0; i<TICTAC_BTN.length;i++){
            System.out.println(ae.getSource() == TICTAC_BTN[i]);
            if(ae.getSource() == TICTAC_BTN[i]){
                if(!TICTAC_BTN[i].getText().isEmpty())
                    return;
                
                if(playerTurn)
                    TICTAC_BTN[i].setText("X");
                else{
                    TICTAC_BTN[i].setText("O");
                }
            }
        }
        
        playerTurn = !playerTurn;
        if(playerTurn)
            TICTACT_LBL.setText("Player One's");
        else{
            TICTACT_LBL.setText("Player Two's");
        }
    }
}
