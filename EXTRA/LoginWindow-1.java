import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class LoginWindow extends JFrame implements ActionListener, AccountSecurity{
	private JLabel labelUser = new JLabel("Username:", JLabel.CENTER);
	private JLabel labelPass = new JLabel("Password:", JLabel.CENTER);
	private JButton buttonLogin = new JButton("LOGIN");
	private JButton buttonCancel = new JButton("CANCEL");
	private JTextField textFieldUser = new JTextField();
	private JTextField textFieldPass = new JTextField();

	public LoginWindow(){
		setTitle("Login Window");
		setLayout(new GridLayout(3, 2));
		
		add(labelUser); add(textFieldUser);
		add(labelPass); add(textFieldPass);
		add(buttonLogin); add(buttonCancel);
		
		setSize(300,150);
		setVisible(true);
		
		buttonLogin.addActionListener(this);
		buttonCancel.addActionListener(this);
	}

	private void messageBox(String message, String title, int event){
		JOptionPane.showMessageDialog(null, message, title, event);
	}

	private boolean isConditionMet(){
		String err = "";
		int i = 1;
		if(isEmptyUser()){
			err+= i + ". Username CAN'T be empty.\n";
			i++;
		}
		if(isEmptyPass()){
			err+= i + ". Password CAN'T be empty.\n";
			i++;			
		}
		if(!isGreater()){
			err+= i + ". Password length MUST be greater than 8.\n";
			i++;			
		}
		if(isUpper()){
			err+= i + ". Password MUST have atleast a single UPPERCASE LETTER.\n";
			i++;			
		}
		if(isLower()){
			err+= i + ". Password MUST have atleast a single LOWERCASE LETTER.\n";
			i++;			
		}
		if(isNumber()){
			err+= i + ". Password MUST have atleast a single NUMERICAL NUMBER.\n";
			i++;			
		}
		if(isSpecial()){
			err+= i + ". Password MUST have atleast a single SPECIAL CHARACTER (e.g. ?-!$^...).\n";
			i++;			
		}
		if(!(err == "")){
			messageBox(err, "Error!", 0);
			return false;
		}
		return true;
	}
	
	@Override
	public boolean isUpper(){
		for(int i = 0; textFieldPass.getText().length() > i; i++){
			if(textFieldPass.getText().charAt(i) >= 65 &&  textFieldPass.getText().charAt(i) <= 90){
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean isLower(){
		for(int i = 0; textFieldPass.getText().length() > i; i++){
			if(textFieldPass.getText().charAt(i) >= 97 &&  textFieldPass.getText().charAt(i) <= 122){
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean isSpecial(){
		for(int i = 0; textFieldPass.getText().length() > i; i++){
			if(
			textFieldPass.getText().charAt(i) >= 32 &&  textFieldPass.getText().charAt(i) <= 47 ||
			textFieldPass.getText().charAt(i) >= 58 &&  textFieldPass.getText().charAt(i) <= 64 ||
			textFieldPass.getText().charAt(i) >= 91 &&  textFieldPass.getText().charAt(i) <= 96 ||
			textFieldPass.getText().charAt(i) >= 123 &&  textFieldPass.getText().charAt(i) <= 126
			){
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean isNumber(){
		for(int i = 0; textFieldPass.getText().length() > i; i++){
			if(textFieldPass.getText().charAt(i) >= 48 &&  textFieldPass.getText().charAt(i) <= 57){
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean isEmptyUser(){
		return textFieldUser.getText().isEmpty();	
	}
	
	@Override
	public boolean isGreater(){
		return textFieldPass.getText().length() >= MINIMUM_CHARACTERS;
	}
	
	@Override
	public boolean isEmptyPass(){
		return textFieldPass.getText().isEmpty();
	}	

	@Override
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == buttonCancel){
			int c = JOptionPane.showConfirmDialog(rootPane, "Are you sure you want to exit?", "Exit", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
			if(c == JOptionPane.OK_OPTION){
				this.dispose();
			}
			return;
		}
		if(e.getSource() == buttonLogin){
			if(isConditionMet()){
				if(textFieldUser.getText().equalsIgnoreCase(DEFAULT_USER) && textFieldPass.getText().equals(DEFAULT_PASS)){
					messageBox("Welcome, " + textFieldUser.getText() + " to the world of Java!", "Login Information", 1);
				} else {
					messageBox("Login Error!", "Login Information", 0);
				}
			}
		}
	}
}