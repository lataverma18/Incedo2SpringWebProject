package incedo.coreproject.abstractinterfaces;

public class Speakers implements VolumeButton,MenuButton
{

	@Override
	public void on() {
		System.out.println("Switch On the Volume");
	}

	@Override
	public void off() {
		System.out.println("Mute");
	}

	@Override
	public void changeVolume() {
	System.out.println("Changing Volume");
	}

	@Override
	public void displayMenu() {
		System.out.println("Display the Menu");
		
	}
}
