package shyam;

public class Test {

	public static void main(String[] args) {
//line added from git url
String name="shyam vishnu gadekar";
String []ch=name.split(" ");

String rev="";

for(int i=ch.length-1;i>=0;i--) {
	
	rev=rev+ch[i]+" ";
	
}

System.out.println(rev);

	}

}
