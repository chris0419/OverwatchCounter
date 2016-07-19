/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OC.Model;
import java.util.ArrayList;


/**
 *
 * @author chris
 */
public class CharModel {
    private String  name;
    private String imgURL;
    private ArrayList<CharModel> disfavorList;

    
    /**
     * 
     * @param name
     * @param imgURL 
     */
    public CharModel(String name, String imgURL){
        this.name= name;
        this.imgURL=imgURL;
        disfavorList= new ArrayList<CharModel>();
    }
    
    /**
     * 
     * @param character 
     */
     public void addCounter(CharModel character){
      disfavorList.add(character);
    }
    
    
    
    
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the imgURL
     */
    public String getImgURL() {
        return imgURL;
    }

    /**
     * @param imgURL the imgURL to set
     */
    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }

    /**
     * @return the disfavorList
     */
    public ArrayList<CharModel> getDisfavorList() {
        return disfavorList;
    }

    /**
     * @param disfavorList the disfavorList to set
     */
    public void setDisfavorList(ArrayList<CharModel> disfavorList) {
        this.disfavorList = disfavorList;
    }
    
}
