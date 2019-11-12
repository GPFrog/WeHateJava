package classes;
//�л�
public class Student
{
	private String studentId;					//�й�
	private String name;						//����
	private char gender;						//����
	private String departmentId;				//�а��ڵ�
	private String departmentName;				//�а���
	private int year;							//�г�
	private String rrn;							//�ֹε�Ϲ�ȣ(resident registration number)
	private String contact;						//�л���ȭ��ȣ
	private String parentZipCode;				//��ȣ�� �����ȣ
	private String parentAddress;				//��ȣ���ּ�
	private String medicalCertificatePath;		//(����)���ܼ� ���
	private boolean medicalCertificateCheck;	//(����)���ܼ� Ȯ�ο���
	
	public String getStudentId()
	{
		return studentId;
	}
	public void setStudentId(String studentId)
	{
		this.studentId = studentId;
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	
	public char getGender()
	{
		return gender;
	}
	public void setGender(char gender)
	{
		this.gender = gender;
	}
	
	public String getDepartmentId()
	{
		return departmentId;
	}
	public void setDepartmentId(String departmentId)
	{
		this.departmentId = departmentId;
	}
	
	public String getDepartmentName()
	{
		return departmentName;
	}
	public void setDepartmentName(String departmentName)
	{
		this.departmentName = departmentName;
	}
	
	public int getYear()
	{
		return year;
	}
	public void setYear(int year)
	{
		this.year = year;
	}
	
	public String getRrn()
	{
		return rrn;
	}
	public void setRrn(String rrn)
	{
		this.rrn = rrn;
	}
	
	public String getContact()
	{
		return contact;
	}
	public void setContact(String contact)
	{
		this.contact = contact;
	}
	
	public String getParentZipCode()
	{
		return parentZipCode;
	}
	public void setParentZipCode(String parentZipCode)
	{
		this.parentZipCode = parentZipCode;
	}
	
	public String getParentAddress()
	{
		return parentAddress;
	}
	public void setParentAddress(String parentAddress)
	{
		this.parentAddress = parentAddress;
	}
	
	public String getMedicalCertificatePath()
	{
		return medicalCertificatePath;
	}
	public void setMedicalCertificatePath(String medicalCertificatePath)
	{
		this.medicalCertificatePath = medicalCertificatePath;
	}
	
	public boolean isMedicalCertificateCheck()
	{
		return medicalCertificateCheck;
	}
	public void setMedicalCertificateCheck(boolean medicalCertificateCheck)
	{
		this.medicalCertificateCheck = medicalCertificateCheck;
	}
}
