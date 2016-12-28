package query;

public class QueryDelete {

private String deleteEmpInfo = "DELETE FROM EMP WHERE ENAME=?";
	
	public String getDeleteEmpInfo() {
		return deleteEmpInfo;
	}
}
