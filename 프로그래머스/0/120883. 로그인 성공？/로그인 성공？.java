import java.util.*;
class Solution {
    public String solution(String[] id_pw, String[][] db) {
        HashMap<String, String> loginDb = new HashMap<>();
        for (int i = 0; i < db.length; i++) {
            loginDb.put(db[i][0], db[i][1]);
        }

        // 로그인 정보가 아예 없다면
        if (!loginDb.containsKey(id_pw[0])) {
            return "fail";
        }
        
        if (id_pw[1].equals(loginDb.get(id_pw[0]))) {
            return "login";
        } else {
            return "wrong pw";
        }
    }
}