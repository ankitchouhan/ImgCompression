package image;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class ImageController{
 
	 @RequestMapping(value = "/index", method = RequestMethod.GET)
   public ModelAndView hello1() {
      ModelAndView model=new ModelAndView("index"); 
return model;
   }
	 @RequestMapping(value = "/image", method = RequestMethod.GET)
   public ModelAndView index1() {
	      ModelAndView model=new ModelAndView("image"); 
	      return model;
	   }

   
}