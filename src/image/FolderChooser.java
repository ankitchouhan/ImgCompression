package image;

import javax.swing.JFileChooser;
import java.io.File;

public class FolderChooser {
	static public String  selected_folder;
	
	/*public String normalizePath(String path) {
		   return path.replaceAll("\\", "/");
		}*/
	
	public void folder()
	{
		JFileChooser fileChooser = new JFileChooser();
		 fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		    fileChooser.setAcceptAllFileFilterUsed(false);
		fileChooser.setCurrentDirectory(fileChooser.getCurrentDirectory());
		
		int result = fileChooser.showOpenDialog(fileChooser);
		if (result == JFileChooser.APPROVE_OPTION) {
		   File selectedFile = fileChooser.getSelectedFile();
		   selected_folder= selectedFile.getAbsolutePath();
		   
		   new File(selected_folder+"/Image").mkdir();
		   new File(selected_folder+"/Image/all_image").mkdir();
		   new File(selected_folder+"/Image/imagej").mkdir();
		   new File(selected_folder+"/Image/DIP_Java").mkdir();
		   new File(selected_folder+"/Image/Imagemagick").mkdir();
	
		}	
	}

}	

