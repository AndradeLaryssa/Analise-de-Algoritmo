package buscalinear;

import javax.swing.JOptionPane;

public class BuscaLinear {
    
    
    public static void BuscarNumero(int[] lista_numeros, int numero_escolhido) {
        int i = 0;
        
        while(true) {
            if (numero_escolhido == lista_numeros[i]) {
                JOptionPane.showMessageDialog(null, "O número " + numero_escolhido + " está na posição " + i);
                break;
            } else if(numero_escolhido != lista_numeros[i]) {
                i++;
            }
        }
    
    }

    public static void main(String[] args) {
        int[] lista_numeros = new int[5];
        
        JOptionPane.showMessageDialog(null, "Escolha 5 números");
        for(int i = 0; i < lista_numeros.length; i++) {
            lista_numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i+1) + "º número: "));
        }
        
        JOptionPane.showMessageDialog(null, "Escolha 1 número dos 5 números digitados anteriomente");
        int numero_escolhido = Integer.parseInt(JOptionPane.showInputDialog("Digite o número escolhido: "));
        
        BuscarNumero(lista_numeros, numero_escolhido);
    }
    
}
