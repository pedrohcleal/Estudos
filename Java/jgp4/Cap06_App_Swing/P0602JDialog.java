import java.awt.Frame;
import javax.swing.JDialog;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class P0602JDialog extends JDialog {

	public P0602JDialog (Frame resp, boolean modal) {
		// ajusta respons�vel, t�tulo e opera��o modal
		super(resp, "Swing Dialog", modal);
		setSize(250, 90); // ajusta tamanho
		// ajusta posi��o em rela��o a janela respons�vel
		setLocation(resp.getX() + getWidth() + 10, resp.getY());
		// conte�do
		add(new JLabel("Dialogo")); 
	}
}
