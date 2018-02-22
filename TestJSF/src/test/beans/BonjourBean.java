package test.beans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class BonjourBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private String Noooom;

	public String getNom() {
		return Noooom;
	}

	public void setNom(String nom) {
		this.Noooom = nom;
	}
}
