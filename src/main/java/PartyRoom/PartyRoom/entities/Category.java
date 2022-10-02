package PartyRoom.PartyRoom.entities;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "category")
public class Category implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer categoryId;
    private String CategoryName;
    private String descriptionCategory;

    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "category")
    @JsonIgnoreProperties("category")
    private List<Party_room> party_room;

    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "category")
    @JsonIgnoreProperties("category")
    private List<Reservation> reservations;
    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer idCategory) {
        this.categoryId = idCategory;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String nameCategory) {
        this.CategoryName = nameCategory;
    }

    public String getDescriptionCategory() {
        return descriptionCategory;
    }

    public void setDescriptionCategory(String categoryDescription) {
        this.descriptionCategory = categoryDescription;
    }

    public List<Party_room> getParty_room() {
        return party_room;
    }

    public void setParty_room(List<Party_room> party_room) {
        this.party_room = party_room;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }
}
