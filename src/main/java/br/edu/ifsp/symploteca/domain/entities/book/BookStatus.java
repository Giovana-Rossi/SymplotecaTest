package br.edu.ifsp.symploteca.domain.entities.book;

public enum BookStatus {
    AVAILABLE("Disponível"),
    CHECKED_OUT("Emprestado");

    private String label;

    BookStatus(String label){
        this.label = label;
    }

    @Override
    public String toString() {
        return label;
    }
}
