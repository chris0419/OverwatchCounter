/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OC.Model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * @author chris
 */
public class TeamModel {

    private Map<CharModel, Integer> counterMap;
    private ArrayList<CharModel> teamList;

    public TeamModel() {
        counterMap = new LinkedHashMap<>();
        teamList = new ArrayList<>(6);
    }

    public void addCharacter(CharModel Char) {
        getTeamList().add(Char);
        addCounter(Char.getDisfavorList());
    }
    
    public void removeCharacter(CharModel Char){
        removeCounters(Char);
        getTeamList().remove(Char);
    }

    private void addCounter(ArrayList<CharModel> list) {
        for (CharModel counter : list) {
            if (getCounterMap().containsKey(counter)) 
                getCounterMap().put(counter, 0);
            
            else 
                getCounterMap().put(counter, 1 + getCounterMap().get(counter));
            
        }
    }

    private void removeCounters(CharModel counterHero) {
        for (CharModel counter : counterHero.getDisfavorList()) {
            if (getCounterMap().containsKey(counter)) {
                if (getCounterMap().get(counter) > 1) 
                    getCounterMap().put(counter, getCounterMap().get(counter) - 1);
                
                else 
                    getCounterMap().remove(counter);
                

            }
        }
    }

    public Map<CharModel, Integer> sortMap() {
        List<Entry<CharModel, Integer>> list = new LinkedList<>(getCounterMap().entrySet());

        Collections.sort(list, (Entry<CharModel, Integer> o1, Entry<CharModel, Integer> o2) -> o1.getValue().compareTo(o2.getValue()));

        Map<CharModel, Integer> sortedMap = new LinkedHashMap<>();

        for (Entry<CharModel, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }

    /**
     * @return the counterMap
     */
    public Map<CharModel, Integer> getCounterMap() {
        return counterMap;
    }

    /**
     * @return the teamList
     */
    public ArrayList<CharModel> getTeamList() {
        return teamList;
    }
    
    
    
}



