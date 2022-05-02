package net.protezov.bestprotez.proba;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "client", schema = "public", catalog = "propCrm")
public class ClientEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private long id;
    @Basic
    @Column(name = "table_id", nullable = false)
    private int tableId;
    @Basic
    @Column(name = "surname", nullable = false, length = 255)
    private String surname;
    @Basic
    @Column(name = "firstname", nullable = false, length = 255)
    private String firstname;
    @Basic
    @Column(name = "patronymic", nullable = true, length = 255)
    private String patronymic;
    @Basic
    @Column(name = "birthday", nullable = true)
    private Date birthday;
    @Basic
    @Column(name = "coments", nullable = true, length = 1000)
    private String coments;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getTableId() {
        return tableId;
    }

    public void setTableId(int tableId) {
        this.tableId = tableId;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getComents() {
        return coments;
    }

    public void setComents(String coments) {
        this.coments = coments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClientEntity that = (ClientEntity) o;
        return id == that.id && tableId == that.tableId && Objects.equals(surname, that.surname) && Objects.equals(firstname, that.firstname) && Objects.equals(patronymic, that.patronymic) && Objects.equals(birthday, that.birthday) && Objects.equals(coments, that.coments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tableId, surname, firstname, patronymic, birthday, coments);
    }
}
