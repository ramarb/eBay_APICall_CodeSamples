//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-661 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.27 at 04:06:26 PM PDT 
//


package ebay.apis.eblbasecomponents;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Contains the templates requested on input. 
 * 				Each SellingManagerTemplateType object in the response contains the data for one
 * 				Selling Manager template.
 * 			
 * 
 * <p>Java class for GetSellingManagerTemplatesResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSellingManagerTemplatesResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="SellingManagerTemplateDetailsArray" type="{urn:ebay:apis:eBLBaseComponents}SellingManagerTemplateDetailsArrayType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSellingManagerTemplatesResponseType", propOrder = {
    "sellingManagerTemplateDetailsArray"
})
public class GetSellingManagerTemplatesResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "SellingManagerTemplateDetailsArray")
    protected SellingManagerTemplateDetailsArrayType sellingManagerTemplateDetailsArray;

    /**
     * Gets the value of the sellingManagerTemplateDetailsArray property.
     * 
     * @return
     *     possible object is
     *     {@link SellingManagerTemplateDetailsArrayType }
     *     
     */
    public SellingManagerTemplateDetailsArrayType getSellingManagerTemplateDetailsArray() {
        return sellingManagerTemplateDetailsArray;
    }

    /**
     * Sets the value of the sellingManagerTemplateDetailsArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellingManagerTemplateDetailsArrayType }
     *     
     */
    public void setSellingManagerTemplateDetailsArray(SellingManagerTemplateDetailsArrayType value) {
        this.sellingManagerTemplateDetailsArray = value;
    }

}
