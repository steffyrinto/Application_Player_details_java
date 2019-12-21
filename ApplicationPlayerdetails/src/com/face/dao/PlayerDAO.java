package com.face.dao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import com.face.util.ConnectionManager;

import player.Player;

public class PlayerDAO {
	private static final String Skill = null;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	ConnectionManager cm=new ConnectionManager();
	
	
	
	public void createPlayer() throws IOException, ClassNotFoundException, SQLException {
		
		Connection con=cm.getConnection();
		Statement statement =con.createStatement();
		
		System.out.println("Enter the Playername");
		String Playername=br.readLine();
		System.out.println("Enter the Country name");
		String Country=br.readLine();
		System.out.println("Enter the Skill");
		String Skill=br.readLine();
		System.out.println("enter the Team name");
		String Teamname=br.readLine();
		statement.executeUpdate("INSERT INTO playerdetails values('"+Playername+"','"+Country+"','"+Skill+"','"+Teamname+"')");
		System.out.println("Insertion successful");
		String q="select*from playerdetails";
		ResultSet r1=statement.executeQuery(q);
		System.out.println("Player Details");
		if(r1.next())
		{
			do
			{
				System.out.println(r1.getString(1)+"\t\t"+r1.getString(2)+"\t\t"+r1.getString(3)+"\t\t\t"+r1.getString(4));
				}while(r1.next());
				}
				else
				{
				System.out.println("No Records found!!!");
				}
				}

	
	public void getPlayerDetails() throws ClassNotFoundException, SQLException, IOException{
		
		Connection conn = cm.getConnection();
		Statement statement = conn.createStatement();
		System.out.println("Enter Your Skill Details");
		String Skill=br.readLine();
		String q="select * from playerdetails where Skill = '"+Skill+"' ";
		ResultSet r1=statement.executeQuery(q);
		System.out.println("Player details:");
		if(r1.next())
		{
			
		do
		{
		System.out.println(r1.getString(1)+"\t\t"+r1.getString(2)+"\t\t"+r1.getString(3)+"\t\t\t"+r1.getString(4));
		}while(r1.next());
		}
		else
		{
		System.out.println("Oops.....!!!!!!No Records found!!!");
		}

		
	}
	
	public void getAllPlayerDetails() throws ClassNotFoundException, SQLException{
		
		
		Connection conn = cm.getConnection();
		Statement statement = conn.createStatement();
		String q="select * from playerdetails";
		ResultSet r1=statement.executeQuery(q);
		System.out.println("Player details:");
		if(r1.next())
		{
		do
		{
		System.out.println(r1.getString(1)+"\t\t"+r1.getString(2)+"\t\t"+r1.getString(3)+"\t\t\t"+r1.getString(4));
		}while(r1.next());
		}
		else
		{
		System.out.println("No Records found!!!");
		}
	}
}
