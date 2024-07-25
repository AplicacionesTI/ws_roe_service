/**
 * SendOrdenAnular.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.labroe.ww2.servicios.LocalSE_asmx;

public class SendOrdenAnular  implements java.io.Serializable {
    private java.lang.String pCodigoOrden;

    public SendOrdenAnular() {
    }

    public SendOrdenAnular(
           java.lang.String pCodigoOrden) {
           this.pCodigoOrden = pCodigoOrden;
    }


    /**
     * Gets the pCodigoOrden value for this SendOrdenAnular.
     * 
     * @return pCodigoOrden
     */
    public java.lang.String getPCodigoOrden() {
        return pCodigoOrden;
    }


    /**
     * Sets the pCodigoOrden value for this SendOrdenAnular.
     * 
     * @param pCodigoOrden
     */
    public void setPCodigoOrden(java.lang.String pCodigoOrden) {
        this.pCodigoOrden = pCodigoOrden;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SendOrdenAnular)) return false;
        SendOrdenAnular other = (SendOrdenAnular) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pCodigoOrden==null && other.getPCodigoOrden()==null) || 
             (this.pCodigoOrden!=null &&
              this.pCodigoOrden.equals(other.getPCodigoOrden())));
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
        if (getPCodigoOrden() != null) {
            _hashCode += getPCodigoOrden().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SendOrdenAnular.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://ww2.labroe.com/servicios/LocalSE.asmx", ">SendOrdenAnular"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCodigoOrden");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ww2.labroe.com/servicios/LocalSE.asmx", "pCodigoOrden"));
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
