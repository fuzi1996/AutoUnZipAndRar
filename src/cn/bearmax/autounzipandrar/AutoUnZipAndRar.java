package cn.bearmax.autounzipandrar;
import java.io.File;
import java.util.Scanner;
/**
 * ��Ҫ����Բ���zip��rar�����ļ�����
 * ����÷�
 * @author 11829
 *
 */
public class AutoUnZipAndRar {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = new Scanner(System.in).nextLine();
		File file = FileDeal.getFile(path);
		FileDeal.deal(file);
	}

}
