package beans;

public class Televisor {

	private int canal = 1;
	private int volume = 0;
	private boolean ligado = true;

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;

		if (ligado == false) {
			System.out.println("TV DESLIGADA");
			this.volume = 0;
			this.canal = 1;

		}

		else {
			if (this.canal >= 1 && this.canal <= 16) {
				System.out.println("Mudado canal para " + this.canal);

			} else {
				if (this.canal > 16) {
					System.out.println("Não pode ser alterado");
					this.canal = 16;
				} else if (this.canal == 0) {
					System.out.println("Não pode ser alterado");
					this.canal = 1;
				}
			}
		}
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;

		if (ligado == false) {
			System.out.println("TV DESLIGADA");
			this.volume = 0;
			this.canal = 1;
		}

		else {
			if (this.volume >= 0 && this.volume <= 10) {
				System.out.println("Volume Alterado para: " + this.volume);
				
				

			} else {
				if (this.volume > 10) {
					System.out.println("Não é possivel aumenta o volume");
					this.volume = 10;
				} else if (this.volume < 0) {
					System.out.println("Não pe possivel abaixa volume");
					this.volume = 0;
				}
			}
		}
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public void aumentoVolume() {
		setVolume(this.volume + 1);
	}

	public void reduzirVolume() {
		setVolume(this.volume - 1);

	}

	public void subirCanal() {
		setCanal(this.canal + 1);
	}

	public void descerCanal() {
		setCanal(this.canal - 1);
	}

	public void ligarTelevisor() {
		setLigado(true);
	}

	public void desligarTelevidor() {
		setLigado(false);
	}

	public void status() {
		System.out.println("Canal: " + getCanal() + " Volume " + getVolume() + " Tv esta ligada " + isLigado());

	}

}
