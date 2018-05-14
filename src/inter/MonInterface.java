package inter;

public interface MonInterface {
	public default String direBonjour(){
		return"je vous salut";
	}
	public void faireLaSomme(int x, int y);

}
