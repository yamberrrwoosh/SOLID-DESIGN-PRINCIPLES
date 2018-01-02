package dependencyinversion.before;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class DatabaseHandlerTest {

	@Mock
	MySQLDatabase mySQLDb;

	@Mock
	OracleDatabase oracleDb;

	@InjectMocks
	private DatabaseHandler handler = new DatabaseHandler();

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testMySQL() throws Exception {
		handler.connect(mySQLDb);

		Mockito.verify(mySQLDb, Mockito.times(1)).connect();
	}

	@Test
	public void testMyOracle() throws Exception {
		handler.connect(oracleDb);
		Mockito.verify(oracleDb, Mockito.times(1)).connect();
	}

}
