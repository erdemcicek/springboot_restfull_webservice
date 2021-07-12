package restfulwebservice03;


import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import com.google.common.collect.Sets;

public enum ApplicationUserRoles { // enum is mean that fix data or user ..in a year the month also 
    // creating of user roles 
	
	
//    STUDENT(Sets.newHashSet(ApplicationUserPermissions.STUDENT_READ)),
//    ADMIN(Sets.newHashSet(ApplicationUserPermissions.ADMIN_READ, ApplicationUserPermissions.ADMIN_WRITE));
	
//	private final Set<ApplicationUserPermissions> permissions;
	
	
//	ApplicationUserRoles(HashSet<ApplicationUserRoles> newHashSet){
//		
//	}
//
//	public Set<ApplicationUserPermissions> getPermissions() {
//		return permissions;
//	}
	
//	public Set<SimpleGrantedAuthority> getGrantedAuthorities(){
//		
//		Set<SimpleGrantedAuthority> permissions = getPermissions().
//														  stream().
//														  map(permission -> new SimpleGrantedAuthority(permission.getPermission())).
//														  collect(Collectors.toSet());
//		
//		permissions.add(new SimpleGrantedAuthority("ROLE_" + this.name()));
//		
//		return permissions;
//	}
	

}
