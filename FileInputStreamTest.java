package file.inputstrem;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//import java.io.FileInputStream;
public class FileInputStreamTest {

	/*
	 * FileInputStream 读取文件内容
	 * .available计算可读取的字节数
	 * 。read() 读取文件内容，返回值为int类型，默认读取结束返回值-1，提示读取完毕；read()方法是“单程"
	 * 格式转换  举例插入 char c=(char)data;
	 * 使用流操作包括FileOutputStream和FileInputStream 最后一定要关闭流，编程习惯！
	 * println和print：println输出内容每次输出完毕自动换行
	 */
	public static void main(String[] args) throws IOException{
		FileInputStream fis=new FileInputStream("c:/myDoc/Hello.txt");
		/*
		 * 错误：class文件名设置为FileInputStream 与自带类java.io.FileInputStream名称冲突
		 * 报错：The import java.io.FileInputStream conflicts with a type defined in the same file
		 * 同一文件里引入的java.io.FileInputStream类与定义类冲突
		 */
		int data;
		System.out.println("可读取的字节数"+fis.available());
		/*System.out.println("=========文件内容=======");
		while((data=fis.read())!=-1){
			System.out.println(data+" ");
		}*/
		System.out.println("========文件读取完毕=======");
		System.out.println("===将文件读取内容转化===");
		while((data=fis.read())!=-1){
			/*char s=(char)data;*/
			System.out.print((char)data);	
		}
		fis.close();
	}
}
