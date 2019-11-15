package ExceptionHandling;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.UnsupportedEncodingException;

public class JdkLogging {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        Logger logger = Logger.getGlobal();
//        logger.info("start process...");
//        logger.warning("memory is running out...");
//        logger.fine("ignored.");
//        logger.severe("process will be terminated...");
		//excise
		Logger logger = Logger.getLogger(JdkLogging.class.getName());
		logger.info("Start process...");
		try {
			"".getBytes("invalidCharsetName");
		}catch(UnsupportedEncodingException e){
			logger.severe("Exception");
		}
		logger.info("Process end.");
	}

}
