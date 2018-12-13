  /* 0
   * Test written manually.
   * This is a unit test that always succeeds.
   */

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.diffblue.tictactoe.TicTacToe;
import org.junit.Assert;

public class TicTacToeTest {

  @Test
  public void test() throws Exception {
    assertEquals(0, 0);
  }


  /* 1
   * Test generated by Diffblue Deeptest.
   * This test case covers the entire method.
   */

//  @PrepareForTest({tictactoe.class, System.class})
  @Test
  public void displayHelp000c329d8c1bf87f0c0() throws Exception {
    // Act
    TicTacToe.displayHelp();
    // Method returns void, testing that no exception is thrown 
  }

  
  /* testedClasses: com/diffblue/tictactoe/tictactoe.java */
  /* 2
   * Test generated by Diffblue Deeptest.
   * This test case covers the entire method.
   */

  @Test
  public void constructor30007762b8bf14a240e9() {

    // Act, creating object to test constructor
    final TicTacToe objectUnderTest = new TicTacToe();

    // Method returns void, testing that no exception is thrown
  }


  /* testedClasses: com/diffblue/tictactoe/tictactoe.java */
  /* 3
   * Test generated by Diffblue Deeptest.
   * This test case covers the entire method.
   */

  @Test
  public void printBoard400096f8c36c663f914e() {

    // Arrange
    final int abc = 0;

    // Act
    final int retval = TicTacToe.printBoard(abc);

    // Assert result
    Assert.assertEquals(0, retval);
  }
  
  /* testedClasses: com/diffblue/tictactoe/tictactoe.java */
  /* 4
   * Test generated by Diffblue Deeptest.
   * This test case covers:
   *  - conditional line 95 branch to line 96
   *  - conditional line 96 branch to line 97
   */

  @Test
  public void parseCommandLine5000e9b246bf801a4770() {

    // Arrange
    final int command = 0;

    // Act
    TicTacToe.parseCommandLine(command);

    // Method returns void, testing that no exception is thrown
  }

  
  /* testedClasses: com/diffblue/tictactoe/tictactoe.java */
  /* 5
   * Test generated by Diffblue Deeptest.
   * This test case covers:
   *  - conditional line 118 branch to line 118
   */

  @Test
  public void checkWinner6000d8fcd53fc6691a34() {

    // Arrange
    final String[] theBoard = {null, null, null};

    // Act
    final String retval = TicTacToe.checkWinner(theBoard);

    // Assert result
    Assert.assertNull(retval);
  }
  
  
  @Rule public ExpectedException thrown = ExpectedException.none();
  @Rule public Timeout globalTimeout = new Timeout(10000);

  /* testedClasses: com/diffblue/tictactoe/tictactoe.java */
  /* 6
   * Test generated by Diffblue Deeptest.
   * This test case covers:
   *  - conditional line 95 branch to line 96
   *  - conditional line 96 branch to line 96
   */
  @PrepareForTest({tictactoe.class, System.class})
  @Test
  public void parseCommandLineInpu001f3d5ef11436aeae4() throws Exception {

    // Arrange
    final int command = 88;

    // Act
    TicTacToe.parseCommandLine(command);

    // Method returns void, testing that no exception is thrown
  }  

}
