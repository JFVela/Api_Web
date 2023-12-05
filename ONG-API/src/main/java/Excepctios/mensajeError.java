package Excepctios;

public class mensajeError extends RuntimeException {
	public mensajeError(String message) {
		super(message);
	}
}
