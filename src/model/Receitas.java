package model;

public class Receitas {
	
	private double donativos,
				  quotas;
	//private String data;
	//private int data;

	public Receitas(double donativos, double quotas) {
		super();
		this.donativos = donativos;
		this.quotas = quotas;
	}

	public double getDonativos() {
		return donativos;
	}

	public void setDonativos(double donativos) {
		this.donativos = donativos;
	}

	public double getQuotas() {
		return quotas;
	}

	public void setQuotas(double quotas) {
		this.quotas = quotas;
	}
	
	

}
