package january.targettt50;

public class reverseaword {
	// java program to reverse a word

	
		public static void main (String[] args) {
		
			String str= "Geeks", nstr="";
			char ch;
		
		System.out.print("Original word: ");
		System.out.println("Geeks"); //Example word
		
		for (int i=0; i<str.length(); i++)
		{
			ch= str.charAt(i); //extracts each character
			nstr= ch+nstr; //adds each character in front of the existing string
		}
		System.out.println("Reversed word: "+ nstr);
		}
	}

	//Contributed by Tiyasa



