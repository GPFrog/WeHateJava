package classes;
//��Ȱ�� ����
public class Dormitory
{
	private String dormitoryName;			//��Ȱ����
	private char gender;					//����...�������?
	private int semesterCode;				//�б��ڵ�
	private int capacity;					//�����ο�
	private boolean isMealDuty;				//�Ļ��ǹ�			�Ļ簡 �ǹ��̸� true, �ǹ��� �ƴϸ� false
	private int mealCost5;					//5��ġ �ĺ�, ���� ���ؼ� �ӽ÷� mealCost5�� �ص�.
	private int mealCost7;					//7��ġ �ĺ�, ���� ���ؼ� �ӽ÷� mealCost7�� �ص�.
	private String boardingFees;			//������
	
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
	
	public int getCapacity()
	{
		return capacity;
	}
	public void setCapacity(int capacity)
	{
		this.capacity = capacity;
	}
	
	public boolean isMealDuty()
	{
		return isMealDuty;
	}
	public void setMealDuty(boolean isMealDuty)
	{
		this.isMealDuty = isMealDuty;
	}
	
	public int getMealCost5()
	{
		return mealCost5;
	}
	public void setMealCost5(int mealCost5)
	{
		this.mealCost5 = mealCost5;
	}
	
	public int getMealCost7()
	{
		return mealCost7;
	}
	public void setMealCost7(int mealCost7)
	{
		this.mealCost7 = mealCost7;
	}
	
	public String getBoardingFees()
	{
		return boardingFees;
	}
	public void setBoardingFees(String boardingFees)
	{
		this.boardingFees = boardingFees;
	}
}
