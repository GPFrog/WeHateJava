package classes;

import java.util.Date;

//���� ����
public class ResidenceInfo
{
	private String studentId;			//�л��� �й�(�ܷ�Ű)
	private int roomId;					//���� ���� ���̵�(�ܷ�Ű)
	private int semesterCode;			//�б��ڵ�
	private char seat;					//�ڸ�
	private Date checkout;				//��� ������
	
	public String getStudentId()
	{
		return studentId;
	}
	public void setStudentId(String studentId)
	{
		this.studentId = studentId;
	}
	
	public int getRoomId()
	{
		return roomId;
	}
	public void setRoomId(int roomId)
	{
		this.roomId = roomId;
	}
	
	public int getSemesterCode()
	{
		return semesterCode;
	}
	public void setSemesterCode(int semesterCode)
	{
		this.semesterCode = semesterCode;
	}
	
	public char getSeat()
	{
		return seat;
	}
	public void setSeat(char seat)
	{
		this.seat = seat;
	}
	
	public Date getCheckout()
	{
		return checkout;
	}
	public void setCheckout(Date checkout)
	{
		this.checkout = checkout;
	}
}
