package query;

public class QueryInsert {
	private String insertPersonInfo = "INSERT INTO PERSON (MYNAME, MAJOR) VALUES (?,?)";
	
	public String getInsertPersonInfo() {
		return insertPersonInfo;
	}
}
