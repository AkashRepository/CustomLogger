package com.akash.logging.console;

import java.util.logging.ConsoleHandler;
import java.util.logging.LogRecord;
/**
 * @author Akash Tripathi
 * @brief CustomHandler class for Console 
 */
public class CustomConsoleHandler extends ConsoleHandler{

	@Override
	public void close() throws SecurityException {
		super.close();
	}

	@Override
	public void flush() {
		super.flush();
	}	

	@Override
	public void publish(LogRecord record) {
		super.publish(record);
	}

}
