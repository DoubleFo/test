package file.inputstrem;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//import java.io.FileInputStream;
public class FileInputStreamTest {

	/*
	 * FileInputStream ��ȡ�ļ�����
	 * .available����ɶ�ȡ���ֽ���
	 * ��read() ��ȡ�ļ����ݣ�����ֵΪint���ͣ�Ĭ�϶�ȡ��������ֵ-1����ʾ��ȡ��ϣ�read()�����ǡ�����"
	 * ��ʽת��  �������� char c=(char)data;
	 * ʹ������������FileOutputStream��FileInputStream ���һ��Ҫ�ر��������ϰ�ߣ�
	 * println��print��println�������ÿ���������Զ�����
	 */
	public static void main(String[] args) throws IOException{
		FileInputStream fis=new FileInputStream("c:/myDoc/Hello.txt");
		/*
		 * ����class�ļ�������ΪFileInputStream ���Դ���java.io.FileInputStream���Ƴ�ͻ
		 * ����The import java.io.FileInputStream conflicts with a type defined in the same file
		 * ͬһ�ļ��������java.io.FileInputStream���붨�����ͻ
		 */
		int data;
		System.out.println("�ɶ�ȡ���ֽ���"+fis.available());
		/*System.out.println("=========�ļ�����=======");
		while((data=fis.read())!=-1){
			System.out.println(data+" ");
		}*/
		System.out.println("========�ļ���ȡ���=======");
		System.out.println("===���ļ���ȡ����ת��===");
		while((data=fis.read())!=-1){
			/*char s=(char)data;*/
			System.out.print((char)data);	
		}
		fis.close();
	}
}
