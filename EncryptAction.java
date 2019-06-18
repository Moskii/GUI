// Import necessary tools
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

/** My encrypt button will implement the interface ActionListener containing the necessarry methods to click it */
class EncryptAction implements ActionListener {
  // Declare attribute with CaesarGUI attributes
  private CaesarGUI encryptFrame;

  public EncryptAction(CaesarGUI e) {
    this.encryptFrame = e;
  }

  /** Performs the action when the button is pressed.
  * @param event The event is passed through
  */ 
  public void actionPerformed(ActionEvent event) {
    // Instantiate object to have access to Caesar methods.
    Caesar object = new Caesar();

    // Try - catch statement 
    try {
      String final_message = encryptFrame.getMessage(); // Calls the method declared in CaesarGUI
      int final_shift = encryptFrame.getShift();
      String cipher_text = object.rotate(final_message,final_shift); // Using 2 variables above, apply the rotation and store it in cipher_text
      // Displays a pop up message displaying the encrypted message
      JOptionPane.showMessageDialog(null,"Your message: " + final_message + "\n" + "Your Key: " + final_shift + "\n" + "Your Encrypted Message: " + cipher_text, 
      "Encrypted message",JOptionPane.INFORMATION_MESSAGE);
    }
    catch (Exception e) {
      // Exception handling
      JOptionPane.showMessageDialog(null,"Please enter the correct data type for each text field", "Error",JOptionPane.ERROR_MESSAGE); 
    }
  }
}