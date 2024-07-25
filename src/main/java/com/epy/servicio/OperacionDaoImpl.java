package com.epy.servicio;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.labroe.ww2.servicios.LocalSE_asmx.LocalSE;
import com.labroe.ww2.servicios.LocalSE_asmx.LocalSELocator;
import com.labroe.ww2.servicios.LocalSE_asmx.LocalSESoap;

public class OperacionDaoImpl implements OperacionDao {

	private static final Logger LOG = LogManager.getLogger(OperacionDaoImpl.class);

	@Override
	public String getOrdenResultados(String codigoOrden) {
		String rpta = "";
		try {
			LocalSE soap = new LocalSELocator();
			LocalSESoap proxy = soap.getLocalSESoap();
			rpta = proxy.getOrdenResultados(codigoOrden);
			LOG.info("erick");
		} catch (Exception ex) {

		} finally {

		}
		return rpta;
	}

	@Override
	public String getMuestras(String codigoRecepcion) {
		String rpta = "";
		try {
			LocalSE soap = new LocalSELocator();
			LocalSESoap proxy = soap.getLocalSESoap();
			rpta = proxy.getMuestrasRecepcion(codigoRecepcion);
		} catch (Exception ex) {

		} finally {

		}
		return rpta;
	}

}
