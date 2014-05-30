/*******************************************************************************
 * Copyright (c) 2014 Spikes N.V.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Spikes - Initial implementation
 *******************************************************************************/
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.02 at 02:42:29 PM CEST 
//


package eu.artist.migration.mdt.dotnet.dbml2uml.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for Function complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Function">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Parameter" type="{http://schemas.microsoft.com/linqtosql/dbml/2007}Parameter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="ElementType" type="{http://schemas.microsoft.com/linqtosql/dbml/2007}Type" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="Return" type="{http://schemas.microsoft.com/linqtosql/dbml/2007}Return" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="Method" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AccessModifier" type="{http://schemas.microsoft.com/linqtosql/dbml/2007}AccessModifier" />
 *       &lt;attribute name="Modifier" type="{http://schemas.microsoft.com/linqtosql/dbml/2007}MemberModifier" />
 *       &lt;attribute name="HasMultipleResults" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="IsComposable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Function", propOrder = {
    "parameter",
    "elementType",
    "_return"
})
public class Function {

    @XmlElement(name = "Parameter")
    protected List<Parameter> parameter;
    @XmlElement(name = "ElementType")
    protected List<Type> elementType;
    @XmlElement(name = "Return")
    protected Return _return;
    @XmlAttribute(name = "Name", required = true)
    protected String name;
    @XmlAttribute(name = "Id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "Method")
    protected String method;
    @XmlAttribute(name = "AccessModifier")
    protected AccessModifier accessModifier;
    @XmlAttribute(name = "Modifier")
    protected MemberModifier modifier;
    @XmlAttribute(name = "HasMultipleResults")
    protected Boolean hasMultipleResults;
    @XmlAttribute(name = "IsComposable")
    protected Boolean isComposable;

    /**
     * Gets the value of the parameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Parameter }
     * 
     * 
     */
    public List<Parameter> getParameter() {
        if (parameter == null) {
            parameter = new ArrayList<Parameter>();
        }
        return this.parameter;
    }

    /**
     * Gets the value of the elementType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the elementType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElementType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Type }
     * 
     * 
     */
    public List<Type> getElementType() {
        if (elementType == null) {
            elementType = new ArrayList<Type>();
        }
        return this.elementType;
    }

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link Return }
     *     
     */
    public Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link Return }
     *     
     */
    public void setReturn(Return value) {
        this._return = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the method property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMethod() {
        return method;
    }

    /**
     * Sets the value of the method property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMethod(String value) {
        this.method = value;
    }

    /**
     * Gets the value of the accessModifier property.
     * 
     * @return
     *     possible object is
     *     {@link AccessModifier }
     *     
     */
    public AccessModifier getAccessModifier() {
        return accessModifier;
    }

    /**
     * Sets the value of the accessModifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessModifier }
     *     
     */
    public void setAccessModifier(AccessModifier value) {
        this.accessModifier = value;
    }

    /**
     * Gets the value of the modifier property.
     * 
     * @return
     *     possible object is
     *     {@link MemberModifier }
     *     
     */
    public MemberModifier getModifier() {
        return modifier;
    }

    /**
     * Sets the value of the modifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemberModifier }
     *     
     */
    public void setModifier(MemberModifier value) {
        this.modifier = value;
    }

    /**
     * Gets the value of the hasMultipleResults property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasMultipleResults() {
        return hasMultipleResults;
    }

    /**
     * Sets the value of the hasMultipleResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasMultipleResults(Boolean value) {
        this.hasMultipleResults = value;
    }

    /**
     * Gets the value of the isComposable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsComposable() {
        return isComposable;
    }

    /**
     * Sets the value of the isComposable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsComposable(Boolean value) {
        this.isComposable = value;
    }

}