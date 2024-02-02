import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

@SuppressWarnings("serial")
public class P0605JLabel extends JFrame {
	public P0605JLabel () {
		// ajusta t�tulo
		super("Swing Labels"); 
		// ajusta posi��o e tamanho
		setSize(400, 100); 
		// ajusta layout GridLayout e adiciona componentes
		setLayout(new GridLayout(2,2)); 
		add(new JLabel("R�tulo � Esquerda"));
		add(new JLabel("R�tulo � Direita", JLabel.RIGHT));
		add(new JLabel("R�tulo Centralizado", JLabel.CENTER));
		add(new JLabel("<html><font color=#FF0000>Swing</font>" +
			" � <i>diferente</i>!</html>"));
		// a��o fechar
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	}
	
	public static void main (String a[]) {
		SwingUtilities.invokeLater( // express�o lambda
			() -> { new P0605JLabel ().setVisible(true); }
		);
	}
}
