package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

import com.face.dao.PlayerDAO;

public class Main {

	public static void main(String[] args ) throws NumberFormatException, IOException, ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		boolean j=true;
		
		
		System.out.println("******************Menu**************");
		while(j) 
		{
		System.out.println("\n\n1.List all Player");
		System.out.println("2.Add new Player");
		System.out.println("3.Search Player");
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int choice =Integer.parseInt(br.readLine());
		PlayerDAO pd=new PlayerDAO();
		
		switch(choice) {
		case 1:
			pd.getAllPlayerDetails();
			break;
			
		case 2:
			pd.createPlayer();
			break;
			
		case 3:
			pd.getPlayerDetails();
			System.out.println("Do You Want to Continue(y/n)");
			char y1=br.readLine().charAt(0);
			if(y1=='y')
			{
				j=true;
			}
			else {
				j=false;
				System.out.println("*************************Thank You For Your Valuable Time**************************");
			}
			break;
		}
		while(j=false);
		
	}
	}
}
