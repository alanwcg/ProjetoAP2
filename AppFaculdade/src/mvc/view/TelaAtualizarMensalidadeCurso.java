package mvc.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class TelaAtualizarMensalidadeCurso extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JLabel lbMensalidade, lbCodigo;
	private JTextField tfMensalidade, tfCodigo;
	private JButton btAtualizar;
	
	public TelaAtualizarMensalidadeCurso() {
		this.setTitle("Atualização da Mensalidade");
		this.setResizable(false);
		this.setSize(400, 220);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		
		this.lbMensalidade = new JLabel("Mensalidade:");
		this.lbMensalidade.setBounds(30, 30, 80, 20);
		this.add(lbMensalidade);
		this.tfMensalidade = new JTextField();
		this.tfMensalidade.setBounds(115, 30, 150, 25);
		this.add(tfMensalidade);
		
		this.lbCodigo = new JLabel("Código do Curso:");
		this.lbCodigo.setBounds(30, 80, 150, 20);
		this.add(lbCodigo);
		this.tfCodigo = new JTextField();
		this.tfCodigo.setBounds(140, 80, 125, 25);
		this.add(tfCodigo);
		
		this.btAtualizar = new JButton("Atualizar");
		this.btAtualizar.setBounds(30, 130, 100, 25);
		this.add(btAtualizar);
	}
	
	public void limparCampos() {
		this.tfMensalidade.setText("");
		this.tfCodigo.setText("");
	}
	
	public void exibirAlerta(String mensagem) {
		JOptionPane.showMessageDialog(this, mensagem, "Atenção", JOptionPane.WARNING_MESSAGE);
	}

	public JLabel getLbMensalidade() {
		return lbMensalidade;
	}

	public void setLbMensalidade(JLabel lbMensalidade) {
		this.lbMensalidade = lbMensalidade;
	}

	public JLabel getLbCodigo() {
		return lbCodigo;
	}

	public void setLbCodigo(JLabel lbCodigo) {
		this.lbCodigo = lbCodigo;
	}

	public JTextField getTfMensalidade() {
		return tfMensalidade;
	}

	public void setTfMensalidade(JTextField tfMensalidade) {
		this.tfMensalidade = tfMensalidade;
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