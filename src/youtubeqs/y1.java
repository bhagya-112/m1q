package youtubeqs;  //employee Salary

import java.util.HashMap;

class Salary
{
	HashMap<String,Integer> empList=new HashMap();
	public int totalSalary()
	{
		int total=0;
		for(int i:empList.values())
			total+=i;
		return total;
		
	}
	public String getSalary(String designation)
	{
		if(empList.containsKey(designation))
			return "Salary is " +empList.get(designation);
		else
			return "no designation match";
	}
	public void updateSalary(String designation,int newSalary)
	{
		empList.put(designation,newSalary);
	}
}
public class y1 {
	public static void main(String args[]) throws Exception
	{
		Salary obj=new Salary();
		obj.empList.put("CEO",2000);
		obj.empList.put("Developer",5000);
		
		System.out.println(obj.totalSalary());
		obj.updateSalary("developer",6000);
		System.out.println(obj.getSalary("developer"));
	}

}
