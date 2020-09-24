package pack.model;

import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;
@Repository
public class DataSource extends DriverManagerDataSource {
	public DataSource() {//aop.xml�� �ִ� property�� ����� ���� ����.
		setDriverClassName("org.mariadb.jdbc.Driver");
		setUrl("jdbc:mysql://localhost:3308/test");
		setUsername("root");
		setPassword("123");
	}
}
