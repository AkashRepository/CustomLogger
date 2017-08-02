package com.akash.logging.file;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.LogRecord;

/**
 * @author Akash Tripathi
 * @brief CustomHandler class for File 
 */
public class CustomFileHandler extends FileHandler{
	public CustomFileHandler(String pFileName) throws IOException, SecurityException {
		super(pFileName);
	}

	@Override
	public void close() throws SecurityException {
//		getmHandler().close();
		super.close();
	}

	@Override
	public void flush() {
//		getmHandler().flush();
		super.flush();
	}	

	@Override
	public void publish(LogRecord record) {
//		getmHandler().publish(record);
		super.publish(record);
	}
}
