import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

@SuppressWarnings("serial")
public class P0606JLabel extends JFrame {
	public P0606JLabel () {
		// ajusta t�tulo
		super("Swing Labels com �cones"); 
		// posi��o e tamanho da janela
		setSize(300, 100); 
		// ajusta layout GridLayout
		setLayout(new GridLayout(2,2)); 

		// adiciona r�tulos
		add(new JLabel("Sem �cone"));
		String imgDir = "C:/JGP4/Cap06_SwingComp/img/";
		add(new JLabel(new ImageIcon(imgDir + "new16.gif"))); // centralizado
		add(new JLabel(new ImageIcon(imgDir + "print16.gif"), JLabel.LEFT));
		add(new JLabel("Ajuda", new ImageIcon(imgDir + "help16.gif"), JLabel.RIGHT));

		// a��o fechar
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	}

	public static void main (String a[]) {
		SwingUtilities.invokeLater( // express�o lambda
			() -> { new P0606JLabel ().setVisible(true); }
		);
	}
}
