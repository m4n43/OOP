public class Lab202{
    public static int Substr(String s1, String s2) {
        return s1.indexOf(s2);
    }
	public static String Concat(String s1, String s2) {
        return s1 + s2;
    }
    public static int getConcatPosition(String s1, String s2) {
        return s1.length(); 
    }	
    public static void main(String[] args) {
        String s1 = "Hello World";
        String s2 = "World";
        int pos = Substr(s1, s2);
        System.out.println("Vi tri cua \"" + s2 + "\" trong \"" + s1 + "\": " + pos);
		
        String s3 = "Hello ";
        String s4 = "World!";
        String result = Concat(s3, s4);
        int concatPos = getConcatPosition(s3, s4);
        System.out.println("Chuoi sau khi lien ket: " + result);
        System.out.println("Vi tri lien ket: " + concatPos);
	}
}
