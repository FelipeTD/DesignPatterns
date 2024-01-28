package connections;

public class MySQLAdapter implements DbAdpter {

    private MySQLCommands mysql;

    public MySQLAdapter(MySQLCommands mySQL) {
        this.mysql = mySQL;
    }

    @Override
    public void insert() {
        this.mysql.insertMySQL();
    }

    @Override
    public void update() {
        this.mysql.updateMySQL();
    }

    @Override
    public void delete() {
        this.mysql.deleteMySQL();
    }

}
