
import java.util.ArrayList;


public class Checks {

	ArrayList<Check> list;
	
	
	public Checks()
	{
		list = new ArrayList<Check>();
	}
	
	public void addCheck(Check check)
	{
		list.add(check);
	}
	
	public ArrayList<Check> getChecks()
	{
		return list;
	}
	
	
}
