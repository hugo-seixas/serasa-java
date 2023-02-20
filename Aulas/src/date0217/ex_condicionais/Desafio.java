package date0217.ex_condicionais;

import javax.swing.JOptionPane;

public class Desafio {

	public static void main(String[] args) {
		double reta1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Informe o comprimento da 1ª Reta: "));
        double reta2 = Double.parseDouble (JOptionPane.showInputDialog(null,"Informe o comprimento da 2ª Reta: "));
        double reta3 = Double.parseDouble (JOptionPane.showInputDialog(null,"Informe o comprimento da 3ª Reta: "));


        if ((reta1 + reta2 > reta3) && (reta1 + reta3 > reta2) && (reta2 + reta3 > reta1)) {
            JOptionPane.showMessageDialog(null,"É possível formar um Triângulo");
        } 
        else {
            JOptionPane.showMessageDialog(null,"Não é possível formar um Triângulo");
        }

	}

}
