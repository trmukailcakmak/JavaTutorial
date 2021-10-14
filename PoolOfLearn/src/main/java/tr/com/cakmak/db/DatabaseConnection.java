//package tr.com.cakmak.db;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//import org.springframework.context.annotation.PropertySource;
//import org.springframework.core.env.Environment;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
//
//import javax.sql.DataSource;
//
//@Configuration
//@PropertySource({"classpath:application.properties"})
//@ConditionalOnExpression("'${spring.profiles}'=='local'")
//public class DatabaseConnection {
//
//    @Autowired
//    private Environment env;
//
//    @Bean
//    public DataSource dataSourcePoolStb() {
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setDriverClassName(env.getProperty("db.postgresql.driver"));
//        dataSource.setUrl(env.getProperty("db.postgresql.url"));
//        dataSource.setUsername(env.getProperty("db.postgresql.username"));
//        dataSource.setPassword(env.getProperty("db.postgresql.password"));
//        return dataSource;
//    }
//
//}
