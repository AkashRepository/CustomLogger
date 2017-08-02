package com.akash.logging.socket;

import java.io.IOException;
import java.util.logging.LogRecord;
import java.util.logging.SocketHandler;

/**
 * @author Akash Tripathi
 * @brief CustomHandler class for Socket 
 */
public class CustomSocketHandler extends SocketHandler{
	public CustomSocketHandler(String pServer, int pPort) throws IOException {
		super(pServer, pPort);
	}

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
