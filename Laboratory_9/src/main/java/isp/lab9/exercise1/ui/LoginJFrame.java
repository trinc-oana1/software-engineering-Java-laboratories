package isp.lab9.exercise1.ui;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

/**
 * @author mihai.hulea
 * @author radu.miron
 */
public class LoginJFrame extends JFrame {
    public static final Map<String, String> accounts = new HashMap<>();

    public LoginJFrame() {
        //setup the window
        this.setTitle("Login");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setBounds(200, 200, 300, 200);

        //create and add components
        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(20, 20, 100, 20);
        this.add(userLabel);

        JTextField userInputField = new JTextField();
        userInputField.setBounds(160, 20, 100, 20);
        this.add(userInputField);

        JLabel pwdLabel = new JLabel("Password:");
        pwdLabel.setBounds(20, 60, 100, 20);
        this.add(pwdLabel);

        JPasswordField pwdInputField = new JPasswordField();
        pwdInputField.setBounds(160, 60, 100, 20);
        this.add(pwdInputField);

        JButton button = new JButton("Login");
        button.setBounds(20, 100, 240, 20);
        this.add(button);

        // add event listener to button
        button.addActionListener(e -> verifyCredentials(userInputField, pwdInputField));

        //initialize accounts
        initAccounts();

        //display
        this.setVisible(true);
    }

    private void verifyCredentials(JTextField userInputField, JPasswordField pwdInputField) {
        boolean ok = false;
        String username = userInputField.getText();
        String password = pwdInputField.getText();
        for(String user:accounts.keySet())
        {
            if(username.equals(user)&& password.equals(accounts.get(user)))
                ok = true;
            if(ok){
                this.setVisible(false);
                new StockMarketJFrame();
            }
            else
            {
                LoginJFrame.this.setVisible(false);
                JFrame x = new JFrame("Login failed");
                JDialog dialog = new JDialog(x, "Login failed", true);
                JTextField text = new JTextField("Incorrect username/password");
                text.setHorizontalAlignment(JTextField.CENTER);
                dialog.add(text);
                dialog.setBounds(200, 200, 300, 200);
                dialog.setVisible(true);
            }
        }


        // todo: implement the login by checking the credentials
        //  show an error message (in a JDialog) in case of bad credentials
    }

    private void initAccounts() {
        accounts.put("user1", "password1");
        accounts.put("test", "1234");
    }
}
