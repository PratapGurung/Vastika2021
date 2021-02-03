package org.example.dao;

import org.example.model.User;
    import org.example.util.QueryUtil;
import org.example.util.dbUtil;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao{

    @Override
    public int saveUser(User user) {
        int saved = 0;
        try(
                PreparedStatement ps = dbUtil.getConnection().prepareStatement(QueryUtil.SAVE_SQl);
                ){
            ps.setString(1,user.getUsername());
            ps.setString(2,user.getPassword());
            ps.setString(3,user.getMobileNo());
            ps.setDouble(4,user.getSalary());
            ps.setBoolean(5, user.isEnable());
            ps.setDate(6, Date.valueOf(user.getDob()));
            saved = ps.executeUpdate();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return saved;
    }

    @Override
    public int updateUser(User user) {
        int updated = 0;
        try(
                PreparedStatement ps = dbUtil.getConnection().prepareStatement(QueryUtil.SAVE_SQl);
        ){
            ps.setString(1,user.getUsername());
            ps.setString(2,user.getPassword());
            ps.setString(3,user.getMobileNo());
            ps.setDouble(4,user.getSalary());
            ps.setBoolean(5, user.isEnable());
            ps.setDate(6, Date.valueOf(user.getDob()));
            ps.setInt(7,user.getId());
            updated = ps.executeUpdate();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return updated;
    }

    @Override
    public int deleteUser(int id) {
        int deleted = 0;
        try(
                PreparedStatement ps = dbUtil.getConnection().prepareStatement(QueryUtil.DELETE_SQL);
        ){
            ps.setInt(1,id);
            deleted = ps.executeUpdate();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return deleted;
    }

    @Override
    public User getUserById(int id) {
        User user = new User();

        try(
                PreparedStatement ps = dbUtil.getConnection().prepareStatement(QueryUtil.USER_BY_ID_SQL);
        ){
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                user.setId(rs.getInt("id"));
                user.setUsername(rs.getString("user_name"));
                user.setPassword(rs.getString("password"));
                user.setSalary(rs.getDouble("salary"));
                user.setEnable(rs.getBoolean("enable"));
                user.setMobileNo(rs.getString("mobileNo"));
                user.setDob(rs.getDate("dob").toLocalDate());
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return user;
    }

    @Override
    public List<User> getAllUser() {
        List<User> userlist = new ArrayList<>();

        try(
                PreparedStatement ps = dbUtil.getConnection().prepareStatement(QueryUtil.LIST_SQL);
        ){
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setUsername(rs.getString("user_name"));
                user.setPassword(rs.getString("password"));
                user.setSalary(rs.getDouble("salary"));
                user.setEnable(rs.getBoolean("enable"));
                user.setMobileNo(rs.getString("mobileNo"));
                user.setDob(rs.getDate("dob").toLocalDate());
                userlist.add(user);
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return userlist;
    }
}
