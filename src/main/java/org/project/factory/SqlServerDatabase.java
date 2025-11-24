package org.project.factory;

public class SqlServerDatabase implements IDatabase {
    @Override
    public void connect() {
        IO.println("Connecting to SQL Server database...");
    }

    @Override
    public void executeQuery(String query) {
        IO.println("Executing query in SQL Server database: " + query);
    }
}
