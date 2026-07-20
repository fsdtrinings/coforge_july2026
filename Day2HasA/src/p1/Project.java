package p1;

public class Project {

	private String projectName;
	private String projectLocation;
	private String clientName;
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Project(String projectName, String projectLocation, String clientName) {
		super();
		this.projectName = projectName;
		this.projectLocation = projectLocation;
		this.clientName = clientName;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProjectLocation() {
		return projectLocation;
	}
	public void setProjectLocation(String projectLocation) {
		this.projectLocation = projectLocation;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	
	
}
