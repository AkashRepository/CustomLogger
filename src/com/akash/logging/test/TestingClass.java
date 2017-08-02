package com.akash.logging.test;

import com.akash.logging.console.CustomConsoleLogger;
import com.akash.logging.file.CustomFileLogger;
import com.akash.logging.socket.CustomSocketLogger;

/**
 * @author Akash Tripathi
 * @brief Test Driver class for running test cases using Logging Java framework.
 * 
 * Test case 1. : For Console Logging using ConsoleHandler Class.
 * 
 * Test case 2. : For File Logging using FileHandler Class.It writes the logs in "FileHandler.txt" file.
 * 
 * Test case 3. : For Socket Logging using SocketHandler Class. Please ensure that a service is running on port 135 on localhost.
 */
public class TestingClass {
	
	public static final CustomConsoleLogger mCustomConsoleLogger = new CustomConsoleLogger(TestingClass.class.getName());
	public static final CustomFileLogger mCustomFileLogger = new CustomFileLogger(TestingClass.class.getName(),"FileHandler.txt");
	public static final CustomSocketLogger mCustomSocketLogger = new CustomSocketLogger(TestingClass.class.getName(),"localhost",135);

	public static void main (String args[]){
		try{
			
			/**
			 * Test case 1.
			 * function setLevel() @param Logging Level
			 */
			mCustomFileLogger.setLevel(CustomFileLogger.DEBUG);
			mCustomFileLogger.log("Test message.");
			
			/**
			 * Test case 2.
			 * function setLevel() @param Logging Level
			 */
			mCustomConsoleLogger.setLevel(CustomConsoleLogger.ALL);
			mCustomConsoleLogger.log("Test message.");
			
			/**
			 * Test case 3.
			 * function setLevel() @param Logging Level
			 * Please Run this only if a service is running on 135 port , localhost
			 */

			mCustomSocketLogger.setLevel(CustomConsoleLogger.ERROR);
			mCustomSocketLogger.log("Test message.");
			
			
			
		} catch(Exception ex){
			ex.printStackTrace();
		}
	}

}
