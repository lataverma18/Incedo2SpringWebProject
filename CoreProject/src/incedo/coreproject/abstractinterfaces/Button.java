package incedo.coreproject.abstractinterfaces;

public interface Button {
int i=10;
void on();
void off();
default void get() 
{
	System.out.println("Interface method");
}
}
