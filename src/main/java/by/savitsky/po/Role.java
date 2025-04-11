package by.savitsky.po;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import static by.savitsky.po.Role.TABLE_NAME;

@Entity
@Table(name = TABLE_NAME)
public class Role extends PersistObject<Long> {

    public static final String TABLE_NAME = "role";

    public static final String COLUMN_NAME = "f_name";

    @Column(name = COLUMN_NAME)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
