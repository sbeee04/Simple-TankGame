import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Tankgame tankie = new Tankgame ("ragu", 10, 40);
        Tankgame tanko = new Tankgame ("ravi",10,40);

        boolean AliveBoth = true;

        while (AliveBoth)
        {
            System.out.println("Alive:" + tankie.getName());
            System.out.println("Alive:" + tanko.getName());
            System.out.println("Who attacks?:");
            System.out.println("===========");
            Scanner question = new Scanner(System.in);
            System.out.println("the players are \n1.ravi\n2.ragu");
            int answer = question.nextInt();
            switch (answer)
            {
                case 1:
                    tankie.damageHealth(tanko.Damage);
                case 2:
                    tanko.damageHealth(tankie.Damage);
                default:
                    System.out.println("");




            }
           /* if (answer.toLowerCase() == "ravi")
            {
                tankie.damageHealth(tanko.Damage);
            }
            else
            {
                tanko.damageHealth(tankie.Damage);
            }*/
            tankie.checkifDead();
            tanko.checkifDead();

            if ((tanko.Health == 0) || (tankie.Health == 0))
                break;
        }




    }
}