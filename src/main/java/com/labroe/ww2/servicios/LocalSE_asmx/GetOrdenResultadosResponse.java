/**
 * GetOrdenResultadosResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.labroe.ww2.servicios.LocalSE_asmx;

public class GetOrdenResultadosResponse  implements java.io.Serializable {
    private java.lang.String getOrdenResultadosResult;

    public GetOrdenResultadosResponse() {
    }

    public GetOrdenResultadosResponse(
           java.lang.String getOrdenResultadosResult) {
           this.getOrdenResultadosResult = getOrdenResultadosResult;
    }


    /**
     * Gets the getOrdenResultadosResult value for this GetOrdenResultadosResponse.
     * 
     * @return getOrdenResultadosResult
     */
    public java.lang.String getGetOrdenResultadosResult() {
        return getOrdenResultadosResult;
    }


    /**
     * Sets the getOrdenResultadosResult value for this GetOrdenResultadosResponse.
     * 
     * @param getOrdenResultadosResult
     */
    public void setGetOrdenResultadosResult(java.lang.String getOrdenResultadosResult) {
        this.getOrdenResultadosResult = getOrdenResultadosResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetOrdenResultadosResponse)) return false;
        GetOrdenResultadosResponse other = (GetOrdenResultadosResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getOrdenResultadosResult==null && other.getGetOrdenResultadosResult()==null) || 
             (this.getOrdenResultadosResult!=null &&
              this.getOrdenResultadosResult.equals(other.getGetOrdenResultadosResult())));
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
        if (getGetOrdenResultadosResult() != null) {
            _hashCode += getGetOrdenResultadosResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetOrdenResultadosResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://ww2.labroe.com/servicios/LocalSE.asmx", ">GetOrdenResultadosResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getOrdenResultadosResult");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ww2.labroe.com/servicios/LocalSE.asmx", "GetOrdenResultadosResult"));
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
