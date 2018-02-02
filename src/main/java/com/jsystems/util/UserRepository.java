package com.jsystems.util;

import com.jsystems.models.UserMock;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    public List<UserMock> getAll(){
        List<UserMock> userMocks = new ArrayList<>();

        try {
            Statement statement = DatabaseConnector.getConnection().createStatement();
            String sql = "select * from usermock";
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()){
                UserMock userMock = new UserMock();
                userMock.setId(resultSet.getLong(1));
                userMock.setName(resultSet.getString(2));
                userMock.setSurname(resultSet.getString(3));
                userMocks.add(userMock);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
