package com.chain;

public class Chaindemo
{
	public static Abstractlogger getchainoflogger()
	{
		Abstractlogger e = new Errorlogger(Abstractlogger.error);
		Abstractlogger f = new Filelogger(Abstractlogger.debug);
		Abstractlogger c = new Consolelogger(Abstractlogger.info);

		e.setnextlogger(f);
		f.setnextlogger(c);
		
		return e;
	}
	public static void main(String[] args) 
	{	
		Abstractlogger logger = getchainoflogger();
		logger.logmessage(Abstractlogger.error, "This is error information");
		logger.logmessage(Abstractlogger.debug, "This is debug information");
		logger.logmessage(Abstractlogger.info, "This is console information");
	}

}
