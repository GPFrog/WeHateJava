package classes;
//����
public class Account
{
	private String accountId;					//���̵�, �л��� �й��� ���� �ǰ�, ������/�����ڴ� ���ڿ��� �� �� ����.
	private String password;			//��й�ȣ
	private int type;					//Ÿ�� , �л� 0, ������ 1, ������ 2 �̷������� ���� �� ����.
	
	public String getAccountId()
	{
		return accountId;
	}
	public void setAccountId(String accountId)
	{
		this.accountId = accountId;
	}
	
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	public int getType()
	{
		return type;
	}
	public void setType(int type)
	{
		this.type = type;
	}
}
