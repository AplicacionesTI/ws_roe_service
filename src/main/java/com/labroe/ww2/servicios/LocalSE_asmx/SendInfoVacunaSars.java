/**
 * SendInfoVacunaSars.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.labroe.ww2.servicios.LocalSE_asmx;

public class SendInfoVacunaSars  implements java.io.Serializable {
    private com.labroe.ww2.servicios.LocalSE_asmx.SendInfoVacunaSarsPInfoSarsXML pInfoSarsXML;

    public SendInfoVacunaSars() {
    }

    public SendInfoVacunaSars(
           com.labroe.ww2.servicios.LocalSE_asmx.SendInfoVacunaSarsPInfoSarsXML pInfoSarsXML) {
           this.pInfoSarsXML = pInfoSarsXML;
    }


    /**
     * Gets the pInfoSarsXML value for this SendInfoVacunaSars.
     * 
     * @return pInfoSarsXML
     */
    public com.labroe.ww2.servicios.LocalSE_asmx.SendInfoVacunaSarsPInfoSarsXML getPInfoSarsXML() {
        return pInfoSarsXML;
    }


    /**
     * Sets the pInfoSarsXML value for this SendInfoVacunaSars.
     * 
     * @param pInfoSarsXML
     */
    public void setPInfoSarsXML(com.labroe.ww2.servicios.LocalSE_asmx.SendInfoVacunaSarsPInfoSarsXML pInfoSarsXML) {
        this.pInfoSarsXML = pInfoSarsXML;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SendInfoVacunaSars)) return false;
        SendInfoVacunaSars other = (SendInfoVacunaSars) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pInfoSarsXML==null && other.getPInfoSarsXML()==null) || 
             (this.pInfoSarsXML!=null &&
              this.pInfoSarsXML.equals(other.getPInfoSarsXML())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getPInfoSarsXML() != null) {
            _hashCode += getPInfoSarsXML().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SendInfoVacunaSars.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://ww2.labroe.com/servicios/LocalSE.asmx", ">SendInfoVacunaSars"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PInfoSarsXML");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ww2.labroe.com/servicios/LocalSE.asmx", "pInfoSarsXML"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ww2.labroe.com/servicios/LocalSE.asmx", ">>SendInfoVacunaSars>pInfoSarsXML"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
