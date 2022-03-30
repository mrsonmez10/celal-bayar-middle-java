package content06;

import java.util.Objects;

public class DenemeSınıf {

    private int a, b;

    public DenemeSınıf(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o)
            return true;
        if(o == null || getClass() != o.getClass())
            return false;
        DenemeSınıf that = (DenemeSınıf) o;
        return a == that.a && b == that.b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }
}
