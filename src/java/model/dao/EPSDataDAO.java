/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import com.google.code.morphia.Morphia;
import com.google.code.morphia.dao.BasicDAO;
import com.mongodb.Mongo;
import java.util.List;
import model.EPSData;

/**
 *
 * @author NicolasR
 */
public class EPSDataDAO extends BasicDAO<EPSData , Integer>{

    public EPSDataDAO(Mongo mongo, Morphia morphia, String dbName) {
        super(mongo, morphia, dbName);
    }
    public List findAll()
    {
        return ds.find(EPSData.class).asList();
        
    }

    
    
    
}
