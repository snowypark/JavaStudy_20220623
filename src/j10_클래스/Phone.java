package j10_클래스;

public class Phone {
	// 변수는 항상 private
	
	private String company;
	private String model;
	private int version;
	private String color;
	
	public Phone() {
		System.out.println("기본생성자로 메모리 할당");
	}
	
	
	//Alt+Shift+S -> Generate constructor
	public Phone(String company, String model, int version, String color) {
		
		this.company = company;
		this.model = model;
		this.version = version;
		this.color = color;
	}

	//set+변수명(대문자...)

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}


	public int getVersion() {
		return version;
	}


	public void setVersion(int version) {
		this.version = version;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public void setCompany(String company) {
		this.company = madeCompanyName(company);
	}

	//캡슐화
	private String madeCompanyName(String company) {
		return company + "회사";
	}
	
	
	
	public String getCompany() {
		return company == null ? null : company.substring(0, company.indexOf("회사"));
	}
	
	
//	public String getCompanyRemoveWord() {
//		return removeCompanyWord();
//	}
	
	private String removeCompanyWord() {
		return company.substring(0, company.indexOf("회사"));
	}
	//substring(0번째부터, (indexOf(회사(2)전까지) 자르기
	

	public void showInfo() {
	System.out.println("제조사: " + company);
	System.out.println("모델: " + model);
	System.out.println("버전: " + version);
	System.out.println("색상: " + color);
	System.out.println();
	
	}
}
