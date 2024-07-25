package com.labroe.ww2.servicios.LocalSE_asmx;

public class LocalSESoapProxy implements com.labroe.ww2.servicios.LocalSE_asmx.LocalSESoap {
  private String _endpoint = null;
  private com.labroe.ww2.servicios.LocalSE_asmx.LocalSESoap localSESoap = null;
  
  public LocalSESoapProxy() {
    _initLocalSESoapProxy();
  }
  
  public LocalSESoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initLocalSESoapProxy();
  }
  
  private void _initLocalSESoapProxy() {
    try {
      localSESoap = (new com.labroe.ww2.servicios.LocalSE_asmx.LocalSELocator()).getLocalSESoap();
      if (localSESoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)localSESoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)localSESoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (localSESoap != null)
      ((javax.xml.rpc.Stub)localSESoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.labroe.ww2.servicios.LocalSE_asmx.LocalSESoap getLocalSESoap() {
    if (localSESoap == null)
      _initLocalSESoapProxy();
    return localSESoap;
  }
  
  public java.lang.String sendOrden(com.labroe.ww2.servicios.LocalSE_asmx.SendOrdenPOrdenXML pOrdenXML) throws java.rmi.RemoteException{
    if (localSESoap == null)
      _initLocalSESoapProxy();
    return localSESoap.sendOrden(pOrdenXML);
  }
  
  public java.lang.String sendOrdenAnular(java.lang.String pCodigoOrden) throws java.rmi.RemoteException{
    if (localSESoap == null)
      _initLocalSESoapProxy();
    return localSESoap.sendOrdenAnular(pCodigoOrden);
  }
  
  public java.lang.String sendOrdenAnalisisAnular(com.labroe.ww2.servicios.LocalSE_asmx.SendOrdenAnalisisAnularPOrdenXML pOrdenXML) throws java.rmi.RemoteException{
    if (localSESoap == null)
      _initLocalSESoapProxy();
    return localSESoap.sendOrdenAnalisisAnular(pOrdenXML);
  }
  
  public java.lang.String sendMuestras(com.labroe.ww2.servicios.LocalSE_asmx.SendMuestrasPMuestrasXML pMuestrasXML) throws java.rmi.RemoteException{
    if (localSESoap == null)
      _initLocalSESoapProxy();
    return localSESoap.sendMuestras(pMuestrasXML);
  }
  
  public java.lang.String getOrden(java.lang.String pCodigoOrden) throws java.rmi.RemoteException{
    if (localSESoap == null)
      _initLocalSESoapProxy();
    return localSESoap.getOrden(pCodigoOrden);
  }
  
  public java.lang.String getOrdenResultados(java.lang.String pCodigoOrden) throws java.rmi.RemoteException{
    if (localSESoap == null)
      _initLocalSESoapProxy();
    return localSESoap.getOrdenResultados(pCodigoOrden);
  }
  
  public java.lang.String getMuestrasRecepcion(java.lang.String pCodigoRecepcion) throws java.rmi.RemoteException{
    if (localSESoap == null)
      _initLocalSESoapProxy();
    return localSESoap.getMuestrasRecepcion(pCodigoRecepcion);
  }
  
  public java.lang.String sendInfoVacunaSars(com.labroe.ww2.servicios.LocalSE_asmx.SendInfoVacunaSarsPInfoSarsXML pInfoSarsXML) throws java.rmi.RemoteException{
    if (localSESoap == null)
      _initLocalSESoapProxy();
    return localSESoap.sendInfoVacunaSars(pInfoSarsXML);
  }
  
  
}