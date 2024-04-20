import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaTest6
{

    public static void main(String[] args)
    {
        List<String> list = Arrays.asList("abc", "aaa", "bbb", "ccc");
        Collections.sort(list, new Comparator<String>()	//람다식 바꿀 메서드
						//new Comparator<String>() 생성자
        {
            public int compare(String s1, String s2)
            {
                return s2.compareTo(s1);
            }
        });
        System.out.println(list);
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class LambdaTest6
{

    public static void main(String[] args)
    {
        List<String> list = Arrays.asList("abc", "aaa", "bbb", "ccc");
        Collections.sort(list, (s1, s2) -> s2.compareTo(s1));
        System.out.println(list);
    }
}
