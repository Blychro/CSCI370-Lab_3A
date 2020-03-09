package com.example.advancedadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.BaseAdapter;
import android.widget.ListView;
import com.example.advancedadapter.Student;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView list;
    private Student one;
    private Student two;
    private Student three;
    private Student four;
    private Student five;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = findViewById(R.id.student);
        one = new Student("Cole", "Horton", "Mechanic");
        two = new Student("Stephanie", "Bagget", "Biology");
        three = new Student("Alex", "Stephens", "Computer Science");
        four = new Student("Anna", "Schmitt", "Engineering");
        five = new Student("Gus", "Mann", "Criminology");

        ArrayList<Student> students = new ArrayList<Student>(5);
        students.add(one);
        students.add(two);
        students.add(three);
        students.add(four);
        students.add(five);

        StudentAdapter adapter = new StudentAdapter(this, students);
        list.setAdapter(adapter);


    }
}
