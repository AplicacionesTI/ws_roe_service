/**
 * SendOrdenAnularResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.labroe.ww2.servicios.LocalSE_asmx;

public class SendOrdenAnularResponse  implements java.io.Serializable {
    private java.lang.String sendOrdenAnularResult;

    public SendOrdenAnularResponse() {
    }

    public SendOrdenAnularResponse(
           java.lang.String sendOrdenAnularResult) {
           this.sendOrdenAnularResult = sendOrdenAnularResult;
    }


    /**
     * Gets the sendOrdenAnularResult value for this SendOrdenAnularResponse.
     * 
     * @return sendOrdenAnularResult
     */
    public java.lang.String getSendOrdenAnularResult() {
        return sendOrdenAnularResult;
    }


    /**
     * Sets the sendOrdenAnularResult value for this SendOrdenAnularResponse.
     * 
     * @param sendOrdenAnularResult
     */
    public void setSendOrdenAnularResult(java.lang.String sendOrdenAnularResult) {
        this.sendOrdenAnularResult = sendOrdenAnularResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SendOrdenAnularResponse)) return false;
        SendOrdenAnularResponse other = (SendOrdenAnularResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sendOrdenAnularResult==null && other.getSendOrdenAnularResult()==null) || 
             (this.sendOrdenAnularResult!=null &&
              this.sendOrdenAnularResult.equals(other.getSendOrdenAnularResult())));
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
        if (getSendOrdenAnularResult() != null) {
            _hashCode += getSendOrdenAnularResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SendOrdenAnularResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://ww2.labroe.com/servicios/LocalSE.asmx", ">SendOrdenAnularResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendOrdenAnularResult");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ww2.labroe.com/servicios/LocalSE.asmx", "SendOrdenAnularResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
