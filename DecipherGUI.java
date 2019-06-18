// Import Jframe tools
import javax.swing.*;
import java.awt.*;
import javax.swing.JOptionPane;

/** The class DecipherGUI extends to JFrame to have access to the widgets and componenets.
* @return A GUI with declared components.
*/
public class DecipherGUI extends JFrame {
  // Declare attributes
  private JLabel title2;
  private JLabel cryptoMessageLabel;
  private JTextField cryptoMessage;
  private JButton decrypt;

  /** Layout of the JFrame. Disabled default layout to allow absolute positioning. */
  // Custom JFrame
  public DecipherGUI() {
    setLayout(null);

    title2 = new JLabel("Decryption Software!");

    decrypt = new JButton("Decrypt");
    decrypt.setToolTipText("Press to Decrypt");
    Decipher d = new Decipher(this); // Performs an action when the button is pressed. First instantiate it to a event handler
    decrypt.addActionListener(d);
    decrypt.setEnabled(true);

    cryptoMessageLabel = new JLabel("Enter Crypto Message: ");

    cryptoMessage = new JTextField(100);
    cryptoMessage.setToolTipText("Enter message here");

    // Add components to the frame
    add(decrypt);
    add(title2);
    add(cryptoMessageLabel);
    add(cryptoMessage);

    // Set the sizes and position
    decrypt.setBounds(175,135,85,30);
    title2.setBounds(175,15,300,50);
    cryptoMessageLabel.setBounds(50,50,300,50);
    cryptoMessage.setBounds(75,95,300,35);
  }

  /** Method to recieve user input from the textboxes
  * @return A string
  */
  public String getMessage() {
    return new String(cryptoMessage.getText());
  }

  /** Main method which forms the frame using all the componenets declared above */
  public static void main(String[] args) {
    DecipherGUI caesarFrame = new DecipherGUI();
    caesarFrame.setTitle("Decipher");
    caesarFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    caesarFrame.setBounds(0,0,500,400);
    caesarFrame.setVisible(true);
  }
}