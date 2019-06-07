package mvc.view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import mvc.model.vo.Disciplina;

public class TelaAproveitamentoDisciplinas extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JScrollPane barraRolagem;
	private JTable tabela;
	private DefaultTableModel modelo = new DefaultTableModel();
	
	public TelaAproveitamentoDisciplinas() {
		this.setTitle("Tabela de Aproveitamento das Disciplinas");
		this.setResizable(false);
		this.setSize(570, 345);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		
        criarTabela();
		
		barraRolagem = new JScrollPane(tabela);
		this.barraRolagem.setBounds(30, 30, 495, 250);
		this.add(barraRolagem);
	}
	
	public void exibirAlerta(String mensagem) {
		JOptionPane.showMessageDialog(this, mensagem, "Atenção", JOptionPane.WARNING_MESSAGE);
	}
	
	private void criarTabela() {
		tabela = new JTable(modelo);
		modelo.addColumn("Código");
		modelo.addColumn("Disciplina");		
		modelo.addColumn("Média");			
		modelo.addColumn("Avaliação");	
		tabela.getColumnModel().getColumn(0).setPreferredWidth(50);
		tabela.getColumnModel().getColumn(1).setPreferredWidth(200);
		tabela.getColumnModel().getColumn(2).setPreferredWidth(50);
		tabela.getColumnModel().getColumn(3).setPreferredWidth(65);
	}
	
	public void adicionarAproveitamentoDisciplinaTabela(Disciplina d) {
		modelo.addRow(new Object[] { d.getCodigo(), d.getNome(), d.getMedia(),
				d.getAvaliacao() });
	}

}