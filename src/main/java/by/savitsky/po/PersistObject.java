package by.savitsky.po;

import jakarta.persistence.*;

import java.io.Serializable;

@MappedSuperclass
public abstract class PersistObject<T extends Serializable> {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "default_sequence")
    @SequenceGenerator(name = "default_sequence", sequenceName = "default_sequence", allocationSize = 1)
    private T pid;

    public T getPid() {
        return pid;
    }

    public void setPid(T pid) {
        this.pid = pid;
    }

}
