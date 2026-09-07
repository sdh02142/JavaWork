package kosta.db.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import kosta.db.util.DbManager;

public class TransactionDAO {
  /**
   * 계좌이체 기능 구현
   * */
	public void transfer(String inputAccount, String outputAccount, int money) {
		/**
		 * 로드 연결 실행 닫기
		 * */
		Connection con = null;
		try {
			con = DbManager.getConnection(); // -> Auto Commit Mode
			con.setAutoCommit(false); // -> Auto Commit Mode 해제
			
			// 출금
			int result = this.withdraw(con, outputAccount, money);
			if (result == 0) throw new SQLException("출금 계좌 오류");
			
			// 입금
			result = this.depodit(con, inputAccount, money);
			if (result == 0) throw new SQLException("입금 계좌 오류");
			// 잔액조회
			if (this.balanceCheck(con, inputAccount)) throw new SQLException("입금 계좌 오류");
			
			// 계좌이체 성공
			System.out.println("계좌이체 성공");
			con.commit(); // Commit 완료
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			try {
				con.rollback();
			} catch(Exception ex) {
				ex.printStackTrace();
			}
		} finally {
			DbManager.dbClose(con, null);
		}
	}
	
	/**
	 * 출금 method
	 * update bank set balance=balane-인출금액 where account = 출금계좌번호
	 * sql update구문 -> int
	 * */
	public int withdraw (Connection con, String outputAccount, int money) throws SQLException {
		PreparedStatement ps = null;
		String sql = "update bank set balance = balance - ? where account = ?";
		int result = 0;
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, money);
			ps.setString(2, outputAccount);
			result = ps.executeUpdate();
		} finally {
			DbManager.dbClose(null, ps); // -> 상위 method에서 finally 구문에 close가 있으므로 con은 여기서 다루지 않음.
		}
		return result;
	}
	
	
	/**
	 * 입금 method
	 * update bank set balance=balance+인출금액 where account =입금계좌번호
	 * sql update구문 -> int
	 * */
	public int depodit(Connection con, String inputAccount, int money) throws SQLException {
		PreparedStatement ps = null;
		String sql = "update bank set balance = balance + ? where account = ?";
		int result = 0;
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, money);
			ps.setString(2, inputAccount);
			result = ps.executeUpdate();
		} finally {
			DbManager.dbClose(null, ps); // -> 상위 method에서 finally 구문에 close가 있으므로 con은 여기서 다루지 않음.
		}
		return result;
	}
	
	/**
	 * 잔액조회 method
	 * select balance from bank where account='A02'
	 * sql select구문 -> 반환한 계좌의 잔액이 요청한 금액보다 많은지 확인할 목적이므로 boolean 채택
	 * true -> 잔액 초과
	 * */
	public boolean balanceCheck(Connection con, String inputAccount) throws SQLException {
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select balance from bank where account = ?";
		boolean result = false;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, inputAccount);
			
			rs = ps.executeQuery();
			if(rs.next()) {
				if(rs.getInt(1) >= 1000) result = true;
				};
		} finally {
			DbManager.dbClose(null, ps, rs); // -> 상위 method에서 finally 구문에 close가 있으므로 con은 여기서 다루지 않음.
		}
		return result;
	}
	
	public static void main(String[] args) {
		TransactionDAO dao = new TransactionDAO();
		System.out.println("--1. 출금계좌 오류----");
//		dao.transfer("A02", "A05",200);//입금, 출금, 금액
		
		System.out.println("--2. 입금계좌 오류----");
//		dao.transfer("A04", "A01",200);//입금, 출금, 금액
		
		
		System.out.println("--3. 입금계좌의 총액 1000원 이상인경우----");
//		dao.transfer("A02", "A01",700);//입금, 출금, 금액
		
		System.out.println("--4. 성공----------");
		dao.transfer("A02", "A01",100);//입금, 출금, 금액
	}
}











