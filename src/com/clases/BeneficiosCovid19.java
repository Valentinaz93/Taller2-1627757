package com.clases;

public class BeneficiosCovid19 {
    //Debe ser el numero entero aleatorio puedes usar la funcion ramdom para esto
    private String id;
    private String nombre;
    private Float valorSubsidio;

    //Completar clase

    //Implementar un metodo que retorne el mejor beneficio comparando los valores de todos los beneficios
    public Float getMejorbeneficios(String bestBeneficiario1, String bestBeneficiario2){
    	String BestBeneficiario = Float.parseFloat(bestBeneficiario1) > Float.parseFloat(bestBeneficiario2) ? bestBeneficiario1 : bestBeneficiario2;
        return Float.valueOf(BestBeneficiario);
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Float getValorSubsidio() {
		return valorSubsidio;
	}

	public void setValorSubsidio(String vlrSubsidio) {
		this.valorSubsidio = Float.valueOf(vlrSubsidio);
	}
    
    
    
}
