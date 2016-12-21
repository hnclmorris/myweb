package com.landray.kmss.dfm.ws.service.tims;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the com.landray.kmss.dfm.ws.service.tims
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

	private final static QName _AddOtherFlowResponse_QNAME = new QName(
			"http://tims.service.ws.dfm.kmss.landray.com/",
			"addOtherFlowResponse");
	private final static QName _AddOtherFlow_QNAME = new QName(
			"http://tims.service.ws.dfm.kmss.landray.com/", "addOtherFlow");
	private final static QName _Exception_QNAME = new QName(
			"http://tims.service.ws.dfm.kmss.landray.com/", "Exception");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package: com.landray.kmss.dfm.ws.service.tims
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link AddOtherFlow }
	 * 
	 */
	public AddOtherFlow createAddOtherFlow() {
		return new AddOtherFlow();
	}

	/**
	 * Create an instance of {@link Exception }
	 * 
	 */
	public Exception createException() {
		return new Exception();
	}

	/**
	 * Create an instance of {@link AddOtherFlowResponse }
	 * 
	 */
	public AddOtherFlowResponse createAddOtherFlowResponse() {
		return new AddOtherFlowResponse();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link AddOtherFlowResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://tims.service.ws.dfm.kmss.landray.com/", name = "addOtherFlowResponse")
	public JAXBElement<AddOtherFlowResponse> createAddOtherFlowResponse(
			AddOtherFlowResponse value) {
		return new JAXBElement<AddOtherFlowResponse>(
				_AddOtherFlowResponse_QNAME, AddOtherFlowResponse.class, null,
				value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link AddOtherFlow }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://tims.service.ws.dfm.kmss.landray.com/", name = "addOtherFlow")
	public JAXBElement<AddOtherFlow> createAddOtherFlow(AddOtherFlow value) {
		return new JAXBElement<AddOtherFlow>(_AddOtherFlow_QNAME,
				AddOtherFlow.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Exception }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://tims.service.ws.dfm.kmss.landray.com/", name = "Exception")
	public JAXBElement<Exception> createException(Exception value) {
		return new JAXBElement<Exception>(_Exception_QNAME, Exception.class,
				null, value);
	}

}
