package tiposprimitivos;

import javax.swing.JOptionPane;

public class LeituraComGUI {
    public static void main(String[] args) {
        int idade = 0;
        String aux = JOptionPane.showInputDialog("Insira uma idade");

        idade = Integer.parseInt(aux);
        
        JOptionPane.showConfirmDialog(null, "Idade digitada " + idade);
        
        
    }
    
}