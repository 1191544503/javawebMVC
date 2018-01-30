package mk;

public class UserDAOFactory {
   public static UserDAO getUserDAOInstance(){
	   return new UserDAOImpl();
   }
}
