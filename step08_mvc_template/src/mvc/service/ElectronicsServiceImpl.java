package mvc.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ResourceBundle;

import mvc.dto.Electronics;
import mvc.exception.DuplicateModelNoException;
import mvc.exception.ElectronicsArrayBoundsException;
import mvc.exception.SearchNotFoundException;

/**
 * 전자제품에 관련된 기능을 담당할 클래스
 */

public class ElectronicsServiceImpl implements ElectronicsService {
	
	private static ElectronicsService instance = new ElectronicsServiceImpl(); 
    private static final int MAX_SIZE=10;
    List<Electronics> list = new ArrayList<Electronics>();
    
    
    /** 
     * 외부에서 객체 생성안됨. 
     * InitInfo.properties파일을 로딩하여  List에 추가하여
     * 초기치 데이터를 만든다.
     * 
     */
    private ElectronicsServiceImpl() {
    	System.out.println("**private constructor init.....");
    	ResourceBundle rb = ResourceBundle.getBundle("InitInfo");//InitInfo.properties
        for(String key : rb.keySet()) {
     	  String value =  rb.getString(key); //100,\uC120\uD48D\uAE30,35000,\uC0BC\uC131 \uC120\uD48D\uAE30
     	   String data[] = value.split(",");
     	   System.out.println(key +" = " + value);
     	  
     	     list.add(new Electronics( Integer.parseInt(data[0]) ,data[1],   
     	    		 Integer.parseInt( data[2]), data[3]) );
     	  
        }
        
        System.out.println(list);
      
    }
    
    public static ElectronicsService getInstance() {
		return instance;
	}

	@Override
	public void insert(Electronics electronics) 
			  throws ElectronicsArrayBoundsException, DuplicateModelNoException {
		if(list.size() >= MAX_SIZE) throw new ElectronicsArrayBoundsException("배열의 길이를 벗어나 더 이상 등록 할 수 없습니다.");
		for(Electronics e : list) {
			if(e.getModelNo() == electronics.getModelNo()) {
				throw new DuplicateModelNoException("modelNo가 중복되어 등록할 수 없습니다.");
			}
		}
		System.out.println("등록 완료");
		list.add(electronics);
	}

	@Override
	public List<Electronics> selectAll() {
		
		return list;
	}

	@Override
	public Electronics searchByModelNo(int modelNo) throws SearchNotFoundException {
		for(Electronics e : list) {
			if(e.getModelNo() == modelNo) return e;
		}
		throw new SearchNotFoundException(modelNo + "번은 없는 모델번호로 검색할수 없습니다.");
	}

	@Override
	public void update(Electronics electronics) throws SearchNotFoundException {
		Electronics e = this.searchByModelNo(electronics.getModelNo());
		e.setModelDetail(electronics.getModelDetail());
		System.out.println("수정 성공");
		}

	@Override
	public void delete(int modelNo) throws SearchNotFoundException {
		Electronics e = this.searchByModelNo(modelNo);
		if(list.remove(e)) System.out.println("삭제 성공");
		
	}

	@Override
	public List<Electronics> selectSortByPrice() {
		List<Electronics> re = new ArrayList<Electronics>(list);
		Collections.sort(re);
		return re;
	}
    
} // 클래스 끝 