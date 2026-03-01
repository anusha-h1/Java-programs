public class nestedif
{
    public static void main(String[] args)
    {
        int num = 8;
        int marks = 90;
        char ch = 'e';
        int age = 20;
        boolean citizen = true;
        boolean mobileUnlocked = true;
        boolean correctPassword = true;
        int salary = 60000;
        int experience = 6;
        int number = 121;
        int year = 2000;
        boolean hasAccount = true;
        int pin = 1234;
        int enteredPin = 1234;

        if(num > 0)
        {
            if(num % 2 == 0)
                System.out.println("Positive and Even");
        }

        if(marks >= 35)
        {
            if(marks > 85)
                System.out.println("Passed with Distinction");
        }

        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
        {
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
               ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
                System.out.println("Alphabet and Vowel");
        }

        if(age >= 18)
        {
            if(citizen)
                System.out.println("Allowed to vote");
        }

        if(mobileUnlocked)
        {
            if(correctPassword)
                System.out.println("Access granted");
        }

        if(num % 2 == 0)
        {
            if(num % 4 == 0)
                System.out.println("Divisible by 2 and 4");
        }

        if(salary > 50000)
        {
            if(experience >= 5)
                System.out.println("Eligible");
        }

        if(number >= 100 && number <= 999)
        {
            int temp = number, rev = 0;
            while(temp > 0)
            {
                int r = temp % 10;
                rev = rev * 10 + r;
                temp /= 10;
            }
            if(number == rev)
                System.out.println("3-digit Palindrome");
        }

        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
        {
            if(year % 100 == 0)
                System.out.println("Leap year and Century");
        }

        if(hasAccount)
        {
            if(pin == enteredPin)
                System.out.println("Withdrawal allowed");
        }
    }
}