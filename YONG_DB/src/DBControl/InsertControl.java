package DBControl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import query.QueryInsert;
import query.QuerySelect;

public class InsertControl {

	QueryInsert insert = new QueryInsert();

	public void  insertEmpInfo(Connection conn){
		PreparedStatement pstmt = null;   //DB�����ؼ� �۾��� ���� �����ϴ� ��ü

		try{
			//INSERT INTO PERSON (MYNAME, MAJOR) VALUES (?,?)
			pstmt = conn.prepareStatement(insert.getInsertPersonInfo());

			pstmt.setString(1, "FUCK");
			pstmt.setString(2, "FUCKFUCK");
			
			pstmt.executeUpdate();


		}catch(Exception e)
		{
			System.out.println(e);
		}

		System.out.println("Query Insert End");
	}
}
