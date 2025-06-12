
public class ReverseString {

	public static void main(String[] args) {
		
	String orignalString="Geetanjali";
	String reversedString="";
	
	for(int i=orignalString.length()-1;i>=0;i--) {
		reversedString=reversedString+orignalString.charAt(i);
	}

	System.out.println("Reversed String is "+reversedString);
	}

}
