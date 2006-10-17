/**
 * 
 */
package net.transformatorhuis.teapot;

import org.apache.log4j.Logger;

/**
 * @author cyberroadie
 *
 */
public class DrinkTea {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Logger logger = Logger.getLogger(Teapot.class);
		
        Teapot teapot = null;
        
		try {
			teapot = new Teapot();
		} catch (BrokenTeapotException e) {
			logger.fatal(e.toString());
			System.exit(1);
		}
        
		System.out.println("Result:/n" + teapot.toString());
		
	}

}
