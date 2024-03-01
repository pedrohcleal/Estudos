import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JWindow;

@SuppressWarnings("serial")
public class P0604JWindow extends JWindow {
	public P0604JWindow () {
		// ajusta posi��o
		setLocation(150, 150);
		JLabel label = new JLabel("<HTML><U>Fechar</U></HTML>", JLabel.RIGHT);
		label.addMouseListener(new MouseAdapter() { // classe an�nima
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0); // fecha aplica��o
		}	}	);
		add("North", label);
		add("Center", new JLabel(new ImageIcon("./img/JGP.png")));
		pack();
	}
	public static void main (String a[]) {
		// in�cio simplificado
		new P0604JWindow ().setVisible(true);
	}
}
