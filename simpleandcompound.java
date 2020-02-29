import java.util.*;
import java.io.*;
import org.apache.log4j.Logger;
public class simpleandcompound {
	    final static Logger logger = Logger.getLogger(simpleandcompound.class.getName());

       public void findSimpleInterest(double Principle,double time,double rate)
       {
      logger.debug(""+((Principle*time*rate)/100));
	  logger.info(""+((Principle*time*rate)/100));
       }
       public void findCompoundInterest(double Principle,double time,double rate,boolean yearly)
       {
      if(yearly)
      {
      logger.debug(""+(Principle*(Math.pow(1+(rate/100),time)-1)));
     logger.info(""+(Principle*(Math.pow(1+(rate/100),time)-1)));
      }
      else
      {
      logger.debug(""+(Principle*(Math.pow(1+((rate/2)/100),2*time)-1)));
	  logger.info(""+(Principle*(Math.pow(1+((rate/2)/100),2*time)-1)));
      }
       }
}
 
