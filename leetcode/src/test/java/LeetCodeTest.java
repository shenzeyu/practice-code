import com.shenzeyu.practice.leetcode.Sudoku;
import org.junit.Test;

/**
 * @Author shenzeyu
 * @Date 2020/9/11 4:23 下午
 */
public class LeetCodeTest {

    @Test
    public void testSudoku() {
        char[][] chars = new char[9][9];
        new Sudoku().solveSudoku(chars);
        System.out.println("test");
    }
}
