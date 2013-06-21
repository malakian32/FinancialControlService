/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import com.google.code.morphia.Morphia;
import com.mongodb.Mongo;
import java.net.UnknownHostException;
import model.EPSData;

/**
 *
 * @author NicolasR
 */
public class SingleDAO {

    private Mongo mongo = null;
    private Morphia morphia = null;
    private String dbName = "EPSFinancial";
    private EPSDataDAO EPSDAO;

    public SingleDAO() {


        try {
            this.mongo = new Mongo("localhost", 27017);

        } catch (UnknownHostException e) {
        }
        
        morphia = new Morphia();
        morphia.map(EPSData.class);
        
        EPSDAO = new EPSDataDAO(mongo,morphia,dbName);
        
    
    }

    public EPSDataDAO getEPSDAO() {
        return EPSDAO;
    }
    
    
    
    public synchronized static SingleDAO getInstance() {
		while (m_this == null) {
			m_this = new SingleDAO();
		}
		return m_this;
    }
    
    private static SingleDAO m_this;
}
