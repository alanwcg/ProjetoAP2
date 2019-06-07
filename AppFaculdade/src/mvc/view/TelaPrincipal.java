package mvc.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class TelaPrincipal extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	private JLabel lbAluno1, lbAluno2;
	private JLabel lbCurso1, lbCurso2;
	private JLabel lbDisciplina1, lbDisciplina2;
	private JLabel lbDA, lbDC;
	private JLabel lbPesquisa1, lbPesquisa2, lbPesquisa3, lbPesquisa4;
	private JLabel lbPesquisaMatricula, lbPesquisaCodigo;
	private JTextField tfAluno;
	private JTextField tfCurso;
	private JTextField tfDisciplina;
	private JTextField tfPesquisa2, tfPesquisa3;
	private JButton btAlunoCadastrar, btAlunoListar, btAlunoAtualizar, btAlunoDeletar;
	private JButton btCursoCadastrar, btCursoListar, btCursoAtualizar, btCursoDeletar;
	private JButton btDisciplinaCadastrar, btDisciplinaListar, btDisciplinaAtualizar, btDisciplinaDeletar;
	private JButton btDARelacionar, btDCRelacionar;
	private JButton btMostrar1, btMostrar2, btMostrar3, btMostrar4;

	public TelaPrincipal() {
		this.setTitle("Aplicação Faculdade");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setSize(750, 570);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		
		this.lbAluno1 = new JLabel("Aluno:");
		this.lbAluno1.setBounds(30, 20, 150, 20);
		this.add(lbAluno1);
		this.btAlunoCadastrar = new JButton("Cadastro");
		this.btAlunoCadastrar.setBounds(30, 50, 100, 25);
		this.add(btAlunoCadastrar);
		this.btAlunoListar = new JButton("Listar Todos");
		this.btAlunoListar.setBounds(150, 50, 120, 25);
		this.add(btAlunoListar);
		this.btAlunoAtualizar = new JButton("Atualizar Endereço");
		this.btAlunoAtualizar.setBounds(290, 50, 160, 25);
		this.add(btAlunoAtualizar);
		this.lbAluno2 = new JLabel("Matrícula:");
		this.lbAluno2.setBounds(470, 50, 80, 20);
		this.add(lbAluno2);
		this.tfAluno = new JTextField();
		this.tfAluno.setBounds(530, 50, 50, 25);
		this.add(tfAluno);
		this.btAlunoDeletar = new JButton("Deletar");
		this.btAlunoDeletar.setBounds(600, 50, 100, 25);
		this.add(btAlunoDeletar);
		
		this.lbCurso1 = new JLabel("Curso:");
		this.lbCurso1.setBounds(30, 105, 150, 20);
		this.add(lbCurso1);
		this.btCursoCadastrar = new JButton("Cadastro");
		this.btCursoCadastrar.setBounds(30, 135, 100, 25);
		this.add(btCursoCadastrar);
		this.btCursoListar = new JButton("Listar Todos");
		this.btCursoListar.setBounds(150, 135, 120, 25);
		this.add(btCursoListar);
		this.btCursoAtualizar = new JButton("Atualizar Mensalidade");
		this.btCursoAtualizar.setBounds(290, 135, 160, 25);
		this.add(btCursoAtualizar);
		this.lbCurso2 = new JLabel("Código:");
		this.lbCurso2.setBounds(470, 135, 80, 20);
		this.add(lbCurso2);
		this.tfCurso = new JTextField();
		this.tfCurso.setBounds(530, 135, 50, 25);
		this.add(tfCurso);
		this.btCursoDeletar = new JButton("Deletar");
		this.btCursoDeletar.setBounds(600, 135, 100, 25);
		this.add(btCursoDeletar);
		
		this.lbDisciplina1 = new JLabel("Disciplina:");
		this.lbDisciplina1.setBounds(30, 190, 150, 20);
		this.add(lbDisciplina1);
		this.btDisciplinaCadastrar = new JButton("Cadastro");
		this.btDisciplinaCadastrar.setBounds(30, 220, 100, 25);
		this.add(btDisciplinaCadastrar);
		this.btDisciplinaListar = new JButton("Listar Todas");
		this.btDisciplinaListar.setBounds(150, 220, 120, 25);
		this.add(btDisciplinaListar);
		this.btDisciplinaAtualizar = new JButton("Atualizar Modalidade");
		this.btDisciplinaAtualizar.setBounds(290, 220, 160, 25);
		this.add(btDisciplinaAtualizar);
		this.lbDisciplina2 = new JLabel("Código:");
		this.lbDisciplina2.setBounds(470, 220, 80, 20);
		this.add(lbDisciplina2);
		this.tfDisciplina = new JTextField();
		this.tfDisciplina.setBounds(530, 220, 50, 25);
		this.add(tfDisciplina);
		this.btDisciplinaDeletar = new JButton("Deletar");
		this.btDisciplinaDeletar.setBounds(600, 220, 100, 25);
		this.add(btDisciplinaDeletar);
		
		this.lbDA = new JLabel("Disciplina - Aluno:");
		this.lbDA.setBounds(30, 275, 150, 20);
		this.add(lbDA);
		this.btDARelacionar = new JButton("Relacionar");
		this.btDARelacionar.setBounds(30, 305, 100, 25);
		this.add(btDARelacionar);
		
		this.lbDC = new JLabel("Disciplina - Curso:");
		this.lbDC.setBounds(375, 275, 150, 20);
		this.add(lbDC);
		this.btDCRelacionar = new JButton("Relacionar");
		this.btDCRelacionar.setBounds(375, 305, 100, 25);
		this.add(btDCRelacionar);
		
		this.lbPesquisa2 = new JLabel("Situação Final do Aluno Por Disciplina:");
		this.lbPesquisa2.setBounds(30, 360, 250, 20);
		this.add(lbPesquisa2);
		this.lbPesquisaMatricula = new JLabel("Matrícula:");
		this.lbPesquisaMatricula.setBounds(30, 390, 80, 20);
		this.add(lbPesquisaMatricula);
		this.tfPesquisa2 = new JTextField();
		this.tfPesquisa2.setBounds(100, 390, 50, 25);
		this.add(tfPesquisa2);
		this.btMostrar2 = new JButton("Mostrar");
		this.btMostrar2.setBounds(170, 390, 100, 25);
		this.add(btMostrar2);
		
		this.lbPesquisa1 = new JLabel("Quantidade de Alunos Por Curso:");
		this.lbPesquisa1.setBounds(30, 445, 350, 25);
		this.add(lbPesquisa1);
		this.btMostrar1 = new JButton("Mostrar");
		this.btMostrar1.setBounds(30, 475, 100, 25);
		this.add(btMostrar1);
		
		this.lbPesquisa3 = new JLabel("Listar Disciplinas Por Curso:");
		this.lbPesquisa3.setBounds(375, 360, 350, 25);
		this.add(lbPesquisa3);
		this.lbPesquisaCodigo = new JLabel("Código:");
		this.lbPesquisaCodigo.setBounds(375, 390, 80, 20);
		this.add(lbPesquisaCodigo);
		this.tfPesquisa3 = new JTextField();
		this.tfPesquisa3.setBounds(435, 390, 50, 25);
		this.add(tfPesquisa3);
		this.btMostrar3 = new JButton("Mostrar");
		this.btMostrar3.setBounds(505, 390, 100, 25);
		this.add(btMostrar3);
		
		this.lbPesquisa4 = new JLabel("Aproveitamento das Disciplinas:");
		this.lbPesquisa4.setBounds(375, 445, 350, 25);
		this.add(lbPesquisa4);
		this.btMostrar4 = new JButton("Mostrar");
		this.btMostrar4.setBounds(375, 475, 100, 25);
		this.add(btMostrar4);
		
	}
	
	public void exibirAlerta(String mensagem) {
		JOptionPane.showMessageDialog(this, mensagem, "Atenção", JOptionPane.WARNING_MESSAGE);
	}

	public JLabel getLbAluno1() {
		return lbAluno1;
	}

	public void setLbAluno1(JLabel lbAluno1) {
		this.lbAluno1 = lbAluno1;
	}

	public JLabel getLbAluno2() {
		return lbAluno2;
	}

	public void setLbAluno2(JLabel lbAluno2) {
		this.lbAluno2 = lbAluno2;
	}

	public JLabel getLbCurso1() {
		return lbCurso1;
	}

	public void setLbCurso1(JLabel lbCurso1) {
		this.lbCurso1 = lbCurso1;
	}

	public JLabel getLbCurso2() {
		return lbCurso2;
	}

	public void setLbCurso2(JLabel lbCurso2) {
		this.lbCurso2 = lbCurso2;
	}

	public JLabel getLbDisciplina1() {
		return lbDisciplina1;
	}

	public void setLbDisciplina1(JLabel lbDisciplina1) {
		this.lbDisciplina1 = lbDisciplina1;
	}

	public JLabel getLbDisciplina2() {
		return lbDisciplina2;
	}

	public void setLbDisciplina2(JLabel lbDisciplina2) {
		this.lbDisciplina2 = lbDisciplina2;
	}

	public JLabel getLbDA() {
		return lbDA;
	}

	public void setLbDA1(JLabel lbDA) {
		this.lbDA = lbDA;
	}

	public JLabel getLbPesquisa1() {
		return lbPesquisa1;
	}

	public void setLbPesquisa1(JLabel lbPesquisa1) {
		this.lbPesquisa1 = lbPesquisa1;
	}

	public JLabel getLbPesquisa2() {
		return lbPesquisa2;
	}

	public void setLbPesquisa2(JLabel lbPesquisa2) {
		this.lbPesquisa2 = lbPesquisa2;
	}

	public JLabel getLbPesquisa3() {
		return lbPesquisa3;
	}

	public void setLbPesquisa3(JLabel lbPesquisa3) {
		this.lbPesquisa3 = lbPesquisa3;
	}

	public JLabel getLbPesquisa4() {
		return lbPesquisa4;
	}

	public void setLbPesquisa4(JLabel lbPesquisa4) {
		this.lbPesquisa4 = lbPesquisa4;
	}

	public JLabel getLbDC() {
		return lbDC;
	}

	public void setLbDC(JLabel lbDC) {
		this.lbDC = lbDC;
	}

	public JTextField getTfAluno() {
		return tfAluno;
	}

	public void setTfAluno(JTextField tfAluno) {
		this.tfAluno = tfAluno;
	}

	public JTextField getTfCurso() {
		return tfCurso;
	}

	public void setTfCurso(JTextField tfCurso) {
		this.tfCurso = tfCurso;
	}

	public JTextField getTfDisciplina() {
		return tfDisciplina;
	}

	public void setTfDisciplina(JTextField tfDisciplina) {
		this.tfDisciplina = tfDisciplina;
	}

	public JButton getBtAlunoCadastrar() {
		return btAlunoCadastrar;
	}

	public void setBtAlunoCadastrar(JButton btAlunoCadastrar) {
		this.btAlunoCadastrar = btAlunoCadastrar;
	}

	public JButton getBtAlunoListar() {
		return btAlunoListar;
	}

	public void setBtAlunoListar(JButton btAlunoListar) {
		this.btAlunoListar = btAlunoListar;
	}

	public JButton getBtAlunoAtualizar() {
		return btAlunoAtualizar;
	}

	public void setBtAlunoAtualizar(JButton btAlunoAtualizar) {
		this.btAlunoAtualizar = btAlunoAtualizar;
	}

	public JButton getBtAlunoDeletar() {
		return btAlunoDeletar;
	}

	public void setBtAlunoDeletar(JButton btAlunoDeletar) {
		this.btAlunoDeletar = btAlunoDeletar;
	}

	public JButton getBtCursoCadastrar() {
		return btCursoCadastrar;
	}

	public void setBtCursoCadastrar(JButton btCursoCadastrar) {
		this.btCursoCadastrar = btCursoCadastrar;
	}

	public JButton getBtCursoListar() {
		return btCursoListar;
	}

	public void setBtCursoListar(JButton btCursoListar) {
		this.btCursoListar = btCursoListar;
	}

	public JButton getBtCursoAtualizar() {
		return btCursoAtualizar;
	}

	public void setBtCursoAtualizar(JButton btCursoAtualizar) {
		this.btCursoAtualizar = btCursoAtualizar;
	}

	public JButton getBtCursoDeletar() {
		return btCursoDeletar;
	}

	public void setBtCursoDeletar(JButton btCursoDeletar) {
		this.btCursoDeletar = btCursoDeletar;
	}

	public JButton getBtDisciplinaCadastrar() {
		return btDisciplinaCadastrar;
	}

	public void setBtDisciplinaCadastrar(JButton btDisciplinaCadastrar) {
		this.btDisciplinaCadastrar = btDisciplinaCadastrar;
	}

	public JButton getBtDisciplinaListar() {
		return btDisciplinaListar;
	}

	public void setBtDisciplinaListar(JButton btDisciplinaListar) {
		this.btDisciplinaListar = btDisciplinaListar;
	}

	public JButton getBtDisciplinaAtualizar() {
		return btDisciplinaAtualizar;
	}

	public void setBtDisciplinaAtualizar(JButton btDisciplinaAtualizar) {
		this.btDisciplinaAtualizar = btDisciplinaAtualizar;
	}

	public JButton getBtDisciplinaDeletar() {
		return btDisciplinaDeletar;
	}

	public void setBtDisciplinaDeletar(JButton btDisciplinaDeletar) {
		this.btDisciplinaDeletar = btDisciplinaDeletar;
	}

	public JButton getBtDARelacionar() {
		return btDARelacionar;
	}

	public void setBtDARelacionar(JButton btDARelacionar) {
		this.btDARelacionar = btDARelacionar;
	}

	public JButton getBtMostrar1() {
		return btMostrar1;
	}

	public void setBtMostrar1(JButton btMostrar1) {
		this.btMostrar1 = btMostrar1;
	}

	public JButton getBtMostrar2() {
		return btMostrar2;
	}

	public void setBtMostrar2(JButton btMostrar2) {
		this.btMostrar2 = btMostrar2;
	}

	public JButton getBtMostrar3() {
		return btMostrar3;
	}

	public void setBtMostrar3(JButton btMostrar3) {
		this.btMostrar3 = btMostrar3;
	}

	public JButton getBtMostrar4() {
		return btMostrar4;
	}

	public void setBtMostrar4(JButton btMostrar4) {
		this.btMostrar4 = btMostrar4;
	}

	public JButton getBtDCRelacionar() {
		return btDCRelacionar;
	}

	public void setBtDCRelacionar(JButton btDCRelacionar) {
		this.btDCRelacionar = btDCRelacionar;
	}

	public JLabel getLbPesquisaMatricula() {
		return lbPesquisaMatricula;
	}

	public void setLbPesquisaMatricula(JLabel lbPesquisaMatricula) {
		this.lbPesquisaMatricula = lbPesquisaMatricula;
	}

	public JLabel getLbPesquisaCodigo() {
		return lbPesquisaCodigo;
	}

	public void setLbPesquisaCodigo(JLabel lbPesquisaCodigo) {
		this.lbPesquisaCodigo = lbPesquisaCodigo;
	}

	public JTextField getTfPesquisa2() {
		return tfPesquisa2;
	}

	public void setTfPesquisa2(JTextField tfPesquisa2) {
		this.tfPesquisa2 = tfPesquisa2;
	}

	public JTextField getTfPesquisa3() {
		return tfPesquisa3;
	}

	public void setTfPesquisa3(JTextField tfPesquisa3) {
		this.tfPesquisa3 = tfPesquisa3;
	}

	public void setLbDA(JLabel lbDA) {
		this.lbDA = lbDA;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}