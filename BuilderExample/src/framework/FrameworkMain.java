package framework;

public class FrameworkMain {

    public static void main(String[] args) {

        // Primeiro jeito criando construtor
        Framework framework = new Framework("Teste", "MySQL", "root", "root", "localhost", true, true, true);

        // Se o construtor não existisse poderia fazer vários 'sets'
        framework.setName("Teste2");
        framework.setDb("Oracle");
        framework.setDbUser("root");
        framework.setDbPassword("root");
        framework.setDbHost("localhost");
        framework.setTests(true);
        framework.setWebpack(true);
        framework.setFull(true);

        framework.run();

        FrameworkFullBuilder builder = new FrameworkFullBuilder();
        Framework framework2 = builder.getFramework();

        framework2.run();

    }

}