package kosta.db.view;

import java.util.List;


import kosta.db.dao.EmpDAO;
import kosta.db.dto.EmpDTO;

public class MainApp {

	public static void main(String[] args) {
		EmpDAO dao = new EmpDAO();
//		dao.selectNames();
//		dao.deleteByEmpno2(7521);
		
//		List<EmpDTO> list = dao.selectAll();
//		list.forEach(System.out::println);
		System.out.println(dao.selectOne(7902));	
		
//		int re = dao.insert(new EmpDTO(9999, "길동", "student", 9000, ""));
//		if(re == 0) System.out.println("Insert fail");
//		else System.out.println("Insert success");
		
		System.out.println(dao.selectOne(9999));
		
		dao.deleteByEmpno2(9999);
		
		System.out.println(dao.selectOne(9999));
	}

}
