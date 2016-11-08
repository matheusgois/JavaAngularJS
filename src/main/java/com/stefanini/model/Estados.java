package com.stefanini.model;

public enum Estados {
	AC("AC"), AL("AL"), AM("AM"), AP("AP"), BA("BA"), CE("CE"), DF("DF"), ES(
			"ES"), GO("GO"), MA("MA"), MG("MG"), MS(" MS"), MT(
					"MT"), PA("PA"), PB("PB"), PE("PE"), PI("PI"), PR("PR"), RJ(
							"RJ"), RN("RN"), RO("RO"), RR(
									"RR"), RS("RS"), SC(
											"SC"), SE("SE"), SP("SP"), TO("RO");
	private String estado;

	Estados(String estado) {
		this.estado = estado;
	}

	public String getEstado() {
		return estado;
	}

	@Override
	public String toString() {
		return estado;
	}
    private String label;



    public String getLabel() {
        return label;
    }
	
}
