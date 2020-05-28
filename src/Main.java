
public class Main {

	public static void main(String[] args) {
		int j = 20, i = 0;
		
		try {
			System.out.println(j/i);
		} catch (ClassCastException e) {
			e.printStackTrace();
		} finally {
		System.out.println("Coucou toi !");
		}
	}

}
