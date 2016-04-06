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
		//ʵ����һ��File����
		File file = new File("c:/myDoc/Test.txt");
		//�ж��ļ��Ƿ�����Լ��Ƿ�Ϊһ����ͨ�ļ�
		if(file.exists()&&file.isFile()){
			System.out.println("�ļ����ڣ���������");
		}else{
			System.out.println("�ļ������ڣ��½�һ���ļ�");
		}
		/*
		 * ͨ�����������ȡ��Text.txtд�����Ϣ
		 */
		//ʵ����һ��BufferedReader��
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
		System.out.println("\n����ļ�����");
		while((line=br1.readLine())!=null){
			System.out.println(line);
		}	
		br1.close();
		System.out.println("����");	
	}
	
}
