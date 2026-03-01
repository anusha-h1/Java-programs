public class elseifladder
{
    public static void main(String[] args)
    {
        int num = -5;
        int age = 15;
        int percentage = 75;
        int amount = 3500;
        int temp = 32;
        int salary = 60000;
        char ch = 'A';

        if(num < 0)
            System.out.println("Negative");
        else if(num == 0)
            System.out.println("Zero");
        else
            System.out.println("Positive");

        if(age < 13)
            System.out.println("Child");
        else if(age <= 19)
            System.out.println("Teenager");
        else if(age <= 59)
            System.out.println("Adult");
        else
            System.out.println("Senior Citizen");

        if(percentage >= 85)
            System.out.println("Distinction");
        else if(percentage >= 60)
            System.out.println("First Class");
        else if(percentage >= 35)
            System.out.println("Pass");
        else
            System.out.println("Fail");

        if(amount >= 5000)
            System.out.println("20% discount");
        else if(amount >= 3000)
            System.out.println("15% discount");
        else if(amount >= 1000)
            System.out.println("10% discount");
        else
            System.out.println("No discount");

        if(temp >= 40)
            System.out.println("Very Hot");
        else if(temp >= 30)
            System.out.println("Hot");
        else if(temp >= 20)
            System.out.println("Warm");
        else if(temp >= 10)
            System.out.println("Cold");
        else
            System.out.println("Very Cold");

        if(salary >= 80000)
            System.out.println("Senior Level");
        else if(salary >= 50000)
            System.out.println("Mid Level");
        else if(salary >= 25000)
            System.out.println("Junior Level");
        else
            System.out.println("Entry Level");

        if(ch >= 'a' && ch <= 'z')
            System.out.println("Lowercase");
        else if(ch >= 'A' && ch <= 'Z')
            System.out.println("Uppercase");
        else if(ch >= '0' && ch <= '9')
            System.out.println("Digit");
        else
            System.out.println("Special Character");
    }
}