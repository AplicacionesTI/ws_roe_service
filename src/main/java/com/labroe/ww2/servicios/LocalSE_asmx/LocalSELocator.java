/**
 * LocalSELocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.labroe.ww2.servicios.LocalSE_asmx;

public class LocalSELocator extends org.apache.axis.client.Service implements com.labroe.ww2.servicios.LocalSE_asmx.LocalSE {

    public LocalSELocator() {
    }


    public LocalSELocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public LocalSELocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for LocalSESoap
    private java.lang.String LocalSESoap_address = "https://ww2.labroe.com/servicios/LocalSE.asmx";

    public java.lang.String getLocalSESoapAddress() {
        return LocalSESoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String LocalSESoapWSDDServiceName = "LocalSESoap";

    public java.lang.String getLocalSESoapWSDDServiceName() {
        return LocalSESoapWSDDServiceName;
    }

    public void setLocalSESoapWSDDServiceName(java.lang.String name) {
        LocalSESoapWSDDServiceName = name;
    }

    public com.labroe.ww2.servicios.LocalSE_asmx.LocalSESoap getLocalSESoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(LocalSESoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getLocalSESoap(endpoint);
    }

    public com.labroe.ww2.servicios.LocalSE_asmx.LocalSESoap getLocalSESoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.labroe.ww2.servicios.LocalSE_asmx.LocalSESoapStub _stub = new com.labroe.ww2.servicios.LocalSE_asmx.LocalSESoapStub(portAddress, this);
            _stub.setPortName(getLocalSESoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setLocalSESoapEndpointAddress(java.lang.String address) {
        LocalSESoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.labroe.ww2.servicios.LocalSE_asmx.LocalSESoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.labroe.ww2.servicios.LocalSE_asmx.LocalSESoapStub _stub = new com.labroe.ww2.servicios.LocalSE_asmx.LocalSESoapStub(new java.net.URL(LocalSESoap_address), this);
                _stub.setPortName(getLocalSESoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("LocalSESoap".equals(inputPortName)) {
            return getLocalSESoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("https://ww2.labroe.com/servicios/LocalSE.asmx", "LocalSE");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("https://ww2.labroe.com/servicios/LocalSE.asmx", "LocalSESoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("LocalSESoap".equals(portName)) {
            setLocalSESoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
