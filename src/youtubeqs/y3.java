package youtubeqs;  //offer of a brand

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Model
{
	String modelname;
	int carspeed;
	public Model(String modelname, int carspeed) {
		super();
		this.modelname = modelname;
		this.carspeed = carspeed;
	}
	public String getModelname() {
		return modelname;
	}
	public void setModelname(String modelname) {
		this.modelname = modelname;
	}
	public int getCarspeed() {
		return carspeed;
	}
	public void setCarspeed(int carspeed) {
		this.carspeed = carspeed;
	}
	@Override
	public String toString() {
		return "Model [modelname=" + modelname + ", carspeed=" + carspeed + "]";
	}
	
}
class Implementation
{
	public List<String> getModelname(List<Model> list)
	{
		return list.stream().map(m->m.getModelname()).collect(Collectors.toList());
	}
	public Model getModelInfo(List<Model> list,String model,int speed)
	{
		return list.stream().filter(m->m.getModelname()==model && m.getCarspeed()==speed).findAny().get();
	}
}
public class y3 {
	public static void main(String args[])
	{
		List<Model> list=new ArrayList<>();
		list.add(new Model("SUV",500));
		list.add(new Model("SEDAN",800));
		
		Implementation i=new Implementation();
		System.out.println(i.getModelname(list));
		System.out.println(i.getModelInfo(list, "SUV", 500));
	}

}
