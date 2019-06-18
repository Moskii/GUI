// Import necessary tools
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

class DecryptAction implements ActionListener {
  // Declare attribute with CaesarGUI attributes
  private CaesarGUI decryptFrame;

  public DecryptAction(CaesarGUI d) {
    this.decryptFrame = d;
  }
  
  /** Performs the action when the button is pressed.
  * @param event The event is passed through
  */ 
  public void actionPerformed(ActionEvent event) {
    // Instantiate object to have access to Caesar methods.
    Caesar object = new Caesar();

    try {
      String cipher_message = decryptFrame.getMessage();
      int key = decryptFrame.getShift();
      int invKey = -key;
      String plain_text = object.rotate(cipher_message, invKey);
      JOptionPane.showMessageDialog(null,"Cipher message: " + cipher_message + "\n" + "Your key: " + key + "\n" + "So the Inverse key is: " + invKey + "\n" +
      "Your Original Message: " + plain_text, 
      "Decrypting message",JOptionPane.INFORMATION_MESSAGE);
    }
    catch (Exception e) {
      JOptionPane.showMessageDialog(null,"Please enter the correct data type for each text field", "Error",JOptionPane.ERROR_MESSAGE); 
    }
  }
}