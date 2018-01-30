package mk;

import java.util.ArrayList;

public interface UserDAO {
	public ArrayList getAll();
	public boolean updateUser(String on);
	public void close();
}
