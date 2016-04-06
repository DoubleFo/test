package dateInputStreamAndOuputStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/*
 * 使用DataOutputStream和DataInputStream 写和读的数据类型顺序保持一致
 */
public class DateIO {
	public static void main(String[] args) throws IOException{
		//使用DataOutStream进行文件的写操作
		//实例化一个FileInputStream对象
		FileOutputStream fos = new FileOutputStream("c:/myDoc/Hello.txt");
		//实例化一个BufferedOutputStream对象
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		//实例化一个DataOutputStream对象
		DataOutputStream dos = new DataOutputStream(bos);
		//写操作
		dos.write(1);
		dos.writeChar('a');
		dos.writeInt(32);
		dos.writeUTF("nihao");
		//关闭流
		dos.close();
		bos.close();
		fos.close();
		System.out.println("===写入完毕===");
		
		//使用DataOInputStream进行文件的读操作 
		//实例化一个FileInputStream对象
		FileInputStream fis = new FileInputStream("c:/myDoc/Hello.txt");
		//实例化一个BufferedInputStream对象
		BufferedInputStream bis = new BufferedInputStream(fis);
		//实例化一个DataInputStream对象
	    DataInputStream dis = new DataInputStream(bis);
	    //读操作
	    System.out.println(dis.readByte());
	    System.out.println( dis.readChar());
	    System.out.println(dis.readInt());
	    System.out.println(   dis.readUTF());
	    System.out.println("===读操作完毕===");
		//关闭流
	    dis.close();
	    bis.close();
	    fis.close();
	}
}
