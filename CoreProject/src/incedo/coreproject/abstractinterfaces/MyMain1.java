package incedo.coreproject.abstractinterfaces;

public class MyMain1 {

	public static void main(String[] args) {
		Button[]arr=new Button[3];
		arr[0]=new Projector();
		arr[1]=new Laptop();
		arr[2]=new Speakers();
		
		//Enhanced for Loop or ForEach loop 
		for(Button temp:arr)
		{
			temp.on();
			temp.off();
			if(temp instanceof Speakers)
			{
			/*	Speakers s=(Speakers)temp;
				s.changeVolume();*/
				((Speakers) temp).changeVolume();
			}
		}
		
		/*int len=arr.length;
		for(int i=0;i<len;i++)
		{
			arr[i].on();
			arr[i].off();
		}*/
		/*System.out.println(Button.i);
		Button b=new Projector();
		b.on();
		b.off();
		b=new Laptop();
		b.on();
		b.off();*/
	}
}
