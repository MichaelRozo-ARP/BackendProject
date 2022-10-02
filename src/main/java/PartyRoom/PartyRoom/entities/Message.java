package PartyRoom.PartyRoom.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "message")
public class Message implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMessage;
    private String messageText;

    @ManyToOne
    @JoinColumn(name = "id")
    @JsonIgnoreProperties("message")
    private Party_room party_room;

    public Integer getIdMessage() {

        return idMessage;
    }

    public void setIdMessage(Integer idMessage) {

        this.idMessage = idMessage;
    }

    public String getMessageText() {

        return messageText;
    }

    public void setMessageText(String messageText) {

        this.messageText = messageText;
    }
}
