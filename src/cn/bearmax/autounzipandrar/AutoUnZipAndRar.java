package cn.bearmax.autounzipandrar;
import java.io.File;
import java.util.Scanner;
/**
 * 需要补充对不是zip和rar类型文件处理
 * 添加用法
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
