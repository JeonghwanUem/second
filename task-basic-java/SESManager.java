package step3;
import java.io.*;
import java.util.*;

/**
 * <pre>
 * SES(Soft Engineer School) 관리 프로그램의 업무로직을 관리하는 클래스
 * 주요 기능으로는 다음과 같다.
 * 1. 신규 관리인원 등록
 * 2. 등록인원 검색
 * 3. 등록인원 삭제
 * 4. 전체 등록인원 출력
 * </pre>
 * */
public class SESManager {
	private final String FILE_NAME = "human.dat";	// 파일명 상수
	private ArrayList<Human> list;	// Human 객체를 담을 리스트
	
	private FileInputStream fis;	//파일을 읽기위한 스트림
	private FileOutputStream fos;	//파일을 쓰기위한 스트림
	private ObjectInputStream ois;	//객체를 읽기위한 스트림
	private ObjectOutputStream oos;	//객체를 쓰기위한 스트림
	
	/**
	 * 생성자
	 */
	public SESManager(){
		// 파일이 존재하면 읽어들인다. 없으면 ArrayList를 생성한다.
		if(new File(FILE_NAME).exists()) {//파일이 존재하면 true로 
				//읽어들인다
			/*File f = new File(FILE_NAME);
			boolean flag = f.exists();
			if(flag) {
			}else {
				
			}*///가독성이 더 좋다
			getFile();
		}else {
			list = new ArrayList<>();//+파일이 없으면 새로 하나 만들라는 의미 인것같다@@
		}
	}
	
	/**
	 * 새로운 Human 객체를 등록한다.
	 * @param human 등록할 Professor, Trainee, Staff 클래스의 객체
	 * @return 성공 여부
	 * */
	public boolean insertHuman(Human human) {//등록이 제대로 됬으면 트루 아니면 폴스
		// 전달된 객체의 주민등록번호로 검색한다.
		Human find_h = findHuman(human.getJumin());
		
		if(find_h !=null) {
			return false;//지금 등록 받은 주민등록 번호가 있으니깐 따로 등록 안함
		}
		// 등록된 주민번호인지 체크한다. 이미 있는 주민등록번호인 경우는 false를 리턴한다.
		
		//리스트에 새로운 Human 객체를 추가한다.
		list.add(human);//넘어온 휴만 값으로 
		
		//파일에 저장 리스트를 덮어쓴다
		//파일에 저장하다가 실패했을때 어떻게 할것인가 생각해야 한다. 저장하다 실패하면 list의 내용을 지워야한다.원상복귀해줘야 한다 
		if(setFile()==false) {//저장은 setFile에서 이미 이루어져 있다 
			list.remove(human);
		}
		
		//true를 리턴한다.
		return true;
	}

	/**
	 * 등록된 Human 객체를 검색한다.
	 * @param jumin 검색할 Human의 주민번호
	 * @return Human 배열에 등록된 객체들 중 파라메터로 전달된 주민번호와 일치되는 Human 객체, 검색 결과가 없을 시 null을 반환한다.//return null하라는 말
	 * */
	public Human findHuman(String jumin) {//그냥 검색을 할때도 사용하기 때문에 함수로 이루어져 있다
		//전달된 주민번호를 리스트에서 검색하여 있으면 해당 객체를 리턴한다.
	for(Human h : list) {
		if (h.getJumin().equals(jumin)) {
			return h;
		}
		
	}
	//위와 같은 함수이다. 
	/*for (int i =0 ; i<list.size();i++) {
		if(list.get(i).getJumin().equals(jumin)) {
			return list.get(i);
		}
	}*/
		//없으면 null을 리턴한다.
		return null;
	}

	/**
	 * 등록된 Human 객체를 삭제한다.
	 * @param jumin 삭제할 Human의 주민번호
	 * @return 주어진 주민번호와 일치되는 Human 객체의 삭제 결과, Human 배열에 등록된 객체들 중 파라메터로 전달된 주민번호와 일치되는 Human 객체가 발견되어 삭제를 성공하면 true를 그렇지 않으면 false를 반환
	 * */
	public boolean deleteHuman(String jumin){
		//전달된 주민번호를 찾아 해당 객체를 삭제한다.
		for(Human h : list) {
			if(h.getJumin().equals(jumin)) {
				list.remove(h);
				setFile();
				return true;
			}
		}
		//삭제 성공 여부를 리턴한다.
		return false;
	}

	/**
	 * 등록된 모든 Human 객체 정보를 출력한다.
	 * */
	public void showAll() {
		//리스트의 모든 객체 출력
		for(Human h : list) {
			System.out.println(h);//모든정보를 출력한다 
		}
	}
	
	/**
	 * 리스트에 등록된 모든 Human 객체 정보를 파일에 쓴다.
	 * @return 파일 쓰기 성공 여부
	 * */
	public boolean setFile(){
		boolean result = false; 
		
		try {
			fos = new FileOutputStream(FILE_NAME);
			oos = new ObjectOutputStream(fos);//에러나는 이유는 IOException//스트림 연결
			oos.writeObject(list);//현제가지고 있는 리스트의 정보를 등록한다는 의미//flush기능이 있긴 있지만
			
			oos.flush();//안될수도 있기때문에 해준다 
			result = true;
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			closeStreams();
		}
		
		return result;
	}
	
	/**
	 * 파일에 쓰여진 모든 Human 객체 정보를 ArrayList로 읽어들인다.
	 * */
	public void getFile() {//통로만 개설한것임
		try {
			fis = new FileInputStream(FILE_NAME);
			ois = new ObjectInputStream(fis);
			list = (ArrayList<Human>)ois.readObject();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			closeStreams();
		}
		
	
	}
	
	/**
	 * 스트림 객체를 모두 close 하여 자원을 반환한다.
	 * */
	private void closeStreams() {
			
	if(fis!=null) {
		try 
		{
			fis.close();

		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	if(fos!=null) {
		try {
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	if(ois!=null) {
		try {
			ois.close();

		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	if(oos!=null) {
		try {
			oos.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
}
