package fileOutStreamTest;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileOutputStreamTest {
	public static void main(String[] args) throws IOException{
		FileOutputStream fos=new FileOutputStream("c:/myDoc/Hello.txt");
		//String s="abcdef";
		String s="�ú�ѧϰ ��������";
		byte[] words=s.getBytes();
		fos.write(words, 0, words.length);
		System.out.println("�ļ���д��");
		fos.close();
		
		FileReader fr=new FileReader("c:/myDoc/Hello.txt");
		BufferedReader br=new BufferedReader(fr);
		String str;
		while((str=br.readLine())!=null){
			System.out.println(str);
		}
		
		/*int i;
		char[] cbuf=new char[20];
		FileInputStream fis=null;
		InputStreamReader isr=null;
		i=isr.read(cbuf, 1, 20);
		System.out.println("�ļ������ַ�����"+i);
		while(i!=-1){
			System.out.print(i);
		}
		fis.close();
		isr.close();*/
		}
	
}
