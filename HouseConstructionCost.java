import java.util.*;
import org.apache.log4j.Logger;
public class HouseConstructionCost {
	
	final static Logger logger = Logger.getLogger(HouseConstructionCost.class.getName());
	
public void estimateCost(String material,double area,boolean fullyAutomated)
{	
	
if(material.equals("standardMaterial") && fullyAutomated == false)
{
logger.debug(""+(1200*area));
logger.info(""+(1200*area));
}
else if(material.equals("aboveStandardMaterial") && fullyAutomated == false)
{
logger.debug(""+(1500*area));
logger.info(""+(1500*area));
}
else if(material.equals("highStandardMaterial") && fullyAutomated == false)
{
logger.debug(""+(1800*area));
logger.info(""+(1800*area));
}
else
{
logger.debug(""+(2500*area));
logger.info(""+(2500*area));
}
}
}
