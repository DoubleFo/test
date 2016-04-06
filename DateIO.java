package dateInputStreamAndOuputStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/*
 * ʹ��DataOutputStream��DataInputStream д�Ͷ�����������˳�򱣳�һ��
 */
public class DateIO {
	public static void main(String[] args) throws IOException{
		//ʹ��DataOutStream�����ļ���д����
		//ʵ����һ��FileInputStream����
		FileOutputStream fos = new FileOutputStream("c:/myDoc/Hello.txt");
		//ʵ����һ��BufferedOutputStream����
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		//ʵ����һ��DataOutputStream����
		DataOutputStream dos = new DataOutputStream(bos);
		//д����
		dos.write(1);
		dos.writeChar('a');
		dos.writeInt(32);
		dos.writeUTF("nihao");
		//�ر���
		dos.close();
		bos.close();
		fos.close();
		System.out.println("===д�����===");
		
		//ʹ��DataOInputStream�����ļ��Ķ����� 
		//ʵ����һ��FileInputStream����
		FileInputStream fis = new FileInputStream("c:/myDoc/Hello.txt");
		//ʵ����һ��BufferedInputStream����
		BufferedInputStream bis = new BufferedInputStream(fis);
		//ʵ����һ��DataInputStream����
	    DataInputStream dis = new DataInputStream(bis);
	    //������
	    System.out.println(dis.readByte());
	    System.out.println( dis.readChar());
	    System.out.println(dis.readInt());
	    System.out.println(   dis.readUTF());
	    System.out.println("===���������===");
		//�ر���
	    dis.close();
	    bis.close();
	    fis.close();
	}
}
