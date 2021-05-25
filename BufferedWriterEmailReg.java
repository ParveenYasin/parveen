package sample;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class BufferedWriterEmailReg 
{
	public static void main(String[] args) {
		BufferedWriter bW =null;
		FileWriter fW =null;
		Scanner sc=null;
		sc =new Scanner(System.in);
		System.out.println("Enter Your name");
		String name=sc.next();
		System.out.println("Enter Email Id");
		String email=sc.next();
		String fv="Welcome" +name +"Thank you for registering your email id "+email;
		try {
			fW=new FileWriter("c:/file.txt");
			bW=new BufferedWriter(fW);
			bW.write(fv);
			System.out.println("Information Written to the file");
		}catch(IOException e)
		{
			e.printStackTrace();
		}finally {
			try {
				bW.close();
				fW.close();
			}catch(IOException e)
			{
				e.printStackTrace();
			}

		}
	}
}
