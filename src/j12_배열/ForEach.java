package j12_배열;

public class ForEach {

	public static void main(String[] args) {
		
		String[] names = new String[4];
		names[0] = "김땡일";
		names[1] = "김땡이";
		names[2] = "김땡삼";
		names[3] = "김땡사";
		
		for(int i = 0; i< names.length; i++) {
			System.out.println(names[i]);
		}

		System.out.println();
		
		String name = names[0];
		System.out.println(name);
		name = names[1];		
		System.out.println(name);
		
		System.out.println();
		
		for(String n : names) {
			System.out.println(n);
		}
		

	}

}
