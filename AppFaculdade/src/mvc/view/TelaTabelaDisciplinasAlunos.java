package mvc.view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import mvc.model.vo.DisciplinaAluno;

public class TelaTabelaDisciplinasAlunos extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JScrollPane barraRolagem;
	private JTable tabela;
	private DefaultTableModel modelo = new DefaultTableModel();
	
	public TelaTabelaDisciplinasAlunos() {
		this.setTitle("Tabela de Situação do Aluno por Disciplina");
		this.setResizable(false);
		this.setSize(770, 345);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		
        criarTabela();
		
		barraRolagem = new JScrollPane(tabela);
		this.barraRolagem.setBounds(30, 30, 700, 250);
		this.add(barraRolagem);
	}
	
	public void exibirAlerta(String mensagem) {
		JOptionPane.showMessageDialog(this, mensagem, "Atenção", JOptionPane.WARNING_MESSAGE);
	}
	
	private void criarTabela() {
		tabela = new JTable(modelo);
		modelo.addColumn("Aluno");
		modelo.addColumn("Disciplina");		
		modelo.addColumn("Modalidade");			
		modelo.addColumn("Nota Final");
		modelo.addColumn("Situação");	
		tabela.getColumnModel().getColumn(0).setPreferredWidth(170);
		tabela.getColumnModel().getColumn(1).setPreferredWidth(200);
		tabela.getColumnModel().getColumn(2).setPreferredWidth(70);
		tabela.getColumnModel().getColumn(3).setPreferredWidth(70);
		tabela.getColumnModel().getColumn(4).setPreferredWidth(60);
	}
	
	public void adicionarDisciplinaAlunoTabela(DisciplinaAluno da) {
		modelo.addRow(new Object[] { da.getNomeAluno(), da.getNomeDisciplina(), da.getModalidade(),
				da.getNota(), da.getSituacao() });
	}

}