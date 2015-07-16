/*
* Este programa captura do usu�rio seu nome em uma caixa
* de di�logo, e depois mostra-lhe em outra caixa de di�logo
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
        // caixa de di�logo perguntando o nome do usu�rio:
        String name = JOptionPane.showInputDialog("Qual � o seu nome?:");
        
        // formatando o nome em uma String separada para a pr�xima caixa:
        String message = String.format("Bem-vindo ao Java %s!", name);
        
        // exibindo caixa de di�logo de boas vindas:
        JOptionPane.showMessageDialog(null, message);
    }
}
