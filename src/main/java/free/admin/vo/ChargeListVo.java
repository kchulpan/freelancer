package free.admin.vo;

public class ChargeListVo 
{
	private int rownum;
	private String charge_id;
	private String charge_nm;
	private String company_name;
	private String org_id;
	private String position_nm;
	private String charge_phone;
	private String charge_mail_1;

	public int getRownum() {
		return rownum;
	}


	public void setRownum(int rownum) {
		this.rownum = rownum;
	}


	public String getCharge_id() {
		return charge_id;
	}


	public void setCharge_id(String charge_id) {
		this.charge_id = charge_id;
	}


	public String getCharge_nm() {
		return charge_nm;
	}


	public void setCharge_nm(String charge_nm) {
		this.charge_nm = charge_nm;
	}


	public String getCompany_name() {
		return company_name;
	}


	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}


	public String getOrg_id() {
		return org_id;
	}


	public void setOrg_id(String org_id) {
		this.org_id = org_id;
	}


	public String getPosition_nm() {
		return position_nm;
	}


	public void setPosition_nm(String position_nm) {
		this.position_nm = position_nm;
	}


	public String getCharge_phone() {
		return charge_phone;
	}


	public void setCharge_phone(String charge_phone) {
		this.charge_phone = charge_phone;
	}


	public String getCharge_mail_1() {
		return charge_mail_1;
	}


	public void setCharge_mail_1(String charge_mail_1) {
		this.charge_mail_1 = charge_mail_1;
	}


	@Override
	public String toString() {
		return "ChargeListVo [rownum=" + rownum + ", charge_id=" + charge_id + ", charge_nm=" + charge_nm
				+ ", company_name=" + company_name + ", org_id=" + org_id + ", position_nm=" + position_nm
				+ ", charge_phone=" + charge_phone + ", charge_mail_1=" + charge_mail_1 + "]";
	}
	
	
}

