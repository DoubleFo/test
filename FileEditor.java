package fileDemo;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileEditor {
	public static void main(String[] args) throws IOException
	{
		//实例化一个File对象
		File file = new File("c:/myDoc/Test.txt");
		//判断文件是否存在以及是否为一个普通文件
		if(file.exists()&&file.isFile()){
			System.out.println("文件存在，覆盖内容");
		}else{
			System.out.println("文件不存在，新建一个文件");
		}
		/*
		 * 通过键盘输入获取向Text.txt写入的信息
		 */
		//实例化一个BufferedReader类
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String line=null;
		DataOutputStream dos=new DataOutputStream(new FileOutputStream(file));
		while((line=br.readLine())!=null){
			if(line.toLowerCase().equals("end")){
				break;
			}
			dos.writeBytes(line);
		}
		dos.close();
		br.close();
		
		BufferedReader br1=new BufferedReader(new FileReader(file));
		System.out.println("\n输出文件内容");
		while((line=br1.readLine())!=null){
			System.out.println(line);
		}	
		br1.close();
		System.out.println("结束");	
	}
	
}
