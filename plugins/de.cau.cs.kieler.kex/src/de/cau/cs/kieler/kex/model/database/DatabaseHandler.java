/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kex.model.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Handles Database Connection to KIELER Examples Database. To
 * 
 * @author pkl
 * 
 */
public class DatabaseHandler {

    private static final String DRIVER = "org.postgresql.Driver";

    private static final String HOST = "localhost";

    private static final String PORT = "5432";

    private static final String DATABASE = "postgres";

    private static final String USER = "postgres";

    private static final String PASSWORD = "postgres";

    private Connection connection = null;

    /**
     * @return Url-string for postgreSQL-database connection
     */
    private String getUrl() {
        // PostgreSQL takes one of the following url-forms:
        // ================================================
        // jdbc:postgresql:database
        // jdbc:postgresql://host/database
        // jdbc:postgresql://host:port/database
        
        StringBuilder url = new StringBuilder("jdbc:postgresql:");
        if (HOST != null) {
            url.append("//" + HOST);
            
            if (PORT != null) {
                url.append(":" + PORT);
            }
            
            url.append("/");
        }
        url.append(DATABASE);
        
        return url.toString();
    }

    /**
     * loading the JDBC driver.
     */
    private void loadJdbcDriver() {
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("driver loaded");
    }

    /**
     * opening the connection.
     */
    private void openConnection() {
        try {
            connection = DriverManager.getConnection(getUrl(), USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println("connection opened");
    }

    /**
     * close the connection.
     */
    private void closeConnection() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println("\nconnection closed");
    }

    /**
     * loads examples of database.
     */
    public void loadExample() {
        loadJdbcDriver();
        openConnection();
        try {
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("select * from example");

            while (resultSet.next()) {
                System.out.println(resultSet.getString("title"));
            }

            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        closeConnection();
    }

}
