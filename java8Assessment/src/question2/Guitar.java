package question2;

public interface Guitar {
	default void play() {
		System.out.println("Guitar playing...");
	}
}
