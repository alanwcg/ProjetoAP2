package mvc.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class TelaRelacionarDisciplinaAluno extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JLabel lbCodigoDisciplina, lbMatriculaAluno, lbFrequencia, lbNotaFinal;
	private JTextField tfCodigoDisciplina, tfMatriculaAluno, tfFrequencia, tfNotaFinal;
	private JButton btRelacionar;
	
	public TelaRelacionarDisciplinaAluno() {
		this.setTitle("Relacionar Disciplina - Aluno");
		this.setResizable(false);
		this.setSize(400, 320);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		
		this.lbCodigoDisciplina = new JLabel("Código da Disciplina:");
		this.lbCodigoDisciplina.setBounds(30, 30, 150, 20);
		this.add(lbCodigoDisciplina);
		this.tfCodigoDisciplina = new JTextField();
		this.tfCodigoDisciplina.setBounds(160, 30, 120, 25);
		this.add(tfCodigoDisciplina);
		
		this.lbMatriculaAluno = new JLabel("Matrícula do Aluno:");
		this.lbMatriculaAluno.setBounds(30, 80, 150, 20);
		this.add(lbMatriculaAluno);
		this.tfMatriculaAluno = new JTextField();
		this.tfMatriculaAluno.setBounds(150, 80, 130, 25);
		this.add(tfMatriculaAluno);
		
		this.lbFrequencia = new JLabel("Frequência:");
		this.lbFrequencia.setBounds(30, 130, 150, 20);
		this.add(lbFrequencia);
		this.tfFrequencia = new JTextField();
		this.tfFrequencia.setBounds(105, 130, 175, 25);
		this.add(tfFrequencia);
		
		this.lbNotaFinal = new JLabel("Nota Final:");
		this.lbNotaFinal.setBounds(30, 180, 80, 20);
		this.add(lbNotaFinal);
		this.tfNotaFinal = new JTextField();
		this.tfNotaFinal.setBounds(100, 180, 180, 25);
		this.add(tfNotaFinal);
		
		this.btRelacionar = new JButton("Relacionar");
		this.btRelacionar.setBounds(30, 230, 100, 25);
		this.add(btRelacionar);
	}
	
	public void limparCampos() {
		this.tfCodigoDisciplina.setText("");
		this.tfMatriculaAluno.setText("");
		this.tfFrequencia.setText("");
		this.tfNotaFinal.setText("");
		
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

	public JLabel getLbMatriculaAluno() {
		return lbMatriculaAluno;
	}

	public void setLbMatriculaAluno(JLabel lbMatriculaAluno) {
		this.lbMatriculaAluno = lbMatriculaAluno;
	}

	public JLabel getLbFrequencia() {
		return lbFrequencia;
	}

	public void setLbFrequencia(JLabel lbFrequencia) {
		this.lbFrequencia = lbFrequencia;
	}

	public JLabel getLbNotaFinal() {
		return lbNotaFinal;
	}

	public void setLbNotaFinal(JLabel lbNotaFinal) {
		this.lbNotaFinal = lbNotaFinal;
	}

	public JTextField getTfCodigoDisciplina() {
		return tfCodigoDisciplina;
	}

	public void setTfCodigoDisciplina(JTextField tfCodigoDisciplina) {
		this.tfCodigoDisciplina = tfCodigoDisciplina;
	}

	public JTextField getTfMatriculaAluno() {
		return tfMatriculaAluno;
	}

	public void setTfMatriculaAluno(JTextField tfMatriculaAluno) {
		this.tfMatriculaAluno = tfMatriculaAluno;
	}

	public JTextField getTfFrequencia() {
		return tfFrequencia;
	}

	public void setTfFrequencia(JTextField tfFrequencia) {
		this.tfFrequencia = tfFrequencia;
	}

	public JTextField getTfNotaFinal() {
		return tfNotaFinal;
	}

	public void setTfNotaFinal(JTextField tfNotaFinal) {
		this.tfNotaFinal = tfNotaFinal;
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