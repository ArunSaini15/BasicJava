package in.co.practicre;

public class Method2 {
	public static void main(String[] args) {
		
		String name = "The Quick Brown Fox Jumps Over The Lazy Dog ";
		
		System.out.println(name.length());
		System.out.println(name.charAt(7));
		System.out.println(name.indexOf("Q"));
		System.out.println(name.indexOf("i"));
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.replace("D", "A"));
		System.out.println(name.startsWith("The"));
		System.out.println(name.endsWith("Dog"));
	}

}
