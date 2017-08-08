package inheritance.hr;

import inheritance.MgmtEmployee;

public class HR extends MgmtEmployee{
	
	private String recruitingSkills;
	private int recruitingExp;
	int testing;
	protected String proctedVariable;
	
	public HR(String name, int id) {
		super(name, id);
	}

	public String getRecruitingSkills() {
		return recruitingSkills;
	}

	public void setRecruitingSkills(String recruitingSkills) {
		this.recruitingSkills = recruitingSkills;
	}

	public int getRecruitingExp() {
		return recruitingExp;
	}

	public void setRecruitingExp(int recruitingExp) {
		this.recruitingExp = recruitingExp;
	}
	
	@Override
	public String toString() {
		return "" + recruitingSkills + " "+ testing +" "+ proctedVariable;
	}
	
	private void callMe(){}
}
