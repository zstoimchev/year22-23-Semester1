
public interface IDisk {
	boolean write(String fileName, String data);
	String read(String fileName);
}
