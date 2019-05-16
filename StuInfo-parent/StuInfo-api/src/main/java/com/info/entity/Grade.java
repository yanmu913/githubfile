
public class Grade {
	private String gradeName;
	private Integer gid;
	public String getGradeName() {
		return gradeName;
	}
	public void setGradeName(String gradeName) {
		this.gradeName = gradeName;
	}
	public Integer getGid() {
		return gid;
	}
	public void setGid(Integer gid) {
		this.gid = gid;
	}
	public Grade(String gradeName, Integer gid) {
		super();
		this.gradeName = gradeName;
		this.gid = gid;
	}
	public Grade() {
		super();
	}
	
	
}
