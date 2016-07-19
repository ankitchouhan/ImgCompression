package image;



import java.util.ArrayList;
import java.util.HashMap;


public class CatalogDefine { 
	
	public   HashMap<String,ArrayList<Integer>> map = new HashMap<String,ArrayList<Integer>>();
	
	public  void inputData(String name,int height,int width,int quality)
	{  
		ArrayList<Integer> size = new ArrayList<Integer>();
	    size.add(height);
	    size.add(width);
	    size.add(quality);
		map.put(name,size);
	}
public  void catalogs() {
		
	    inputData("_catalog",176,255,80);
	    inputData("_cart",75,75,80);
	    inputData("_product",277,400,90);
	    inputData("_gallery",37,54,80);
	    inputData("_zoom",762,1100,90 );
	    inputData("_related",135,194,90);
	    inputData("_list",79,79,80 );
	    inputData("_product_click_zoom",576,831,100);
	    inputData("_mproduct",220,318,90);
	    inputData("_mcatalog",98,142,80);	    
	    inputData("_product2",357,515,95);
	    inputData("_gallery2",54,78,80);	    
	    inputData("_mcatalog_xhdpi",278,402,100);
	    inputData("_mpdp_xhdpi",480,700,95);
	    inputData("_mpdpdg_xhdpi",640,910,100);
	    inputData("_mpdpdgi_xhdpi",74,108,100);
	    inputData("_mhrpi_xhdpi",186,268,90);
	    inputData("_mcart_xhdpi",120,180,100);
	    inputData("_mcat_ldpi",70,101,80);
	    inputData("_bag",75,108,80);
	    inputData("_catalog_l",248,338,80);
	    inputData("_catalog_m",248,338,80);
	    inputData("_catalog_s",300,410,80);
	    inputData("_catalog_xs",200,273,80);
	    inputData("_catalog_xxs",148,202,80);
	    inputData("_pdp_slider_l",440,600,95);
	    inputData("_pdp_slider_m",391,533,95);
	    inputData("_pdp_slider_s",352,480,95);
	    inputData("_pdp_slider_xs",310,424,95); 
	    inputData("_pdp_slider_xxs",295,403,95);
	    inputData("_new_cart",88,120,80);
	    inputData("_catalog_xs",200,273,80);
	    //Zoom image configurations for new site with high resolution for fast networks
	    inputData("_zoom_l",1025,1400,100);
	    inputData("_zoom_s",768,1049,100);
	    inputData("_zoom_xs",500,683,100);
	    inputData("_zoom_xxs",320,437,100); 
	   // Zoom image configurations for new site with lower resolution

	    inputData("_zoom_l_lr",1025,1400,80);
	    inputData("_zoom_s_lr",768,1049,80);
	    inputData("_zoom_xs_lr",500,683,80);
	    inputData("_zoom_xxs_lr",320,437,80); 
	    		
	    inputData("_catalog_l_lr",248,338,70);
	    inputData("_catalog_m_lr",248,338,70);
	    inputData("_catalog_s_lr",300,410,70);
	    inputData("_catalog_xs_lr",200,273,70); 
	    inputData("_catalog_xxs_lr",148,202,70);
	    
	    inputData("_pdp_slider_l_lr",440,600,70);
	    inputData("_pdp_slider_m_lr",391,533,70);
	    inputData("_pdp_slider_s_lr",352,480,70); 
	    
   		
	    inputData("_pdp_slider_xs_lr",310,424,70);
	    inputData("_pdp_slider_xxs_lr",295,403,70);
	    inputData("_new_cart_lr",88,120,70);
	    inputData("_large",440,600,80); 
	    inputData("_medium",391,553,80);

 		
	    inputData("_small",352,480,80);
	    inputData("_xs",310,424,80);
	    inputData("_xxs",295,403,80);
	  
  		// Landscape Configurations
	    
	   // inputData("_ol-pdp_slider_l",718,526,95);
	   // inputData("_ol-pdp_slider_m",619, 453,95);
	   // inputData("_ol-pdp_slider_s",635,465,95);
	    //inputData("_ol-pdp_slider_xs",415,304,95); 
	    //inputData("_ol-pdp_slider_xxs",358,262,95);
		
	    inputData("_ol-catalog",176,255,80);
	    inputData("_ol-catalog_l",248,338,80);
	    inputData("_ol-catalog_m",248,338,80);
	
	    inputData("_ol-catalog_s",300,410,80);
	    inputData("_ol-catalog_xs",200,273,80);
	    	
	    // Landscape for Catalog Pages, Low resolution.
	    
	    inputData("_ol-catalog_l_lr",248,338,70);
	    inputData("_ol-catalog_m_lr",248,338,70);
	    inputData("_ol-catalog_s_lr",300,410,70);
	    inputData("_ol-catalog_xs_lr",200,273,70); 
	    inputData("_ol-catalog_xxs_lr",148,202,70);
    
	   // inputData("_ol-product",545,400,95);
	   // inputData("_ol-product1",341,250,95);
	    inputData("_ol-cart",75,75,80);
	    inputData("_ol-new_cart_lr",88,120,70); 
	    inputData("_ol-new_cart",88,120,80);
	}
	
	
	
}