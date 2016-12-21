package com.landray.kmss.third.ekp.java.oms.in.ehr;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the com.landray.kmss.third.ekp.java.oms.in.ehr
 * package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

	private final static QName _GetElementsBaseInfo_QNAME = new QName(
			"http://out.webservice.organization.sys.kmss.landray.com/",
			"getElementsBaseInfo");
	private final static QName _GetElementsBaseInfoResponse_QNAME = new QName(
			"http://out.webservice.organization.sys.kmss.landray.com/",
			"getElementsBaseInfoResponse");
	private final static QName _Exception_QNAME = new QName(
			"http://out.webservice.organization.sys.kmss.landray.com/",
			"Exception");
	private final static QName _GetUpdatedElements_QNAME = new QName(
			"http://out.webservice.organization.sys.kmss.landray.com/",
			"getUpdatedElements");
	private final static QName _GetUpdatedElementsResponse_QNAME = new QName(
			"http://out.webservice.organization.sys.kmss.landray.com/",
			"getUpdatedElementsResponse");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package:
	 * com.landray.kmss.third.ekp.java.oms.in.ehr
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link SysSynchroGetOrgContext }
	 * 
	 */
	public SysSynchroGetOrgContext createSysSynchroGetOrgContext() {
		return new SysSynchroGetOrgContext();
	}

	/**
	 * Create an instance of {@link GetUpdatedElements }
	 * 
	 */
	public GetUpdatedElements createGetUpdatedElements() {
		return new GetUpdatedElements();
	}

	/**
	 * Create an instance of {@link GetElementsBaseInfoResponse }
	 * 
	 */
	public GetElementsBaseInfoResponse createGetElementsBaseInfoResponse() {
		return new GetElementsBaseInfoResponse();
	}

	/**
	 * Create an instance of {@link GetUpdatedElementsResponse }
	 * 
	 */
	public GetUpdatedElementsResponse createGetUpdatedElementsResponse() {
		return new GetUpdatedElementsResponse();
	}

	/**
	 * Create an instance of {@link SysSynchroGetOrgBaseInfoContext }
	 * 
	 */
	public SysSynchroGetOrgBaseInfoContext createSysSynchroGetOrgBaseInfoContext() {
		return new SysSynchroGetOrgBaseInfoContext();
	}

	/**
	 * Create an instance of {@link Exception }
	 * 
	 */
	public Exception createException() {
		return new Exception();
	}

	/**
	 * Create an instance of {@link SysSynchroOrgResult }
	 * 
	 */
	public SysSynchroOrgResult createSysSynchroOrgResult() {
		return new SysSynchroOrgResult();
	}

	/**
	 * Create an instance of {@link GetElementsBaseInfo }
	 * 
	 */
	public GetElementsBaseInfo createGetElementsBaseInfo() {
		return new GetElementsBaseInfo();
	}

	/**
	 * Create an instance of {@link SysSynchroGetOrgInfoContext }
	 * 
	 */
	public SysSynchroGetOrgInfoContext createSysSynchroGetOrgInfoContext() {
		return new SysSynchroGetOrgInfoContext();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetElementsBaseInfo }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://out.webservice.organization.sys.kmss.landray.com/", name = "getElementsBaseInfo")
	public JAXBElement<GetElementsBaseInfo> createGetElementsBaseInfo(
			GetElementsBaseInfo value) {
		return new JAXBElement<GetElementsBaseInfo>(_GetElementsBaseInfo_QNAME,
				GetElementsBaseInfo.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetElementsBaseInfoResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://out.webservice.organization.sys.kmss.landray.com/", name = "getElementsBaseInfoResponse")
	public JAXBElement<GetElementsBaseInfoResponse> createGetElementsBaseInfoResponse(
			GetElementsBaseInfoResponse value) {
		return new JAXBElement<GetElementsBaseInfoResponse>(
				_GetElementsBaseInfoResponse_QNAME,
				GetElementsBaseInfoResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Exception }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://out.webservice.organization.sys.kmss.landray.com/", name = "Exception")
	public JAXBElement<Exception> createException(Exception value) {
		return new JAXBElement<Exception>(_Exception_QNAME, Exception.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetUpdatedElements }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://out.webservice.organization.sys.kmss.landray.com/", name = "getUpdatedElements")
	public JAXBElement<GetUpdatedElements> createGetUpdatedElements(
			GetUpdatedElements value) {
		return new JAXBElement<GetUpdatedElements>(_GetUpdatedElements_QNAME,
				GetUpdatedElements.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetUpdatedElementsResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://out.webservice.organization.sys.kmss.landray.com/", name = "getUpdatedElementsResponse")
	public JAXBElement<GetUpdatedElementsResponse> createGetUpdatedElementsResponse(
			GetUpdatedElementsResponse value) {
		return new JAXBElement<GetUpdatedElementsResponse>(
				_GetUpdatedElementsResponse_QNAME,
				GetUpdatedElementsResponse.class, null, value);
	}

}
