import java.io.File;  
import java.io.FileOutputStream;  
import de.innosystec.unrar.Archive;  
import de.innosystec.unrar.rarfile.FileHeader;  
  
public class UnRARTools {
	/**
	 *   
	 * @param sourceRar 文件路径
	 * @param destDir 解压到路径
	 * @throws Exception
	 */
    public static void unrar(File sourceRar, File destDir) throws Exception {  
        Archive archive = null;  
        FileOutputStream fos = null;  
        System.out.println("Starting...");  
        try {  
            archive = new Archive(sourceRar);  
            FileHeader fh = archive.nextFileHeader();  
            int count = 0;  
            File destFileName = null;  
            while (fh != null) {  
                System.out.println((++count) + ") " + fh.getFileNameString());  
                String compressFileName = fh.getFileNameString().trim();  
                destFileName = new File(destDir.getAbsolutePath() + "/" + compressFileName);  
                if (fh.isDirectory()) {  
                    if (!destFileName.exists()) {  
                        destFileName.mkdirs();  
                    }  
                    fh = archive.nextFileHeader();  
                    continue;  
                }   
                if (!destFileName.getParentFile().exists()) {  
                    destFileName.getParentFile().mkdirs();  
                }  
                fos = new FileOutputStream(destFileName);  
                archive.extractFile(fh, fos);  
                fos.close();  
                fos = null;  
                fh = archive.nextFileHeader();  
            }  
            archive.close();  
            archive = null;  
            System.out.println("Finished !");  
        } catch (Exception e) {  
            throw e;  
        } finally {  
            if (fos != null) {  
                try {  
                    fos.close();  
                    fos = null;  
                } catch (Exception e) {  
                    //ignore  
                }  
            }  
            if (archive != null) {  
                try {  
                    archive.close();  
                    archive = null;  
                } catch (Exception e) {  
                    //ignore  
                }  
            }  
        }  
    }  
  
}  