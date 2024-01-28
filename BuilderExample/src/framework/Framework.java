package framework;

public class Framework {

    private String name;
    private String db;
    private String dbUser;
    private String dbPassword;
    private String dbHost;
    private boolean tests;
    private boolean webpack;
    private boolean full;

    public Framework(String name, String db, String dbUser, String dbPassword, String dbHost, boolean tests, boolean webpack, boolean full) {
        this.name = name;
        this.db = db;
        this.dbUser = dbUser;
        this.dbPassword = dbPassword;
        this.dbHost = dbHost;
        this.tests = tests;
        this.webpack = webpack;
        this.full = full;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }

    public String getDbUser() {
        return dbUser;
    }

    public void setDbUser(String dbUser) {
        this.dbUser = dbUser;
    }

    public String getDbPassword() {
        return dbPassword;
    }

    public void setDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
    }

    public String getDbHost() {
        return dbHost;
    }

    public void setDbHost(String dbHost) {
        this.dbHost = dbHost;
    }

    public boolean isTests() {
        return tests;
    }

    public void setTests(boolean tests) {
        this.tests = tests;
    }

    public boolean isWebpack() {
        return webpack;
    }

    public void setWebpack(boolean webpack) {
        this.webpack = webpack;
    }

    public boolean isFull() {
        return full;
    }

    public void setFull(boolean full) {
        this.full = full;
    }

    public void run() {
        System.out.println("Projeto criado");
    }

}
