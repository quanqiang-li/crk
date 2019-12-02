package liqq.crk.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * Security的自定义配置
 * 
 * @author Administrator
 *
 */
@Configuration
public class MyWebSecurityConfigurer extends WebSecurityConfigurerAdapter {
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception {

		auth.inMemoryAuthentication().withUser("15097689051").password(passwordEncoder().encode("15097689051")).roles("ADMIN");
	}

	// 配置
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// security的CsrfFilter跨站请求伪造,默认只允许"GET", "HEAD", "TRACE",
		// "OPTIONS",不支持POST,这里粗暴禁用
		http.csrf().disable();
		// 是否允许页面被iframe嵌套，deny 不允许，sameOrigin 同域下允许
		http.headers().frameOptions().sameOrigin();
		http
		.authorizeRequests()
			.anyRequest().authenticated()
			.and()
		.formLogin();
//		http
//		.authorizeRequests()
//			.anyRequest().permitAll();
	}

}
