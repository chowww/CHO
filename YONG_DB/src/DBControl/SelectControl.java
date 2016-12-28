package DBControl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import query.QuerySelect;

public class SelectControl {

	QuerySelect select = new QuerySelect();

	public ResultSet SelectEmpInfo(Connection conn){
		PreparedStatement pstmt = null;   //DB연결해서 작업을 직접 수행하는 객체
		ResultSet rs = null;

		try{
			pstmt = conn.prepareStatement(select.getSelectEmpInfo());

			rs = pstmt.executeQuery();

			System.out.println("SELECT RESULT COUNT : " + rs.getRow());
			while(rs.next()){
				int empno = rs.getInt("EMPNO");
				String ename = rs.getString("ENAME");
				int sal = rs.getInt("SAL");
				System.out.println("empno : " + empno + "\t ename : " + ename+"\t sal :"+sal );
			}

			System.out.println("SELECT RESULT COUNT : " + rs.getRow());

		}catch(SQLException se){
			se.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			System.out.println("Query Select End");
		}

		return rs;
	}

	public ResultSet SelectEmpInfoAboutEname(Connection conn, String Ename){
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try{
			pstmt = conn.prepareStatement(select.getSelectEmpInfoAboutEname());

			//"SELECT EMPNO, ENAME FROM SCOTT.EMP WHERE ENAME = ?";

			pstmt.setString(1, Ename);    //input value
			
			rs = pstmt.executeQuery();
			
			while(rs.next())
			{
				int empno = rs.getInt("EMPNO");
				String ename = rs.getString("ENAME");
				int sal=rs.getInt("SAL");
				System.out.println("empno : " + empno + "	ename : " + ename );
			}
		}catch(Exception e){}

		return rs;
	}
}
