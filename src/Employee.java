import javax.swing.text.NumberFormatter;
import java.sql.SQLOutput;
import java.util.Locale;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class Employee
{
    float hours;
    float rate;
    float salary;
    // Constructor
    public Employee()
    {
        hours = 10;
        rate = 100;
        salary = hours * rate;
    }
    public void getInfo()
    {
        NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("Salary is: "+ currency.format(salary));
        System.out.print("The salary is: "+ String.format("$%,.2f\n", salary));
    }
}
