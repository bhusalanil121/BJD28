package com.takeo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    
    {
    	SQLConnection mySqlCon = new SQLConnection();
		mySqlCon.sqlConnection();
		
		ProductInsert pi = new ProductInsert();
	     pi.productInsert();
    
//        ProductUpdate pu = new ProductUpdate();
//        pu.productUpdate();
//        
//        ProductDelete  pd = new ProductDelete();
//        pd.productDelete();
        
      
    	
    }
}
