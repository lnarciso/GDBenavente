package model;

public class Receitas {
	
	private float donativos,
				  quotas;
	//private String data;
	//private int data;

	public Receitas(float donativos, float quotas) {
		super();
		this.donativos = donativos;
		this.quotas = quotas;
	}

	public float getDonativos() {
		return donativos;
	}

	public void setDonativos(float donativos) {
		this.donativos = donativos;
	}

	public float getQuotas() {
		return quotas;
	}

	public void setQuotas(float quotas) {
		this.quotas = quotas;
	}
	
	

}
