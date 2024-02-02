import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingUtilities;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

@SuppressWarnings("serial")
public class P0625JSpinner extends JFrame implements ChangeListener {
	private JLabel lAlvo = new JLabel("PeterJandlJr2020"); // r�tulo
	private JSpinner spFSize = new JSpinner(); // spinner
	private SpinnerNumberModel snm; // modelo num�rico para spinner

	public P0625JSpinner () {
		super("Swing JSpinner"); // ajusta t�tulo
		add("Center", new JScrollPane(lAlvo));

		// cria modelo para JSpinner com tamanho do fonte do r�tulo
		snm = new SpinnerNumberModel(lAlvo.getFont().getSize(),6,72,2);
		spFSize.setModel(snm); // ajusta modelo do spinner
		spFSize.addChangeListener(this); // registra listener

		// painel auxiliar
		JPanel pAux = new JPanel();
		pAux.add(new JLabel("Tamanho do Fonte"));
		pAux.add(spFSize);
		add("South", pAux);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // a��o fechar
		setSize(300, 130); // dimensiona janela
	}

	@Override
	public void stateChanged (ChangeEvent e) {
		Font f = lAlvo.getFont(); // obt�m fonte do r�tulo
		float valor = snm.getNumber().floatValue(); // obt�m valor do spinner
		lAlvo.setFont(f.deriveFont(valor)); // ajusta fonte do label com outro derivado
		lAlvo.validate(); // valida exibi��o
	}

	public static void main(String a[]) {
		SwingUtilities.invokeLater(
			() -> { new P0625JSpinner().setVisible(true); }
		);
	}
}

