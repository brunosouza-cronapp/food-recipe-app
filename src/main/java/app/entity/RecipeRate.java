
package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
import cronapi.swagger.CronappSwagger;


/**
* Classe que representa a tabela recipe_rate
* @generated
*/
@javax.persistence.Entity
@IdClass(RecipeRatePK.class)
@javax.persistence.Table(name = "\"recipe_rate\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.RecipeRate")
public class RecipeRate implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "id", nullable = false, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

    /**
    * @generated
    */
    @Id
    @JoinColumn(name="fk_recipe", nullable = false, referencedColumnName = "recipe_id", insertable=true, updatable=true)
        private Recipe recipe;

    /**
    * @generated
    */
    @Id
    @JoinColumn(name="fk_user", nullable = false, referencedColumnName = "id", insertable=true, updatable=true)
        private User user;


    /**
    * @generated
    */
    @Temporal(TemporalType.DATE)
    @Column(name = "creation_date", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.util.Date creation_date;


    /**
    * @generated
    */
    @Column(name = "rate", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.String rate;




    /**
    * Construtor
    * @generated
    */
    public RecipeRate(){
    }

    /**
    * Obtém id
    * return id
    * @generated
    */
    public java.lang.String getId() {
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public RecipeRate setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém creation_date
    * return creation_date
    * @generated
    */
    public java.util.Date getCreation_date() {
        return this.creation_date;
    }

    /**
    * Define creation_date
    * @param creation_date creation_date
    * @generated
    */
    public RecipeRate setCreation_date(java.util.Date creation_date) {
        this.creation_date = creation_date;
        return this;
    }
    /**
    * Obtém rate
    * return rate
    * @generated
    */
    public java.lang.String getRate() {
        return this.rate;
    }

    /**
    * Define rate
    * @param rate rate
    * @generated
    */
    public RecipeRate setRate(java.lang.String rate) {
        this.rate = rate;
        return this;
    }
    /**
    * Obtém recipe
    * return recipe
    * @generated
    */
    public Recipe getRecipe() {
        return this.recipe;
    }

    /**
    * Define recipe
    * @param recipe recipe
    * @generated
    */
    public RecipeRate setRecipe(Recipe recipe) {
        this.recipe = recipe;
        return this;
    }
    /**
    * Obtém user
    * return user
    * @generated
    */
    public User getUser() {
        return this.user;
    }

    /**
    * Define user
    * @param user user
    * @generated
    */
    public RecipeRate setUser(User user) {
        this.user = user;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
RecipeRate object = (RecipeRate)obj;
        if (id != null ? !id.equals(object.id) : object.id != null) return false;
        if (recipe != null ? !recipe.equals(object.recipe) : object.recipe != null) return false;
        if (user != null ? !user.equals(object.user) : object.user != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id == null) ? 0 : id.hashCode());
        result = 31 * result + ((recipe == null) ? 0 : recipe.hashCode());
        result = 31 * result + ((user == null) ? 0 : user.hashCode());
        return result;
    }

}