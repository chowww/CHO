package DBControl;
import java.sql.Connection;
import java.sql.PreparedStatement;

import query.*;

public class UpdateControl {

	QueryUpdate update = new QueryUpdate();
	
	
	public void updateEmpSal(Connection conn){
		PreparedStatement pstmt = null;   //DB�����ؼ� �۾��� ���� �����ϴ� ��ü

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
