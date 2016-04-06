package bufferedWriter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/*
 * BufferedWriter
 * 1.实例化一个输入流的对象
 * 2.实例化BufferedWriter对象 修饰输入流对象，
 * 3。通过。write写操作
 * 4。清空缓冲区
 * 5.关闭流
 */
/*
 * BufferReader
 * 1.实例化一个输入流对象
 * 2.实例化BufferReader对象
 * 3.通过一个while循环读取所有内容  利用了。readline()不为空
 * 4.关闭流
 */
public class BufferedWriterTest {
	public static void main(String[] args) throws IOException{
		/* 实例化一个FileWriter对象*/
		FileWriter fw=new FileWriter("c:/myDoc/Hello.txt");
		//实例化一个BufferedWriter对象//
		BufferedWriter bw=new BufferedWriter(fw);
		//通过BufferedWriter对象bw添加内容
		bw.write("大家好");
		bw.newLine();
		bw.write("哈哈");
		bw.flush();
		//清空缓冲区
		bw.close();
		fw.close();
		//关闭流
		//BufferedWriter会覆盖指定文件原有内容
		
		FileReader fr=new FileReader("c:/myDoc/Hello.txt");
		//实例化一个输入流对象 这里是fr 即FileReader类的对象
		BufferedReader br=new BufferedReader(fr);
		//实例化BufferedReader 装饰fr
		String str;
		//int num = 1;
		while((str=br.readLine())!=null)
		{
			//System.out.println("读取第"+num+"行的内容是：");
			System.out.println(str);
			//num++;
		}
		br.close();
		fr.close();
		
		
		
		
	}

}
