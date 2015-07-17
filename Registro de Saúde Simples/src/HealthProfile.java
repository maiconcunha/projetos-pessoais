package healthprofile;

/*
* A classe abaixo define os dados de saúde do indíviduo.
*/

public class HealthProfile
{
    private String firstName, secondName;
    private int birthDay, birthMonth, birthYear, yearsOld;
    private double weight, height;
    
    // configura nome da pessoa:
    public void setFirstName(String str)
    {
        firstName = str;
    }
    
    // retorna nome da pessoa:
    public String getFirstName()
    {
        return firstName;
    }
    
    // configura sobrenome da pessoa:
    public void setSecondName(String str)
    {
        secondName = str;
    }
    
    // retorna sobrenome da pessoa:
    public String getSecondName()
    {
        return secondName;
    }
    
    // configura dia de nasimento da pessoa:
    public void setBirthDay(int integer)
    {
        birthDay = integer;
    }
    
    // retorna dia de nascimento;
    public int getBirthDay()
    {
        return birthDay;
    }
    
    // configura mês de nascimento:
    public void setBirthMonth(int integer)
    {
        birthMonth = integer;
    }
    
    // retorna mês de nascimento:
    public int getBirthMonth()
    {
        return birthMonth;
    }
    
    // configura ano de nascimento:
    public void setBirthYear(int integer)
    {
        birthYear = integer;
        // configurando idade da pessoa:
        yearsOld = 2015 - birthYear;
    }
    
    // retorna ano de nascimento:
    public int getBirthYear()
    {
        return birthYear;
    }
    
    // retornando idade da pessoa:
    public int getYearsOld()
    {
        return yearsOld;
    }
    
    // configura peso da pessoa:
    public void setWeight(double doub)
    {
        weight = doub;
    }
    
    // retorna peso:
    public double getWeight()
    {
        return weight;
    }
    
    // configura altura da pessoa:
    public void setHeight(double doub)
    {
        height = doub;
    }
    
    // retornando altura:
    public double getHeight()
    {
        return height;
    }
    
    // retornando frequência cardíaca máxima;
    public int getMaxHeartRates()
    {
        return 220 - yearsOld;
    }
    
    // retornando frequência cardíaca-alvo:
    // em 50%:
    public int getTargetHeartRates_1()
    {
        return (getMaxHeartRates() * 50) / 100;
    }
    // em 85%:
    public int getTargetHeartRates_2()
    {
        return (getMaxHeartRates() * 85) / 100;
    }
    
    // retorna índice de massa corporal (IMC):
    public double getIMC()
    {
        return height / (weight * weight);
    }
    
    // retorna se seu IMC está muito baixo, normal, alto ou muito alto:
    public String getIMCSummary()
    {
        if (getIMC() < 18.5)
            return "abaixo do peso";
        else if (getIMC() > 18.5 && getIMC() < 25.9)
            return "com o seu peso normal";
        else if (getIMC() > 25.9 && getIMC() < 29.9)
            return "acima do peso";
        else
            return "obeso";
    }
}
