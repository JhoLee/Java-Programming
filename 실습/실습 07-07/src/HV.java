/**
 * @date : 2017. 5. 25.
 */
/**
 * <pre>
 *  
 *    |_ HV.java
 * 
 * </pre>
 * @date : 2017. 5. 25. ���� 11:25:48
 * @version : 
 * @author : Jho
 */

import java.util.*;

public class HV {
    public static Vector<String> hashToVector(HashMap<String, String> h) {
        // �ۼ� �ʿ�
    }

    public static void main(String[] args) {
        HashMap<String, String> h = new HashMap<String, String>();
        h.put("����", "112");
        h.put("ȭ��", "119");
        h.put("��ȭ��ȣ", "114");
        Vector<String> v = HV.hashToVector(h);
        for (int n = 0; n < v.size(); n++)
            System.out.println(v.get(n));
    }
}
