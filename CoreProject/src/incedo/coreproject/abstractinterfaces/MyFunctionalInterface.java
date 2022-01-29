package incedo.coreproject.abstractinterfaces;
@FunctionalInterface
public interface MyFunctionalInterface {
	void get();
	default void put() {}
}
