
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
* Classe que representa a tabela recipe
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"recipe\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Recipe")
public class Recipe implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "recipe_id", nullable = false, insertable=true, updatable=true)
        private java.lang.String recipe_id = UUID.randomUUID().toString().toUpperCase();


    /**
    * @generated
    */
    @Column(name = "name", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.String name;


    /**
    * @generated
    */
    @Column(name = "description", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.String description;


    /**
    * @generated
    */
    @Column(name = "instructions", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.String instructions;


    /**
    * @generated
    */
    @Temporal(TemporalType.DATE)
    @Column(name = "creation_date", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.util.Date creation_date;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_user", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private User user;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_recipeCategory", nullable = true, referencedColumnName = "category_id", insertable=true, updatable=true)
        
        private RecipeCategory recipeCategory;


    /**
    * Construtor
    * @generated
    */
    public Recipe(){
    }

    /**
    * Obtém recipe_id
    * return recipe_id
    * @generated
    */
    public java.lang.String getRecipe_id() {
        return this.recipe_id;
    }

    /**
    * Define recipe_id
    * @param recipe_id recipe_id
    * @generated
    */
    public Recipe setRecipe_id(java.lang.String recipe_id) {
        this.recipe_id = recipe_id;
        return this;
    }
    /**
    * Obtém name
    * return name
    * @generated
    */
    public java.lang.String getName() {
        return this.name;
    }

    /**
    * Define name
    * @param name name
    * @generated
    */
    public Recipe setName(java.lang.String name) {
        this.name = name;
        return this;
    }
    /**
    * Obtém description
    * return description
    * @generated
    */
    public java.lang.String getDescription() {
        return this.description;
    }

    /**
    * Define description
    * @param description description
    * @generated
    */
    public Recipe setDescription(java.lang.String description) {
        this.description = description;
        return this;
    }
    /**
    * Obtém instructions
    * return instructions
    * @generated
    */
    public java.lang.String getInstructions() {
        return this.instructions;
    }

    /**
    * Define instructions
    * @param instructions instructions
    * @generated
    */
    public Recipe setInstructions(java.lang.String instructions) {
        this.instructions = instructions;
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
    public Recipe setCreation_date(java.util.Date creation_date) {
        this.creation_date = creation_date;
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
    public Recipe setUser(User user) {
        this.user = user;
        return this;
    }
    /**
    * Obtém recipeCategory
    * return recipeCategory
    * @generated
    */
    public RecipeCategory getRecipeCategory() {
        return this.recipeCategory;
    }

    /**
    * Define recipeCategory
    * @param recipeCategory recipeCategory
    * @generated
    */
    public Recipe setRecipeCategory(RecipeCategory recipeCategory) {
        this.recipeCategory = recipeCategory;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Recipe object = (Recipe)obj;
        if (recipe_id != null ? !recipe_id.equals(object.recipe_id) : object.recipe_id != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((recipe_id == null) ? 0 : recipe_id.hashCode());
        return result;
    }

}