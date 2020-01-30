
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 */
public class ChatBotWindow extends ChatBotLogic {
    private static final JFrame BOT_FRAME = new JFrame();
    private static final JTextField TEXTFIELD_QUESTION = new JTextField();  
    private static final JButton BUTTON_ASK = new JButton("ASK ME");
    private static final File FPATH = new File("ChatBot.db");
    private static ChatBot obj = null;
    
    public void initializeGUI(){
        BOT_FRAME.setTitle("ChatBot");
        BOT_FRAME.setSize(300, 100);
        BOT_FRAME.setLayout(new GridLayout(2,1));
        
        BOT_FRAME.add(TEXTFIELD_QUESTION);
        BOT_FRAME.add(BUTTON_ASK);
        
        TEXTFIELD_QUESTION.addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e) { }

            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_ENTER)
                    BUTTON_ASK.doClick();
            }

            @Override
            public void keyReleased(KeyEvent e) { }
            
        });
        
        BUTTON_ASK.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList <String> ans = null;
                if(obj.questionsDB.containsKey(TEXTFIELD_QUESTION.getText().toUpperCase())){
                    Random r = new Random();
                    ans = obj.questionsDB.get(TEXTFIELD_QUESTION.getText().toUpperCase());
                    int n = r.nextInt(ans.size());
                    JOptionPane.showMessageDialog(BOT_FRAME, 
                            obj.questionsDB.get(TEXTFIELD_QUESTION.getText().toUpperCase()).get(n), 
                            "Respond", JOptionPane.INFORMATION_MESSAGE);
                }else if(TEXTFIELD_QUESTION.getText().isEmpty()){
                    JOptionPane.showMessageDialog(BOT_FRAME, "The question can't be empty", "Warning", JOptionPane.WARNING_MESSAGE);
                } else {
                    int c = (JOptionPane.showConfirmDialog(
                            BOT_FRAME, 
                            "I don't know what to say. Would you like me to learn that?", 
                            "Responding", 
                            JOptionPane.YES_NO_OPTION, 
                            JOptionPane.INFORMATION_MESSAGE));
                    if(c == JOptionPane.YES_OPTION){
                        String message = JOptionPane.showInputDialog(
                                BOT_FRAME, 
                                "Answer:", 
                                "Teach Me That", 
                                JOptionPane.QUESTION_MESSAGE);
                        if(message.isEmpty()){
                            JOptionPane.showMessageDialog(
                                    BOT_FRAME, 
                                    "You didn't teach me the answer", 
                                    "Respond", 
                                    JOptionPane.WARNING_MESSAGE);
                        }else{
                            ans = new ArrayList();
                            ans.add(message);
                            JOptionPane.showMessageDialog(BOT_FRAME, 
                                    "Thank you for teaching me", 
                                    "Just saying", 
                                    JOptionPane.INFORMATION_MESSAGE);
                            obj.questionsDB.put(TEXTFIELD_QUESTION.getText().toUpperCase(), ans);
                            serializeObject(FPATH, obj);
                        }
                    }
                }
           }
        });        
        
        BOT_FRAME.setLocationRelativeTo(null);
        BOT_FRAME.setVisible(true);
        BOT_FRAME.setResizable(false);
        BOT_FRAME.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    
    public void initializeBackEnd(){
        if((obj = super.loadFile(FPATH)) == null){
            obj = new ChatBot();
            obj.questionsDB = new HashMap();
            ArrayList<String> list = new ArrayList();
            list.add("Hi");
            list.add("Hello");
            list.add("Yow!");
            list.add("How's going?");
            obj.questionsDB.put("HI", list);
            list = new ArrayList();
            list.add("Pow pow pow pow");
            list.add("Happy happy happy yow");
            obj.questionsDB.put("WHAT DOES THE FOX SAY?", list);
            super.serializeObject(FPATH, obj);
        } else {
            obj = super.deserializeObject(FPATH, obj);
        }
    }
    
}
