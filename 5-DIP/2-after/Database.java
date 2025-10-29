public interface Database {
    
    public void save(String data);
}

class MySQLDatabase implements Database {
    @Override
    public void save(String data) {
    System.out.println("Saving to MySQL: " + data);
    }
}

class MongoDBDatabase implements Database{
    @Override
    public void save(String data) {
        System.out.println("Saving to MongoDB: " + data);
    }
}