package PartyRoom.PartyRoom.entities;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "client")
public class Client implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idClient;
    private String clientName;
    private String clientEmail;
    private Integer clientAge;
    private String password;

    public Integer getIdClient() {
        return idClient;
    }

    public void setIdClient(Integer idClient) {
        this.idClient = idClient;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String nameClient) {
        this.clientName = nameClient;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String emailClient) {
        this.clientEmail = emailClient;
    }

    public Integer getClientAge() {
        return clientAge;
    }

    public void setClientAge(Integer ageClient) {
        this.clientAge = ageClient;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
