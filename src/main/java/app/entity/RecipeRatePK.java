package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;


/**
* @generated
*
**/
public class RecipeRatePK implements Serializable {

  /**
  * @generated
  */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

  /**
   * @generated
   */
  private java.lang.String recipe_recipe;

  /**
   * @generated
   */
  private java.lang.String user;

  /**
   * Construtor
   * @generated
   */
  public RecipeRatePK(){
  }

  /**
   * Obtém id
   * return id
   * @generated
   */
  public java.lang.String getId(){
    return this.id;
  }

  /**
   * Define id
   * @param id id
   * @generated
   */
  public RecipeRatePK setId(java.lang.String id){
    this.id = id;
    return this;
  }
  /**
   * Obtém recipe_recipe
   * return recipe_recipe
   * @generated
   */
  public java.lang.String getRecipe_recipe(){
    return this.recipe_recipe;
  }

  /**
   * Define recipe_recipe
   * @param recipe_recipe recipe_recipe
   * @generated
   */
  public RecipeRatePK setRecipe_recipe(java.lang.String recipe_recipe){
    this.recipe_recipe = recipe_recipe;
    return this;
  }
  /**
   * Obtém user
   * return user
   * @generated
   */
  public java.lang.String getUser(){
    return this.user;
  }

  /**
   * Define user
   * @param user user
   * @generated
   */
  public RecipeRatePK setUser(java.lang.String user){
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
RecipeRatePK object = (RecipeRatePK)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    if (recipe_recipe != null ? !recipe_recipe.equals(object.recipe_recipe) : object.recipe_recipe != null) return false;
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
    result = 31 * result + ((recipe_recipe == null) ? 0 : recipe_recipe.hashCode());
    result = 31 * result + ((user == null) ? 0 : user.hashCode());
    return result;
  }

}
