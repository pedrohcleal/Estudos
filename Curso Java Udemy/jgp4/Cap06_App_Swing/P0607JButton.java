import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

@SuppressWarnings("serial")
public class P0607JButton extends JFrame implements ActionListener {
	private JLabel label1;
	private JButton button1;
	// contador de clicks
	private int count=0;
	private final String msg = "N�mero de clicks: ";

	public P0607JButton () {
		setTitle("Swing Button"); // ajusta t�tulo
		Container cp = getContentPane(); // painel de conte�do
		cp.setLayout(new FlowLayout()); // ajusta layout FlowLayout
		cp.setBackground(Color.orange); // ajusta cor de fundo

		// instancia��o e adi��o
		cp.add(button1 = new JButton("Bot�o Swing"));
		cp.add(label1 = new JLabel(msg + count));
		// listener que registra este objeto
		button1.addActionListener(this);
		button1.setMnemonic('S'); // tecla de atalho
		button1.setToolTipText("Clique aqui para contar."); // dica

		setSize(300, 75);
		// a��o fechar
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed (ActionEvent e) { // a��o do bot�o
		++count;
		label1.setText(msg + count);
	}

	public static void main (String a[]) {
		SwingUtilities.invokeLater( // express�o lambda
			() -> { new P0607JButton ().setVisible(true); }
		);
	}

}
