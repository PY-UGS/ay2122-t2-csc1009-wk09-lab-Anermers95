import java.util.Random;


public class RandomCharacter{

    RandomCharacter(){}

    public char getRandomLowerCaseLetter()
    {
        Random rand = new Random();   
        return (char)(rand.nextInt(26) + 'a');
    }
    public char getRandomUpperCaseLetter()
    {
        Random rand = new Random();   
        return (char)(rand.nextInt(26) + 'A');
    }
    public char getRandomDigitCharacter()
    {
        Random rand = new Random();   
        return (char)(rand.nextInt(9) + '0');
    }

    public char getRandomCharacter()
    {
        Random rand = new Random();  
        int min = 0;
        int max = 127; 
        return (char)(rand.nextInt(max));
    }

    public boolean isPrime(char temp)
    {
        //char temp = getRandomCharacter();
        if ((int) temp <= 1)
        {
            System.out.print(temp + " is not a prime" );  
            return false;
        }

        if((int)temp % 2 == 0)
        {
            System.out.print(temp + " is not a prime" );  
            return false;
        }       

        else
        {
            int sqrt = (int) Math.sqrt(temp)+1;
            for(int i = 3; i <sqrt; i+=2)
            {
                if(temp%i == 0)
                {
                    System.out.print(temp + " is not a prime" );  
                    return false;
                }
            }
        }
            System.out.print(temp + " is a prime" );
            return true;       
    }

    public static void main(String[] args) {
        RandomCharacter rc = new RandomCharacter();
        
        for(int i = 0; i< 15; ++i)
            System.out.print(rc.getRandomLowerCaseLetter());
        System.out.print("\n");
        for(int i = 0; i< 15; ++i)
            System.out.print(rc.getRandomUpperCaseLetter());
        System.out.print("\n");
        for(int i = 0; i< 15; ++i)
            System.out.print(rc.getRandomDigitCharacter());
        System.out.print("\n");
        for(int i = 0; i< 15; ++i)
            System.out.print(rc.getRandomCharacter());
        System.out.print("\n");


        rc.isPrime(rc.getRandomLowerCaseLetter());
        System.out.print("\n");
        rc.isPrime(rc.getRandomUpperCaseLetter());
        System.out.print("\n");
        rc.isPrime(rc.getRandomDigitCharacter());
        System.out.print("\n");
        rc.isPrime(rc.getRandomCharacter());
        
    }

}