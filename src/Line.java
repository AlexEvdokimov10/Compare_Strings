import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Line {
    public static void main(String[] args) {
        String [] lines={"hello","how are you","my name is Mark","hi"};
        Order1 ligving=new Order1();
                Comparator<String>ligving2= new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                if(o1.length()>o2.length()) {
                    return 1;
                }
                else {
                    return 0;
                }
            }
        };
        System.out.println(ligving.Methoder(lines,ligving2));
    }
}

class Order1 implements Comparator<Line> {


    @Override
    public int compare(Line o1, Line o2) {
     return 0;
    }

    public String Methoder (String [] lines,Comparator <String> line){
        String temp=null;
        for(int i=0;i<lines.length;i++){
            for(int j=0;j<lines.length-i-1;j++){
                if(line.compare(lines[j],lines[j+1])==1)
                {

                    temp = lines[j];
                    lines[j] = lines[j + 1];
                    lines[j + 1] = temp;
                }

            }

        }

        return Arrays.toString(lines);
    }


   /* public int compareTo(Book p,String [] lines){
        return compareTo(lines);
    }*/
}