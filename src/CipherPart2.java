import java.io.IOException;
import java.util.Scanner;

public class CipherPart2 
{

	public static void main(String[] args) 
	{
		
		Scanner scan= new Scanner(System.in);
		String fileName;
		boolean encrypt; //(true=encrypt, false=decrypt)
		int shiftAmount;
		
		System.out.println("Would you like to encrypt or decrypt a file?: ");
		String encordec= scan.nextLine();
		
		while(!encordec.equals("encrypt")&& !encordec.equals("Encrypt")
				&& !encordec.equals("decrypt") && !encordec.equals("Decrypt"))
		{
			System.out.println("Invalid.  Please re-enter if you want to"
					+ " encrypt or decrypt: ");
			
		}
		if (encordec.equals("encrypt") || encordec.equals("Encrypt"))
			encrypt=true;
		else
			encrypt=false;
		
		System.out.println("How many places should the alphabet be shifted?);
		
		

		
		

	}

	
	
	
	public static String caesar_cipher(String fileName, boolean encrypt,
						int shiftAmount)  throws IOException
	{
		
	}
}
