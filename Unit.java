import java.util.Random;

public class Unit
{
    
    private static final String[] shouts = {"Argh", "Ahhh!", "Grrr" };
    private static Random rand;
    
    private String name;

    public Unit()
    {
        name = "Default name"; 
        if(rand == null )
            rand = new Random(new Long("13265458965435"));   
    }

    public Unit (String nameP)
    {
        this();
        name = nameP;
         
    }


    public String getName()
    {
        return name;
    }

    public void shout()
    {
        int randomNum = rand.nextInt((shouts.length) );
        System.out.println(name + " shouts: " + shouts[randomNum]);
    }
}