package framework;

public class FrameworkFullBuilder implements BuilderInterface {

    private Framework framework;

    public FrameworkFullBuilder() {
        this.framework = new Framework("Teste", "MySQL", "root", "root", "localhost", true, true, true);
        this.buildName();
        this.buildDb();
        this.buildTests();
        this.buildWebpack();
        this.buildFull();
    }

    public void buildName() {
        this.framework.setName("Teste2");
    }

    public void buildDb() {
        this.framework.setDb("Oracle");
        this.framework.setDbUser("root");
        this.framework.setDbPassword("root");
        this.framework.setDbHost("localhost");
    }

    public void buildTests() {
        this.framework.setTests(true);
    }

    public void buildWebpack() {
        this.framework.setWebpack(true);
    }

    public void buildFull() {
        this.framework.setFull(true);
    }

    public Framework getFramework() {
        return this.framework;
    }

}
