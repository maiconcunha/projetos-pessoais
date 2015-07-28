/*
* Este programa captura do usuário 4 inteiros e criptografa-os ou descriptografa-os.
*
* Esta classe define a interface ao usuário, perguntando-lhe o que deseja fazer e procedendo conforme.
*/

import java.util.Scanner;

public class Encrypter_CLI
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int opt;

	do {
            System.out.printf("1 - Criptografar;\n2 - Descriptografar;\n3 - Sair;\nOpção: ");
                opt = input.nextInt();

            if (opt < 1 || opt > 3)
                System.out.println("Atenção: opção inválida!");
            else if (opt == 1)
                encrypt();
            else if (opt == 2)
                decrypt();
        } while (opt != 3);
    }

    public static void encrypt()
    {
	Scanner input = new Scanner(System.in);
	Encrypter enc = new Encrypter();

	int numToEncrypt;

        System.out.print("Digite o número a ser criptografado: ");
            numToEncrypt = input.nextInt();

        if (numToEncrypt < 1000 || numToEncrypt > 9999) {
            System.out.println("Atenção, digite apenas quatro números inteiros!");
            encrypt();
        } else
            System.out.printf("\nCriptografando, aguarde...\nNúmero criptografado: %d\n\n", enc.encrypt(numToEncrypt));
    }
    
    public static void decrypt()
    {
        Scanner input = new Scanner(System.in);
	Encrypter enc = new Encrypter();
        
        int numToDecrypt;

        System.out.print("Digite o número a ser descriptografado: ");
            numToDecrypt = input.nextInt();

        if (numToDecrypt < 1000 || numToDecrypt > 9999) {
            System.out.println("Atenção, digite apenas quatro números inteiros!");
            decrypt();
        } else
            System.out.printf("\nDescriptografando, aguarde...\nNúmero descriptografado: %d\n\n", enc.decrypt(numToDecrypt));
    }
}
