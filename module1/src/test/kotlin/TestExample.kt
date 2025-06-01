import kotlin.test.Test
import kotlin.test.assertTrue

class TestExample {

    @Test
    fun case1() {
        val oddNumbers = listOf(2, 4, 6, 8, 10)
        oddNumbers.forEach { assertTrue { it % 2 == 0 } }
        assertTrue{ oddNumbers.sum() % 2 == 0 }
    }
}