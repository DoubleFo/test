package test1;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileMethods {
	/*
	 * 使用File类操作文件（普通文件、目录)
	 * 新建文件（File类的cteateNewFile（）方法）
	 * 删除文件（File类的delete（）方法）
	 */
	public static void main(String[] args) throws IOException
	{
		//实例化File类的对象
		File file=new File("c:/myDoc/Hello.txt");
		//查看文件的属性
		System.out.println("文件名："+file.getName());
		System.out.println("文件相对路径"+file.getPath());
		System.out.println("文件绝对路径"+file.getAbsolutePath());
		System.out.println(file.exists()?"文件存在":"文件不存在D");
		System.out.println(file.isFile()?"文件是普通文件":"文件可能是一个命名管道");
		System.out.println(file.isDirectory()?"文件是目录":"文件不是目录");
		System.out.println();
		if(file.canRead()){
			System.out.println("当前文件可读");
		}else{
			System.out.println("当前文件不可读");
		}
		if(file.canWrite()){
			System.out.println("当前文件可写");
		}else{
			System.out.println("当前文件不可写");
		}
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date date=new Date(file.lastModified());
		System.out.println("当前文件的最后修改日期是："+sdf.format(date));
		//新建文件
		if(!file.exists()){
			file.createNewFile();
		}
		/*删除文件
		if(file.exists()){
			file.delete();
		}*/
		
	}
}
