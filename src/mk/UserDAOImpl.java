package mk;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class UserDAOImpl implements UserDAO{
    public Connection conn=null;

    public UserDAOImpl() {
        conn=new DbCon().getConnection();
    }

    public ArrayList getAll(){
        String sql="select * from ticket";
        ArrayList<UserBean> list=new ArrayList();
        UserBean userInfo=null;
        try{
            Statement stmt=conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs=stmt.executeQuery(sql);
            while(rs.next()){
                userInfo=new UserBean();
                userInfo.setone(rs.getInt("one"));
                userInfo.settwo(rs.getInt("two"));
                userInfo.setthree(rs.getInt("three"));
                userInfo.setfour(rs.getInt("four"));
                list.add(userInfo);
            }
            rs.close();
            stmt.close();
            conn.close();
        }catch(SQLException e){e.printStackTrace();
        }
        return list;

    }

    public boolean updateUser(String on){
        String sql = null;
        boolean rs=false;
        if(on.equals("1")){
            sql="update ticket set one=one+1 where id=1";
        }
        if(on.equals("2")){
            sql="update ticket set two=two+1 where id=1";
        }
        if(on.equals("3")){
            sql="update ticket set three=three+1 where id=1";
        }
        if(on.equals("4")){
            sql="update ticket set four=four+1 where id=1";
        }
        int count=0;
        try{

            Statement stmt=conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            int t=stmt.executeUpdate(sql);
            if(t>0){
                rs=true;
            }
            conn.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
        if(rs){
            return true;
        }
        return false;
    }


    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        try{
            if(!conn.isClosed())
                conn.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
        super.finalize();
    }

    public void close(){
        try{
            if(!conn.isClosed())
                conn.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

}
