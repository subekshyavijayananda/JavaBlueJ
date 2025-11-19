
/**
 * Write a description of class Workshop3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Workshop3
{
    int age; // instance variable
    static int qty; // static variable
    public static void main(String[] args){
        // <className> <variable>=new <className> ();
        int age=18; // local variable
        
        Workshop3 v1= new Workshop3(); // calling instance variable in static method
        System.out.println(v1.age);
        
        System.out.println(age);
        System.out.println(Workshop3.qty);
        
        
    }
}