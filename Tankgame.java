public class Tankgame {
    public String Name;
    public double Health;
    public double Damage;
    public boolean Alive;

    public Tankgame(String name, double Damage, double health)
    {
        Name = name;
        Health = health;
        this.Damage = Damage;
        Alive = true;
    }



    public String getName()
    {
        return Name;
    }

    public void damageHealth(double damage)
    {
        this.Health = Health - damage;
    }

    public void checkifDead()
    {
        if (Health == 0)
        {
            System.out.println(Name + " is DEAD!");
        }
        else
        {
            System.out.println("===========");
            System.out.println("Name: " + Name);
            System.out.println("Health now:" + Health);
            System.out.println("Damage: " + Damage);
            System.out.println("===========");
        }


    }

}
