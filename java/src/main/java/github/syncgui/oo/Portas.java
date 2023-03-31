package github.syncgui.oo;

import java.util.Objects;

public class Portas {

    boolean portas;

    boolean portaAberta() {
        return portas = true;
    }
    boolean portaFecada() {
        return portas = false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Portas portas1 = (Portas) o;
        return portas == portas1.portas;
    }

    @Override
    public int hashCode() {
        return Objects.hash(portas);
    }
}
