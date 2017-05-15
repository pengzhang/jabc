package org.service;

import org.model.User;

import com.jfinal.json.Json;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;

public class UserService 
{
    public static void main( String[] args )
    {
    	Record user = new Record().set("username", "hello").set("password", "123456");
    	Db.save("user", user);
        System.out.println(Json.getJson().toJson(User.dao.findFirst("select * from user")));
    }
    
}
