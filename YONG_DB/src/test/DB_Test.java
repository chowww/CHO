package test;

import java.sql.Connection;
import java.sql.ResultSet;


import DBControl.*;
import connect.OracleConnect;

public class DB_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OracleConnect oraConn = new OracleConnect();

		Connection conn = oraConn.connect();

		if ( conn != null) 
		{
			System.out.println("Oracle Connect Success");
		}
		else 
		{
			System.out.println("Oracle Connect Fail");
		}
		
		InsertControl dd = new InsertControl();
		dd.insertEmpInfo(conn);
	}
}
