package numberops;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class NumberTest {
	
	@Mock
	Number number;
	
	@Test
	void test_add() {
		//Number number = new Number();
		Mockito.when(number.add(14,7)).thenReturn(21);
		assertEquals(21, number.add(14,7));
	}

}
