package by.savitsky.po;

import jakarta.persistence.*;

import java.util.List;

import static by.savitsky.po.SecurityUser.TABLE_NAME;

@Entity
@Table(name = TABLE_NAME)
public class SecurityUser {

    public static final String TABLE_NAME = "security_user";

    public static final String TABLE_SECURITY_USER_ROLE = "security_user_role";

    public static final String COLUMN_LOGIN = "f_login";

    public static final String COLUMN_PASSWORD = "f_password";

    public static final String COLUMN_SECURITY_USER = "security_user_pid";

    public static final String COLUMN_ROLE = "role_pid";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "security_user_sequence")
    @SequenceGenerator(name = "security_user_sequence", sequenceName = "security_user_sequence", allocationSize = 1)
    private Long pid;

    @Column(name = COLUMN_LOGIN)
    private String login;

    @Column(name = COLUMN_PASSWORD)
    private String password;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = TABLE_SECURITY_USER_ROLE,
            joinColumns = @JoinColumn(name = COLUMN_SECURITY_USER),
            inverseJoinColumns = @JoinColumn(name = COLUMN_ROLE)
    )
    private List<Role> roles;

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

}
