package customcollections;

import static org.junit.Assert.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
public class ListTest {
	private static final Logger logger=LogManager.getLogger(ListTest.class);
		@Test
		public void test() {
			Difflist l1=new Difflist();
			l1.add("this");
			l1.add("is");
			l1.add("a");
			l1.add("sample");
			l1.add("list");
			l1.add("epam");
			l1.add("apple");
			l1.add("banana");
			l1.add("tennis");
			//games.remove(9);
			assertEquals("[this,is,a,sample,list,epam,apple,banana,tennis]",l1.print() );
			assertEquals(9,l1.length());
			assertEquals("sample",l1.get(3));
			logger.info("Items added and removed successfully");
			logger.debug(l1.print());
			logger.warn("No warnings in using the custom list");
			logger.error("No errors in using the custom list");
			}
		@Test
		public void test2() {
			Difflist l2=new Difflist();
			l2.add("Simla");
			l2.add("Patna");
			l2.add("Japan");
			l2.add("Kerala");
			l2.add("Cochin");
			l2.add("Bihar");
			l2.add("Jaipur");
			l2.remove(6);
			assertEquals("[Simla,Patna,Japan,Kerala,Cochin,Bihar]",l2.print() );
			assertEquals(6,l2.length());
			assertEquals("Japan",l2.get(2));
			logger.info("Items added and removed successfully");
			logger.debug(l2.print());
			logger.warn("No warnings in using the custom list");
			logger.error("No errors in using the custom list");
			}
	}