public class employee
{
    String name;
    static int count = 0;
    employee(String name)
    {
        this.name=name;
        count++;
    }
    void display()
    {
        System.out.println("Employee Name:"+name);
    }
    public static void main (String[]args)
    {
        employee e1 = new employee("A.Karthikeya");
        employee e2 = new employee("A.Shashank");
        employee e3 = new employee("TVS Ajay");
        e1.display();
        e2.display();
        e3.display();
        System.out.println("Total Employees:"+count);

    }
   

}