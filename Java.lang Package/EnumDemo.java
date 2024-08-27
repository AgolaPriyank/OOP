enum Dept
{
    CS("Prince", "Block A"),IT("Priyank" ,"Block B"),CIVIL("Jay" , "Block C"),EC("Giniyes" , "Block D");

    String head;
    String location;

    private Dept(String head , String loc)
    {
        this.head = head;
        this.location = loc;

        // System.out.println(this.name());
    }

    public String getHeadName()
    {
        return head;
    }

    public String getLocation()
    {
        return location;
    }

    // public void display()
    // {
    //     System.out.println(this.name() + " " + this.ordinal());
    // }

}

public class EnumDemo {
    
    public static void main(String[] args)
    {
        Dept d = Dept.EC;

        System.out.println(d.getHeadName());
        System.out.println(d.getLocation());

        // d.display();
        
        // System.out.println(d.name());
        // System.out.println(d.ordinal());

        // System.out.println(Dept.valueOf("IT"));

        // Dept list[] = Dept.values();
        // for(Dept x : list)
        // {
        //     System.out.println(x);
        // }

        // switch (d) {
        //     case CS:System.out.println("CS");
                
        //         break;
        // }



    }
}
