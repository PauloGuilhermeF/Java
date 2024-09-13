package JavaCore.ZZEconcorrencia.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcorrenciaDeColecoesTest {
    public static void main(String[] args) {

        ConcurrentMap<String, String> map = new ConcurrentHashMap<>();
        map.put("1", "1");
        map.putIfAbsent("1", "2");
        System.out.println(map.get("1"));
    }
}