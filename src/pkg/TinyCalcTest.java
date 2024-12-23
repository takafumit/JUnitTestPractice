package pkg;

//JUnitテストのライブラリをインポート
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class TinyCalcTest {

	//@Testアノテーションを付けると，テストとして実行される．
	@Test 
    public void testAdd() {
        //テスト対象のインスタンスを用意
		TinyCalc calc = new TinyCalc();
        
        //第1引数と第2引数を比較し，等しければテスト成功
        assertEquals(8, calc.add(3, 5));
    }
}