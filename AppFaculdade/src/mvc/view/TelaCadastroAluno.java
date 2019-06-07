package mvc.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class TelaCadastroAluno extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JLabel lbNome, lbCpf, lbDataNascimento, lbRua, lbNumero, lbCep, lbBairro, lbCidade, lbUf, lbDataMatriculaCurso;
	private JLabel lbCodigoCurso, lbAviso;
	private JTextField tfNome, tfCpf, tfDataNascimento, tfRua, tfNumero, tfCep, tfBairro, tfCidade, tfUf;
	private JTextField tfDataMatriculaCurso, tfMatriculaMonitor, tfCodigoCurso;
	private JButton btCadastrar;
	
	public TelaCadastroAluno() {
		this.setTitle("Cadastro de Aluno");
		this.setResizable(false);
		this.setSize(400, 700);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		
		this.lbNome = new JLabel("Nome:");
		this.lbNome.setBounds(30, 30, 50, 20);
		this.add(lbNome);
		this.tfNome = new JTextField();
		this.tfNome.setBounds(80, 30, 200, 25);
		this.add(tfNome);
		
		this.lbCpf = new JLabel("CPF:");
		this.lbCpf.setBounds(30, 80, 50, 20);
		this.add(lbCpf);
		this.tfCpf = new JTextField();
		this.tfCpf.setBounds(70, 80, 210, 25);
		this.add(tfCpf);
		
		this.lbDataNascimento = new JLabel("Data de Nascimento*:");
		this.lbDataNascimento.setBounds(30, 130, 150, 20);
		this.add(lbDataNascimento);
		this.tfDataNascimento = new JTextField();
		this.tfDataNascimento.setBounds(160, 130, 120, 25);
		this.add(tfDataNascimento);
		
		this.lbRua = new JLabel("Rua:");
		this.lbRua.setBounds(30, 180, 50, 20);
		this.add(lbRua);
		this.tfRua = new JTextField();
		this.tfRua.setBounds(70, 180, 210, 25);
		this.add(tfRua);
		
		this.lbNumero = new JLabel("Número:");
		this.lbNumero.setBounds(30, 230, 80, 20);
		this.add(lbNumero);
		this.tfNumero = new JTextField();
		this.tfNumero.setBounds(90, 230, 190, 25);
		this.add(tfNumero);
		
		this.lbCep = new JLabel("CEP:");
		this.lbCep.setBounds(30, 280, 80, 20);
		this.add(lbCep);
		this.tfCep = new JTextField();
		this.tfCep.setBounds(70, 280, 210, 25);
		this.add(tfCep);
		
		this.lbBairro = new JLabel("Bairro:");
		this.lbBairro.setBounds(30, 330, 80, 20);
		this.add(lbBairro);
		this.tfBairro = new JTextField();
		this.tfBairro.setBounds(80, 330, 200, 25);
		this.add(tfBairro);
		
		this.lbCidade = new JLabel("Cidade:");
		this.lbCidade.setBounds(30, 380, 80, 20);
		this.add(lbCidade);
		this.tfCidade = new JTextField();
		this.tfCidade.setBounds(85, 380, 195, 25);
		this.add(tfCidade);
		
		this.lbUf = new JLabel("UF:");
		this.lbUf.setBounds(30, 430, 50, 20);
		this.add(lbUf);
		this.tfUf = new JTextField();
		this.tfUf.setBounds(60, 430, 220, 25);
		this.add(tfUf);
		
		this.lbDataMatriculaCurso = new JLabel("Data da Matrícula*:");
		this.lbDataMatriculaCurso.setBounds(30, 480, 150, 20);
		this.add(lbDataMatriculaCurso);
		this.tfDataMatriculaCurso = new JTextField();
		this.tfDataMatriculaCurso.setBounds(145, 480, 135, 25);
		this.add(tfDataMatriculaCurso);
		
		this.lbCodigoCurso = new JLabel("Código do Curso:");
		this.lbCodigoCurso.setBounds(30, 530, 150, 20);
		this.add(lbCodigoCurso);
		this.tfCodigoCurso = new JTextField();
		this.tfCodigoCurso.setBounds(140, 530, 140, 25);
		this.add(tfCodigoCurso);
		
		this.btCadastrar = new JButton("Cadastrar");
		this.btCadastrar.setBounds(30, 580, 100, 25);
		this.add(btCadastrar);
		
		this.lbAviso = new JLabel("*Datas devem ser Informadas no Formato: AAAA-MM-DD");
		this.lbAviso.setBounds(30, 630, 500, 20);
		this.add(lbAviso);
	}
	
	public void limparCampos() {
		this.tfNome.setText("");
		this.tfCpf.setText("");
		this.tfDataNascimento.setText("");
		this.tfRua.setText("");
		this.tfNumero.setText("");
		this.tfCep.setText("");
		this.tfBairro.setText("");
		this.tfCidade.setText("");
		this.tfUf.setText("");
		this.tfDataMatriculaCurso.setText("");
		this.tfCodigoCurso.setText("");
	}
	
	public void exibirAlerta(String mensagem) {
		JOptionPane.showMessageDialog(this, mensagem, "Atenção", JOptionPane.WARNING_MESSAGE);
	}

	public JLabel getLbNome() {
		return lbNome;
	}

	public void setLbNome(JLabel lbNome) {
		this.lbNome = lbNome;
	}

	public JLabel getLbCpf() {
		return lbCpf;
	}

	public void setLbCpf(JLabel lbCpf) {
		this.lbCpf = lbCpf;
	}

	public JLabel getLbDataNascimento() {
		return lbDataNascimento;
	}

	public void setLbDataNascimento(JLabel lbDataNascimento) {
		this.lbDataNascimento = lbDataNascimento;
	}

	public JLabel getLbRua() {
		return lbRua;
	}

	public void setLbRua(JLabel lbRua) {
		this.lbRua = lbRua;
	}

	public JLabel getLbNumero() {
		return lbNumero;
	}

	public void setLbNumero(JLabel lbNumero) {
		this.lbNumero = lbNumero;
	}

	public JLabel getLbCep() {
		return lbCep;
	}

	public void setLbCep(JLabel lbCep) {
		this.lbCep = lbCep;
	}

	public JLabel getLbBairro() {
		return lbBairro;
	}

	public void setLbBairro(JLabel lbBairro) {
		this.lbBairro = lbBairro;
	}

	public JLabel getLbCidade() {
		return lbCidade;
	}

	public void setLbCidade(JLabel lbCidade) {
		this.lbCidade = lbCidade;
	}

	public JLabel getLbUf() {
		return lbUf;
	}

	public void setLbUf(JLabel lbUf) {
		this.lbUf = lbUf;
	}

	public JLabel getLbDataMatriculaCurso() {
		return lbDataMatriculaCurso;
	}

	public void setLbDataMatriculaCurso(JLabel lbDataMatriculaCurso) {
		this.lbDataMatriculaCurso = lbDataMatriculaCurso;
	}

	public JLabel getLbCodigoCurso() {
		return lbCodigoCurso;
	}

	public void setLbCodigoCurso(JLabel lbCodigoCurso) {
		this.lbCodigoCurso = lbCodigoCurso;
	}
	
	public JLabel voidgetLbAviso() {
		return lbAviso;
	}
	
	public void setLbAviso(JLabel lbAviso) {
		this.lbAviso = lbAviso;
	}

	public JTextField getTfNome() {
		return tfNome;
	}

	public void setTfNome(JTextField tfNome) {
		this.tfNome = tfNome;
	}

	public JTextField getTfCpf() {
		return tfCpf;
	}

	public void setTfCpf(JTextField tfCpf) {
		this.tfCpf = tfCpf;
	}

	public JTextField getTfDataNascimento() {
		return tfDataNascimento;
	}

	public void setTfDataNascimento(JTextField tfDataNascimento) {
		this.tfDataNascimento = tfDataNascimento;
	}

	public JTextField getTfRua() {
		return tfRua;
	}

	public void setTfRua(JTextField tfRua) {
		this.tfRua = tfRua;
	}

	public JTextField getTfNumero() {
		return tfNumero;
	}

	public void setTfNumero(JTextField tfNumero) {
		this.tfNumero = tfNumero;
	}

	public JTextField getTfCep() {
		return tfCep;
	}

	public void setTfCep(JTextField tfCep) {
		this.tfCep = tfCep;
	}

	public JTextField getTfBairro() {
		return tfBairro;
	}

	public void setTfBairro(JTextField tfBairro) {
		this.tfBairro = tfBairro;
	}

	public JTextField getTfCidade() {
		return tfCidade;
	}

	public void setTfCidade(JTextField tfCidade) {
		this.tfCidade = tfCidade;
	}

	public JTextField getTfUf() {
		return tfUf;
	}

	public void setTfUf(JTextField tfUf) {
		this.tfUf = tfUf;
	}

	public JTextField getTfDataMatriculaCurso() {
		return tfDataMatriculaCurso;
	}

	public void setTfDataMatriculaCurso(JTextField tfDataMatriculaCurso) {
		this.tfDataMatriculaCurso = tfDataMatriculaCurso;
	}

	public JTextField getTfMatriculaMonitor() {
		return tfMatriculaMonitor;
	}

	public void setTfMatriculaMonitor(JTextField tfMatriculaMonitor) {
		this.tfMatriculaMonitor = tfMatriculaMonitor;
	}

	public JTextField getTfCodigoCurso() {
		return tfCodigoCurso;
	}

	public void setTfCodigoCurso(JTextField tfCodigoCurso) {
		this.tfCodigoCurso = tfCodigoCurso;
	}

	public JButton getBtCadastrar() {
		return btCadastrar;
	}

	public void setBtCadastrar(JButton btCadastrar) {
		this.btCadastrar = btCadastrar;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}