import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class score {
    public static void main(String[] args){

        List<Student> list = new ArrayList<>();
        list.add(new Student("홍길동", 95));
        list.add(new Student("이순신", 77));

        Comparator<Student> comparator = new Comparator<Student>(){
            @Override
            public int compare(Student s1, Student s2){
                if(s1.getScore() < s2.getScore()){

                    // s1의 순서상 priority를 의미함
                    // -1 이면 더 prioirity가 더 우선됨을 의미, 즉 오름차순
                    return -1;
                }else {
                    return 1;
                }
            }
        };

        Collections.sort(list, comparator);

        for(Student s : list){
            System.out.println(String.format("student : %s, score : %d", s.getName(), s.getScore()));
        }

    }
}

class Student {

    private String name;
    private int score;

    Student(String name, int score){
        this.name = name;
        this.score = score;
    }

    public String getName(){
        return this.name;
    }

    public int getScore(){
        return this.score;
    }
}

// class Student implements Comparable<Student> {

//     private String name;
//     private int score;

//     Student(String name, int score){
//         this.name = name;
//         this.score = score;
//     }

//     public String getName(){
//         return this.name;
//     }

//     public int getScore(){
//         return this.score;
//     }

//     @Override
//     public int compareTo(Student p) {
//         if(this.score < p.score){
//             return -1;
//         }else if (this.score == p.score){
//             return 0;
//         }else {
//             return 1;
//         }
//     }
// }

