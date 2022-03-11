class Pract2C {
	public static void main (String[] args) {
	
		String str= "Java Programming", newstr="";
		char ch;
		System.out.println("Word: " + str); 
	
	for (int i=0; i<str.length(); i++)
	{
		ch= str.charAt(i); 
		newstr= ch+newstr; 
	}
	System.out.println("Reversed word: "+ newstr);
	}
}