<%@page import="java.awt.image.BufferedImage"%>
<%@page import="javax.imageio.ImageIO"%>
<%@page import="java.io.*"%>
<%@ page import="image.FolderChooser" %>
<%@page import="java.util.*" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
 <style type="text/css">
 
 input[type=text] {padding:5px; border:2px solid #ccc; 
-webkit-border-radius: 5px;
    border-radius: 5px;
}
input[type=submit] 

{ padding:5px 15px; background:#fff; border:0 none;
    cursor:pointer;
    -webkit-border-radius: 5px;
    border-radius: 5px; }
 
h1,form {
    text-align:center;
     color:#FFFFFF;
      }
      body
      {
       background: url(http://indianonlineseller.com/wp-content/uploads/2015/10/jabong-com.jpg) no-repeat center center fixed; 
       background-size:120% 150% ;
 
      }
      h1.double {border-style: double;}
</style>   
    
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Image Inserting</title>
</head>
   
     <body>



  <h1 class="double">Library Comparison</h1><br><br><br><br>

<form action =/ImageLibrary/image method="get">
Image URL: <input type="text"    placeholder="Image URL" id="image1" name="image1"style="width: 1000px; " ></input>
         <input type="submit" value="Go">
    </form>
   <% 

FolderChooser f = new FolderChooser(); 
f.folder();
%>

       
   
            
</body>
</html>