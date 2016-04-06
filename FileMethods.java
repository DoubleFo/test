package test1;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileMethods {
	/*
	 * ʹ��File������ļ�����ͨ�ļ���Ŀ¼)
	 * �½��ļ���File���cteateNewFile����������
	 * ɾ���ļ���File���delete����������
	 */
	public static void main(String[] args) throws IOException
	{
		//ʵ����File��Ķ���
		File file=new File("c:/myDoc/Hello.txt");
		//�鿴�ļ�������
		System.out.println("�ļ�����"+file.getName());
		System.out.println("�ļ����·��"+file.getPath());
		System.out.println("�ļ�����·��"+file.getAbsolutePath());
		System.out.println(file.exists()?"�ļ�����":"�ļ�������D");
		System.out.println(file.isFile()?"�ļ�����ͨ�ļ�":"�ļ�������һ�������ܵ�");
		System.out.println(file.isDirectory()?"�ļ���Ŀ¼":"�ļ�����Ŀ¼");
		System.out.println();
		if(file.canRead()){
			System.out.println("��ǰ�ļ��ɶ�");
		}else{
			System.out.println("��ǰ�ļ����ɶ�");
		}
		if(file.canWrite()){
			System.out.println("��ǰ�ļ���д");
		}else{
			System.out.println("��ǰ�ļ�����д");
		}
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date date=new Date(file.lastModified());
		System.out.println("��ǰ�ļ�������޸������ǣ�"+sdf.format(date));
		//�½��ļ�
		if(!file.exists()){
			file.createNewFile();
		}
		/*ɾ���ļ�
		if(file.exists()){
			file.delete();
		}*/
		
	}
}
