
import java.io.File;

import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

@SuppressWarnings("serial")
public class P0613JSplitPane extends JFrame
		implements ListSelectionListener {
	private File corrente, dir[]; // array com info arquivos
	private JList<String> listaDir; // caixa de lista p/ info diret�rio
	private JTextArea taInfo; // �rea de texto p/ info arquivo

	public P0613JSplitPane () {
		super("Swing SplitPane"); // ajusta t�tulo
		// aponta diret�rio atual
		corrente = new File(".");
		// lista arquivos do diret�rio atual
		dir = corrente.listFiles();
		String dirInfo[] = new String[dir.length];
		for (int i=0; i<dir.length; i++)
			dirInfo[i] = (dir[i].isDirectory()? "[D]" : "[F]")
				+ dir[i].getName();

		// painel de divis�o
		JSplitPane split = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,
			new JScrollPane(listaDir = new JList<>(dirInfo)), // diret�rio
			new JScrollPane(taInfo = new JTextArea())); // �rea de texto
		// adiciona painel de divis�o a janela
		getContentPane().add(split, "Center");

		// outros ajustes
		split.setResizeWeight(0.5);
		split.setDividerLocation(0.5);
		split.setOneTouchExpandable(true);
		listaDir.addListSelectionListener(this);

		// dimensiona janela
		setSize(500,175);
		// a��o fechar
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	// classe implementa listener
	@Override
	public void valueChanged (ListSelectionEvent e) {
		int i = listaDir.getSelectedIndex();
		if (i==-1) return;
		StringBuffer sb = new StringBuffer("Nome: "+ dir[i].getName() + "\n");
		// exibe informa��es do arquivo: caminho, caminho absolute,
		// atributos, data de modifica��o e tamanho.
		sb.append("Path: "+ dir[i].getPath() + "\n");
		sb.append("Abs Path: "+ dir[i].getAbsolutePath() + "\n");
		sb.append("Diret�rio: "+ dir[i].isDirectory() + "\n");
		sb.append("Arquivo: "+ dir[i].isFile() + "\n");
		sb.append("Oculto: "+ dir[i].isHidden() + "\n");
		sb.append("LastModif: " + new Date(dir[i].lastModified()).toString()+"\n");
		sb.append("Tamanho: "+ dir[i].length() + "\n");
		taInfo.setText(sb.toString());
		taInfo.setCaretPosition(0); // reposiciona cursor no in�cio
	}

	public static void main(String args[]) {
		SwingUtilities.invokeLater( // express�o lambda
			() -> { new P0613JSplitPane().setVisible(true); }
		);
	}
}

