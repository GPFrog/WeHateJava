package classes;
//����
public class Score
{
	private String subjectName;		//�������
	private int semesterCode;		//�б� �ڵ�
	private int credit;				//���� (�̼� ����)
	private char grade;				//���� ���(A+, A, B+, B, ...)
	private String studentId;		//�л��� �й�(�ܷ�Ű)
	
	public String getSubjectName()
	{
		return subjectName;
	}
	public void setSubjectName(String subjectName)
	{
		this.subjectName = subjectName;
	}
	
	public int getSemesterCode()
	{
		return semesterCode;
	}
	public void setSemesterCode(int semesterCode)
	{
		this.semesterCode = semesterCode;
	}
	
	public int getCredit()
	{
		return credit;
	}
	public void setCredit(int credit)
	{
		this.credit = credit;
	}
	
	public char getGrade()
	{
		return grade;
	}
	public void setGrade(char grade)
	{
		this.grade = grade;
	}
	
	public String getStudentId()
	{
		return studentId;
	}
	public void setStudentId(String studentId)
	{
		this.studentId = studentId;
	}
}
