import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

class Decipher implements ActionListener {
  private DecipherGUI decipher;

  public Decipher(DecipherGUI d) {
    this.decipher = d;
  }

  /** Performs the action when the button is pressed.
  * @param event The event is passed through
  */ 
  public void actionPerformed(ActionEvent event) {
    Caesar object = new Caesar();

    try {
      String crypto_text = decipher.getMessage();
      String plain_text = object.decipher(crypto_text);
      JOptionPane.showMessageDialog(null,"The crypto text: " + crypto_text + "\n" + "The Original Message: " + plain_text, 
      "Decrypting message",JOptionPane.INFORMATION_MESSAGE);
    }
    catch (Exception e) {
      JOptionPane.showMessageDialog(null,"Please enter the correct (Something) data type in the text field", "Error",JOptionPane.ERROR_MESSAGE); 
    }
  }
}