package com.akash.logging.formatter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class CustomFormatter extends Formatter{

    private static final DateFormat mDataFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
    private String mLevel = new String();
    
    public String getmLevel() {
		return mLevel;
	}
	public void setmLevel(String mLevel) {
		this.mLevel = mLevel;
	}

	/**
	 * @author Akash Tripathi
	 * @brief function to format the logs in human readable format.
	 */
	@Override
    public String format(LogRecord pLogRecord) {
	// TODO Auto-generated method stub
	StringBuilder lStringBuilder = new StringBuilder();
	lStringBuilder.append("=-=-=-=-=-=-=-=-=-=-MESSAGE START=-=-=-=-=-=-=-=-=-=-=-=\n");
	lStringBuilder.append("Time : "+mDataFormat.format(new Date(pLogRecord.getMillis()))).append("\n");
	lStringBuilder.append("Function Call : [").append(pLogRecord.getSourceClassName()).append(".");
	lStringBuilder.append(pLogRecord.getSourceMethodName()).append("]\n");
	lStringBuilder.append("Logging Level : [").append(getmLevel()).append("]\n");
	lStringBuilder.append("Message : "+formatMessage(pLogRecord));
	lStringBuilder.append("\n=-=-=-=-=-=-=-=-=-=-MESSAGE END=-=-=-=-=-=-=-=-=-=-=-=-=");
	lStringBuilder.append("\n");
	return lStringBuilder.toString();
    }

}
