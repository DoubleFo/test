package bufferedWriter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/*
 * BufferedWriter
 * 1.ʵ����һ���������Ķ���
 * 2.ʵ����BufferedWriter���� ��������������
 * 3��ͨ����writeд����
 * 4����ջ�����
 * 5.�ر���
 */
/*
 * BufferReader
 * 1.ʵ����һ������������
 * 2.ʵ����BufferReader����
 * 3.ͨ��һ��whileѭ����ȡ��������  �����ˡ�readline()��Ϊ��
 * 4.�ر���
 */
public class BufferedWriterTest {
	public static void main(String[] args) throws IOException{
		/* ʵ����һ��FileWriter����*/
		FileWriter fw=new FileWriter("c:/myDoc/Hello.txt");
		//ʵ����һ��BufferedWriter����//
		BufferedWriter bw=new BufferedWriter(fw);
		//ͨ��BufferedWriter����bw�������
		bw.write("��Һ�");
		bw.newLine();
		bw.write("����");
		bw.flush();
		//��ջ�����
		bw.close();
		fw.close();
		//�ر���
		//BufferedWriter�Ḳ��ָ���ļ�ԭ������
		
		FileReader fr=new FileReader("c:/myDoc/Hello.txt");
		//ʵ����һ������������ ������fr ��FileReader��Ķ���
		BufferedReader br=new BufferedReader(fr);
		//ʵ����BufferedReader װ��fr
		String str;
		//int num = 1;
		while((str=br.readLine())!=null)
		{
			//System.out.println("��ȡ��"+num+"�е������ǣ�");
			System.out.println(str);
			//num++;
		}
		br.close();
		fr.close();
		
		
		
		
	}

}
