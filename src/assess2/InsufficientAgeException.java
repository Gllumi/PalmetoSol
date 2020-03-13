package assess2;

public class InsufficientAgeException extends Exception{
		public InsufficientAgeException() {
			super("Age enterd is insufficient for voting");
		}
}
