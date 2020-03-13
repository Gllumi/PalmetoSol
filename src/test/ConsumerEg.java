package test;
import java.util.function.Consumer;
public class ConsumerEg {

	public static void main(String[] args) {
		
		Consumer<Integer> p =x->{
			if(x>=20)
				System.out.println("Greater");
			else
				System.out.println("Lesser");
		};
		p.accept(21);
	}

}
