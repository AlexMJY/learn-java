import java.sql.SQLOutput;
import java.util.*;

public class CloneEx02 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        // 배열 arr을 복제해서 같은 내용의 새로운 배열을 만든다.
        int[] arrClone = arr.clone();
        arrClone[0] = 6;

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arrClone));
    }
}

// 배열도 객체이기 때문에 Object 클래스를 상속받으며, 동시에 Cloneable 인터페이스와 Serializable 인터페이스가 구현되어 있다.
// 그래서 Object 클래스의 멤버들을 모두 상속받는다. Object 클래스에는 protected로 정의되어 있는 clone()을
// 배열에서는 public으로 오버라이딩했기 때문에 예제처럼 직접 호출이 가능하다.
// 배열 뿐 아니라 java.util 패키지의 Vector, ArrayList, LinkedList, HashSet, TreeSet, HashMap, TreeMap, Date와 같은 클래스들도 가능하다.
// clone()은 객체가 참조하고 있는 객체까지 복제하지 않기 때문에 얕은 복사(shallow copy)라고 한다.