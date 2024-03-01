import java.awt.GridLayout;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

@SuppressWarnings("serial")
public class P0615JList extends JFrame
			implements ItemListener, ListSelectionListener {
	private String opcoes[] = {"Simples","Intervalo","M�ltipla"};
	private String elem[] = {"Um","Dois","Tr�s","Quatro","Cinco","Seis","Sete"};
	private JRadioButton rb[] = new JRadioButton[3];
	// cria lista com elementos
	private JList<String> lista = new JList<>(elem);
	private JLabel lSel;

	public P0615JList () {
		setTitle("Swing List"); // ajusta t�tulo
		JPanel pRadio = new JPanel(new GridLayout(1, 3));
		ButtonGroup bg = new ButtonGroup(); // grupo de radiobuttons
		for (int i=0; i<3; i++) { // cria e agrupa radiobuttons
			pRadio.add(rb[i] = new JRadioButton(opcoes[i]));
			rb[i].addItemListener(this);  bg.add(rb[i]);
		}
		
		// adiciona componentes nas regi�es
		add(pRadio, "North");
		add(new JScrollPane(lista), "Center");
		add(lSel=new JLabel("Sem Sele��o"),"South");
		
		// listener para lista
		lista.addListSelectionListener(this);
		// seleciona modo default
		rb[0].setSelected(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // a��o fechar
		pack(); // autodimensiona janela
	}

	@Override
	public void itemStateChanged (ItemEvent e) {
		if (e.getSource()==rb[0]) { // ajusta modo de sele��oo
			lista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		} else if (e.getSource()==rb[1]) {
			lista.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		} else {
			lista.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		}
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		int itens[] = lista.getSelectedIndices(); // obt�m sele��o
		if (itens.length>0) { // verifica selecao
			StringBuffer sb = new StringBuffer();
			// cria lista com sele��o
			for (int i=0; i<itens.length-1; i++) {
				sb.append(itens[i]);
				sb.append(",");
			}
			sb.append(itens[itens.length-1]);
			lSel.setText("Sele��o: "+ sb.toString());
		} else {
			lSel.setText("Sem Sele��o");
		}
	}

	public static void main (String args[]) {
		SwingUtilities.invokeLater(// express�o lambda
			() -> { new P0615JList().setVisible(true); }
		);
	}
}
