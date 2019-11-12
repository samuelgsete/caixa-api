package br.com.gsete.exceptions.models;

public class ObjetcBadFormattedException extends Exception {

    private static final long serialVersionUID = 1L;

    public ObjetcBadFormattedException(String message) {
        super(message);
    }
}