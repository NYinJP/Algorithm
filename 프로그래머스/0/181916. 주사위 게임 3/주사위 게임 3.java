import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
         List<Integer> list = new ArrayList<>();
        list.add(a); list.add(b);list.add(c);list.add(d);
        // 4 수를 모두 정렬함
        Collections.sort(list);

        // 1. 정렬한 수가 모두 같음
        if (list.get(0) == list.get(1) && list.get(1) == list.get(2) && list.get(2) == list.get(3)) {
            return 1111 * list.get(0);
        }
        // 2. 앞 3개의 수가 같고 맨 뒤 하나가 다름
        //    아니 1 222 2 333 일 수도 있잖아.
        else if (list.get(0) != list.get(1) && list.get(1) == list.get(2) && list.get(2) == list.get(3)) {
            return ((10 * list.get(1)) + list.get(0))*((10 * list.get(1))+  list.get(0));
        }
        else if (list.get(0) == list.get(1) && list.get(1) == list.get(2) && list.get(2) != list.get(3)) {
            return ((10 * list.get(0)) + list.get(3))*((10 * list.get(0) )+ list.get(3));
        }

        // 3. 두 개씩 같은 값이 나옴. 22 33
        else if (list.get(0) == list.get(1) && list.get(1) != list.get(2) && list.get(2) == list.get(3)) {
            int number1 = list.get(0) + list.get(3);
            int number2 = Math.abs(list.get(0) - list.get(3));

            return number1 * number2;
        } else if (list.get(0) != list.get(1) && list.get(1) != list.get(2) && list.get(2) != list.get(3)) {
            return list.get(0);
        }
        else {
            if (list.get(0) == list.get(1)) {
                return list.get(2) * list.get(3);
            }
            if (list.get(1) == list.get(2)) {
                return list.get(0) * list.get(3);
            }
            if (list.get(2) == list.get(3)) {
                return list.get(0) * list.get(1);
            }
            return 0;
        }
    }
}