package restfulwebservice03;

public enum ApplicationUserPermissions {

	STUDENT_READ("student:read"),
	ADMIN_READ("admin:read"),
	ADMIN_WRITE("admin:write");

	private final String permission;

	public String getPermission() {
		return permission;
	}

	ApplicationUserPermissions(String permission) {this.permission=permission;}
}
