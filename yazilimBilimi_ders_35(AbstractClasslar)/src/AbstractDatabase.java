 
public abstract class AbstractDatabase {
	public void add() {
		System.out.println("Eklendi...");
	}
	public void delete() {
		System.out.println("Silindi...");
	}
//add ve delete fonksiyonları ortak olduğu için burada tanımlanabilirler ama update ve get fonksiyonları değişebilir olduğu için zorunlu kullanımı vardır 
	abstract void update();//bu abstractlar kullanıldıkları yerde yazılmak ve tanımlanmak zorundalar
	abstract void get();
}
