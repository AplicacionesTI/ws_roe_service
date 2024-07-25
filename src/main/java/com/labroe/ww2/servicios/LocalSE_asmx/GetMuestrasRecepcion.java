/**
 * GetMuestrasRecepcion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.labroe.ww2.servicios.LocalSE_asmx;

public class GetMuestrasRecepcion  implements java.io.Serializable {
    private java.lang.String pCodigoRecepcion;

    public GetMuestrasRecepcion() {
    }

    public GetMuestrasRecepcion(
           java.lang.String pCodigoRecepcion) {
           this.pCodigoRecepcion = pCodigoRecepcion;
    }


    /**
     * Gets the pCodigoRecepcion value for this GetMuestrasRecepcion.
     * 
     * @return pCodigoRecepcion
     */
    public java.lang.String getPCodigoRecepcion() {
        return pCodigoRecepcion;
    }


    /**
     * Sets the pCodigoRecepcion value for this GetMuestrasRecepcion.
     * 
     * @param pCodigoRecepcion
     */
    public void setPCodigoRecepcion(java.lang.String pCodigoRecepcion) {
        this.pCodigoRecepcion = pCodigoRecepcion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetMuestrasRecepcion)) return false;
        GetMuestrasRecepcion other = (GetMuestrasRecepcion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pCodigoRecepcion==null && other.getPCodigoRecepcion()==null) || 
             (this.pCodigoRecepcion!=null &&
              this.pCodigoRecepcion.equals(other.getPCodigoRecepcion())));
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
        if (getPCodigoRecepcion() != null) {
            _hashCode += getPCodigoRecepcion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetMuestrasRecepcion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://ww2.labroe.com/servicios/LocalSE.asmx", ">GetMuestrasRecepcion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCodigoRecepcion");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ww2.labroe.com/servicios/LocalSE.asmx", "pCodigoRecepcion"));
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
