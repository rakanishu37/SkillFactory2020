package net.Avalith.CollectionsInterfaces.Ej1;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.*;

public class PeopleRegistry {
    Map<String,Person> registry;

    public PeopleRegistry() {
        this.registry = new HashMap<>();
    }

    public void addPerson(Person p){
        registry.put(p.getId(),p);
    }

    public void removePerson(String id){
        registry.remove(id);
    }

    public Map<String,Person> getRegistry(){
        return registry;
    }

    public String showRegistry1(){
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<String,Person> register :registry.entrySet()){
            sb.append((String.format("Key : %s \nValue: %s\n",register.getKey(),register.getValue())));
        }
        return sb.toString();
    }

    public String showRegistry2(){
        StringBuilder sb = new StringBuilder();
        for(String key : registry.keySet()){
            sb.append((String.format("Key : %s -- Value: %s\n",key,registry.get(key))));
        }
        return sb.toString();
    }

    public String showRegistryOrderedByKeys(){
        StringBuilder sb = new StringBuilder();
        List<String> keysOrdered = new ArrayList<>(registry.keySet());
        Collections.sort(keysOrdered);
        for(String key : keysOrdered){
            sb.append((String.format("--Key : %s\n--Value: %s\n",key,registry.get(key))));
        }
        return sb.toString();
    }


}
