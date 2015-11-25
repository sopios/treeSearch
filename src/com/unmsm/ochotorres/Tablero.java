package com.unmsm.ochotorres;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tablero implements Cloneable {

    public static int DIMENSION = 8;
    private final Celda[][] matriz;
    public int cantidadPiezas;

    public Tablero() {
        matriz = new Celda[DIMENSION][DIMENSION];
        cantidadPiezas = 0;
        crearTablero();
    }

    public Tablero(Tablero tablero) {
        this.matriz = Arrays.copyOf(tablero.matriz, DIMENSION);
        this.cantidadPiezas = tablero.cantidadPiezas;
    }

    private void crearTablero() {
        for (int i = 0; i < DIMENSION; i++) {
            for (int j = 0; j < DIMENSION; j++) {
                matriz[i][j] = new Celda(i + 1, j + 1);
            }
        }
    }

    public Celda agregarPieza(int posicionX, int posicionY, Pieza pieza) {
        Celda celda = getCelda(posicionX, posicionY);
        if (celda.estaLibre()) {
            celda.colocarPieza(this, pieza);
            cantidadPiezas++;
        }
        return celda;
    }

    public Celda getCelda(int posicionX, int posicionY) {
        try {
            return matriz[posicionX - 1][posicionY - 1];
        } catch (ArrayIndexOutOfBoundsException ex) {
            throw new FueraLimiteException(ex);
        }
    }

    public int getCantidadPiezas() {
        return cantidadPiezas;
    }

    public List<Celda> celdasLibres() {
        List<Celda> celdasLibres = new ArrayList<>();

        for (int i = 1; i <= Tablero.DIMENSION; i++) {
            for (int j = 1; j <= Tablero.DIMENSION; j++) {
                Celda celda = getCelda(i, j);
                if (celda.estaLibre()) {
                    celdasLibres.add(celda);
                }
            }
        }
        return celdasLibres;
    }

    @Override
    public String toString() {
        String cadenaMatriz = "";
        for (int i = 0; i < DIMENSION; i++) {
            cadenaMatriz += Arrays.toString(matriz[i]) + '\n';
        }
        return cadenaMatriz;
    }

    public static class Celda {

        public int posicionX;
        public int posicionY;
        private Pieza pieza;
        private Estado estado;
        private Tablero tablero;

        public static enum Estado {

            OCUPADO,
            BLOQUEADO,
            LIBRE
        }

        private Celda(int posicionX, int posicionY) {
            this.posicionX = posicionX;
            this.posicionY = posicionY;
            this.estado = Estado.LIBRE;
        }

        public void colocarPieza(Tablero tablero, Pieza pieza) {
            this.pieza = pieza;
            pieza.bloquear(tablero, this);
            this.estado = Estado.OCUPADO;
        }

        public void ocupar() {
            this.estado = Estado.OCUPADO;
        }

        public void restringir() {
            this.estado = Estado.BLOQUEADO;
        }

        public boolean estaLibre() {
            return this.estado == Estado.LIBRE;
        }

        @Override
        public String toString() {
            return String.format("%s %d %s %d %s %-11s", "(", posicionX, ",", posicionY, ")=", estado);
        }

        public Estado obtenerEstado() {
            return estado;
        }
    }

}
