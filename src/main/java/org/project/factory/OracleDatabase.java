package org.project.factory;

public class OracleDatabase implements IDatabase {
    @Override
    public void connect() {
        IO.println("Connecting to Oracle database...");
    }

    @Override
    public void executeQuery(String query) {
        IO.println("Executing query in Oracle database: " + query);
    }
}
