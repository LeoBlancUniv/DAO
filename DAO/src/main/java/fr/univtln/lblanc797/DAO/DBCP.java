package fr.univtln.lblanc797.DAO;

import fr.univtln.lblanc797.App;
import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class DBCP {
    private static BasicDataSource ds = new BasicDataSource();

    static {
        ds.setUrl(App.getProperty("dao.datasource.url"));
        ds.setUsername(App.getProperty("dao.datasource.username"));
        ds.setUsername(App.getProperty("dao.datasource.password"));

        ds.setMinIdle(5);
        ds.setMaxIdle(10);
        ds.setMaxOpenPreparedStatements(100); //check if this is right ?



    }

    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }
}
