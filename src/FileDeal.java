import java.io.File;
import java.io.IOException;
public class FileDeal {
	
	public static File getFile(String filePath) {
		if (filePath.length()>0) {
			return new File(filePath);
		}
		return null;
	}
	
	public static void deal(File file) {
		if (file.isFile()) {
			String[] strings = file.getName().split("\\.");
			String endF = strings[strings.length-1];
			if (endF.equals("rar")) {
				try {
					UnRARTools.unrar(file, file.getParentFile());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else if(endF.equals("zip")){
				System.out.println(file.getParentFile().getPath());
			}else {
				System.out.println(file.getPath());
			}
		}else if(file.isDirectory()){
			String[] files = file.list();
			for(String string:files) {
				File files1 = new File(file.getPath()+"\\"+string);
				deal(files1);
			}
		}
	}
	
	
}
