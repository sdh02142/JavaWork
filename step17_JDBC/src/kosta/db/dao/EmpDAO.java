package kosta.db.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import kosta.db.dto.EmpDTO;
import kosta.db.util.DbManager;

public class EmpDAO {
	/**
	 * emp테이블에서 사원의 모든 이름 검색
	 * */
	public void selectNames() {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			con = DbManager.getConnection();
			st = con.createStatement();
			rs = st.executeQuery("select ename from emp");
			
			while(rs.next()) {
				System.out.println(rs.getString("ename"));
			}
			System.out.println("=== End ===");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DbManager.dbClose(con, st, rs);
		}
	}
	
	/**
	 * 사원번호에 해당하는 레코드 삭제
	 * */
	public void deleteByEmpno(int empno) {
		Connection con = null;
		Statement st = null;
		String sql = "delete from emp where empno = " + empno;
		try {
			con = DbManager.getConnection();
			st = con.createStatement();
			int re = st.executeUpdate(sql);
			
			if(re == 0) System.out.println("Delete fail");
			else System.out.println("Delete success");
			System.out.println("=== End ===");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DbManager.dbClose(con, st);
		}
	}
	
	/**
	 * PreparedStatement 사용
	 * */
	public void deleteByEmpno2(int empno) {
		Connection con = null;
		PreparedStatement ps = null;
		String sql = "delete from emp where empno = ?";
		
		try {
			con = DbManager.getConnection();
			ps = con.prepareStatement(sql);

			// sql 내의 ?에 순차적으로 대입할 값 설정
			ps.setInt(1, empno);
			
			int re = ps.executeUpdate();
			
			if(re == 0) System.out.println("Delete fail");
			else System.out.println("Delete success");
			System.out.println("=== End ===");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DbManager.dbClose(con, ps);
		}
	}
	
	/**
	 * 모든 사원의 정보 검색
	 * */
	public List<EmpDTO> selectAll() {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select empno, ename, job, sal, hiredate from emp";
		List<EmpDTO> list = new ArrayList<EmpDTO>();
		try {
			con = DbManager.getConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				list.add(new EmpDTO(rs.getInt("empno"),
						rs.getString("ename"),
						rs.getString("job"),
						rs.getInt("sal"),
						rs.getString("hiredate")));
			}
			//System.out.println("=== End ===");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DbManager.dbClose(con, ps, rs);
		}
		return list;
	}
	
	/**
	 * 입력받은 사원번호에 해당하는 사원의 정보 검색
	 * */
	public EmpDTO selectOne(int empno) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select empno, ename, job, sal, hiredate from emp where empno = ?";
		EmpDTO empdto = null;
		try {
			con = DbManager.getConnection();
			ps = con.prepareStatement(sql);
			ps.setInt(1, empno);
			rs = ps.executeQuery();
			
			if(rs.next()) {
				empdto = new EmpDTO(rs.getInt("empno"),
						rs.getString("ename"),
						rs.getString("job"),
						rs.getInt("sal"),
						rs.getString("hiredate"));
			} else System.out.println(empno + " number not found");
			
			//System.out.println("=== End ===");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DbManager.dbClose(con, ps, rs);
		}
		return empdto;
	}
	
	/**
	 * db에 데이터 추가
	 * */
	public int insert(EmpDTO empdto) {
		Connection con = null;
		PreparedStatement ps = null;
		String sql = "insert into emp(empno, ename, job, sal, hiredate) values(?, ?, ?, ?, now())";
		int result = 0;
		
		try {
			con = DbManager.getConnection();
			ps = con.prepareStatement(sql);
			// sql 내의 ?에 순차적으로 대입할 값 설정
			ps.setInt(1, empdto.getEmpno());
			ps.setString(2, empdto.getEname());
			ps.setString(3, empdto.getJob());
			ps.setInt(4, empdto.getSal());
			
			int re = ps.executeUpdate();
			
			result = re;
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DbManager.dbClose(con, ps);
		}
		return result;
	}
}
