package com.landray.kmss.third.ekp.java.oms.in.ehr;

import javax.xml.ws.WebFault;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.3-hudson-390-
 * Generated source version: 2.0
 * 
 */
@WebFault(name = "Exception", targetNamespace = "http://out.webservice.organization.sys.kmss.landray.com/")
public class Exception_Exception extends java.lang.Exception {

	/**
	 * Java type that goes as soapenv:Fault detail element.
	 * 
	 */
	private com.landray.kmss.third.ekp.java.oms.in.ehr.Exception faultInfo;

	/**
	 * 
	 * @param message
	 * @param faultInfo
	 */
	public Exception_Exception(String message,
			com.landray.kmss.third.ekp.java.oms.in.ehr.Exception faultInfo) {
		super(message);
		this.faultInfo = faultInfo;
	}

	/**
	 * 
	 * @param message
	 * @param faultInfo
	 * @param cause
	 */
	public Exception_Exception(String message,
			com.landray.kmss.third.ekp.java.oms.in.ehr.Exception faultInfo,
			Throwable cause) {
		super(message, cause);
		this.faultInfo = faultInfo;
	}

	/**
	 * 
	 * @return returns fault bean:
	 *         com.landray.kmss.third.ekp.java.oms.in.ehr.Exception
	 */
	public com.landray.kmss.third.ekp.java.oms.in.ehr.Exception getFaultInfo() {
		return faultInfo;
	}

}