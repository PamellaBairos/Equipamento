package TP;

public class equipamento {
	protected boolean  ligado;

	  equipamento (boolean ligado){
	    this.ligado = ligado;	
	  }

	  public void ligar() {
	    this.ligado = true;
	  }

	  public void desligar() {
	    this.ligado = false;
	  }
	  @Override
	  public String toString() {
	    return ("o equipamento está ligado? "+ligado);
	  }

}
