package com.accp;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.accp.biz.RecordBiz;
import com.accp.biz.StudentBiz;
import com.accp.pojo.Record;
import com.accp.pojo.Student;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentRewardAndPunishmentSystemApplicationTests {

	@Resource
	private StudentBiz sBiz;
	
	@Resource
	private RecordBiz rBiz;
	
	@Test
	public void contextLoads() {
		for (Student s : sBiz.findStudent(1, 5).getList()) {
			System.out.println(s);
		}
		
	}
	
	@Test
	public void findreward() {
		for (Record r : rBiz.findRecordByStudent("admin")) {
			System.out.println(r);
		}
	}

	
	@Test
	public void findreward1() {
		for (Record r : rBiz.findRecordAll(null, null, 1, 5).getList()) {
			System.out.println(r);
		}
	}
}
