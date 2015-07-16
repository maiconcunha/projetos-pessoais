package analysis;

/*
* Este programa captura do usuário a aprovação ou reprovação
* de dez alunos em uma disciplina, faz a soma de quantos foram
* aprovados e quantos reprovados, e exibe ao instrutor tais dados.
* Se a quantidade de alunos aprovados for maior que 8, é exibido
* uma String extra ao usuário.
*/

import java.util.Scanner;

public class Analysis
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int passes=0 , failures=0, count=1, finalResult;
        
        while (count <= 10)
        {
            System.out.print("Entre com a nota final [1 = aprovado, 2 = reprovado]: ");
            finalResult = input.nextInt();
            
            if (finalResult == 1)
                passes++;
            else
                failures++;
            
            count++;
        }
        
        System.out.printf("%d foram aprovados, e %d foram reprovados\n", passes, failures);
        
        if (passes >= 8)
            System.out.println("Parabéns ao instrutor");
    }
}
