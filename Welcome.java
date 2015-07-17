/*
* Este programa captura do usuário seu nome em uma caixa
* de diálogo, e depois mostra-lhe em outra caixa de diálogo
* seu nome digitado.
* Este programa utiliza o Swing.
*
* Maicon Rosa da Cunha, 16 de Julho de 2015.
*/

import javax.swing.JOptionPane;

public class Welcome
{
    public static void main(String[] args)
    {
        // caixa de diálogo perguntando o nome do usuário:
        String name = JOptionPane.showInputDialog("Qual é o seu nome?:");
        
        // formatando o nome em uma String separada para a próxima caixa:
        String message = String.format("Bem-vindo ao Java %s!", name);
        
        // exibindo caixa de diálogo de boas vindas:
        JOptionPane.showMessageDialog(null, message);
    }
}
