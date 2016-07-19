package image;

import java.io.File;
import image.CatalogDefine;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;
import org.imgscalr.Scalr;
import org.imgscalr.Scalr.Method;
import java.awt.image.*;
import javax.imageio.*; 
import javax.imageio.stream.ImageOutputStream; 
import org.apache.commons.io.*;
import image.FolderChooser;
 
 
public class DIPJava
{
	

	
	public void make_directory(String s) throws IOException, InterruptedException
	{    
		CatalogDefine catalog =new CatalogDefine();
		catalog.catalogs();
	
	try{
		InputStream in = new URL(s).openStream();
		String baseName = FilenameUtils.getBaseName(s);
	    Files.copy(in, Paths.get(FolderChooser.selected_folder+"/Image/all_image/"+baseName+".jpg"));
	    new File(FolderChooser.selected_folder+"/Image/DIP_Java/"+baseName).mkdir();
	    
	    for (Entry<String, ArrayList<Integer>> entry : catalog.map.entrySet()) {
	
	
	File input = new File(FolderChooser.selected_folder+"/Image/all_image/"+baseName+".jpg"); 
	BufferedImage image = ImageIO.read(input);  

	BufferedImage scaledImg = Scalr.resize(image, Method.QUALITY, entry.getValue().get(0),entry.getValue().get(1));
    File compressedImageFile = new File(FolderChooser.selected_folder+"/Image/DIP_Java/"+baseName+"/"+baseName+entry.getKey()+".jpg");
    OutputStream os =new FileOutputStream(compressedImageFile);

    Iterator<ImageWriter>writers =
    ImageIO.getImageWritersByFormatName("jpg");
    ImageWriter writer = (ImageWriter) writers.next();

    ImageOutputStream ios = ImageIO.createImageOutputStream(os);
    writer.setOutput(ios);

    ImageWriteParam param = writer.getDefaultWriteParam();
    param.setCompressionMode(ImageWriteParam.MODE_EXPLICIT);
   float r= (float) (entry.getValue().get(2)*0.01);
    param.setCompressionQuality(r);
    
    writer.write(null, new IIOImage(scaledImg,null ,null ), param);
    os.close();
    ios.close();
    writer.dispose();
	
	
	
	    }
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	
		
		}

