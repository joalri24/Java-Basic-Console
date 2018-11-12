import java.util.Scanner; 

public class Java_Example
{

    //---------------------------------------------
    // Main
    //---------------------------------------------

    public static void main (String[] args)
    {
        
        System.out.println("Helloooo there.");
        Scanner in = new Scanner(System.in);
        
        Unit unit1 = new Unit("Unit 1");
        //System.out.println(unit1.getName());
        //unit1.shout();

        /*Unit unit2 = new Unit("Unit 2");
        System.out.println(unit2.getName());*/

        /*String a = in.next();
        System.out.println(a);*/

        

        String comando;
        loop: while(true)
        {
            System.out.println("Type a command: ");
            comando = in.next();
            switch (comando)
            {
                case "exit":
                    break loop;

                case "new":
                    if(in.next().equals("unit"))
                    {
                        Unit u = new Unit(in.next());
                        System.out.println("new unit name: " + u.getName());
                    }
                    else
                    {
                        in.next();
                        System.out.println("Invalid object.");
                    }
                    break;

                case "shout":
                    unit1.shout();
                    break;
                
                default:
                    System.out.println("Invalid command");
                    in.nextLine();
                    break ;
            }
        }
    }
    
}