package org.eday.persistence;

import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.DriverManager;

import org.apache.ibatis.javassist.bytecode.stackmap.BasicBlock.Catch;
import org.junit.Test;

import lombok.extern.log4j.Log4j;

@Log4j
public class JdbcTests {
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e){
			e.printStackTrace();
		}
	}
	
	@Test
	public void testConnection() {
		try(Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE",
				"mydb",
				"1234")){
					log.info(con);
				} catch(Exception e) {
					fail(e.getMessage());
				}
	}
}