package mvc.view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import mvc.model.vo.Curso;

public class TelaTabelaCursos extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JScrollPane barraRolagem;
	private JTable tabela;
	private DefaultTableModel modelo = new DefaultTableModel();
	
	public TelaTabelaCursos() {
		this.setTitle("Tabela de Cursos");
		this.setResizable(false);
		this.setSize(705, 345);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		
		criarTabela();
		
		barraRolagem = new JScrollPane(tabela);
		this.barraRolagem.setBounds(30, 30, 630, 250);
		this.add(barraRolagem);
	}
	
	public void exibirAlerta(String mensagem) {
		JOptionPane.showMessageDialog(this, mensagem, "Atenção", JOptionPane.WARNING_MESSAGE);
	}
	
	private void criarTabela() {
		tabela = new JTable(modelo);
		modelo.addColumn("Código");
		modelo.addColumn("Nome");		
		modelo.addColumn("Duração Em Anos");		
		modelo.addColumn("Turno");		
		modelo.addColumn("Mensalidade");		
		tabela.getColumnModel().getColumn(0).setPreferredWidth(70);
		tabela.getColumnModel().getColumn(1).setPreferredWidth(250);
		tabela.getColumnModel().getColumn(2).setPreferredWidth(130);
		tabela.getColumnModel().getColumn(3).setPreferredWidth(70);
		tabela.getColumnModel().getColumn(4).setPreferredWidth(110);
	}
	
	public void adicionarCursoTabela(Curso curso) {
		modelo.addRow(new Object[] { curso.getCodigo(), curso.getNome(), curso.getDuracaoAnos(), curso.getTurno(),
				curso.getMensalidade() });
	}

}