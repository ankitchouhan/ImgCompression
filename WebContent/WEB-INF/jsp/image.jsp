<%@ page import="image.ImageMagicK"%>
<%@ page import="image.DIPJava" %>
<%@ page import="image.ImageJ" %>
<%@ page import="image.CatalogDefine" %>
<%@page import="java.awt.image.BufferedImage"%>
<%@page import="javax.imageio.ImageIO"%>
<%@page import="java.io.*"%>
<%@page import="java.util.*" %>  
<%@ page import= "java.util.HashMap"%>
<%@page import=" java.util.Map.Entry"%>
<%@page import="java.nio.file.Files" %> 
<%@ page import=" org.apache.commons.io.*" %>
<%@page import="sun.misc.BASE64Decoder"%>
<%@ page import="image.FolderChooser" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Image Inserting</title>
</head>


<style type="text/css">

h1,form {
    text-align:center;
     color:#000000;
      }

 body
      {
      background-color: white;
       background-position: center;
      }
      h1.double {border-style: double;}
</style>   
    
<style>

input[type=text] 

{ 
padding:5px; border:2px solid #ccc; 
-webkit-border-radius: 5px;
    border-radius: 5px;
}

input[type=submit]  
{ 
padding:5px 15px; background:#fff; border:0 none;
    cursor:pointer;
    -webkit-border-radius: 5px;
    border-radius: 5px; }
.scroll
{
  width:100%;
    height: 600px;
    overflow: scroll;
    

}
div.container{
    text-align:center;
    border:1px solid #666;
    background-color: lavender;
     padding: 2px;
  margin-right:200px;
  margin-bottom:10px;
}

  
    .IM
    {
     display: inline-block;
    
    }  
    .DIP
    {
    display: inline-block;
    }  

  
    div
    {
   background-color: lavender;
     padding: 1px;
  margin: 2px;
  
    }    
        ul
{
    list-style-type: none;
    width=50%;
    
}
     li {
  float: left;
  width=50%;
 
 

  
}
 li img {
  float: left;
  background: #EFEFEF;
border: 1px solid #AAA;
  
}

h5{
font-weight: bold;
}


   
   



</style>

<h1 class="double">Image Review</h1>
<body background="Abstract_Blue_Background_with_Wavy_Lines.jpg">
  
<form>
Image: <input type="text" placeholder="Image URL" id="image1" name="image1"style="width: 1000px;" ></input>
  <input type="submit" value="Go">
    </form>
          
<%


String k=request.getParameter("image1");
String Base=FilenameUtils.getBaseName(k);
File theDir = new File(FolderChooser.selected_folder+"/Image/Imagemagick/"+Base);

