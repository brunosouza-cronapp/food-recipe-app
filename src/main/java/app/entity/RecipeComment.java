
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
* Classe que representa a tabela recipe_comment
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"recipe_comment\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.RecipeComment")
public class RecipeComment implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "id", nullable = true, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();


    /**
    * @generated
    */
    @Temporal(TemporalType.DATE)
    @Column(name = "creation_date", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.util.Date creation_date;


    /**
    * @generated
    */
    @Column(name = "comment", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.String comment;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_recipe", nullable = false, referencedColumnName = "recipe_id", insertable=true, updatable=true)
        
        private Recipe recipe;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_recipeCategory", nullable = false, referencedColumnName = "category_id", insertable=true, updatable=true)
        
        private RecipeCategory recipeCategory;


    /**
    * Construtor
    * @generated
    */
    public RecipeComment(){
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
    public RecipeComment setId(java.lang.String id) {
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
    public RecipeComment setCreation_date(java.util.Date creation_date) {
        this.creation_date = creation_date;
        return this;
    }
    /**
    * Obtém comment
    * return comment
    * @generated
    */
    public java.lang.String getComment() {
        return this.comment;
    }

    /**
    * Define comment
    * @param comment comment
    * @generated
    */
    public RecipeComment setComment(java.lang.String comment) {
        this.comment = comment;
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
    public RecipeComment setRecipe(Recipe recipe) {
        this.recipe = recipe;
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
    public RecipeComment setRecipeCategory(RecipeCategory recipeCategory) {
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
RecipeComment object = (RecipeComment)obj;
        if (id != null ? !id.equals(object.id) : object.id != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

}