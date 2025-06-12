
public class Pallindrome {

	public static void main(String[] args) {
		
	String orignalString="aba";
	String reversedString="";
	
	for(int i=orignalString.length()-1;i>=0;i--) {
		reversedString=reversedString+orignalString.charAt(i);
	}

	System.out.println("Reversed String is "+reversedString);
	
	if(orignalString.equalsIgnoreCase(reversedString)) {
		System.out.println("String is pallindrome");
	}
	else
		System.out.println("String is not pallindrome");
	}

}
