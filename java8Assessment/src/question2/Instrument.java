package question2;

public class Instrument implements Piano, Guitar {

	public static void main(String[] args) {

		Instrument instrument = new Instrument();
		instrument.play();

	}

	@Override
	public void play() {
		Guitar.super.play();
		Piano.super.play();
	}

}
