package classes;
//ȣ������
public class Room
{
	private int roomId;					//���� ���� ���̵�
	private String number;				//ȣ�� ��ȣ, ��ȣ��
	private int capacity;				//���ν�
	private String dormitoryName;		//��Ȱ����(�ܷ�Ű)
	private char gender;				//����(�ܷ�Ű)
	private int semesterCode;			//�б��ڵ�(�ܷ�Ű)
	
	public int getRoomId()
	{
		return roomId;
	}
	public void setRoomId(int roomId)
	{
		this.roomId = roomId;
	}
	
	public String getNumber()
	{
		return number;
	}
	public void setNumber(String number)
	{
		this.number = number;
	}
	
	public int getCapacity()
	{
		return capacity;
	}
	public void setCapacity(int capacity)
	{
		this.capacity = capacity;
	}
	
	public String getDormitoryName()
	{
		return dormitoryName;
	}
	public void setDormitoryName(String dormitoryName)
	{
		this.dormitoryName = dormitoryName;
	}
	
	public char getGender()
	{
		return gender;
	}
	public void setGender(char gender)
	{
		this.gender = gender;
	}
	
	public int getSemesterCode()
	{
		return semesterCode;
	}
	public void setSemesterCode(int semesterCode)
	{
		this.semesterCode = semesterCode;
	}
}
