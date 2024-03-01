import java.awt.Color;
import java.awt.GridLayout;

import java.io.File;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

@SuppressWarnings("serial")
public class P0621JFileChooser extends JFrame {
	private JButton bDialogo; // bot�o p/ acionar di�logo
	private JLabel lRes; // r�tulo p/ resultados
	private JFileChooser dialogo; // di�logo de arquivos
	
	public P0621JFileChooser () {
		super("SwingFileDialog"); // ajusta t�tulo
		setLayout(new GridLayout(2, 1)); // layout grade 4x1
		
		add(bDialogo = new JButton("Selecionar Arquivo"));
		add(lRes = new JLabel("Sem sele��o"));
		lRes.setBorder(BorderFactory.
				createMatteBorder(2, 2, 3, 2, Color.green));
		bDialogo.addActionListener((e) -> { // express�o lambda
			dialogo = new JFileChooser(); // instancia di�logo
			/*
			FileNameExtensionFilter filtro1 = new FileNameExtensionFilter("C�digo fonte C/C++", "c", "cpp");
			FileNameExtensionFilter filtro2 = new FileNameExtensionFilter("C�digo fonte Java", "java");
			dialogo.addChoosableFileFilter(filtro1);
			dialogo.addChoosableFileFilter(filtro2);
			*/ 
			int res = dialogo.showOpenDialog(P0621JFileChooser.this);
			// verifica se usu�rio fez sele��o
			if (res == JFileChooser.APPROVE_OPTION) { 
				File arq = dialogo.getSelectedFile();
				lRes.setText(arq.getName());
			}
		});
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400, 90); // ajusta tamanho da janela
	}
	public static void main (String[] args) {
		SwingUtilities.invokeLater(
			() -> { new P0621JFileChooser().setVisible(true); }
		);
	}
}
