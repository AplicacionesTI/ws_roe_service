/**
 * SendInfoVacunaSarsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.labroe.ww2.servicios.LocalSE_asmx;

public class SendInfoVacunaSarsResponse  implements java.io.Serializable {
    private java.lang.String sendInfoVacunaSarsResult;

    public SendInfoVacunaSarsResponse() {
    }

    public SendInfoVacunaSarsResponse(
           java.lang.String sendInfoVacunaSarsResult) {
           this.sendInfoVacunaSarsResult = sendInfoVacunaSarsResult;
    }


    /**
     * Gets the sendInfoVacunaSarsResult value for this SendInfoVacunaSarsResponse.
     * 
     * @return sendInfoVacunaSarsResult
     */
    public java.lang.String getSendInfoVacunaSarsResult() {
        return sendInfoVacunaSarsResult;
    }


    /**
     * Sets the sendInfoVacunaSarsResult value for this SendInfoVacunaSarsResponse.
     * 
     * @param sendInfoVacunaSarsResult
     */
    public void setSendInfoVacunaSarsResult(java.lang.String sendInfoVacunaSarsResult) {
        this.sendInfoVacunaSarsResult = sendInfoVacunaSarsResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SendInfoVacunaSarsResponse)) return false;
        SendInfoVacunaSarsResponse other = (SendInfoVacunaSarsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sendInfoVacunaSarsResult==null && other.getSendInfoVacunaSarsResult()==null) || 
             (this.sendInfoVacunaSarsResult!=null &&
              this.sendInfoVacunaSarsResult.equals(other.getSendInfoVacunaSarsResult())));
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
        if (getSendInfoVacunaSarsResult() != null) {
            _hashCode += getSendInfoVacunaSarsResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SendInfoVacunaSarsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://ww2.labroe.com/servicios/LocalSE.asmx", ">SendInfoVacunaSarsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendInfoVacunaSarsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ww2.labroe.com/servicios/LocalSE.asmx", "SendInfoVacunaSarsResult"));
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
