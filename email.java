class Header{
String from;
	String to;
	public Header(String from, String to) {
		super();
		this.from = from;
		this.to = to;
	}
}
class Email{
Header header;
	String body;
	String greetings;
	public Email(Header header, String body, String greetings) {
		super();
		this.header = header;
		this.body = body;
		this.greetings = greetings;
	}
}


class EmailOperations{
public int emailVerify(Email e){
Pattern firstLetter= Pattern.compile("^[a-zA-Z_][a-z0-9]*[@][a-z]*[.][a-z]+");
Matcher match= firstLetter.matcher(e.header.from);
Matcher match1= firstLetter.matcher(e.header.to);
int count=0;
if(match.find()&&match1.find())
	count=2;
else if(match.find()||match1.find())
	count =1;
else 
	count=0;
}
return count;
}
public String bodyEncryption(Email e){
	char[] c=e.body.toCharArray();
	for(int i=0;i<e.body.length();i++){
		c[i]+=3;
	}
	str=Character.toString(c);
	return str;
}public String greetingMessage(Email e){
	return e.greetings+" "+e.from.substring(0,e.from.indexOf('@'));
}

}


public class Source {
	public static void main(String args[] ) throws Exception {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
    // You can Implement your main() to check your Program.
}