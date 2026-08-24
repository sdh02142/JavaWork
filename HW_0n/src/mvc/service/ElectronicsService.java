package mvc.service;

import java.util.List;

import mvc.dto.Person;
import mvc.exception.DuplicateModelNoException;
import mvc.exception.ElectronicsArrayBoundsException;
import mvc.exception.SearchNotFoundException;

public interface ElectronicsService {

    public void insert(Person person);
    
    /**
     * 모델번호에 해당하는 전자제품 검색 
     * @param modelNo
     * @return
     *   : 만약 찾는 정보가 없으면 
     *      SearchNotFoundException 예외발생
     *       -예외메시지 : modelNo+"는 없는 모델번호로 검색할수 없습니다."
     */
    public Person searchByNameNPw(String name, String pw)throws SearchNotFoundException;


    /**
     * 모델번호에 해당하는 전자제품 수정하기 
     * (설명만 수정한다)
     * @param electronics
     *  : 수정전에 모델번호에 해당하는 정보가 있는지를 찾고 없으면
     *     SearchNotFoundException 예외발생
     *     있으면 전자제품 모델번호에 해당하는 설명을 수정한다.
     */
    public void update(Person electronics) throws SearchNotFoundException;
    
    
    /**
     * 모델번호에 해당하는 전자제품 삭제하기
     * 
     * @param 모델번호
     *  :삭제전에 모델번호에 해당하는 정보가 있는지를 찾고 없으면
     *     SearchNotFoundException 예외발생
     *     있으면 전자제품 모델번호에 해당하는 정보를 삭제한다.
     */
    public void delete(int modelNo) throws SearchNotFoundException;
    
    /**
     *  가격을 기준으로 정렬하기
     *  만약, 가격이 같으면 modelNo를 기준으로 정렬한다.
     * @return
     */
    public List<Person> selectSortByPrice();
    
    public void saveObject() throws Exception;
}



