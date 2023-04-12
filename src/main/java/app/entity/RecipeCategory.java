
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
* Classe que representa a tabela recipe_category
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"recipe_category\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.RecipeCategory")
public class RecipeCategory implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "category_id", nullable = false, insertable=true, updatable=true)
        private java.lang.String category_id = UUID.randomUUID().toString().toUpperCase();


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
    * Construtor
    * @generated
    */
    public RecipeCategory(){
    }

    /**
    * Obtém category_id
    * return category_id
    * @generated
    */
    public java.lang.String getCategory_id() {
        return this.category_id;
    }

    /**
    * Define category_id
    * @param category_id category_id
    * @generated
    */
    public RecipeCategory setCategory_id(java.lang.String category_id) {
        this.category_id = category_id;
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
    public RecipeCategory setName(java.lang.String name) {
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
    public RecipeCategory setDescription(java.lang.String description) {
        this.description = description;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
RecipeCategory object = (RecipeCategory)obj;
        if (category_id != null ? !category_id.equals(object.category_id) : object.category_id != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((category_id == null) ? 0 : category_id.hashCode());
        return result;
    }

}