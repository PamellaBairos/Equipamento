package TP;

public class EquipamentoSonoro extends equipamento {
	  private boolean stereo;
	    private int volume;

	    public EquipamentoSonoro(boolean ligado, boolean stereo, int volume) {
	        super(ligado);
	        this.stereo = stereo;
	        this.volume = volume;
	    }

	    @Override
	    public void ligar() {
	        this.ligado = true;
	        for (int i = 0; i < 5; i++) {
	            aumentarVolume();
	        }
	    }

	    public void mono() {
	        this.stereo = false;
	    }

	    public void stereo() {
	        this.stereo = true;
	    }

	    public void aumentarVolume() {
	        if (this.volume < 10) {
	            this.volume++;
	        }
	    }

	    public void diminuirVolume() {
	        if (volume > 0) {
	            this.volume--;
	        }
	    }

	    @Override
	    public String toString() {
	        return "EquipamentoSonoro [ligado=" + ligado + ", stereo=" + stereo + ", volume=" + volume + "]";
	    }
}
