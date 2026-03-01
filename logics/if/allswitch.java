public class allswitch
{
    public static void main(String[] args)
    {
        int day = 1;
        int month = 3;
        char operator = '+';
        String signal = "red";
        char vowel = 'a';
        char grade = 'A';
        int wheels = 2;

        switch(day)
        {
            case 1: System.out.println("Sunday"); break;
            case 2: System.out.println("Monday"); break;
            case 3: System.out.println("Tuesday"); break;
            case 4: System.out.println("Wednesday"); break;
            case 5: System.out.println("Thursday"); break;
            case 6: System.out.println("Friday"); break;
            case 7: System.out.println("Saturday"); break;
        }

        switch(month)
        {
            case 1: System.out.println("January"); break;
            case 2: System.out.println("February"); break;
            case 3: System.out.println("March"); break;
            case 4: System.out.println("April"); break;
            case 5: System.out.println("May"); break;
            case 6: System.out.println("June"); break;
            case 7: System.out.println("July"); break;
            case 8: System.out.println("August"); break;
            case 9: System.out.println("September"); break;
            case 10: System.out.println("October"); break;
            case 11: System.out.println("November"); break;
            case 12: System.out.println("December"); break;
        }

        switch(month)
        {
            case 12:
            case 1:
            case 2: System.out.println("Winter"); break;
            case 3:
            case 4:
            case 5: System.out.println("Summer"); break;
            case 6:
            case 7:
            case 8: System.out.println("Rainy"); break;
            default: System.out.println("Autumn");
        }

        switch(operator)
        {
            case '+': System.out.println("Addition performed"); break;
            case '-': System.out.println("Subtraction performed"); break;
            case '*': System.out.println("Multiplication performed"); break;
            case '/': System.out.println("Division performed"); break;
        }

        switch(signal)
        {
            case "red": System.out.println("Stop"); break;
            case "yellow": System.out.println("Ready"); break;
            case "green": System.out.println("Go"); break;
        }

        switch(vowel)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u': System.out.println("Vowel"); break;
            default: System.out.println("Not a vowel");
        }

        switch(grade)
        {
            case 'A': System.out.println("Excellent"); break;
            case 'B': System.out.println("Very Good"); break;
            case 'C': System.out.println("Good"); break;
            case 'D': System.out.println("Average"); break;
        }

        switch(wheels)
        {
            case 2: System.out.println("Bike"); break;
            case 3: System.out.println("Auto"); break;
            case 4: System.out.println("Car"); break;
            default: System.out.println("Other Vehicle");
        }
    }
}