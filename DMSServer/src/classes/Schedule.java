package classes;
import java.util.Date;

//������
public class Schedule
{
	private String scheduleId;			//������ ���� ���̵�
	private Date startDate;				//������
	private Date endDate;				//������
	private String description;			//���, ����
	private int code;					//������ ���� �ڵ�(�ܷ�Ű)
	
	public String getScheduleId()
	{
		return scheduleId;
	}
	public void setScheduleId(String scheduleId)
	{
		this.scheduleId = scheduleId;
	}
	
	public Date getStartDate()
	{
		return startDate;
	}
	public void setStartDate(Date startDate)
	{
		this.startDate = startDate;
	}
	
	public Date getEndDate()
	{
		return endDate;
	}
	public void setEndDate(Date endDate)
	{
		this.endDate = endDate;
	}
	
	public String getDescription()
	{
		return description;
	}
	public void setDescription(String description)
	{
		this.description = description;
	}
	
	public int getCode()
	{
		return code;
	}
	public void setCode(int code)
	{
		this.code = code;
	}
}
