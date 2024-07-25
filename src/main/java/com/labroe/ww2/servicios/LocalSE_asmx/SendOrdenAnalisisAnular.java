/**
 * SendOrdenAnalisisAnular.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.labroe.ww2.servicios.LocalSE_asmx;

public class SendOrdenAnalisisAnular  implements java.io.Serializable {
    private com.labroe.ww2.servicios.LocalSE_asmx.SendOrdenAnalisisAnularPOrdenXML pOrdenXML;

    public SendOrdenAnalisisAnular() {
    }

    public SendOrdenAnalisisAnular(
           com.labroe.ww2.servicios.LocalSE_asmx.SendOrdenAnalisisAnularPOrdenXML pOrdenXML) {
           this.pOrdenXML = pOrdenXML;
    }


    /**
     * Gets the pOrdenXML value for this SendOrdenAnalisisAnular.
     * 
     * @return pOrdenXML
     */
    public com.labroe.ww2.servicios.LocalSE_asmx.SendOrdenAnalisisAnularPOrdenXML getPOrdenXML() {
        return pOrdenXML;
    }


    /**
     * Sets the pOrdenXML value for this SendOrdenAnalisisAnular.
     * 
     * @param pOrdenXML
     */
    public void setPOrdenXML(com.labroe.ww2.servicios.LocalSE_asmx.SendOrdenAnalisisAnularPOrdenXML pOrdenXML) {
        this.pOrdenXML = pOrdenXML;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SendOrdenAnalisisAnular)) return false;
        SendOrdenAnalisisAnular other = (SendOrdenAnalisisAnular) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pOrdenXML==null && other.getPOrdenXML()==null) || 
             (this.pOrdenXML!=null &&
              this.pOrdenXML.equals(other.getPOrdenXML())));
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
        if (getPOrdenXML() != null) {
            _hashCode += getPOrdenXML().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SendOrdenAnalisisAnular.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://ww2.labroe.com/servicios/LocalSE.asmx", ">SendOrdenAnalisisAnular"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("POrdenXML");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ww2.labroe.com/servicios/LocalSE.asmx", "pOrdenXML"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ww2.labroe.com/servicios/LocalSE.asmx", ">>SendOrdenAnalisisAnular>pOrdenXML"));
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
