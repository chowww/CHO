package DBControl;
import java.sql.Connection;
import java.sql.PreparedStatement;

import query.*;

public class UpdateControl {

	QueryUpdate update = new QueryUpdate();
	
	
	public void updateEmpSal(Connection conn){
		PreparedStatement pstmt = null;   //DB연결해서 작업을 직접 수행하는 객체

		try{
			//"UPDATE SCOTT.EMP SET SAL = ? WHERE EMPNO = ?";
			pstmt = conn.prepareStatement(update.getUpdateEmpSal());

			pstmt.setInt(1, 65454);
			pstmt.setInt(2, 7310);
			
			pstmt.executeUpdate();


		}catch(Exception e)
		{
			System.out.println(e);
		}

		System.out.println("Query Insert End");
	}
	


}
