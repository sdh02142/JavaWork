package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import util.DbManager;
import vo.Room;
import vo.Student;
import vo.Subject;
import vo.Teacher;

public class StudentTeacherDAOImpl implements StudentTeacherDAO {

	@Override
	public List<Student> getGenderByWomen() {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select * from student where 수_주민등록번호 like '%-2%'";
		List<Student> list = new ArrayList<Student>();
		try {
			con = DbManager.getConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				list.add(new Student(rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4),
						rs.getString(5),
						rs.getString(6)));
			}
			//System.out.println("=== End ===");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DbManager.dbClose(con, ps, rs);
		}
		return list;
	}

	@Override
	public List<Teacher> getTeacherInfoByAddr(String gu) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select * from Teacher where 주소 like ?";
		List<Teacher> list = new ArrayList<Teacher>();
		try {
			con = DbManager.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, "%" + gu + "%");
			rs = ps.executeQuery();
			
			while(rs.next()) {
				list.add(new Teacher(rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4),
						rs.getString(5),
						rs.getString(6),
						rs.getString(7)));
			}
			//System.out.println("=== End ===");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DbManager.dbClose(con, ps, rs);
		}
		return list;
	}

	@Override
	public Teacher getTeacherInfoBySubject(String subject) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select * from teacher where 수강코드 = (select 수강코드 from subject where upper(과목)=upper( ? ))";
		Teacher t = null;
		try {
			con = DbManager.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, subject);
			rs = ps.executeQuery();
			
			if(rs.next()) {
				t = new Teacher(rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4),
						rs.getString(5),
						rs.getString(6),
						rs.getString(7));
			} else System.out.println("강의 이름을 확인해주세요. 입력된 값 : " + subject);
			
			//System.out.println("=== End ===");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DbManager.dbClose(con, ps, rs);
		}
		return t;
	}

	@Override
	public Teacher getTeacherInfoByNo(int teacherNo) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select  * from v_teacher_data where 강사번호 = ?";
		Teacher t = null;
		try {
			con = DbManager.getConnection();
			ps = con.prepareStatement(sql);
			ps.setInt(1, teacherNo);
			rs = ps.executeQuery();
			
			if(rs.next()) {
				Teacher t2 = new Teacher(rs.getInt(1), rs.getString(2), "", "", "", "", "");
						t2.setSubject(new Subject(rs.getString(3), rs.getString(4)));
						t2.setRoom(new Room(rs.getInt(5), rs.getInt(6)));
						t = t2;
			} else System.out.println("강사 번호를 확인해주세요. 입력된 값 : " + teacherNo);
			
			//System.out.println("=== End ===");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DbManager.dbClose(con, ps, rs);
		}
		return t;
	}

}
