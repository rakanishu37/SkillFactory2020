package net.Avalith.CollectionsInterfaces.Ej2;

import java.util.ArrayList;
import java.util.List;

public class Marathon {
    private List<IMarathoner> marathoners;
    private Double distance;
    public Marathon(Double distance) {
        this.distance = distance;
        marathoners = new ArrayList<>();
    }

    public void addMarathoner(IMarathoner marathoner){
        marathoners.add(marathoner);
    }

    private Double getTime(Integer index){
        return marathoners.get(index).run(this.distance);
    }

    public String showResults(){
        StringBuilder sb = new StringBuilder();
        sb.append("Species - Time(hours)\n");
        for(int i = 0; i < marathoners.size();++i) {
            sb.append(String.format("%s - %.2f\n",marathoners.get(i).getSpecie(),getTime(i)));
        }
        return sb.toString();
    }
}
