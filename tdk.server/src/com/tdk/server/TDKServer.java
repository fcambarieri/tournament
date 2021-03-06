/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tdk.server;

import com.tdk.domain.Establecimiento;
import com.tdk.domain.security.Usuario;
import com.tdk.server.services.CompetenciaServiceBean;
import com.tdk.server.services.PersonaServiceBean;
import com.tdk.server.services.SecurityServiceBean;
import com.tdk.server.services.TorneoServiceBean;
import com.tdk.server.services.UtilServiceBean;
import com.tdk.services.CompetenciaServiceRemote;
import com.tdk.services.PersonaServiceRemote;
import com.tdk.services.SecurityServiceRemote;
import com.tdk.services.TorneoServiceRemote;
import com.tdk.services.UtilServiceRemote;
import com.thorplatform.server.AbstractServer;
import com.thorplatform.server.RemotableServiceFactory;
import com.thorplatform.server.api.AbstractLoginServer;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fernando
 */
public class TDKServer extends AbstractServer {
    
    
    public TDKServer() {
        super("TDK Server");
        serverConfig.loadFileProperties("../conf/server.properties"); 
       
    }

    @Override
    protected void loadConfig() {
        String secureServer = serverConfig.get("server_secure");
        isSecure = ((secureServer == null) || !secureServer.equalsIgnoreCase("no"));
    }

    @Override
    protected Map getPersisnteceConfiguration() {
        Map props = new HashMap();
        props.put("hibernate.dialect", serverConfig.get("database_dialect"));
        props.put("hibernate.connection.driver_class", serverConfig.get("database_connection_driver_class"));
        props.put("hibernate.connection.url", serverConfig.get("database_url"));
        props.put("hibernate.connection.username", serverConfig.get("database_user"));
        props.put("hibernate.connection.password", serverConfig.get("database_password"));
        props.put("hibernate.max_fetch_depth", "0");
        //props.put("hibernate.show_sql", "true");
        return props;
    }

    @Override
    protected String getPersisnteceUnitName() {
        return "apiPU";
    }

    @Override
    @SuppressWarnings("empty-statement")
    protected AbstractLoginServer defineLoginServer() {
        return new AbstractLoginServer(jpaLocalServiceFactory) {

            @Override
            public Object validate(String username, String password) {
                Usuario u = jpaLocalServiceFactory.getService(SecurityServiceRemote.class).login(username, password);
                //Usuario u = new Usuario();
                //u.setUserName(username);
                return u;
            }

            @Override
            public RemotableServiceFactory getRemotableServiceFactory() {
                return new RemotableServiceFactoryImp();
            }

            @Override
            public Object getWorkPlace(String arg0) {
                return new Establecimiento(arg0);
            }
        };
    }

    @Override
    protected void defineAllServices() {
        defineService(PersonaServiceRemote.class, PersonaServiceBean.class);
        defineService(SecurityServiceRemote.class, SecurityServiceBean.class);
        defineService(TorneoServiceRemote.class, TorneoServiceBean.class);
        defineService(UtilServiceRemote.class, UtilServiceBean.class);
        defineService(CompetenciaServiceRemote.class, CompetenciaServiceBean.class);
    }

     public static void main(String arg[]) throws Exception {
        new TDKServer().runServer(arg);
    }

    @Override
    protected void bindAllServices() {
        try {
            exportService(PersonaServiceRemote.class);
            exportService(SecurityServiceRemote.class);
        } catch (Exception ex) {
            Logger.getLogger(TDKServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
