package twp.servlet.chapter06;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
public class BookDB {
	//实例化LinkedHashMap对象
	private static Map<String, Book> books = new LinkedHashMap<String, Book>();
	static {
		//使用put添加元素
		/*保存结果books中
		 * 1=book(1，javaweb开发)
		 * 2=book(2，jdbc开发)
		 * 3=book(3，java基础)
		 * ......
		 */
		books.put("1", new Book("1", "javaweb开发"));
		books.put("2", new Book("2", "jdbc开发"));
		books.put("3", new Book("3", "java基础"));
		books.put("4", new Book("4", "struts开发"));
		books.put("5", new Book("5", "spring开发"));
	}
	
	// 获得所有的图书
	/*获得 
	 *book(1，javaweb开发)
	 *book(2，jdbc开发)
	 *book(3，java基础)
	 *........
	*/ 
	public static Collection<Book> getAll() {
		return books.values();
	}
	// 根据指定的id获得图书
	public static Book getBook(String id) {
		return books.get(id);
	}
}