import javax.swing.JFrame;

@SuppressWarnings("serial")
public class P0601JFrame extends JFrame {
	public P0601JFrame () {
		super("Swing Frame Um"); // ajusta t�tulo
		// ajusta posi��o e tamanho da janela
		setBounds(50, 50, 250, 100);
		// ajusta a��o fechar
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main (String a[]) {
		new P0601JFrame().setVisible(true); // In�cio simplificado
	}
}
