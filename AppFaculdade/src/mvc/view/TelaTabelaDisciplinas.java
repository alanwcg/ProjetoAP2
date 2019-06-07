package mvc.view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import mvc.model.vo.Disciplina;

public class TelaTabelaDisciplinas extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JScrollPane barraRolagem;
	private JTable tabela;
	private DefaultTableModel modelo = new DefaultTableModel();
	
	public TelaTabelaDisciplinas() {
		this.setTitle("Tabela de Disciplinas");
		this.setResizable(false);
		this.setSize(575, 345);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		
        criarTabela();
		
		barraRolagem = new JScrollPane(tabela);
		this.barraRolagem.setBounds(30, 30, 500, 250);
		this.add(barraRolagem);
	}
	
	public void exibirAlerta(String mensagem) {
		JOptionPane.showMessageDialog(this, mensagem, "Atenção", JOptionPane.WARNING_MESSAGE);
	}
	
	private void criarTabela() {
		tabela = new JTable(modelo);
		modelo.addColumn("Código");
		modelo.addColumn("Nome");		
		modelo.addColumn("Carga Horária");			
		modelo.addColumn("Modalidade");		
		tabela.getColumnModel().getColumn(0).setPreferredWidth(70);
		tabela.getColumnModel().getColumn(1).setPreferredWidth(220);
		tabela.getColumnModel().getColumn(2).setPreferredWidth(110);
		tabela.getColumnModel().getColumn(3).setPreferredWidth(100);
	}
	
	public void adicionarDisciplinaTabela(Disciplina disciplina) {
		modelo.addRow(new Object[] { disciplina.getCodigo(), disciplina.getNome(), disciplina.getCargaHoraria(),
				disciplina.getModalidade() });
	}

}