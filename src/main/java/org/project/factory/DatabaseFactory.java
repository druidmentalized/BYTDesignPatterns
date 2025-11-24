package org.project.factory;

public final class DatabaseFactory {
    private DatabaseFactory() {
    }

    public static IDatabase createDatabase(DatabaseType type) {
        return switch (type) {
            case SQL_SERVER -> new SqlServerDatabase();
            case ORACLE -> new OracleDatabase();
        };
    }
}
