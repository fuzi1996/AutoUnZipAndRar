import java.io.File;
/**
 * ��Ҫ����Բ���zip��rar�����ļ�����
 * ����÷�
 * @author 11829
 *
 */
public class AutoUnZipAndRar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = args[0];
		File file = FileDeal.getFile(path);
		FileDeal.deal(file);
	}

}
