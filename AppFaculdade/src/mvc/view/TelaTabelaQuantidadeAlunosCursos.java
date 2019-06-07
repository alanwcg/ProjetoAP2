package mvc.view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import mvc.model.vo.Curso;

public class TelaTabelaQuantidadeAlunosCursos extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JScrollPane barraRolagem;
	private JTable tabela;
	private DefaultTableModel modelo = new DefaultTableModel();
	
	public TelaTabelaQuantidadeAlunosCursos() {
		this.setTitle("Tabela da Quantidade de Alunos por Curso");
		this.setResizable(false);
		this.setSize(545, 345);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		
        criarTabela();
		
		barraRolagem = new JScrollPane(tabela);
		this.barraRolagem.setBounds(30, 30, 470, 250);
		this.add(barraRolagem);
	}
	
	public void exibirAlerta(String mensagem) {
		JOptionPane.showMessageDialog(this, mensagem, "Atenção", JOptionPane.WARNING_MESSAGE);
	}
	
	private void criarTabela() {
		tabela = new JTable(modelo);
		modelo.addColumn("Código");
		modelo.addColumn("Curso");		
		modelo.addColumn("Quantidade de Alunos");				
		tabela.getColumnModel().getColumn(0).setPreferredWidth(40);
		tabela.getColumnModel().getColumn(1).setPreferredWidth(200);
		tabela.getColumnModel().getColumn(2).setPreferredWidth(110);
	}
	
	public void adicionarQuantidadeAlunosTabela(Curso curso) {
		modelo.addRow(new Object[] { curso.getCodigo(), curso.getNome(), curso.getQtdAlunos() });
	}

}
