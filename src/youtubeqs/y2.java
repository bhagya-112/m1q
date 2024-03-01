
package youtubeqs; //video gameplayer
import java.util.*;

class Carspeed
{
	String speed;
}
class CarSpeedImplementation
{
	public String setCarSpeed(Carspeed sp,int spd)
	{
		try
		{
		if(spd<30 || spd>90)
			throw new SpeedInvalidException("Exception in speed validation");
		else
			sp.speed="valid";
		}
		catch(SpeedInvalidException ex)
		{
			sp.speed=ex.getMessage();
		}
		return sp.speed;
	}
}
class SpeedInvalidException extends Exception
{
	public SpeedInvalidException(String msg)
	{
		super(msg);
	}
}
public class y2 {
	public static void main(String args[])
	{
		Carspeed s=new Carspeed();
		CarSpeedImplementation car=new CarSpeedImplementation();
		System.out.println(car.setCarSpeed(s, 25));
	}

}
