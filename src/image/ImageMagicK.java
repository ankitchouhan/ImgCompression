package image;

import java.io.File;
import java.io.IOException;
import image.CatalogDefine;
import java.util.ArrayList;
import java.util.Map.Entry;
import org.im4java.core.ConvertCmd;
import org.im4java.core.IM4JavaException;
import org.im4java.core.IMOperation;
import org.apache.commons.io.*;
import image.FolderChooser;
 
 
public class ImageMagicK 
{
	
	
	
	
	
	public void make_directory1(String s) throws IOException, InterruptedException, IM4JavaException 
	{   
		CatalogDefine catalog =new CatalogDefine();
		catalog.catalogs();
	
		try{
			
			
			String baseName = FilenameUtils.getBaseName(s);
		new File(FolderChooser.selected_folder+"/Image/Imagemagick/"+baseName).mkdir();
		 ConvertCmd cmd = new ConvertCmd();
		 for (Entry<String, ArrayList<Integer>> entry : catalog.map.entrySet()) {
		 IMOperation op = new IMOperation(); 
		
		op.addImage(FolderChooser.selected_folder+"/Image/all_image/"+baseName+".jpg");
		op.resize(entry.getValue().get(0), entry.getValue().get(1));
		op.quality((double)entry.getValue().get(2));
		
		op.addImage(FolderChooser.selected_folder+"/Image/Imagemagick/"+baseName+"/"+baseName+entry.getKey()+".jpg");  
		cmd.run(op);  
		  }
		 
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
	}    
		
		
		
	
}

