package com.akash.logging.console;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.akash.logging.formatter.CustomFormatter;

public class CustomConsoleLogger{

	static private CustomConsoleHandler mCustomHandler =  new CustomConsoleHandler();
	static private CustomFormatter mCustomFormatter = new CustomFormatter();

	public static final String ALL = "ALL";
	public static final String DEBUG = "DEBUG";
	public static final String ERROR = "ERROR";
	public static final String OFF = "OFF";

	private Logger logger = null;

	public Logger getLogger() {
		return logger;
	}

	public void setLogger(Logger logger) {
		this.logger = logger;
	}

	public CustomConsoleLogger(String name){

		logger = Logger.getLogger(name);
		this.initialize();
	}


	public void setLevel(String level) throws NoSuchFieldError{
		switch(level){
		case ALL : {
			getLogger().setLevel(Level.CONFIG); 
			mCustomHandler.setLevel(Level.CONFIG);
			mCustomFormatter.setmLevel(ALL);
			mCustomHandler.setFormatter(mCustomFormatter);
			break;
		}
		case DEBUG : {
			getLogger().setLevel(Level.FINE); 
			mCustomHandler.setLevel(Level.FINE);
			mCustomFormatter.setmLevel(DEBUG);
			mCustomHandler.setFormatter(mCustomFormatter);
			break;
		}
		case ERROR : {
			getLogger().setLevel(Level.SEVERE);  
			mCustomHandler.setLevel(Level.SEVERE);
			mCustomFormatter.setmLevel(ERROR);
			mCustomHandler.setFormatter(mCustomFormatter);
			break;
		}
		case OFF : {
			getLogger().setLevel(Level.OFF);  
			mCustomHandler.setLevel(Level.OFF);
			mCustomFormatter.setmLevel(OFF);
			mCustomHandler.setFormatter(mCustomFormatter);
			break;
		}
		default :  throw new NoSuchFieldError("No such Level exists");
		}
	}

	/**
	 * @author Akash Tripathi
	 * @brief function to attach handler and formatter to the custom logger class.
	 */
	public void initialize(){
		getLogger().setUseParentHandlers(false);
		mCustomHandler.setFormatter(mCustomFormatter);
		getLogger().addHandler(mCustomHandler);
	}

	/**
	 * @author Akash Tripathi
	 * @brief function to write logs.
	 */
	public void log(String string) {
		Logger lLogger = getLogger();
		if(lLogger.isLoggable(lLogger.getLevel())){
			lLogger.log(getLogger().getLevel(),string);
		} else {
			lLogger.log(Level.SEVERE, "Cannot be logged");
		}
	}
}
