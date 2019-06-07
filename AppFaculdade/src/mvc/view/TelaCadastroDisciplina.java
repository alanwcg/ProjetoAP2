package mvc.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class TelaCadastroDisciplina extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JLabel lbNome, lbCargaHoraria, lbModalidade;
	private JTextField tfNome, tfCargaHoraria, tfModalidade;
	private JButton btCadastrar;
	private JLabel lbAviso;
	
	public TelaCadastroDisciplina() {
		this.setTitle("Cadastro de Disciplina");
		this.setResizable(false);
		this.setSize(400, 300);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		
		this.lbNome = new JLabel("Nome:");
		this.lbNome.setBounds(30, 30, 50, 20);
		this.add(lbNome);
		this.tfNome = new JTextField();
		this.tfNome.setBounds(80, 30, 200, 25);
		this.add(tfNome);
		
		this.lbCargaHoraria = new JLabel("Carga Horária:");
		this.lbCargaHoraria.setBounds(30, 80, 150, 20);
		this.add(lbCargaHoraria);
		this.tfCargaHoraria = new JTextField();
		this.tfCargaHoraria.setBounds(125, 80, 155, 25);
		this.add(tfCargaHoraria);
		
		this.lbModalidade = new JLabel("Modalidade*:");
		this.lbModalidade.setBounds(30, 130, 150, 20);
		this.add(lbModalidade);
		this.tfModalidade = new JTextField();
		this.tfModalidade.setBounds(115, 130, 165, 25);
		this.add(tfModalidade);
		
		this.btCadastrar = new JButton("Cadastrar");
		this.btCadastrar.setBounds(30, 180, 100, 25);
		this.add(btCadastrar);
		
		this.lbAviso = new JLabel("*Modalidade deve ser: 'Preferencial' ou 'EAD'");
		this.lbAviso.setBounds(30, 230, 500, 20);
		this.add(lbAviso);
	}
	
	public void limparCampos() {
		this.tfNome.setText("");
		this.tfCargaHoraria.setText("");
		this.tfModalidade.setText("");
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

	public JLabel getLbCargaHoraria() {
		return lbCargaHoraria;
	}

	public void setLbCargaHoraria(JLabel lbCargaHoraria) {
		this.lbCargaHoraria = lbCargaHoraria;
	}

	public JLabel getLbModalidade() {
		return lbModalidade;
	}

	public void setLbModalidade(JLabel lbModalidade) {
		this.lbModalidade = lbModalidade;
	}

	public JTextField getTfNome() {
		return tfNome;
	}

	public void setTfNome(JTextField tfNome) {
		this.tfNome = tfNome;
	}

	public JTextField getTfCargaHoraria() {
		return tfCargaHoraria;
	}

	public void setTfCargaHoraria(JTextField tfCargaHoraria) {
		this.tfCargaHoraria = tfCargaHoraria;
	}

	public JTextField getTfModalidade() {
		return tfModalidade;
	}

	public void setTfModalidade(JTextField tfModalidade) {
		this.tfModalidade = tfModalidade;
	}

	public JButton getBtCadastrar() {
		return btCadastrar;
	}

	public void setBtCadastrar(JButton btCadastrar) {
		this.btCadastrar = btCadastrar;
	}

	public JLabel getLbAviso() {
		return lbAviso;
	}

	public void setLbAviso(JLabel lbAviso) {
		this.lbAviso = lbAviso;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}