package step3;
import java.io.*;
import java.util.*;

/**
 * <pre>
 * SES(Soft Engineer School) ���� ���α׷��� ���������� �����ϴ� Ŭ����
 * �ֿ� ������δ� ������ ����.
 * 1. �ű� �����ο� ���
 * 2. ����ο� �˻�
 * 3. ����ο� ����
 * 4. ��ü ����ο� ���
 * </pre>
 * */
public class SESManager {
	private final String FILE_NAME = "human.dat";	// ���ϸ� ���
	private ArrayList<Human> list;	// Human ��ü�� ���� ����Ʈ
	
	private FileInputStream fis;	//������ �б����� ��Ʈ��
	private FileOutputStream fos;	//������ �������� ��Ʈ��
	private ObjectInputStream ois;	//��ü�� �б����� ��Ʈ��
	private ObjectOutputStream oos;	//��ü�� �������� ��Ʈ��
	
	/**
	 * ������
	 */
	public SESManager(){
		// ������ �����ϸ� �о���δ�. ������ ArrayList�� �����Ѵ�.
		if(new File(FILE_NAME).exists()) {//������ �����ϸ� true�� 
				//�о���δ�
			/*File f = new File(FILE_NAME);
			boolean flag = f.exists();
			if(flag) {
			}else {
				
			}*///�������� �� ����
			getFile();
		}else {
			list = new ArrayList<>();//+������ ������ ���� �ϳ� ������ �ǹ� �ΰͰ���@@
		}
	}
	
	/**
	 * ���ο� Human ��ü�� ����Ѵ�.
	 * @param human ����� Professor, Trainee, Staff Ŭ������ ��ü
	 * @return ���� ����
	 * */
	public boolean insertHuman(Human human) {//����� ����� ������ Ʈ�� �ƴϸ� ����
		// ���޵� ��ü�� �ֹε�Ϲ�ȣ�� �˻��Ѵ�.
		Human find_h = findHuman(human.getJumin());
		
		if(find_h !=null) {
			return false;//���� ��� ���� �ֹε�� ��ȣ�� �����ϱ� ���� ��� ����
		}
		// ��ϵ� �ֹι�ȣ���� üũ�Ѵ�. �̹� �ִ� �ֹε�Ϲ�ȣ�� ���� false�� �����Ѵ�.
		
		//����Ʈ�� ���ο� Human ��ü�� �߰��Ѵ�.
		list.add(human);//�Ѿ�� �޸� ������ 
		
		//���Ͽ� ���� ����Ʈ�� �����
		//���Ͽ� �����ϴٰ� ���������� ��� �Ұ��ΰ� �����ؾ� �Ѵ�. �����ϴ� �����ϸ� list�� ������ �������Ѵ�.���󺹱������ �Ѵ� 
		if(setFile()==false) {//������ setFile���� �̹� �̷���� �ִ� 
			list.remove(human);
		}
		
		//true�� �����Ѵ�.
		return true;
	}

	/**
	 * ��ϵ� Human ��ü�� �˻��Ѵ�.
	 * @param jumin �˻��� Human�� �ֹι�ȣ
	 * @return Human �迭�� ��ϵ� ��ü�� �� �Ķ���ͷ� ���޵� �ֹι�ȣ�� ��ġ�Ǵ� Human ��ü, �˻� ����� ���� �� null�� ��ȯ�Ѵ�.//return null�϶�� ��
	 * */
	public Human findHuman(String jumin) {//�׳� �˻��� �Ҷ��� ����ϱ� ������ �Լ��� �̷���� �ִ�
		//���޵� �ֹι�ȣ�� ����Ʈ���� �˻��Ͽ� ������ �ش� ��ü�� �����Ѵ�.
	for(Human h : list) {
		if (h.getJumin().equals(jumin)) {
			return h;
		}
		
	}
	//���� ���� �Լ��̴�. 
	/*for (int i =0 ; i<list.size();i++) {
		if(list.get(i).getJumin().equals(jumin)) {
			return list.get(i);
		}
	}*/
		//������ null�� �����Ѵ�.
		return null;
	}

	/**
	 * ��ϵ� Human ��ü�� �����Ѵ�.
	 * @param jumin ������ Human�� �ֹι�ȣ
	 * @return �־��� �ֹι�ȣ�� ��ġ�Ǵ� Human ��ü�� ���� ���, Human �迭�� ��ϵ� ��ü�� �� �Ķ���ͷ� ���޵� �ֹι�ȣ�� ��ġ�Ǵ� Human ��ü�� �߰ߵǾ� ������ �����ϸ� true�� �׷��� ������ false�� ��ȯ
	 * */
	public boolean deleteHuman(String jumin){
		//���޵� �ֹι�ȣ�� ã�� �ش� ��ü�� �����Ѵ�.
		for(Human h : list) {
			if(h.getJumin().equals(jumin)) {
				list.remove(h);
				setFile();
				return true;
			}
		}
		//���� ���� ���θ� �����Ѵ�.
		return false;
	}

	/**
	 * ��ϵ� ��� Human ��ü ������ ����Ѵ�.
	 * */
	public void showAll() {
		//����Ʈ�� ��� ��ü ���
		for(Human h : list) {
			System.out.println(h);//��������� ����Ѵ� 
		}
	}
	
	/**
	 * ����Ʈ�� ��ϵ� ��� Human ��ü ������ ���Ͽ� ����.
	 * @return ���� ���� ���� ����
	 * */
	public boolean setFile(){
		boolean result = false; 
		
		try {
			fos = new FileOutputStream(FILE_NAME);
			oos = new ObjectOutputStream(fos);//�������� ������ IOException//��Ʈ�� ����
			oos.writeObject(list);//���������� �ִ� ����Ʈ�� ������ ����Ѵٴ� �ǹ�//flush����� �ֱ� ������
			
			oos.flush();//�ȵɼ��� �ֱ⶧���� ���ش� 
			result = true;
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			closeStreams();
		}
		
		return result;
	}
	
	/**
	 * ���Ͽ� ������ ��� Human ��ü ������ ArrayList�� �о���δ�.
	 * */
	public void getFile() {//��θ� �����Ѱ���
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
	 * ��Ʈ�� ��ü�� ��� close �Ͽ� �ڿ��� ��ȯ�Ѵ�.
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
