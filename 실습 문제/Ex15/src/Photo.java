import java.awt.*;
import java.io.*;
import javax.swing.*;

public class Photo extends JFrame{
	static int[][] inImage = new int[512][512];
	static int[][] outImage = new int[512][512];
	
	Container contentPane;

	public static void main(String[] args) throws Exception {
		
		loadImage();
		
		new Photo();
	}
	
	static public void loadImage() throws Exception{
		int i, k;
		
		File inFp;
		FileInputStream inFs;
		inFp = new File("data/prince.raw");
		inFs = new FileInputStream(inFp.getPath());
		
		// 위 4줄과 동일한 한줄 코드 
		// FileInputStream inFs = new FileInputStream(new File("data/prince.raw")); 
		
		for(i=0;i<512;i++) {
			for(k=0;k<512;k++) {
				inImage[i][k] = inFs.read();
				outImage[i][k] = inImage[i][k];
			}
		}
		
		inFs.close();
	}

}
