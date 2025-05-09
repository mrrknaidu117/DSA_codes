class employee{
    String firstname;
    String lastname;
    double monthlysalary;
    
    public employee(String firstname,String lastname,double monthlysalary)
    {
        this.firstname=firstname;
        this.lastname=lastname;
        if(monthlysalary>0)
        {
            this.monthlysalary=monthlysalary;
        }
        else
        {
            this.monthlysalary=0.0;
        }
    }
    public String getfirstname()
    {
        return firstname;
    }
    public void setfirstname(String firstname)
    {
        this.firstname=firstname;
    }
    public String getlastname()
    {
        return lastname;
    }
    public void setlastname(String lastnmae)
    {
        this.lastname=lastname;
    }
    public double getmonthlysalary()
    {
        return monthlysalary;
    }
     public void setmonthlysalary(double monthlysalary)
     {
         if(monthlysalary>0)
         {
             this.monthlysalary=monthlysalary;
         }
         else
         {
             this.monthlysalary=0.0;
         }
     }
     public double getyearlysalary()
     {
         return monthlysalary*12;
     }
     
     public void giveraise(double percentage)
     {
         double raiseamount=monthlysalary*percentage/100;
         monthlysalary += raiseamount;
     }
}
public class Main
{
    public static void main(String[]args)
    {
        employee employee1=new employee("john","deo",5000.0);
        employee employee2=new employee("jane","smith",6000.0);
        
        System.out.println("employee 1's yearly salary:" +employee1.getyearlysalary());
        System.out.println("employee 2's yearly salary:" +employee2.getyearlysalary());
        
        employee1.giveraise(10);
        employee2.giveraise(10);
        
         System.out.println("employee 1's yearly salary after raise:" +employee1.getyearlysalary());
        System.out.println("employee 2's yearly salary after raise:" +employee2.getyearlysalary());
        
    }
}