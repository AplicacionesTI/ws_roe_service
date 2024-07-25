/**
 * LocalSESoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.labroe.ww2.servicios.LocalSE_asmx;

public interface LocalSESoap extends java.rmi.Remote {
    public java.lang.String sendOrden(com.labroe.ww2.servicios.LocalSE_asmx.SendOrdenPOrdenXML pOrdenXML) throws java.rmi.RemoteException;
    public java.lang.String sendOrdenAnular(java.lang.String pCodigoOrden) throws java.rmi.RemoteException;
    public java.lang.String sendOrdenAnalisisAnular(com.labroe.ww2.servicios.LocalSE_asmx.SendOrdenAnalisisAnularPOrdenXML pOrdenXML) throws java.rmi.RemoteException;
    public java.lang.String sendMuestras(com.labroe.ww2.servicios.LocalSE_asmx.SendMuestrasPMuestrasXML pMuestrasXML) throws java.rmi.RemoteException;
    public java.lang.String getOrden(java.lang.String pCodigoOrden) throws java.rmi.RemoteException;
    public java.lang.String getOrdenResultados(java.lang.String pCodigoOrden) throws java.rmi.RemoteException;
    public java.lang.String getMuestrasRecepcion(java.lang.String pCodigoRecepcion) throws java.rmi.RemoteException;
    public java.lang.String sendInfoVacunaSars(com.labroe.ww2.servicios.LocalSE_asmx.SendInfoVacunaSarsPInfoSarsXML pInfoSarsXML) throws java.rmi.RemoteException;
}
