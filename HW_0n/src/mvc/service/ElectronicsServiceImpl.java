package mvc.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ResourceBundle;


import mvc.dto.Person;
import mvc.exception.DuplicateModelNoException;
import mvc.exception.ElectronicsArrayBoundsException;
import mvc.exception.SearchNotFoundException;

/**
 * 전자제품에 관련된 기능을 담당할 클래스
 */

public class ElectronicsServiceImpl implements ElectronicsService {
	
	private static ElectronicsService instance = new ElectronicsServiceImpl(); 
    private static final int MAX_SIZE=10;
    List<Person> list = new ArrayList<Person>();
    
    
    /** 
     * 외부에서 객체 생성안됨. 
     * InitInfo.properties파일을 로딩하여  List에 추가하여
     * 초기치 데이터를 만든다.
     * 
     */
    private ElectronicsServiceImpl() {
    	File isInitFile = new File("C:\\Edu\\Java\\JavaWork\\step12_mvc_ObjectSave\\resources\\save.txt");
    	if(!isInitFile.exists()) {
    		System.out.println("**private constructor init.....");
        	ResourceBundle rb = ResourceBundle.getBundle("InitInfo");//InitInfo.properties
            for(String key : rb.keySet()) {
         	  String value =  rb.getString(key); //100,\uC120\uD48D\uAE30,35000,\uC0BC\uC131 \uC120\uD48D\uAE30
         	   String data[] = value.split(",");
         	   System.out.println(key +" = " + value);
         	  
         	     list.add(new Person( Integer.parseInt(data[0]) ,data[1],   
         	    		 Integer.parseInt( data[2]), data[3]) );
            }
    	} else {
    		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Edu\\Java\\JavaWork\\step12_mvc_ObjectSave\\resources\\save.txt"))){
    			list = (List<Person>)ois.readObject();
//    			System.out.println(list);
//    			System.out.println(list.size());
    			System.out.println("Loading complete.");
    		} catch(Exception e) {
    			e.printStackTrace();
    		}
    	}
    }
    
    public static ElectronicsService getInstance() {
		return instance;
	}

	@Override
	public void insert(Person electronics) {

	}


	@Override
	public Person searchByNameNPw(String name, String pw) throws SearchNotFoundException {
		for(Person e : list) {
			if(e.getModelNo() == modelNo) return e;
		}
		throw new SearchNotFoundException(modelNo + "번은 없는 모델번호로 검색할수 없습니다.");
	}

	@Override
	public void update(Person electronics) throws SearchNotFoundException {
		Person e = this.searchByModelNo(electronics.getModelNo());
		e.setModelDetail(electronics.getModelDetail());
		System.out.println("수정 성공");
		}

	@Override
	public void delete(int modelNo) throws SearchNotFoundException {
		Person e = this.searchByModelNo(modelNo);
		if(list.remove(e)) System.out.println("삭제 성공");
		
	}

	@Override
	public List<Person> selectSortByPrice() {
		List<Person> re = new ArrayList<Person>(list);
		Collections.sort(re);
		return re;
	}

	@Override
	public void saveObject() throws Exception{
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Edu\\Java\\JavaWork\\step12_mvc_ObjectSave\\resources\\save.txt"))){
			oos.writeObject(list);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
    
} // 클래스 끝 