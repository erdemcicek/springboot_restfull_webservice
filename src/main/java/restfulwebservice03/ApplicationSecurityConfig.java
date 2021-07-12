//package restfulwebservice03;

//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//
//@Configuration
//@EnableWebSecurity
//public class ApplicationSecurityConfig extends WebSecurityConfigurerAdapter {

//	private final PasswordEncoder passwordEncoder;

//	public ApplicationSecurityConfig(PasswordEncoder passwordEncoder) {
//		this.passwordEncoder = passwordEncoder;
//	}

//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
		
//		http.
//			authorizeRequests().
//			// If you want some pages not to ask username and password,
//			// type the following lines
//			antMatchers("/", "index", "/css/*", "/js/*").
//			permitAll().			
//			anyRequest().
//			authenticated().
//			and().
//			httpBasic();
//	}

//	@Override
//	@Bean
//	protected UserDetailsService userDetailsService() {
//		
//		UserDetails student = User.
//									builder().
//									username("techProStudent").
//									password(passwordEncoder.encode("12345")).
//									roles(ApplicationUserRoles.STUDENT.name()).
//									build();
//		
//		UserDetails admin = User.
//								builder().
//								username("techProAdmin").
//								password("admin12345").
//								roles(ApplicationUserRoles.ADMIN.name()).
//								build();
//		
//		
//		return new InMemoryUserDetailsManager(student, admin);
//	}


	
//}
