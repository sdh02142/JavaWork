package com.ws07.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.ws07.dto.AccountDto;
import com.ws07.dto.InstallAccountDto;
import com.ws07.dto.LoanAccountDto;
import com.ws07.dto.SavingAccountDto;
import com.ws07.dto.UserDto;
import com.ws07.exception.BalanceLackException;
import com.ws07.exception.UserAccountNotFoundException;

/**
 * 고객과 계좌에 관련된 서비스
 * (Business Logic 을 처리하는 객체)
 * */


//자동 import 단축키 = ctrl + shift + 영문o
public class BankServiceImpl implements BankService{
	List<AccountDto> accountList;
	List<UserDto> userList;
	
	/**
	 * 생성자에서 테스트를 위한 고객 및 계좌 객체를 생성하고 배열에 저장한다
	 * */
	public BankServiceImpl() {
		userList = new ArrayList<UserDto>(); 
		 accountList = new ArrayList<AccountDto>(); 

		userList.add( new UserDto(111, "홍길동", "hong@gildong@com", "010-1111-1111", false) );
		userList.add( new UserDto(222, "이길동", "lee@gildong@com", "010-2222-2222", true) );
		userList.add( new UserDto(333, "삼길동", "sam@gildong@com", "010-3333-3333", false) );
		
		accountList.add( new InstallAccountDto(20, "00200202002002", 1000, 111, 12, 10000) );
		
		accountList.add( new SavingAccountDto(10, "00100101001001", 500, 111, 100) );
		
		accountList.add( new LoanAccountDto(60, "00600606006006", 500, 333, "House") );
		accountList.add( new LoanAccountDto(30, "00300303003003", 0, 111, "Building") );
		
		accountList.add( new SavingAccountDto(70, "00700707007007", 500, 333, 200) );
		
		accountList.add( new LoanAccountDto(50, "00500505005005", 200, 222, "Car") );
		accountList.add( new SavingAccountDto(40, "00400404004004", 1000, 222, 50) );
		 
	}//생성자 끝
	
    /**
	  특정 사용자의 계좌 목록을 배열로 리턴 하는 메소드를 작성한다
	*/
	
	@Override
	public List<AccountDto> getAccountList() {
		return accountList;
	}
	
	@Override
	public List<AccountDto> getAccountList(int userSeq) {
		List<AccountDto> result = new ArrayList<>();
		for(AccountDto ad : accountList){
			if(ad.getUserSeq() == userSeq){
				result.add(ad);
			}
		}
		return result;
	}
	
	@Override
	public List<AccountDto> getAccountListSortByUserSeq() {
		List<AccountDto> result = new ArrayList<>(accountList);
		Collections.sort(result, (o1, o2)->o1.getUserSeq()-o2.getUserSeq());
		return result;
	}
	
	@Override
	public List<AccountDto> getAccountListSortByBalance() {
		List<AccountDto> result = new ArrayList<>(accountList);
		Collections.sort(result);
		return result;
	}
	
	
	/**
	   특정 사용자의 고객 정보를 리턴 하는 메소드를 작성한다
	   
	   @param : 고객의 sequence
	   @return : null이면 고객의정보없다 
	**/
	@Override
	public UserDto getUserDetail(int userSeq) {
		UserDto result = null;
		for(UserDto ud : userList){
			if(ud.getUserSeq() == userSeq){
				return result = ud;
			}
		}
		return result;
	}
	
	/**
	   특정 계좌의 정보를 리턴 하는 메소드를 작성한다
	   
	   @param : String accountNumber
	   @return : null이면 계좌 정보없다 
	**/
	
	public AccountDto getAccountDetail(String accountNumber) {
		AccountDto result = null;
		for(AccountDto ad : accountList){
			if(ad.getAccountNumber().equals(accountNumber)) {
				return result = ad;
			}
		}
		return result;
	}

	@Override
	public AccountDto getUserAccount(int userSeq, int accountSeq) throws UserAccountNotFoundException {
		AccountDto re = null;
		for(AccountDto ad : accountList) {
			if(ad.getUserSeq() == userSeq && ad.getAccountSeq() == accountSeq) re = ad;
		}
		if (re == null) throw new UserAccountNotFoundException("사용자 또는 계좌를 찾을 수 없습니다.");
		return re;
	}

	@Override
	public int withdraw(int userSeq, int accountSeq, int amount)
			throws BalanceLackException, UserAccountNotFoundException {
		AccountDto tar = this.getUserAccount(userSeq, accountSeq);
		int result = tar.getBalance() - amount;
		if(result < 0) throw new BalanceLackException("잔액이 부족합니다.");
		else return result;
	}
		
}










