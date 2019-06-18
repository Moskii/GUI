// import necessary tools
import javax.swing.* ;
import java.awt.*;
import javax.swing.JOptionPane;

/** The class CaesarGUI extends to JFrame to have access to the widgets and componenets.
* @return A GUI with declared components.
*/
// Extension of JFrame. Full control of placing components 
public class CaesarGUI extends JFrame{
  
  // Declaring attributes to store widgets. This includes Labels,Textboxes and buttons
  private JLabel title;
  private JLabel messageLabel;
  private JTextField message;
  private JLabel messageLabel2;
  private JTextField key_Message;
  private JButton encryptButton;
  private JButton decryptButton;

  /** Layout of the JFrame. Disabled default layout to allow absolute positioning. */
  // Forming layout of frame.
  public CaesarGUI() {
    setLayout(null); // Disable the default layout to allow full customization.

    // Label instance
    title = new JLabel("Encrpytion Software!");
    messageLabel = new JLabel("Enter Message: ");
    messageLabel2 = new JLabel("Enter Key|Shift: ");

    // Button instance
    encryptButton = new JButton("Encrypt");
    encryptButton.setToolTipText("Press to Encrypt"); // Display text when hovering 
    EncryptAction e = new EncryptAction(this); // Performs an action when the button is pressed.
    encryptButton.addActionListener(e);
    encryptButton.setEnabled(true); // Enables the button.

    // Button instance
    decryptButton = new JButton("Decrypt");
    decryptButton.setToolTipText("Press to Decrypt");
    DecryptAction d = new DecryptAction(this); // Performs an action when the button is pressed. First instantiate it to a event handler
    decryptButton.addActionListener(d);
    decryptButton.setEnabled(true);

    // Textfields instance
    key_Message = new JTextField(100);
    key_Message.setToolTipText("Enter Key here");
    message = new JTextField(100);
    message.setToolTipText("Enter message here");

    // Add all the components declared into the frame
    add(decryptButton);
    add(encryptButton);
    add(key_Message);
    add(title);
    add(messageLabel);
    add(message);
    add(messageLabel2);

    // Set the size of each components and place it on the frame
    decryptButton.setBounds(275,215,85,30);
    encryptButton.setBounds(80,215,85,30);
    key_Message.setBounds(75,165,300,35);
    messageLabel2.setBounds(50,125,300,50);
    title.setBounds(175,15,300,50);
    messageLabel.setBounds(50,50,300,50);
    message.setBounds(75,95,300,35);
  }

  /** Method to recieve user input from the textboxes
  * @return A string
  */
  // Method to get user input
  public String getMessage() {
      return new String(message.getText());
  }

  /** Method to recieve user input from the textboxes
  * @return An integer
  */
  // Method to get user input
  public int getShift() {
    int shift = Integer.parseInt(key_Message.getText());
    return shift;
  }

  /** Main method which forms the frame using all the componenets declared above */
  // Form the JFrame
  public static void main(String[] args) {
    CaesarGUI caesarFrame = new CaesarGUI();
    caesarFrame.setTitle("Caesar Encoder / Decoder");
    caesarFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    caesarFrame.setBounds(0,0,500,400);
    caesarFrame.setVisible(true);
  }
}