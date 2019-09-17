
/*package Game.WebApp3.seciurity;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;

import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


import javax.sql.DataSource;
//@Configuration
public class PasswordSeciurity extends WebSecurityConfigurerAdapter {
    @Autowired
    private DataSource dataSource ;

    @Autowired
    public void securityUsers(AuthenticationManagerBuilder auth) throws Exception {
        auth.jdbcAuthentication().dataSource(dataSource).usersByUsernameQuery("SELECT username, password, 1 as " +
                "enabled" +
                " FROM " +
                "employees WHERE username = ?").authoritiesByUsernameQuery("SELECT username, 'ROLE_USER' From employees" +
                " WHERE username=?");// sprawdzanie czy uzytkonik loguje sie z poprawnego username i hasła//
    }



}*/
