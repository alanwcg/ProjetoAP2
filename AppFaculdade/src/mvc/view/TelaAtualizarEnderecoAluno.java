package mvc.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class TelaAtualizarEnderecoAluno extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JLabel lbRua, lbNumero, lbCep, lbBairro, lbCidade, lbUf, lbMatricula;
	private JTextField tfRua, tfNumero, tfCep, tfBairro, tfCidade, tfUf, tfMatricula;
	private JButton btAtualizar;
	
	public TelaAtualizarEnderecoAluno() {
		this.setTitle("Atualização de Endereço");
		this.setResizable(false);
		this.setSize(400, 470);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		
		this.lbRua = new JLabel("Rua:");
		this.lbRua.setBounds(30, 30, 50, 20);
		this.add(lbRua);
		this.tfRua = new JTextField();
		this.tfRua.setBounds(65, 30, 200, 25);
		this.add(tfRua);
		
		this.lbNumero = new JLabel("Número:");
		this.lbNumero.setBounds(30, 80, 80, 20);
		this.add(lbNumero);
		this.tfNumero = new JTextField();
		this.tfNumero.setBounds(85, 80, 180, 25);
		this.add(tfNumero);
		
		this.lbCep = new JLabel("CEP:");
		this.lbCep.setBounds(30, 130, 50, 20);
		this.add(lbCep);
		this.tfCep = new JTextField();
		this.tfCep.setBounds(65, 130, 200, 25);
		this.add(tfCep);
		
		this.lbBairro = new JLabel("Bairro:");
		this.lbBairro.setBounds(30, 180, 80, 20);
		this.add(lbBairro);
		this.tfBairro = new JTextField();
		this.tfBairro.setBounds(80, 180, 185, 25);
		this.add(tfBairro);
		
		this.lbCidade = new JLabel("Cidade:");
		this.lbCidade.setBounds(30, 230, 80, 20);
		this.add(lbCidade);
		this.tfCidade = new JTextField();
		this.tfCidade.setBounds(85, 230, 180, 25);
		this.add(tfCidade);
		
		this.lbUf = new JLabel("UF:");
		this.lbUf.setBounds(30, 280, 50, 20);
		this.add(lbUf);
		this.tfUf = new JTextField();
		this.tfUf.setBounds(60, 280, 205, 25);
		this.add(tfUf);
		
		this.lbMatricula = new JLabel("Matrícula do Aluno:");
		this.lbMatricula.setBounds(30, 330, 150, 20);
		this.add(lbMatricula);
		this.tfMatricula = new JTextField();
		this.tfMatricula.setBounds(150, 330, 115, 25);
		this.add(tfMatricula);
		
		this.btAtualizar = new JButton("Atualizar");
		this.btAtualizar.setBounds(30, 380, 100, 25);
		this.add(btAtualizar);
	}
	
	public void limparCampos() {
		this.tfRua.setText("");
		this.tfNumero.setText("");
		this.tfCep.setText("");
		this.tfBairro.setText("");
		this.tfCidade.setText("");
		this.tfUf.setText("");
		this.tfMatricula.setText("");
	}
	
	public void exibirAlerta(String mensagem) {
		JOptionPane.showMessageDialog(this, mensagem, "Atenção", JOptionPane.WARNING_MESSAGE);
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
	
	public JLabel getLbMatricula() {
		return lbMatricula;
	}
	
	public void setLbMatricula(JLabel lbMatricula) {
		this.lbMatricula = lbMatricula;
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

	public JButton getBtAtualizar() {
		return btAtualizar;
	}
	
	public JTextField getTfMatricula() {
		return tfMatricula;
	}

	public void setTfMatricula(JTextField tfMatricula) {
		this.tfMatricula = tfMatricula;
	}

	public void setBtAtualizar(JButton btAtualizar) {
		this.btAtualizar = btAtualizar;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}