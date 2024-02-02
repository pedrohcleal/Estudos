import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

@SuppressWarnings("serial")
public class P0603JFrame extends JFrame {
	public P0603JFrame () {
		super("Swing Frame Dois"); // ajusta t�tulo
		// ajusta posi��o e tamanho
		setBounds(50, 50, 250, 90);
		// tamanho n�o poder� ser mudado pelo usu�rio
		setResizable(false); 
		// a��o Fechar
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// conte�do
		add(new JLabel("Janela"));
	}

	public static void main (String a[]) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				// cria janela principal
				P0603JFrame principal = new P0603JFrame ();
				// exibe janela principal
				principal.setVisible(true);
				// cria di�logo
				P0602JDialog dialogo = new P0602JDialog (principal, true);
				// exibe di�logo
				dialogo.setVisible(true);
			}
		});
	}
}
