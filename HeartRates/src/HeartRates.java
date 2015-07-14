package heartrates;

public class HeartRates
{
    private String firstName, secondName;
    private int birthDay, birthMonth, birthYear, yearsOld;
    
    // construtor, inicializa as variáveis:
    public HeartRates(String str1, String str2, int int1, int int2, int int3)
    {
        firstName = str1;
        secondName = str2;
        birthDay = int1;
        birthMonth = int2;
        birthYear = int3;
        // anos de idade
        yearsOld = birthYear - 2015;
    }
    
    // configura nome e sobrenome da pessoa:
    public void setname(String str1, String str2)
    {
        firstName = str1;
        secondName = str2;
    }
    
    // retorna nome da pessoa:
    public String getFirstName()
    {
        return firstName;
    }
    
    // retorna sobrenome da pessoa:
    public String getSecondName()
    {
        return secondName;
    }
    
    // configura data de nascimento da pessoa:
    public void setBirthDate(int int1, int int2, int int3)
    {
        birthDay = int1;
        birthMonth = int2;
        birthYear = int3;
    }
    
    // retorna dia de nascimento da pessoa:
    public int getBirthDay()
    {
        return birthDay;
    }
    
    // retorna mês de nascimento da pessoa:
    public int getBirthMonth()
    {
        return birthMonth;
    }
    
    // retorna ano de nascimento da pessoa:
    public int getBirthYear()
    {
        return birthYear;
    }
    
    // retorna quantos anos de idade a pessoa possuí:
    public int getYearsOld()
    {
        return yearsOld;
    }
    
    /*
    * retorna frequência cardiaca máxima:
    * A frequência cardíaca máxima, segundo a American Health Association, é um valor
    * obtido pela fórmula: 220 menos a idade.
    */
    public int getMaxHeartRate()
    {
        return 220 - yearsOld;
    }
    
    /*
    * A frequência cardíaca alvo, segundo a AHA, é um valor entre 50-85% da
    * frequência cardíaca máxima.
    */
    // 1. calculando frequência cardíaca alvo em 50%:
    public int getTargetHeartRate_1()
    {
        // calculando frequência cardíaca máxima:
        int maxHeartRate = 220 - yearsOld;
        
        return (maxHeartRate * 50) / 100;
    }
    // 2. calculando frequência cardíaca alvo em 85%:
    public int getTargetHeartRate_2()
    {
        int maxHeartRate = 220 - yearsOld;
        
        return (maxHeartRate * 85) / 100;
    }
}
