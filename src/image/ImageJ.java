package image;


import ij.*;
import ij.process.*;
import javax.imageio.*;
import java.awt.image.BufferedImage;
import java.io.File;
import image.CatalogDefine;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map.Entry;
import org.apache.commons.io.*;
import image.FolderChooser;


public class ImageJ {
	public void make_directory(String s) throws IOException, InterruptedException
	{    
		CatalogDefine catalog =new CatalogDefine();
		catalog.catalogs();
	
		try{
			
			String baseName = FilenameUtils.getBaseName(s);
		new File(FolderChooser.selected_folder+"/Image/imagej/"+baseName).mkdir();
		
		 for (Entry<String, ArrayList<Integer>> entry : catalog.map.entrySet()) {
			 ImagePlus imp = IJ.openImage(FolderChooser.selected_folder+"/Image/all_image/"+baseName+".jpg");
			 ImageProcessor ip = imp.getProcessor();
			 ip.setInterpolationMethod(ImageProcessor.BILINEAR);
			 
			 ip = ip.resize(entry.getValue().get(0), entry.getValue().get(1));
			 BufferedImage croppedImage = ip.getBufferedImage();
			 ImageIO.write(croppedImage, "jpg", new File(FolderChooser.selected_folder+"/Image/imagej/"+baseName+"/"+baseName+entry.getKey()+".jpg"));
		
			 
	    }
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
