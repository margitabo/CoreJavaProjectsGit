import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ListOperationsTest {
	private ListOperations obj;
	private List<Integer> listIn;
	private List<Integer> listSorted;
	private List<Integer> listReverse;

	@Before
	public void setUp() throws Exception {
		obj = new ListOperations();
		listIn = new ArrayList<Integer>() {
			{
				add(2);
				add(33);
				add(44);
				add(5);
				add(7);
			}
		};
		listSorted = new ArrayList<Integer>() {
			{
				add(2);
				add(5);
				add(7);
				add(33);
				add(44);
			}
		};
		listReverse = new ArrayList<Integer>() {
			{
				add(7);
				add(5);
				add(44);
				add(33);
				add(2);
			}
		};
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSort() {
		assertEquals(listSorted, obj.sort(listIn));
	}

	@Test
	public void testReverse() {

		assertEquals(listReverse, obj.reverse(listIn));
	}

	@Test
	public void testIsMonotonous() {
		assertFalse(obj
				.isMonotonous(Arrays.asList(-10, 1, 2, 3, 4, 5, 6, -100))); // false
		assertTrue(obj.isMonotonous(Arrays.asList(6, 5, 4, 3, 2, 1, 1, 1))); // true
		assertFalse(obj.isMonotonous(Arrays.asList(1, 2, 1, 4, 5, 4))); // false
	}

}
