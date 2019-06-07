package mvc.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class TelaAtualizarModalidadeDisciplina extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JLabel lbModalidade, lbCodigo;
	private JTextField tfModalidade, tfCodigo;
	private JButton btAtualizar;
	private JLabel lbAviso;
	
	public TelaAtualizarModalidadeDisciplina() {
		this.setTitle("Atualização da Modalidade");
		this.setResizable(false);
		this.setSize(400, 250);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		
		this.lbModalidade = new JLabel("Modalidade:");
		this.lbModalidade.setBounds(30, 30, 80, 20);
		this.add(lbModalidade);
		this.tfModalidade = new JTextField();
		this.tfModalidade.setBounds(110, 30, 155, 25);
		this.add(tfModalidade);
		
		this.lbCodigo = new JLabel("Código da Disciplina:");
		this.lbCodigo.setBounds(30, 80, 150, 20);
		this.add(lbCodigo);
		this.tfCodigo = new JTextField();
		this.tfCodigo.setBounds(160, 80, 105, 25);
		this.add(tfCodigo);
		
		this.btAtualizar = new JButton("Atualizar");
		this.btAtualizar.setBounds(30, 130, 100, 25);
		this.add(btAtualizar);
		
		this.lbAviso = new JLabel("*Modalidade deve ser: 'Preferencial' ou 'EAD'");
		this.lbAviso.setBounds(30, 180, 500, 20);
		this.add(lbAviso);
	}
	
	public void limparCampos() {
		this.tfModalidade.setText("");
		this.tfCodigo.setText("");
	}
	
	public void exibirAlerta(String mensagem) {
		JOptionPane.showMessageDialog(this, mensagem, "Atenção", JOptionPane.WARNING_MESSAGE);
	}

	public JLabel getLbModalidade() {
		return lbModalidade;
	}

	public void setLbModalidade(JLabel lbModalidade) {
		this.lbModalidade = lbModalidade;
	}

	public JLabel getLbCodigo() {
		return lbCodigo;
	}

	public void setLbCodigo(JLabel lbCodigo) {
		this.lbCodigo = lbCodigo;
	}
	
	public JLabel getLbAviso() {
		return lbAviso;
	}

	public void setLbAviso(JLabel lbAviso) {
		this.lbAviso = lbAviso;
	}

	public JTextField getTfModalidade() {
		return tfModalidade;
	}

	public void setTfModalidade(JTextField tfModalidade) {
		this.tfModalidade = tfModalidade;
	}

	public JTextField getTfCodigo() {
		return tfCodigo;
	}

	public void setTfCodigo(JTextField tfCodigo) {
		this.tfCodigo = tfCodigo;
	}

	public JButton getBtAtualizar() {
		return btAtualizar;
	}

	public void setBtAtualizar(JButton btAtualizar) {
		this.btAtualizar = btAtualizar;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}