package dependencyinversion.after

import org.scalatest.BeforeAndAfter
import org.scalatest.FunSuite

class DatabaseHandlerTest extends FunSuite with BeforeAndAfter {

  private val handler = new DatabaseHandler()

  test("MySQL DB") {
    val dbConnect = handler.connect(new MySQLDatabase)
    val dbDisconnect = handler.disconnect(new MySQLDatabase)
    assert(dbConnect.equals("MySQL"))
    assert(dbDisconnect.equals("MySQL"))
  }
  
   test("Oracle DB") {
    val dbConnect = handler.connect(new OracleDatabase)
    val dbDisconnect = handler.disconnect(new OracleDatabase)
    assert(dbConnect.equals("Oracle"))
    assert(dbDisconnect.equals("Oracle"))
  }

}