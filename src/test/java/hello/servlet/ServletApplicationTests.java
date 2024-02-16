package hello.servlet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Array;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.IntStream;

@SpringBootTest
class ServletApplicationTests {

	@Test
	void contextLoads() {
		Member member = findById().orElseThrow(NoSuchElementException::new);
	}

	@Test
	public void test() {
		int[] intArr = {3, 2, 5, 4, 1};
		IntStream sorted = Arrays.stream(intArr).sorted();
		System.out.println("intArr = " + intArr[0]);
		System.out.println("sorted = " + sorted.iterator().next());

	}


	public Optional<Member> findById() {
		Member member1 = null;
		Member member2 = new Member("xogus7533", "1234");
		Member member3 = new Member("1", "1");

		return Optional.ofNullable(member1);
	}


	 class Member {
		private String id;

		private String pw;

		public String getId() {
			return id;
		}

		public String getPw() {
			return pw;
		}

		public void setId(String id) {
			this.id = id;
		}

		public void setPw(String pw) {
			this.pw = pw;
		}

		public Member(String id, String pw) {
			this.id = id;
			this.pw = pw;
		}
	}

}