// if the directory does not exist, create it
if (!theDir.exists())
{
	
	
	
	 
	DIPJava td =new DIPJava();
	td.make_directory(k);
	ImageMagicK tc = new ImageMagicK();
	tc.make_directory1(k); 
	ImageJ tim=new ImageJ();
	tim.make_directory(k);
	
}
     try
     {
	 CatalogDefine tc = new CatalogDefine();
	 tc.catalogs();
	 List<Map.Entry<String,ArrayList<Integer>>> entries = new ArrayList<Map.Entry<String,ArrayList<Integer>>>(tc.map.entrySet());

     Collections.sort(entries, new Comparator<Map.Entry<String,ArrayList<Integer>>>() {
         public int compare(Map.Entry<String,ArrayList<Integer>> l1, Map.Entry<String,ArrayList<Integer>> l2) {
             return l1.getValue().get(0).compareTo(l2.getValue().get(0));
         }
     });
     
     
     
for (Map.Entry<String,ArrayList<Integer>> entry : entries) {
 
 
 File imgObj_i = new File(FolderChooser.selected_folder+"/Image/Imagemagick/"+Base+"/"+Base+entry.getKey()+".jpg");
long imgLength_i =  imgObj_i.length();



BufferedImage image = ImageIO.read(new File(FolderChooser.selected_folder+"/Image/Imagemagick/"+Base+"/"+Base+entry.getKey()+".jpg"));//give the path of an image
int width_i          = image.getWidth();
int height_i         = image.getHeight();
ByteArrayOutputStream baos = new ByteArrayOutputStream();
ImageIO.write( image, "jpg", baos );
baos.flush();
byte[] imageInByteArray = baos.toByteArray();
baos.close();
String b64 = javax.xml.bind.DatatypeConverter.printBase64Binary(imageInByteArray);



File imgObj_d = new File(FolderChooser.selected_folder+"/Image/DIP_Java/"+Base+"/"+Base+entry.getKey()+".jpg");
long imgLength_d =  imgObj_d.length();


BufferedImage image_d = ImageIO.read(new File(FolderChooser.selected_folder+"/Image/DIP_Java/"+Base+"/"+Base+entry.getKey()+".jpg"));//give the path of an image
int width_d          = image_d.getWidth();
int height_d         = image_d.getHeight();
ByteArrayOutputStream baos_d = new ByteArrayOutputStream();
ImageIO.write( image_d, "jpg", baos_d );
baos_d.flush();
byte[] imageInByteArray_d = baos_d.toByteArray();
baos_d.close();
String b64_d = javax.xml.bind.DatatypeConverter.printBase64Binary(imageInByteArray_d);


File imgObj_im = new File(FolderChooser.selected_folder+"/Image/imagej/"+Base+"/"+Base+entry.getKey()+".jpg");

long imgLength_im =  imgObj_im.length();


BufferedImage image_im = ImageIO.read(new File(FolderChooser.selected_folder+"/Image/imagej/"+Base+"/"+Base+entry.getKey()+".jpg"));//give the path of an image
int width_im          = image_im.getWidth();
int height_im         = image_im.getHeight();
ByteArrayOutputStream baos_im = new ByteArrayOutputStream();
ImageIO.write( image_im, "jpg", baos_im );
baos_im.flush();
byte[] imageInByteArray_im = baos_im.toByteArray();
baos_im.close();
String b64_im = javax.xml.bind.DatatypeConverter.printBase64Binary(imageInByteArray_im);

int flag=0;
if(height_im>700)
{
	flag=1;
}





%>
        
<ul id="film_strip">
           <li>
           
           <div class="container">
           <% 
           if(flag==1) 
           { %>
           <div class="scroll">
           
          <%}
           else
           {  %>
           <div>
           <%} %>
           <div class="IM">
           <figure>
           
           <h5><figcaption>Imagemagick</figcaption></h5>
                  <img src="data:image/jpg;base64, <%=b64%>" alt="image not found"/>
                    <h5> <figcaption>Size(KB): <% out.println(String.format("%.2f",(float)(imgLength_i)/1024));%></figcaption></h5></figure>
                    </div>
           
           <div class="DIP">
              
           
            <figure>
           <h5> <figcaption>DIP_Java</figcaption></h5>
           <img src="data:image_d/jpg;base64, <%=b64_d%>" alt="image not found"/>
           <h5>  <figcaption>Size(KB): <% out.println(String.format("%.2f",(float)(imgLength_d)/1024));%></figcaption></h5></figure>
           </div>
           
            <div class="IM">
           <figure>
           
           <h5><figcaption>ImageJ</figcaption></h5>
                  <img src="data:image_im/jpg;base64, <%=b64_im%>" alt="image not found"/>
                    <h5> <figcaption>Size(KB): <% out.println(String.format("%.2f",(float)(imgLength_im)/1024));%></figcaption></h5></figure>
                    </div>
          </div>
           
          <h5> <figcaption>Dimension[<%out.println(width_d);%>,<%out.println(height_d);%>]
           <br>Quality:<%out.println(entry.getValue().get(2)); %>
            <br> Diff(KB) [Imagemagick-DIP_java]: <%out.println(String.format("%.2f",(float)(imgLength_i-imgLength_d)/1024));%> </figcaption>
            Diff(KB) [Imagemagick-ImageJ]: <%out.println(String.format("%.2f",(float)(imgLength_i-imgLength_im)/1024));%> </figcaption>
           </h5></div>
           
                    
       
 </div>

           </li>
           </ul>    
           <%
   }
     }
     catch(Exception e){
    	 %>
    	 <script>
    	 window.alert("Invalid Input");
    	 </script>
    	 <%
     }
%>
        
</body>
</html>