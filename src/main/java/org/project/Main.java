import org.project.adapter.EmployeeAdapter;
import org.project.adapter.ITarget;
import org.project.factory.DataAnalyticsEngine;
import org.project.factory.DatabaseFactory;
import org.project.factory.DatabaseType;
import org.project.observer.ConcreteObserver;
import org.project.observer.Subject;

void main() throws InterruptedException {
    dbEngines();
    Thread.sleep(2000);
    IO.println();
    employeesAdapterDemo();
    Thread.sleep(2000);
    IO.println();
    observingThings();
}

void dbEngines() {
    var sqlEngine = new DataAnalyticsEngine(DatabaseFactory.createDatabase(DatabaseType.SQL_SERVER));
    sqlEngine.processData("Query to process data for SQL Server");

    var oracleEngine = new DataAnalyticsEngine(DatabaseFactory.createDatabase(DatabaseType.ORACLE));
    oracleEngine.processData("Query to process data for Oracle");
}

void employeesAdapterDemo() {
    var employeesArray = new String[][]{
            {"101", "John", "SE", "10000"},
            {"102", "Smith", "SE", "20000"},
            {"103", "Dev", "SSE", "30000"},
            {"104", "Pam", "SE", "40000"},
            {"105", "Sara", "SSE", "50000"}
    };

    IO.println("HR system passes employee string array to Adapter\n");
    ITarget target = new EmployeeAdapter();
    target.processCompanySalary(employeesArray);
}

void observingThings() throws InterruptedException {
    var redMi = new Subject("Red MI Mobile", 10000, "Out Of Stock");

    var user1 = new ConcreteObserver("Anurag");
    user1.addSubscriber(redMi);

    var user2 = new ConcreteObserver("Pranaya");
    user2.addSubscriber(redMi);

    var user3 = new ConcreteObserver("Priyanka");
    user3.addSubscriber(redMi);

    Thread.sleep(1000);

    IO.println("Red MI Mobile current state : " + redMi.getAvailability());
    IO.println();

    Thread.sleep(1000);

    user3.removeSubscriber(redMi);

    Thread.sleep(1000);
    redMi.setAvailability("Available");
}
