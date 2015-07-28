/*
* Este programa captura do usuário 4 inteiros e criptografa-os ou descriptografa-os.
*
* Para criptografar, o programa lê os digitos, determina se são 4 digitos, adiciona 7 ao valor de cada digito,
* divide por dez e o resto dessa divisão é atribuído ao digito.
*
* Para descriptografar, é feito o inverso acima.
*/

public class Encrypter
{
    private static int firstNum, secondNum, thirdNum, fourthNum, aux;
    
    public static void breakDigits(int num)
    {
        firstNum = num % 10;
        num /= 10;
        secondNum = num % 10;
        num /= 10;
        thirdNum = num % 10;
        num /= 10;
        fourthNum = num % 10;
    }
    
    public int encrypt(int numToEncrypt)
    {
        breakDigits(numToEncrypt);
        
        firstNum += 7;
        secondNum += 7;
        thirdNum += 7;
        fourthNum += 7;
        
        firstNum %= 10;
        secondNum %= 10;
        thirdNum %= 10;
        fourthNum %= 10;
        
        aux = firstNum;
        firstNum = thirdNum;
        thirdNum = aux;
        aux = secondNum;
        secondNum = fourthNum;
        fourthNum = aux;
        
        return (firstNum * 1000) + (secondNum * 100) + (thirdNum * 10) + fourthNum;
    }
    
    public int decrypt(int numToDecrypt)
    {
        breakDigits(numToDecrypt);
        
        aux = fourthNum;
        fourthNum = secondNum;
        secondNum = aux;
        aux = thirdNum;
        thirdNum = firstNum;
        firstNum = aux;
        
        firstNum = (firstNum + 3) % 10;
        secondNum = (secondNum + 3) % 10;
        thirdNum = (thirdNum + 3) % 10;
        fourthNum = (fourthNum + 3) % 10;
        
        return (firstNum * 1000) + (secondNum * 100) + (thirdNum * 10) + fourthNum;
    }
}