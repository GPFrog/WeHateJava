package classes;
//��û
public class Application
{
	private int applicationId;		//���� ���̵�
	private String studentId;		//�л� �й�(�ܷ�Ű)
	private int choice;				//����
	private int mealType;			//���Ͻ�				0�̸� ����, 5�̸� 5�Ͻ�, 7�̸� 7�Ͻ�
	private boolean isPaid;			//���ο���
	private boolean isPassed;		//�հݿ���	
	private boolean isLastPassed;	//���, �����հݿ���
	private String dormitoryName;	//��Ȱ����(�ܷ�Ű)
	private char gender;			//����(�ܷ�Ű)
	private int semesterCode;		//�б��ڵ�(�ܷ�Ű)
	
	public int getApplicationId()
	{
		return applicationId;
	}
	public void setApplicationId(int applicationId)
	{
		this.applicationId = applicationId;
	}
	
	public String getStudentId()
	{
		return studentId;
	}
	public void setStudentId(String studentId)
	{
		this.studentId = studentId;
	}
	
	public int getChoice()
	{
		return choice;
	}
	public void setChoice(int choice)
	{
		this.choice = choice;
	}
	
	public int getMealType()
	{
		return mealType;
	}
	public void setMealType(int mealType)
	{
		this.mealType = mealType;
	}
	
	public boolean isPaid()
	{
		return isPaid;
	}
	public void setPaid(boolean isPaid)
	{
		this.isPaid = isPaid;
	}
	
	public boolean isPassed()
	{
		return isPassed;
	}
	public void setPassed(boolean isPassed)
	{
		this.isPassed = isPassed;
	}
	
	public boolean isLastPassed()
	{
		return isLastPassed;
	}
	public void setLastPassed(boolean isLastPassed)
	{
		this.isLastPassed = isLastPassed;
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
