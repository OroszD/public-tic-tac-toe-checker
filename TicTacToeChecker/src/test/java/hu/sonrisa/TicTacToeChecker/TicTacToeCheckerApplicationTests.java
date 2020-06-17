package hu.sonrisa.TicTacToeChecker;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
class TicTacToeCheckerApplicationTests {

	@Test
	void noWinner() {
		TicTacToeChecker checker = new TicTacToeChecker();
		String[][] board = new String[][]{{"x", "", "o"}, {"", "o", ""}, {"", "", "x"}};
		checker.set(board);

		assertThat(checker.getStatus()).isEqualTo(-1);
	}

	@Test
	void xWins_column() {
		TicTacToeChecker checker = new TicTacToeChecker();

		String[][] board = new String[][]{{"x", "x", "o"}, {"x", "o", "x"}, {"x", "o", "x"}};
		checker.set(board);

		assertThat(checker.getStatus()).isEqualTo(1);
	}

	@Test
	void xWins_row() {
		TicTacToeChecker checker = new TicTacToeChecker();

		String[][] board = new String[][]{{"x", "x", "x"}, {"x", "o", "o"}, {"o", "o", "x"}};
		checker.set(board);

		assertThat(checker.getStatus()).isEqualTo(1);
	}

	@Test
	void xWins_diagonal() {
		TicTacToeChecker checker = new TicTacToeChecker();

		String[][] board = new String[][]{{"o", "o", "x"}, {"o", "x", "o"}, {"x", "x", "o"}};
		checker.set(board);

		assertThat(checker.getStatus()).isEqualTo(1);
	}

	@Test
	void oWins_column() {
		TicTacToeChecker checker = new TicTacToeChecker();

		String[][] board = new String[][]{{"o", "x", "o"}, {"o", "o", "x"}, {"o", "o", "x"}};
		checker.set(board);

		assertThat(checker.getStatus()).isEqualTo(2);
	}

	@Test
	void oWins_row() {
		TicTacToeChecker checker = new TicTacToeChecker();

		String[][] board = new String[][]{{"o", "o", "o"}, {"o", "x", "x"}, {"x", "x", "o"}};
		checker.set(board);

		assertThat(checker.getStatus()).isEqualTo(2);
	}

	@Test
	void oWins_diagonal() {
		TicTacToeChecker checker = new TicTacToeChecker();

		String[][] board = new String[][]{{"o", "x", "x"}, {"x", "o", "x"}, {"o", "x", "o"}};
		checker.set(board);

		assertThat(checker.getStatus()).isEqualTo(2);
	}

}
