package com.dawnpro.rd.connector.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cncId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="flowId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="actionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="approvalOperName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="approvalIdea" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rejectDetail" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="costDetail" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "cncId", "flowId", "actionId",
		"approvalOperName", "approvalIdea", "rejectDetail", "costDetail" })
@XmlRootElement(name = "putCncStateInfo")
public class PutCncStateInfo {

	@XmlElement(required = true, nillable = true)
	protected String cncId;
	@XmlElement(required = true, nillable = true)
	protected String flowId;
	@XmlElement(required = true, nillable = true)
	protected String actionId;
	@XmlElement(required = true, nillable = true)
	protected String approvalOperName;
	@XmlElement(required = true, nillable = true)
	protected String approvalIdea;
	@XmlElement(required = true, nillable = true)
	protected String rejectDetail;
	@XmlElement(required = true, nillable = true)
	protected String costDetail;

	/**
	 * Gets the value of the cncId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCncId() {
		return cncId;
	}

	/**
	 * Sets the value of the cncId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCncId(String value) {
		this.cncId = value;
	}

	/**
	 * Gets the value of the flowId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFlowId() {
		return flowId;
	}

	/**
	 * Sets the value of the flowId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFlowId(String value) {
		this.flowId = value;
	}

	/**
	 * Gets the value of the actionId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getActionId() {
		return actionId;
	}

	/**
	 * Sets the value of the actionId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setActionId(String value) {
		this.actionId = value;
	}

	/**
	 * Gets the value of the approvalOperName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getApprovalOperName() {
		return approvalOperName;
	}

	/**
	 * Sets the value of the approvalOperName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setApprovalOperName(String value) {
		this.approvalOperName = value;
	}

	/**
	 * Gets the value of the approvalIdea property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getApprovalIdea() {
		return approvalIdea;
	}

	/**
	 * Sets the value of the approvalIdea property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setApprovalIdea(String value) {
		this.approvalIdea = value;
	}

	/**
	 * Gets the value of the rejectDetail property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRejectDetail() {
		return rejectDetail;
	}

	/**
	 * Sets the value of the rejectDetail property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRejectDetail(String value) {
		this.rejectDetail = value;
	}

	/**
	 * Gets the value of the costDetail property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCostDetail() {
		return costDetail;
	}

	/**
	 * Sets the value of the costDetail property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCostDetail(String value) {
		this.costDetail = value;
	}

}
