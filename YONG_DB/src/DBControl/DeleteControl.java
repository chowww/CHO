package DBControl;

import java.sql.Connection;
import java.sql.PreparedStatement;

import query.QueryDelete;
import query.QueryInsert;

public class DeleteControl {

	QueryDelete delete = new QueryDelete();

	public void  deleteEmpInfo(Connection conn){
		PreparedStatement pstmt = null;   //DB�����ؼ� �۾��� ���� �����ϴ� ��ü

		try{
			//DELETE FROM EMP WHERE ENAME=?
			pstmt = conn.prepareStatement(delete.getDeleteEmpInfo());

			pstmt.setString(1, "Check");
			
			pstmt.executeUpdate();


		}catch(Exception e)
		{
			System.out.println(e);
		}

		System.out.println("Query delete End");
	}
}
