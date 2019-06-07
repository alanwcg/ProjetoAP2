package mvc.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class TelaRelacionarDisciplinaCurso extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JLabel lbCodigoDisciplina, lbCodigoCurso;
	private JTextField tfCodigoDisciplina, tfCodigoCurso;
	private JButton btRelacionar;
	
	public TelaRelacionarDisciplinaCurso() {
		this.setTitle("Relacionar Disciplina - Curso");
		this.setResizable(false);
		this.setSize(400, 220);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		
		this.lbCodigoDisciplina = new JLabel("Código da Disciplina:");
		this.lbCodigoDisciplina.setBounds(30, 30, 150, 20);
		this.add(lbCodigoDisciplina);
		this.tfCodigoDisciplina = new JTextField();
		this.tfCodigoDisciplina.setBounds(160, 30, 120, 25);
		this.add(tfCodigoDisciplina);
		
		this.lbCodigoCurso = new JLabel("Código do Curso:");
		this.lbCodigoCurso.setBounds(30, 80, 150, 20);
		this.add(lbCodigoCurso);
		this.tfCodigoCurso = new JTextField();
		this.tfCodigoCurso.setBounds(140, 80, 140, 25);
		this.add(tfCodigoCurso);
		
		this.btRelacionar = new JButton("Relacionar");
		this.btRelacionar.setBounds(30, 130, 100, 25);
		this.add(btRelacionar);
	}
	
	public void limparCampos() {
		this.tfCodigoDisciplina.setText("");
		this.tfCodigoCurso.setText("");
	}
	
	public void exibirAlerta(String mensagem) {
		JOptionPane.showMessageDialog(this, mensagem, "Atenção", JOptionPane.WARNING_MESSAGE);
	}

	public JLabel getLbCodigoDisciplina() {
		return lbCodigoDisciplina;
	}

	public void setLbCodigoDisciplina(JLabel lbCodigoDisciplina) {
		this.lbCodigoDisciplina = lbCodigoDisciplina;
	}

	public JLabel getLbCodigoCurso() {
		return lbCodigoCurso;
	}

	public void setLbCodigoCurso(JLabel lbCodigoCurso) {
		this.lbCodigoCurso = lbCodigoCurso;
	}

	public JTextField getTfCodigoDisciplina() {
		return tfCodigoDisciplina;
	}

	public void setTfCodigoDisciplina(JTextField tfCodigoDisciplina) {
		this.tfCodigoDisciplina = tfCodigoDisciplina;
	}

	public JTextField getTfCodigoCurso() {
		return tfCodigoCurso;
	}

	public void setTfCodigoCurso(JTextField tfCodigoCurso) {
		this.tfCodigoCurso = tfCodigoCurso;
	}

	public JButton getBtRelacionar() {
		return btRelacionar;
	}

	public void setBtRelacionar(JButton btRelacionar) {
		this.btRelacionar = btRelacionar;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}