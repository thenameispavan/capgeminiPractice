package doselect;
//class Header{
//	String from;
//	String to;
//	public Header(String from, String to) {
//		super();
//		this.from = from;
//		this.to = to;
//	}
//}
//class Email{
//	Header header;
//	String body;
//	String greetings;
//	public Email(Header header, String body, String greetings) {
//		super();
//		this.header = header;
//		this.body = body;
//		this.greetings = greetings;
//	}
//}
import java.util.regex.*;
public class Source {

	public static void main(String[] args) {
		String str="thenameispavan@yahoo.com";
//		Pattern firstLetter= Pattern.compile("^[a-zA-Z_][a-z0-9]*[@][a-z]*[.][a-z]+");
//		//Pattern symbol=Pattern.compile("[a-z]*");
//		//Pattern symbol1=Pattern.compile("[a-z]*$");
//		Matcher match= firstLetter.matcher(str);
//		//Matcher match1= firstLetter.matcher(str);
////		Matcher sym= symbol.matcher(str);
////		Matcher sym1= symbol.matcher(str);
////		Matcher sym2= symbol1.matcher(str);
////		Matcher sym3= symbol1.matcher(str);
//		System.out.println(match.find());
//		str.t
//		char[] c=str.toCharArray();
//		
//		for(int i=0;i<str.length();i++){
//			if(c[i]!=' ') {
//				c[i]+=3;
//			}
//			
//			
//		}
//		System.out.println(c);
		System.out.println("regards"+" "+str.substring(0,str.indexOf('@')));

	}

}
