import com.shenzeyu.practice.leetcode.Sudoku;
import org.junit.Test;

import java.util.Arrays;

/**
 * @Author shenzeyu
 * @Date 2020/9/11 4:23 下午
 */
public class LeetCodeTest {

    @Test
    public void testSudoku() {
        char[][] chars = new char[9][9];
        chars[0] = new char[]{'5','3','.','.','7','.','.','.','.'};
        chars[1] = new char[]{'6','.','.','1','9','5','.','.','.'};
        chars[2] = new char[]{'.','9','8','.','.','.','.','6','.'};
        chars[3] = new char[]{'8','.','.','.','6','.','.','.','3'};
        chars[4] = new char[]{'4','.','.','8','.','3','.','.','1'};
        chars[5] = new char[]{'7','.','.','.','2','.','.','.','6'};
        chars[6] = new char[]{'.','6','.','.','.','.','2','8','.'};
        chars[7] = new char[]{'.','.','.','4','1','9','.','.','5'};
        chars[8] = new char[]{'.','.','.','.','8','.','.','7','9'};

        new Sudoku().solveSudoku(chars);
        System.out.println(Arrays.toString(chars[0]));
        System.out.println(Arrays.toString(chars[1]));
        System.out.println(Arrays.toString(chars[2]));
        System.out.println(Arrays.toString(chars[3]));
        System.out.println(Arrays.toString(chars[4]));
        System.out.println(Arrays.toString(chars[5]));
        System.out.println(Arrays.toString(chars[6]));
        System.out.println(Arrays.toString(chars[7]));
        System.out.println(Arrays.toString(chars[8]));
    }
}
