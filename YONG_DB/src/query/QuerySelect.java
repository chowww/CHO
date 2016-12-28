package query;

public class QuerySelect {
	private String selectEmpInfo = "SELECT * FROM EMP";
	private String SelectEmpInfoAboutEname = "SELECT * FROM EMP WHERE ENAME = ?";
	
	public String getSelectEmpInfo() {
		return selectEmpInfo;
	}
	
	public String getSelectEmpInfoAboutEname() {
		return SelectEmpInfoAboutEname;
	}
}
