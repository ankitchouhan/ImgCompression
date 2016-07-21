# ImgCompression


ImgCompression is the compression of images using different open source image libraries using java.
Here there are three different libraries are used. 
First one is the ImageMagick,second is the DIP i.e Digital Image Processing (provided by the java) and the third one is ImageJ.
All three libraries are compared on the basis of different image variants with different image quality. 
Different library can compress image with different quality.
Comparison is used to choose appropriate library according to demand, 
as during sending image on network it is required to send image with minimum size but with maximum quality,as its always the first priority to reduce the bandwidth usage.

Steps to use it.

For Ubuntu

1.Install Imagemagick.

2.Install Apache Tomcat Server

3.Install "Ant" or just open the project with the eclipse.

4.Now,open "build.properties" file from the project.

5.Give the path of your tomcat installation directory in the "appserver.home".

6.Now,just run the build.xml file as an ant build(in eclipse) or simply from the terminal.

7.Output will be the war file of the project in the webapps folder of tomcat.

8.Run the tomcat server from bin directory of tomcat by "./startup.sh"

9.Open the browser and give the URL as "localhost:8080/ImgCompression/index".

10.Select folder path to make directory and to save compressed images.

11.Give the valid url of any image.

12.And Check the result.
