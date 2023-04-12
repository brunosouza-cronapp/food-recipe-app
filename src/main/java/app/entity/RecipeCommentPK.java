package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;


/**
* @generated
*
**/
public class RecipeCommentPK implements Serializable {

  /**
  * @generated
  */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  private java.lang.String recipe_recipe;

  /**
   * @generated
   */
  private java.lang.String recipeCategory_category;

  /**
   * Construtor
   * @generated
   */
  public RecipeCommentPK(){
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
  public RecipeCommentPK setRecipe_recipe(java.lang.String recipe_recipe){
    this.recipe_recipe = recipe_recipe;
    return this;
  }
  /**
   * Obtém recipeCategory_category
   * return recipeCategory_category
   * @generated
   */
  public java.lang.String getRecipeCategory_category(){
    return this.recipeCategory_category;
  }

  /**
   * Define recipeCategory_category
   * @param recipeCategory_category recipeCategory_category
   * @generated
   */
  public RecipeCommentPK setRecipeCategory_category(java.lang.String recipeCategory_category){
    this.recipeCategory_category = recipeCategory_category;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
RecipeCommentPK object = (RecipeCommentPK)obj;
    if (recipe_recipe != null ? !recipe_recipe.equals(object.recipe_recipe) : object.recipe_recipe != null) return false;
    if (recipeCategory_category != null ? !recipeCategory_category.equals(object.recipeCategory_category) : object.recipeCategory_category != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((recipe_recipe == null) ? 0 : recipe_recipe.hashCode());
    result = 31 * result + ((recipeCategory_category == null) ? 0 : recipeCategory_category.hashCode());
    return result;
  }

}
