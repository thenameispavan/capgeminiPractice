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
	public int emailVerify(Email e) {
		Pattern check= Pattern.compile("^[a-zA-Z_][a-z0-9]*[@][a-z]*[.][a-z]+");

		Matcher match1= check.matcher(e.header.from);
		Matcher match2= check.matcher(e.header.to);
		if(match1.find()&&match2.find()){
			return 2;
		}
		else if(match1.find()||match2.find()){
			return 1;
		}
		else
			return 0;
	}
		public String bodyEncryption(Email e){
		char[] c=e.body.toCharArray();
		for(int i=0;i<e.body.length();i++){
			if(c[i] >= 'a' && c[i] <= 'z'){
	            c[i] = (char)(c[i] + 3);
	            
	            if(c[i] > 'z'){
	            	c[i] = (char)(c[i] - 'z' + 'a' - 1);
	            }
	            
	            
	        }
	        else if(c[i] >= 'A' && c[i] <= 'Z'){
	        	c[i] = (char)(c[i] + 3);
	            
	            if(c[i] > 'Z'){
	            	c[i] = (char)(c[i] - 'Z' + 'A' - 1);
	            }
	            
	           
	        }
	        
		}
		String str=new String(c);
		return str;
	}

	public String greetingMessage(Email e){
		return e.greetings+" "+e.header.from.substring(0,e.header.from.indexOf('@'));
	}
}