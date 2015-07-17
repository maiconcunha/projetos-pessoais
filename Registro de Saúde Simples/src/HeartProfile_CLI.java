package healthprofile;

/*
* A classe abaixo captura do usuário os dados e exibe-os ao usuário juntamente
* com o IMC e seu índice mais a frequência cardíaca máxima e alvo.
*/

import java.util.Scanner;

public class HeartProfile_CLI
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        HealthProfile hp = new HealthProfile();
        
        // capturando os dados:
        System.out.println("Olá, bem vindo. Por favor, digite os dados abaixo");
        System.out.print("Nome: ");
            hp.setFirstName(userInput.nextLine());
        System.out.print("Sobrenome: ");
            hp.setSecondName(userInput.nextLine());
        System.out.print("Dia de nascimento: ");
            hp.setBirthDay(userInput.nextInt());
        System.out.print("Mês de nascimento: ");
            hp.setBirthMonth(userInput.nextInt());
        System.out.print("Ano de nascimento: ");
            hp.setBirthYear(userInput.nextInt());
        System.out.print("Peso: ");
            hp.setHeight(userInput.nextDouble());
        System.out.print("Altura: ");
            hp.setWeight(userInput.nextDouble());
        
        // exibindo os dados:
        System.out.printf("\n%s %s, você nasceu em %d/%d/%d\n",
                hp.getFirstName(), hp.getSecondName(), hp.getBirthDay(), hp.getBirthMonth(), hp.getBirthYear());
        System.out.printf("Ou seja, você tem %d anos\n", hp.getYearsOld());
        System.out.printf("Sua altura é %.2f mts\n", hp.getWeight());
        System.out.printf("Seu peso é %.2f kgs\n", hp.getHeight());
        System.out.printf("Seu IMC é %.2f\n", hp.getIMC());
        System.out.printf("Então você está %s\n", hp.getIMCSummary());
        System.out.printf("Sua frequência cardíaca máxima é de %d bpm\n", hp.getMaxHeartRates());
        System.out.printf("E sua frequência cardíaca-alvo é de %d a %d bpm\n", hp.getTargetHeartRates_1(), hp.getTargetHeartRates_2());
    }
}

