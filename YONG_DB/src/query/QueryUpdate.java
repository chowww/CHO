package query;

public class QueryUpdate {
	private String updateEmpSal = "UPDATE EMP SET SAL = ? WHERE EMPNO = ?";
	
	public String getUpdateEmpSal() {
		return updateEmpSal;
	}
}
