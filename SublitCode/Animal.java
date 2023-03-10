package SublitCode;
import java.lang.*;
import java.util.Scanner;

public abstract class Animal
{
    String name;
    Animal(String n)
    {
        name = n;
    }
    public void sleep()
    {
        System.out.println(name+" is sleeping");
    }
    public static void main(String[] args)
    {
        int attr;
        String animal, nam, function;
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =0;i<n;i++)
        {
            animal = sc.next();
            if(animal.equals("LION"))
            {
                nam = sc.next();
                attr = sc.nextInt();
                function = sc.next();
                Lion L1 = new Lion(nam, attr);
                if(function.equals("SPEAK"))
                {
                    L1.speak();
                }
                else if(function.equals("SLEEP"))
                {
                    L1.sleep();
                }
            }
            else if(animal.equals("MONKEY"))
            {
                nam = sc.next();
                function = sc.next();
                Monkey m1 = new Monkey(nam);
                if(function.equals("SPEAK"))
                {
                    m1.speak();
                }
                else if(function.equals("SLEEP"))
                {
                    m1.sleep();
                }
            }
            else if(animal.equals("ELEPHANT"))
            {
                nam = sc.next();
                attr = sc.nextInt();
                function = sc.next();
                Elephant E1 = new Elephant(nam, attr);
                if(function.equals("SPEAK"))
                {
                    E1.speak();
                }
                else if(function.equals("SLEEP"))
                {
                    E1.sleep();
                }
            }
        }
        
    }
}

public class Lion extends Animal{
    int speed;
    Lion(String n, int s)
    {
        super(n);
        speed = s;
    }
    // public void sleep()
    // {
    //     System.out.println
    // }
    public void speak()
    {
        System.out.println("I am a lion, my name is "+name+" and I am "+speed+"m/s fast");
    }
}

public class Monkey extends Animal{
    Monkey(String s)
    {
        super(s);
    }
    public void speak()
    {
        System.out.println("I am a moneky, my name is "+ name);
    }
}

public class Elephant extends Animal{
    int weight;
    Elephant(String s, int w)
    {
        super(s);
        weight = w;
    }
    public void speak()
    {
        System.out.println("I am an elephant, my name is "+name+" and I weigh "+weight+" kgs");
    }
}
