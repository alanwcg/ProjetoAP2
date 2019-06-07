package mvc.view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import mvc.model.vo.DisciplinaCurso;

public class TelaTabelaDisciplinasCursos extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JScrollPane barraRolagem;
	private JTable tabela;
	private DefaultTableModel modelo = new DefaultTableModel();
	
	public TelaTabelaDisciplinasCursos() {
		this.setTitle("Tabela de Disciplinas por Curso");
		this.setResizable(false);
		this.setSize(655, 345);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		
        criarTabela();
		
		barraRolagem = new JScrollPane(tabela);
		this.barraRolagem.setBounds(30, 30, 580, 250);
		this.add(barraRolagem);
	}
	
	public void exibirAlerta(String mensagem) {
		JOptionPane.showMessageDialog(this, mensagem, "Atenção", JOptionPane.WARNING_MESSAGE);
	}
	
	private void criarTabela() {
		tabela = new JTable(modelo);
		modelo.addColumn("Curso");
		modelo.addColumn("Disciplina");		
		modelo.addColumn("Modalidade");				
		tabela.getColumnModel().getColumn(0).setPreferredWidth(200);
		tabela.getColumnModel().getColumn(1).setPreferredWidth(180);
		tabela.getColumnModel().getColumn(2).setPreferredWidth(70);
	}
	
	public void adicionarDisciplinaCursoTabela(DisciplinaCurso dc) {
		modelo.addRow(new Object[] { dc.getNomeCurso(), dc.getNomeDisciplina(), dc.getModalidadeDisciplina() });
	}

}