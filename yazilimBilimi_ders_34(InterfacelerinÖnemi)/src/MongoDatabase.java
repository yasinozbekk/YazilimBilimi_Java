
public class MongoDatabase implements IDatabase{

	@Override
	public void add() {
		System.out.println("MongoDb Ekleme");
	}

	@Override
	public void delete() {
		System.out.println("MongoDb Silme");
	}

	@Override
	public void get() {
		System.out.println("MongoDb Elde Etme");
	}

	@Override
	public void update() {
		System.out.println("MongoDb GŁncelleme");
	}

}
