package java11Features.Strings.Strings;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String> cities=new HashSet<>();
        for(List<String> path: paths)
        {
            cities.add(path.get(0));
        }
        for(List<String> path:paths)
        {
            String dest=path.get(1);
            if(!cities.contains(dest))
            {
                return dest;
            }
        }
        return "";

    }

    public static void main(String[] args) {
        List<List<String>> paths=List.of(List.of("London","New York"),List.of("New York","Lima"),List.of("Lima","Sao Paulo"));
        System.out.println(new Solution().destCity(paths));
    }
}
