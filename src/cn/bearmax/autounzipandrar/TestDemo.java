package cn.bearmax.autounzipandrar;
import java.io.File;

import org.junit.Test;

public class TestDemo {
	@Test
	public void test() {
		String path = "D:\\SSM���������Ӧ��ʵս\\ssm���������Ӧ��ʵս";
		File file = FileDeal.getFile(path);
		FileDeal.deal(file);
	}
	
	@Test
	public void test2() {
		String string = "D:\\temp\\";
		String string2 = "ʾ��1-2��ʹ�ù���ע��.rar";
		File sourceRar = new File(string+string2);
		File destDir = new File(string);
		try {
			UnRARTools.unrar(sourceRar, destDir);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
