package mvc.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class TelaCadastroCurso extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JLabel lbNome, lbDuracaoAnos, lbTurno, lbMensalidade;
	private JTextField tfNome, tfDuracaoAnos, tfTurno, tfMensalidade;
	private JButton btCadastrar;
	private JLabel lbAviso1, lbAviso2;
	
	public TelaCadastroCurso(){
		this.setTitle("Cadastro de Curso");
		this.setResizable(false);
		this.setSize(400, 370);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		
		this.lbNome = new JLabel("Nome:");
		this.lbNome.setBounds(30, 30, 50, 20);
		this.add(lbNome);
		this.tfNome = new JTextField();
		this.tfNome.setBounds(80, 30, 200, 25);
		this.add(tfNome);
		
		this.lbDuracaoAnos = new JLabel("Duração do Curso*:");
		this.lbDuracaoAnos.setBounds(30, 80, 150, 20);
		this.add(lbDuracaoAnos);
		this.tfDuracaoAnos = new JTextField();
		this.tfDuracaoAnos.setBounds(150, 80, 130, 25);
		this.add(tfDuracaoAnos);
		
		this.lbTurno = new JLabel("Turno**:");
		this.lbTurno.setBounds(30, 130, 150, 20);
		this.add(lbTurno);
		this.tfTurno = new JTextField();
		this.tfTurno.setBounds(90, 130, 190, 25);
		this.add(tfTurno);
		
		this.lbMensalidade = new JLabel("Mensalidade:");
		this.lbMensalidade.setBounds(30, 180, 80, 20);
		this.add(lbMensalidade);
		this.tfMensalidade = new JTextField();
		this.tfMensalidade.setBounds(115, 180, 165, 25);
		this.add(tfMensalidade);
		
		this.btCadastrar = new JButton("Cadastrar");
		this.btCadastrar.setBounds(30, 230, 100, 25);
		this.add(btCadastrar);
		
		this.lbAviso1 = new JLabel("*Duração em Anos (float)");
		this.lbAviso1.setBounds(30, 280, 500, 20);
		this.add(lbAviso1);
		
		this.lbAviso2 = new JLabel("**Turno deve ser: 'Manhã', 'Tarde' ou 'Noite'");
		this.lbAviso2.setBounds(30, 300, 280, 20);
		this.add(lbAviso2);
	}
	
	public void limparCampos() {
		this.tfNome.setText("");
		this.tfDuracaoAnos.setText("");
		this.tfTurno.setText("");
		this.tfMensalidade.setText("");
		
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

	public JLabel getLbDuracaoAnos() {
		return lbDuracaoAnos;
	}

	public void setLbDuracaoAnos(JLabel lbDuracaoAnos) {
		this.lbDuracaoAnos = lbDuracaoAnos;
	}

	public JLabel getLbTurno() {
		return lbTurno;
	}

	public void setLbTurno(JLabel lbTurno) {
		this.lbTurno = lbTurno;
	}

	public JLabel getLbMensalidade() {
		return lbMensalidade;
	}

	public void setLbMensalidade(JLabel lbMensalidade) {
		this.lbMensalidade = lbMensalidade;
	}

	public JTextField getTfNome() {
		return tfNome;
	}

	public void setTfNome(JTextField tfNome) {
		this.tfNome = tfNome;
	}

	public JTextField getTfDuracaoAnos() {
		return tfDuracaoAnos;
	}

	public void setTfDuracaoAnos(JTextField tfDuracaoAnos) {
		this.tfDuracaoAnos = tfDuracaoAnos;
	}

	public JTextField getTfTurno() {
		return tfTurno;
	}

	public void setTfTurno(JTextField tfTurno) {
		this.tfTurno = tfTurno;
	}

	public JTextField getTfMensalidade() {
		return tfMensalidade;
	}

	public void setTfMensalidade(JTextField tfMensalidade) {
		this.tfMensalidade = tfMensalidade;
	}

	public JButton getBtCadastrar() {
		return btCadastrar;
	}

	public void setBtCadastrar(JButton btCadastrar) {
		this.btCadastrar = btCadastrar;
	}

	public JLabel getLbAviso1() {
		return lbAviso1;
	}

	public void setLbAviso1(JLabel lbAviso1) {
		this.lbAviso1 = lbAviso1;
	}

	public JLabel getLbAviso2() {
		return lbAviso2;
	}

	public void setLbAviso2(JLabel lbAviso2) {
		this.lbAviso2 = lbAviso2;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}