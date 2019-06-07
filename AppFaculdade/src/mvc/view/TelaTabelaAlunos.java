package mvc.view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import mvc.model.vo.Aluno;

public class TelaTabelaAlunos extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JScrollPane barraRolagem;
	private JTable tabela;
	private DefaultTableModel modelo = new DefaultTableModel();
	
	public TelaTabelaAlunos() {
		this.setTitle("Tabela de Alunos");
		this.setResizable(false);
		this.setSize(1350, 345);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		
		criarTabela();
		
		barraRolagem = new JScrollPane(tabela);
		this.barraRolagem.setBounds(30, 30, 1280, 250);
		this.add(barraRolagem);
	}
	
	public void exibirAlerta(String mensagem) {
		JOptionPane.showMessageDialog(this, mensagem, "Atenção", JOptionPane.WARNING_MESSAGE);
	}
	
	private void criarTabela() {
		tabela = new JTable(modelo);
		modelo.addColumn("Matrícula");
		modelo.addColumn("Nome");		
		modelo.addColumn("CPF");		
		modelo.addColumn("Data de Nascimento");		
		modelo.addColumn("Rua");		
		modelo.addColumn("Número");		
		modelo.addColumn("CEP");		
		modelo.addColumn("Bairro");		
		modelo.addColumn("Cidade");		
		modelo.addColumn("UF");	
		modelo.addColumn("Data_Matrícula_Curso");
		tabela.getColumnModel().getColumn(0).setPreferredWidth(80);
		tabela.getColumnModel().getColumn(1).setPreferredWidth(120);
		tabela.getColumnModel().getColumn(2).setPreferredWidth(110);
		tabela.getColumnModel().getColumn(3).setPreferredWidth(140);
		tabela.getColumnModel().getColumn(4).setPreferredWidth(190);
		tabela.getColumnModel().getColumn(5).setPreferredWidth(70);
		tabela.getColumnModel().getColumn(6).setPreferredWidth(80);
		tabela.getColumnModel().getColumn(7).setPreferredWidth(170);
		tabela.getColumnModel().getColumn(8).setPreferredWidth(160);
		tabela.getColumnModel().getColumn(9).setPreferredWidth(40);
		tabela.getColumnModel().getColumn(10).setPreferredWidth(150);
	}
	
	public void adicionarAlunoTabela(Aluno aluno) {
		modelo.addRow(new Object[] { aluno.getMatricula(), aluno.getNome(), aluno.getCpf(), aluno.getDataNascimento(),
				aluno.getRua(), aluno.getNumero(), aluno.getCep(), aluno.getBairro(), aluno.getCidade(), aluno.getUf(),
				aluno.getDataMatriculaCurso() });
	}

	public JScrollPane getBarraRolagem() {
		return barraRolagem;
	}

	public void setBarraRolagem(JScrollPane barraRolagem) {
		this.barraRolagem = barraRolagem;
	}

	public JTable getTabela() {
		return tabela;
	}

	public void setTabela(JTable tabela) {
		this.tabela = tabela;
	}

	public DefaultTableModel getModelo() {
		return modelo;
	}

	public void setModelo(DefaultTableModel modelo) {
		this.modelo = modelo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}